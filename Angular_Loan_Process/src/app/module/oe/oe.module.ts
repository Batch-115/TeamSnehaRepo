import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OedashboardComponent } from './oedashboard/oedashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { LoandetailsComponent } from './loandetails/loandetails.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CustomercibilComponent } from './customercibil/customercibil.component';
import { LoandetailslistComponent } from './loandetailslist/loandetailslist.component';
import { CustomercibillistComponent } from './customercibillist/customercibillist.component';
import { EmidetailsComponent } from './emidetails/emidetails.component';
import { EmicommonService } from './emicommon.service';
import { EmisingleviewComponent } from './emisingleview/emisingleview.component';
import { EmicardgenerationComponent } from './emicardgeneration/emicardgeneration.component';
import { SinglecarddetailsComponent } from './singlecarddetails/singlecarddetails.component';
import { DocumentverificationComponent } from './documentverification/documentverification.component';
import { SharedserviceService } from './dvshared/sharedservice.service';
import { AppLetterRegiComponent } from './app-letter-regi/app-letter-regi.component';
import { ApprovalLetterSingleComponent } from './approval-letter-single/approval-letter-single.component';
import { SharedService } from './SharedApproval/shared.service';
import { SharedServiceService } from './sharedStatement/shared-service.service';
import { LoanStatementComponent } from './loan-statement/loan-statement.component';
import { LoanStatementDetailsComponent } from './loan-statement-details/loan-statement-details.component';
import { CustomerDetailsComponent } from './customer-details/customer-details.component';

const oerouting:Routes=[
  {path:'oedashboard',component:OedashboardComponent},
  {path:'loandetails',component:LoandetailsComponent},
  {path: 'loandetailslist',component:LoandetailslistComponent},
  {path: 'customercibil',component:CustomercibilComponent},
  {path: 'customercibillist', component:CustomercibillistComponent},
  {path: 'emidetails', component:EmidetailsComponent},
  {path:'emisingle/:emiDetailsId',component: EmisingleviewComponent},
  {path:'emicardgeneration',component:EmicardgenerationComponent},
  {path:'singlecarddetails/:emiCardId',component:SinglecarddetailsComponent },
  {path:'documentverification',component:DocumentverificationComponent},
  {path:'appletterregistration',component:AppLetterRegiComponent},
  {path:'loanstatement',component:LoanStatementComponent},
  {path:'loanstatementdetails',component:LoanStatementDetailsComponent},
  {path:'customertdetails',component:CustomerDetailsComponent},
  {path:'appsingle/:approvalLetterId',component:ApprovalLetterSingleComponent}


]
@NgModule({
  declarations: [OedashboardComponent, LoandetailsComponent, SinglecarddetailsComponent,EmisingleviewComponent,
     CustomercibilComponent,EmidetailsComponent, LoandetailslistComponent, CustomercibillistComponent,
     EmicardgenerationComponent,DocumentverificationComponent,AppLetterRegiComponent,
     ApprovalLetterSingleComponent,LoanStatementComponent,LoanStatementDetailsComponent,CustomerDetailsComponent],
  imports: [
    CommonModule,FormsModule, ReactiveFormsModule,
    RouterModule.forChild(oerouting)
  ],
  providers: [EmicommonService,SharedserviceService,SharedService,SharedServiceService]
})
export class OeModule { }
