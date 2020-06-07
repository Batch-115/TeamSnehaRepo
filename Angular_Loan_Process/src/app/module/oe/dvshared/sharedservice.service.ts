import { Injectable } from '@angular/core';
import { DocumentVerificationModel } from '../DocumentVerification.model';
import { HttpClient } from '@angular/common/http';

//import { CustomerDetailsModel } from '../CustomerDetails.model';

@Injectable({
  providedIn: 'root'
})
export class SharedserviceService {
  
  
  
 
dv:DocumentVerificationModel=
{
  documentVerificationId:null,
	firstLevelVerifyByOE:"",
	firstLevelVerifyBySE:"",
	secondLevelVerifyByThirdParty:"",
	approvedByOE:"",
	approvedBySE:"",
	pendingDocuments:"",
	status:"",
	remark:"",
  customerId:null,             
}
// cd:CustomerDetailsModel=
// {
//   customerId:null,
//   // customerFirstName:"",
//   // customerMiddleName:"",
//   // customerLastName:"",
//   // customerDataOfBirth:"",
//   // customerGender:"",
//   // customerMaritailStatus:"",
//   // customerMobileNumber:"",
//   // customerAddress:"",
//   // customerEducation:"",
//   // customerAppliedLoadAmount:"",
//   // status:null,

//  customerDocument:{
//           documentId:null,
//           addressProof:"",                        
//           idProof:"",
//           photo:"",   
//           blankcheque:"",
//          // signature:"",
//           bankStatement:"",              
//           status:null,
  
//    }

// }

  url:string="http://localhost:8084"

  
  constructor(private http:HttpClient) { }

  postdata(dvm:DocumentVerificationModel)
  {
      return this.http.post(this.url+"/dvpost",dvm);
  }
  getdata()
  {
     return this.http.get(this.url+"/dvgetAlldata");
  }
  deletedata(dvm:DocumentVerificationModel)
  {
    return this.http.delete(this.url+"/dvdelete/"+dvm.documentVerificationId)
  }
  updatedata(dvm:DocumentVerificationModel)
  {
    return this.http.put(this.url+"/dvupdate/"+dvm.documentVerificationId,dvm)
  }
  // getCustdata()
  // {
  //   // return this.http.get(this.url+"/getCdata/"+c.customerId)
  //    //return this.http.get(`${this.url}/${customerId}`);
  //    return this.http.get(this.url+"/getAllCustdata" );
  // }
}
