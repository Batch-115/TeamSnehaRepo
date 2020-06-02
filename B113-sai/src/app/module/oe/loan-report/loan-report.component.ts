import { Component, OnInit } from '@angular/core';

import { AppLetter } from '../OE_Model/AppLetter.model';

import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-loan-report',
  templateUrl: './loan-report.component.html',
  styleUrls: ['./loan-report.component.css']
})
export class LoanReportComponent implements OnInit {
  apLe:FormGroup;

  constructor(private fb:FormBuilder) { }

  searchForm = this.fb.group({
   
    customerId :[] ,
    productId :[],
    loanId: [],
    loanAmount:[]
        
  });
  dataget()
  {
    console.log(this. searchForm );
  }



 


    ngOnInit() {
      
      
    
    }
 /* editdata(apLe:AppLetter)
  {
this.s.ap=Object.assign({},apLe);
  }
  deletedata(apLe:AppLetter)
  {
this.s.deletedata(apLe).subscribe();
  }*/


   
}
