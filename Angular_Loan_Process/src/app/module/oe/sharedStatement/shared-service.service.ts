import { Injectable } from '@angular/core';
import { HttpClient,HttpClientModule } from '@angular/common/http';
import { LoanAccountStatement } from '../LoanAccountStatement.model';
import { CustomerDetails } from '../CustomerDetails.model';


@Injectable({
  providedIn: 'root'
})
export class SharedServiceService {

  url:string="http://localhost:8084";

  constructor(private http:HttpClient) 
  { }

ls:LoanAccountStatement=
{
  
    loanStatementId:null,
    customerId:null,
    tenor:null,
    firstInstallmentDueDate:" ",
    loanDisbursalDate:" ",
    intersetStartDate:" ",
    lastInstallmentDueDate:" ", 
    processingFees:null,
    downPayment:null,
    loanAmountWithRateOfInterest:null,
    
  }
  cs:CustomerDetails=
  {

    customerId:null,
    customerFirstName:" ",
    customerMiddleName:" ",
    customerLastName:" ",
    customerDataOfBirth:" ",
    customerGender:" ",
    customerMaritailStatus:" ",
    customerMobileNumber:" ",
    customerAddress:" ",
    customerEducation:" ",
    customerAppliedLoadAmount:" ",
    status:null
}
  postdata(lcs:LoanAccountStatement )
  {
   return this.http.post(this.url+"/loanStatementpostdata",lcs);
  }


   getdata()
   {
    return this.http.get(this.url+"/loanStatementgetdata");
  
   }
   customergetdata()
   {
    return this.http.get(this.url+"/cdgetAlldata");
  
   }

  
    deletedata(lcs: LoanAccountStatement)
   {
      return this.http.delete(this.url+"/deleteloanstatement/"+lcs.loanStatementId);
    }
    
    updatedata(lcs:LoanAccountStatement)
    {
      return this.http.put(this.url+"/updateloanstatement",lcs);
    }


}
