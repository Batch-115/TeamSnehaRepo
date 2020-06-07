import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup, FormControl } from '@angular/forms';
import { DocumentVerificationModel } from '../DocumentVerification.model';
import { SharedserviceService } from '../dvshared/sharedservice.service';


@Component({
  selector: 'app-documentverification',
  templateUrl: './documentverification.component.html',
  styleUrls: ['./documentverification.component.scss']
})
export class DocumentverificationComponent implements OnInit {
  dvm: DocumentVerificationModel[];
 
 ngOnInit(): void {
   this.s.getdata().subscribe((data:DocumentVerificationModel[])=>(this.dvm=data))
  
     //this.s.getCdata(DocumentVerificationModel["customerdetails"]).subscribe((data:DocumentVerificationModel[])=>{this.dvm=data})
  
  //   throw new Error("Method not implemented.");
  // }
  // form = new FormGroup({
  //   customerId: new FormControl('',Validators.required),
  //   status: new FormControl('', Validators.required)
  // });
  
  // get f(){
  //   return this.form.controls;
  // }
  
  // submit(){
  //   console.log(this.form.value);
   }
  constructor(private s:SharedserviceService) { }

  
  submitdata(dvm:DocumentVerificationModel)
  {
    if(dvm.documentVerificationId==null)
    {
      this.s.postdata(dvm).subscribe();
    }
    else
    {
        this.s.updatedata(dvm).subscribe();
    }

  }
  resetdata()
  {
    this.s.dv=Object.assign({},null);
  }
  editdata(dvm:DocumentVerificationModel)
  {
       this.s.dv=Object.assign({},dvm);
  }
  
  deletedata(dvm:DocumentVerificationModel)
  {
     this.s.deletedata(dvm).subscribe();
  }
  
}
