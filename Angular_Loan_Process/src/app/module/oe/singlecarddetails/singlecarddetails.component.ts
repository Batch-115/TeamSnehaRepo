import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmicommonService } from '../emicommon.service';
import { emicardgeneration } from '../emicardgenerate';

@Component({
  selector: 'app-singlecarddetails',
  templateUrl: './singlecarddetails.component.html',
  styleUrls: ['./singlecarddetails.component.css']
})
export class SinglecarddetailsComponent implements OnInit {
 data:emicardgeneration=new emicardgeneration();
  constructor(private route:ActivatedRoute, private ecs:EmicommonService) { }

  ngOnInit() {
     alert(this.route.snapshot.params.emiDetailsId);
this.ecs.getsinglecard(parseInt(this.route.snapshot.params.emiCardId)).subscribe(data=>this.data=data)
  }

}