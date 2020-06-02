import { Component, OnInit, Inject } from '@angular/core';
import { SharedService } from '../OE_Servive/shared.service';
import { AppLetter } from '../OE_Model/AppLetter.model';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { ParamMap, ActivatedRoute, Router } from '@angular/router';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-approval-letter',
  templateUrl: './approval-letter.component.html',
  styleUrls: ['./approval-letter.component.css']
})
export class ApprovalLetterComponent  {
//export class ApprovalLetterComponent implements OnInit {

//   displayedColumns: string[] = ['approvalLetterId', 'customerId', 'productId', 'loanAmount', 'rateOfIntrest'];
//   columnsToDisplay: string[] = this.displayedColumns.slice();

//   appll:AppLetter[] ;
//     approvalLetterId:any;
     
//   loginForm:FormGroup;
//  // apll:AppLetter[];
 

//  constructor(private es : SharedService,private actroute : ActivatedRoute, private route : Router,
//   @Inject(DOCUMENT) private document: Document) { 
//     console.log("constructor");
//   }


// ngOnInit(): void {   
  
//   this.actroute.paramMap.subscribe((params : ParamMap) => {
//     this.approvalLetterId = params.get('approvalLetterId');
//       console.log(this.approvalLetterId);
//     this.getData(this.approvalLetterId);
//   });
  
// }

// getData(approvalLetterId){
//   return this.es.getData(approvalLetterId).subscribe((data : AppLetter[]) => this.appll = data)
// }

// trackByempId(index : number, appl:AppLetter) : number{
//   return appl.approvalLetterId;
// }


// editdata( element)   {
//  this.es.registerForm.setValue(element);
//  console.log(this.es.registerForm);
//     this.route.navigate(['register']);
//   }
//  deletedata( approvalLetterId)
//   {
//     console.log(approvalLetterId);
//   this.es.deletedata(approvalLetterId).subscribe( () => {this.getData(this.approvalLetterId);
//   });
 
  
  











//   constructor(private s:SharedService, private fb1: FormBuilder) { }

//   ngOnInit() {

//   this.loginForm = this.fb1.group ({
//       approvalLetterId :[ ]
//     });

//     //this.s.getdata().subscribe((data:AppLetter[])=>{this.apll=data})
//      }
     

//   onLogin()
//   {
// console.log(this.loginForm.value);
// let approvalLetterId = this.loginForm.value.approvalLetterId;
// console.log(this.loginForm.value.approvalLetterId);

//   }

    

 
}
