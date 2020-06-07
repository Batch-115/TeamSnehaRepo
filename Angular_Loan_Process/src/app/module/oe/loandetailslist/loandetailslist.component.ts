import { Component, OnInit } from '@angular/core';
import { OeserviceService } from '../shared/oeservice.service';
import { LoanDetails } from '../loanDetails';

@Component({
  selector: 'app-loandetailslist',
  templateUrl: './loandetailslist.component.html',
  styleUrls: ['./loandetailslist.component.scss']
})
export class LoandetailslistComponent implements OnInit {
  loandetails:LoanDetails[];

  constructor(public loandetailsservice:OeserviceService) { }

  ngOnInit() {
    this.loandetailsservice.getLoanDetails().subscribe((data:LoanDetails[])=>{this.loandetails=data})
  }

   editdata(loandetails:LoanDetails){
     this.loandetailsservice.loanDeatailForm.setValue(loandetails);
   }
  deleteloandetails(loandetails:LoanDetails){
    this.loandetailsservice.deleteloandetails(loandetails).subscribe();
  }
}
