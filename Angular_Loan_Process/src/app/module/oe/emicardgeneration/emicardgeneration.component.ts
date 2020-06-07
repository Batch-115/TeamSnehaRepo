import { Component, OnInit } from '@angular/core';
import { EmicommonService } from '../emicommon.service';
import { FormGroup, FormControl } from '@angular/forms'
import { ActivatedRoute, Router } from '@angular/router';
import { emicardgeneration } from '../emicardgenerate';

@Component({
  selector: 'app-emicardgeneration',
  templateUrl: './emicardgeneration.component.html',
  styleUrls: ['./emicardgeneration.component.css']
})
export class EmicardgenerationComponent implements OnInit {
carduserform:FormGroup;
logincarduserform:FormGroup;
cardform:boolean=false;
entryform:boolean=false;
carddata:any[];
hicarduserform:FormGroup;
usercardform:boolean=false;
view:boolean=false;

  constructor(private ecs:EmicommonService,private route:ActivatedRoute,private router:Router) { }

  ngOnInit() {
    this.carduserform = new FormGroup({
 emiCardId:new FormControl(),
customerId: new FormControl(),
 currentMaxloanLimit:new FormControl(),
nextMaxLoanLimit:new FormControl(),
interestRate:new FormControl()

});
 this.logincarduserform = new FormGroup({
 emiCardId:new FormControl(),
 });

  }
submitcarduser(carduserform)
{
  this.view=false;
  let data= carduserform.value;
  this.postcarddata(data);
}
register()
{
this.cardform=true;
 this.entryform=false;
}
entry()
{
  this.entryform=true;
  this.cardform=false;
}
clicktoview()
{
this.view=true;
this.
getallcarddetails();
}
getallcarddetails()
{
  this.cardform=false;
  this.entryform=false;
this.ecs.fetchallcarddata().subscribe(data=>{
    console.log(data);
    this.carddata=data;
  })

}
 customerdetails(emiCardId)
  {console.log(emiCardId)
     this.router.navigate(['../singlecarddetails',emiCardId],{relativeTo:this.route})

  }
  customerdelete(emiCardId)
  {
    this.ecs.deletecarddata(emiCardId).subscribe(data=>{
      this.ecs.fetchallcarddata().subscribe(data=>{
    console.log(data);
    this.carddata=data;
  })

    });
    
  }
  customercardedit(id)
  {
    this.view=false;
   this.cardform=true;
    this.ecs.getsinglecard(id).subscribe(data=>{
    console.log(data)
    this.carduserform.controls['emiCardId'].setValue(data.emiCardId);
  this.carduserform.controls['customerId'].setValue(data.customerId);
   this.carduserform.controls['currentMaxloanLimit'].setValue(data.currentMaxloanLimit);
    this.carduserform.controls['nextMaxLoanLimit'].setValue(data.nextMaxLoanLimit);
     this.carduserform.controls['interestRate'].setValue(data.interestRate);
     
  })
  }
 
postcarddata(data)
{
this.ecs.registercardemidata(data).subscribe(caeddata=>{
  this.carduserform.reset();
   this.cardform=false;
})
}
submitcarduserid(carduserform)
{ this.view=false;
  this.cardform=false;
  let id=this.logincarduserform.get('emiCardId').value;
  console.log(id)
  this.ecs.getsinglecard(id).subscribe(data=>{
    console.log(data);
  })


}
}