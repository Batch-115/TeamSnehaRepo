import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { AppLetter } from '../AppLetter.model';
import { SharedService } from '../SharedApproval/shared.service';


@Component({
  selector: 'app-approval-letter-single',
  templateUrl: './approval-letter-single.component.html',
  styleUrls: ['./approval-letter-single.component.scss']
})
export class ApprovalLetterSingleComponent implements OnInit {

    data:AppLetter=new AppLetter();
    constructor(private route:ActivatedRoute, private ecs:SharedService) { }
  
    ngOnInit() {
      alert(this.route.snapshot.params.approvalLetterId);
  this.ecs.getsingle(parseInt(this.route.snapshot.params.approvalLetterId)).subscribe(data=>this.data=data)
    }

     

}
