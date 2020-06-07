import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { SharedService } from '../OE_Servive/shared.service';
import { ActivatedRoute } from '@angular/router';
import { AppLetter } from '../OE_Model/AppLetter.model';

@Component({
  selector: 'app-app-letter-login',
  templateUrl: './app-letter-login.component.html',
  styleUrls: ['./app-letter-login.component.css']
})
export class AppLetterLoginComponent implements OnInit {

  data:AppLetter=new AppLetter();
  constructor(private route:ActivatedRoute, private ecs:SharedService) { }

  ngOnInit() {
    alert(this.route.snapshot.params.approvalLetterId);
this.ecs.getsingle(parseInt(this.route.snapshot.params.approvalLetterId)).subscribe(data=>this.data=data)
  }











  

//   loginForm:FormGroup;
 
//   constructor(private fb1: FormBuilder) { }

//   ngOnInit() {

//                 this.loginForm = this.fb1.group ({
//                  approvalLetterId :[ ]
//                  });
//              }
     

//   onLogin()
//   {
// console.log(this.loginForm.value);
// let approvalLetterId = this.loginForm.value.approvalLetterId;
// console.log(this.loginForm.value.approvalLetterId);

//   }


}
