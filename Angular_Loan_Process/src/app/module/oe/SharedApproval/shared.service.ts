import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
//import { AppLetter } from '../OE_Model/AppLetter.model';
import { Observable, pipe } from 'rxjs';
import { map } from 'rxjs/operators';
import { AppLetter } from '../AppLetter.model';

@Injectable()
export class SharedService {

  constructor(private http:HttpClient) { 
   
  }
  postData(regdata):Observable<AppLetter>
  {
    console.log(regdata);
    return  this.http.post<AppLetter>("http://localhost:8084/postAppData",regdata);
  }
 fetchall():Observable<AppLetter[]>
 {
    return this.http.get<AppLetter[]>("http://localhost:8084/getAppData");
   
 }

 updateData(data)
 {
  console.log(data);
    return this.http.put("http://localhost:8084/updateApp",data);
   
 }

   deleteData(id)
 {
    return this.http.delete<number>("http://localhost:8084/deleteApp/"+id);
   
 }

  getsingle(id:number):Observable<AppLetter>
   {
     return this.fetchall().pipe(map(appdata=>appdata.find(apda=>apda.approvalLetterId===id)));
   }
  
   

}
