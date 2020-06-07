import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppLetter } from '../OE_Model/AppLetter.model';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class SharedService {

  constructor(private http:HttpClient) { 
   
  }
 postData(regemidata):Observable<AppLetter>
    {
      console.log(regemidata);
      return  this.http.post<AppLetter>("http://localhost:8084/postData",regemidata);
    }
   fetchall():Observable<AppLetter[]>
   {
      return this.http.get<AppLetter[]>("http://localhost:8084/getAllData");
     
   }

   updateData():Observable<AppLetter[]>
   {
      return this.http.get<AppLetter[]>("http://localhost:8084/update/");
     
   }

   deleteData():Observable<AppLetter[]>
   {
      return this.http.delete<AppLetter[]>("http://localhost:8084/delete/");
     
   }

    getsingle(id:number)
     {
       return this.fetchall().map(appdata=>appdata.find(apda=>apda.approvalLetterId===id));
     }
    

















  // registerForm : FormGroup  = this.fb.group({
  //   approvalLetterId: null,
  //   customerId :[null],
  //   productId :[null],
  //   loanAmount:[null],
  //   rateOfIntrest:[null]
  // });

  // url:string="http://localhost:8084";

  // constructor(private http:HttpClient , private fb : FormBuilder) {
  //   console.log("service construct");
  //  }
  //     ngOnInit(): void {
  //   }
 
  // postdata(al:AppLetter)
  // {
  //   return this.http.post(this.url+"/postData",al);
  // }
  // getData(approvalLetterId)
  // {
      
  //    return this.http.get(this.url+"/getData/"+approvalLetterId);
  // }
  // updatedata(al:AppLetter)
  //   {
  //     return this.http.put(this.url+"/update/"+al.approvalLetterId,al);
  //   }
  //   deletedata(approvalLetterId)
  //   {
  //     return this.http.delete(this.url+"/delete/"+approvalLetterId);
  //   }

}
