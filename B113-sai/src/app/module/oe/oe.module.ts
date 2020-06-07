import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OedashboardComponent } from './oedashboard/oedashboard.component';
import { Routes, RouterModule } from '@angular/router';
import {  ReactiveFormsModule, FormsModule } from '@angular/forms';
import { AppLetterRegiComponent } from './app-letter-regi/app-letter-regi.component';
import { ApprovalLetterComponent } from './approval-letter/approval-letter.component';
import { HttpClientModule } from '@angular/common/http';
import { SharedService } from './OE_Servive/shared.service';
import { AppLetterLoginComponent } from './app-letter-login/app-letter-login.component';

const oerouting:Routes=[
  {path:'oedashboard',component:OedashboardComponent},
  {path:'ApprovalLetterRegi',component:AppLetterRegiComponent},  
  {path:'appsingle/:approvalLetterId',component:AppLetterLoginComponent} 
]
@NgModule({
  declarations: [OedashboardComponent, AppLetterRegiComponent, ApprovalLetterComponent, AppLetterLoginComponent],
  imports: [
    CommonModule,ReactiveFormsModule,
    RouterModule.forChild(oerouting),FormsModule,HttpClientModule
  ],
  providers: [SharedService]

})
export class OeModule { }
