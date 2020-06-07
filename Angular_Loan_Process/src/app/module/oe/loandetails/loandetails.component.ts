import { Component, OnInit } from '@angular/core';
import { OeserviceService } from '../shared/oeservice.service';
import { LoanDetails } from '../loanDetails';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-loandetails',
  templateUrl: './loandetails.component.html',
  styleUrls: ['./loandetails.component.scss']
})
export class LoandetailsComponent implements OnInit {

  constructor(public loandetailsservice:OeserviceService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit() {
  }
  onSubmit(loanDetails:LoanDetails){
    if(this.loandetailsservice.loanDeatailForm.get('loanDetailId').value==null){
      console.log(this.loandetailsservice.loanDeatailForm.get('loanDetailId').value);
      console.log(this.loandetailsservice.saveLoanDetails);
   this.loandetailsservice.saveLoanDetails( this.loandetailsservice.loanDeatailForm.value).subscribe();
   
    }
    else{
      this.loandetailsservice.updateLoanDetails( this.loandetailsservice.loanDeatailForm.value).subscribe();
    }
}
resetdata(){
  this.loandetailsservice.loanDeatailForm=Object.assign({},null);
}
showLoanDetails(){
this.router.navigate(['../loandetailslist'],{relativeTo:this.route})
}
}
  

