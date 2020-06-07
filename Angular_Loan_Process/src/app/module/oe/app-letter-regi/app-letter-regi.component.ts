import { Component, OnInit } from '@angular/core';
//import { SharedService } from '../OE_Servive/shared.service';
//import { AppLetter } from '../OE_Model/AppLetter.model';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { SharedService } from '../SharedApproval/shared.service';
import { AppLetter } from '../AppLetter.model';

@Component({
  selector: 'app-app-letter-regi',
  templateUrl: './app-letter-regi.component.html',
  styleUrls: ['./app-letter-regi.component.css']
})
export class AppLetterRegiComponent implements OnInit {
  approvalLetterId:number;
  customerId:number;
  productId:number;
  loanAmount:any;
  rateOfIntrest:any;
  
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
  
  customerdelete(id)
 {
  this.ecs.deleteData(id).subscribe(data=>{
    this.getall();
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
   
}
