import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, observable, from } from 'rxjs';
import { emidata } from './emidata';
import { map } from 'rxjs/operators';
import { emicardgeneration } from './emicardgenerate';


@Injectable()
export class EmicommonService {
emicardgenerate;
  constructor(private http:HttpClient) { 
   
  }
 registeremidata(regemidata):Observable<emidata>
    {
      console.log(regemidata)
      return  this.http.post<emidata>("http://localhost:8084/reg",regemidata)
    }
    registercardemidata(regemidata)
    {
      console.log(regemidata)
      return  this.http.post("http://localhost:8084/cardreg",regemidata)
    }
 
   fetchall():Observable<emidata[]>
   {
      return this.http.get<emidata[]>("http://localhost:8084/getall")
     
   }
   fetchallcarddata():Observable<emicardgeneration[]>
   {
      return this.http.get<emicardgeneration[]>("http://localhost:8084/cardgetall")
     
   }
   getsinglecard(id:number):Observable<emicardgeneration>
    {
    
      return this.fetchallcarddata().pipe(map(emidatas=>emidatas.find(emida=>emida.emiCardId===id)))
    }
    
   
     getsingle(id:number):Observable<emidata>
     {
       return this.fetchall().pipe(map(emidatas=>emidatas.find(emida=>emida.emiDetailsId===id)))
     }
    deletedata(id):Observable<number>
    {
      return this.http.delete<number>("http://localhost:8084/emidelete/"+id)
    }
    deletecarddata(emiCardId)
    {
     return this.http.delete<number>("http://localhost:8084/carddelete/"+emiCardId) 
    }
    updatecarddata(data)
    {
     console.log(data)
       return  this.http.put("http://localhost:8084/amolupdate",data)
    }
}