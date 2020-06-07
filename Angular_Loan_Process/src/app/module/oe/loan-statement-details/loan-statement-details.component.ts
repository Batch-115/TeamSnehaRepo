import { Component, OnInit } from '@angular/core'
import { Router } from '@angular/router';
import { LoanAccountStatement } from '../LoanAccountStatement.model';
import { SharedServiceService } from '../sharedStatement/shared-service.service';

@Component({
  selector: 'app-loan-statement-details',
  templateUrl: './loan-statement-details.component.html',
  styleUrls: ['./loan-statement-details.component.scss']
})
export class LoanStatementDetailsComponent implements OnInit {
  lcs:LoanAccountStatement[];
  
   constructor(public s:SharedServiceService,private route:Router) { }

  
  ngOnInit() {
     this.s.getdata().subscribe((data:LoanAccountStatement[])=>{this.lcs=data})
    
}


   editdata(lcs:LoanAccountStatement)
    {
  this.s.ls=Object.assign({},lcs);
    }


    deletedata(lcs:LoanAccountStatement)
    {
    this.s.deletedata(lcs).subscribe();
   }

 
  
  
  
}
