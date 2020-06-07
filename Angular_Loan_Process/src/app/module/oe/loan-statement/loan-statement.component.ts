import { Component, OnInit } from '@angular/core';

import { Router ,ActivatedRoute} from '@angular/router';
import { LoanAccountStatement } from '../LoanAccountStatement.model';
import { SharedServiceService } from '../sharedStatement/shared-service.service';


@Component({
  selector: 'app-loan-statement',
  templateUrl: './loan-statement.component.html',
  styleUrls: ['./loan-statement.component.scss']
})
export class LoanStatementComponent implements OnInit {

  constructor(public s:SharedServiceService,private router:Router) { }

   ngOnInit() {
   }
   submitdata(lcs:LoanAccountStatement)
{
   if(lcs.loanStatementId==null)
   {
 this.s.postdata(lcs).subscribe();
   }
   else
   {
     this.s.updatedata(lcs).subscribe();
   }
 }
  resetdata()
  {
    this.s.ls=Object.assign({},null);
 }


 

}
