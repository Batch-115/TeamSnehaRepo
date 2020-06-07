import { Component, OnInit, inject } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { EmicommonService } from '../emicommon.service';
import { emidata } from '../emidata';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { DOCUMENT } from '@angular/common';
@Component({
  selector: 'app-emidetails',
  templateUrl: './emidetails.component.html',
  styleUrls: ['./emidetails.component.css']
})
export class EmidetailsComponent implements OnInit {
  emiDetailsId:number;
      customerId:number;
  productId:number;
  customerName:String;
  monthlyEmiAmount:any;
  installment:number;
  constructor(private ecs:EmicommonService,private route:ActivatedRoute,private router:Router) { }
userform:FormGroup;
loginform:FormGroup;
 formactive:boolean=false; 
 loginformactive:boolean=false; 
 activetable:boolean=false;
 alldata:emidata[];
 id:any;
  ngOnInit():void
  {

this.userform = new FormGroup({
  emiDetailsId:new FormControl(),
customerId: new FormControl(),
productId:new FormControl(),
customerName:new FormControl(),
monthlyEmiAmount:new FormControl(),
installment:new FormControl()
});
this.loginform = new FormGroup({
   emiDetailsId: new FormControl()
 
});



  }
  activeform()
  {
    this. formactive=true;
   this.activetable=false;
  }
  loginactiveform()
  {
    this.activetable=true;
    this. loginformactive=false;
    this. formactive=false;
    this.getall();
  }
submituser(hiuserform)
{
  let regemidata=hiuserform.value;

this.userform.reset(); 
this.createemidata(regemidata)
 this. formactive=false;

}
createemidata(regemidata:emidata)
 {
this.ecs.registeremidata(regemidata).subscribe(data=>{
 this. formactive=false;
})

 }
 loginuser(loginform)
{
  console.log(loginform);
  
 
  this.loginform.reset();
}
getall()
{
this.ecs.fetchall().subscribe((data:emidata[])=>{
  console.log(data);
  this.alldata=data;
   
  
})
}
customerdetails(customerId)
{
  console.log(customerId)
this.router.navigate(['../emisingle',customerId],{relativeTo:this.route})
}
cardactiveform()
{
  this.router.navigate(['../emicardgeneration'],{relativeTo:this.route})

}
cardloginform()
{
   this.router.navigate(['../emicardgeneration'],{relativeTo:this.route})

}
 customerdelete(id)
 {
  this.ecs.deletedata(id).subscribe(data=>{
    this.getall();
  }) 
  
 }
  customeredit(id)
  {
     this. formactive=true;
      this.activetable=false;
  this.ecs.getsingle(id).subscribe(data=>{
    console.log(data)
    this.userform.controls['emiDetailsId'].setValue(data.emiDetailsId);
  this.userform.controls['customerId'].setValue(data.customerId);
   this.userform.controls['productId'].setValue(data.productId);
    this.userform.controls['customerName'].setValue(data.customerName);
     this.userform.controls['monthlyEmiAmount'].setValue(data.monthlyEmiAmount);
      this.userform.controls['installment'].setValue(data.installment);
 this.getall();
   })

 }
 }
