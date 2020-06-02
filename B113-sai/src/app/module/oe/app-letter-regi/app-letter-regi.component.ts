import { Component, OnInit } from '@angular/core';
import { SharedService } from '../OE_Servive/shared.service';
import { AppLetter } from '../OE_Model/AppLetter.model';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-app-letter-regi',
  templateUrl: './app-letter-regi.component.html',
  styleUrls: ['./app-letter-regi.component.css']
})
export class AppLetterRegiComponent implements OnInit {
  constructor(private ecs:SharedService,private route:ActivatedRoute,private router:Router) { }
  userform:FormGroup;
  loginform:FormGroup;
   formactive:boolean=false; 
   loginformactive:boolean=false; 
   activetable:boolean=false;
   alldata:AppLetter[];
   id:any;
    ngOnInit():void
    {
  
  this.userform = new FormGroup({
    customerId: new FormControl(),
  productId:new FormControl(),
  loanAmount:new FormControl(),
  rateOfIntrest:new FormControl()
    });

  this.loginform = new FormGroup({
     approvalLetterId: new FormControl()
   
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
    let regdata=hiuserform.value;
  
  this.userform.reset(); 
  this.createappdata(regdata)
   this. formactive=false;
  
  }
  createappdata(postdata:AppLetter)
   {
  this.ecs. postData(postdata).subscribe(data=>{
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
  this.ecs.fetchall().subscribe((data:AppLetter[])=>{
    console.log(data);
    this.alldata=data;
     
    
  })
  }
  customerdetails(customerId)
  {
    console.log(customerId)
  this.router.navigate(['../appsingle',customerId],{relativeTo:this.route})
  }
   
 

//   constructor(public s:SharedService) { }

//   ngOnInit() {
//   }
// submitData(al:AppLetter)
// {
//   if(al.approvalLetterId==null)
//   {
// this.s.postData(al).subscribe();
// }
// else
// {
//   this.s.updateData(al).subscribe();
// }
// }
// resetdata()
// {
//   this.s.registerForm=Object.assign({},null);
// }



}
