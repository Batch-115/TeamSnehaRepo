import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { FormBuilder, FormGroup } from '@angular/forms';
import { LoanDetails } from '../loanDetails';
import { CustomerCibil } from '../customercibil';

//let header = new HttpHeaders({'content-type': 'application/json'});
  

@Injectable({
  providedIn: 'root'
})
export class OeserviceService {
  //loanDeatailForm:FormGroup;
  constructor(public http:HttpClient,public fb:FormBuilder) { }

  loanDeatailForm:FormGroup=this.fb.group({
  loanDetailId: null,
      product: [''],
    loanAccountNo: [''],
    customerId:[''],
    
    loanCalculation:this.fb.group({
    
      loanId: null,

      loanAmount: [''],
      rateOfInterest: [''],
      tenure: [''],
      totalInterest: [''],
      totalRepayment:[''],
      loanInstallment:['']

    })
});

customercibilform:FormGroup=this.fb.group({
  cibilId:null,
  cibilScore:[''],
  customerId:[''],
  cibilRemark:[''],
  cibilScoreDateTime:[''],
  status:['']
})
loanDetailurl="http://localhost:8084";

saveLoanDetails(loandetails:LoanDetails){
  //let data = JSON.stringify(this.loanDeatailForm.value)
console.log(this.loanDetailurl+"/loan-details/save",loandetails)
return this.http.post(this.loanDetailurl+"/loan-details/save",loandetails);

}
updateLoanDetails(loandetails:LoanDetails){
  return this.http.put(this.loanDetailurl+"/loan-details/update"+loandetails.loanDetailId,loandetails);
}
getLoanDetails(){
  return this.http.get(this.loanDetailurl+"/loan-details/get");
}
deleteloandetails(loandetails:LoanDetails){
  return this.http.delete(this.loanDetailurl+"/loan-details/delete/"+loandetails.loanDetailId)
}
saveCibilData(customercibil:CustomerCibil){
console.log(this.loanDetailurl+"/cibil/save",customercibil)
return this.http.post(this.loanDetailurl+"/cibil/save",customercibil);
}
updateCibilData(customercibil:CustomerCibil){
  return this.http.put(this.loanDetailurl+"/cibil/update"+customercibil.cibilId,customercibil);
}
getCibilData(){
  return this.http.get(this.loanDetailurl+"/cibil/get");

}
deleteCibilData(customercibil:CustomerCibil){
  return this.http.delete(this.loanDetailurl+"/cibil/delete/"+customercibil.cibilId);

}

}
