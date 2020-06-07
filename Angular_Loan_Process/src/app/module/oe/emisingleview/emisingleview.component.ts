import { Component,Input, OnInit } from '@angular/core';
import { emidata } from '../emidata';
import { ActivatedRoute } from '@angular/router';
import { EmicommonService } from '../emicommon.service';

@Component({
  selector: 'app-emisingleview',
  templateUrl: './emisingleview.component.html',
  styleUrls: ['./emisingleview.component.css']
})
export class EmisingleviewComponent implements OnInit {

data:emidata=new emidata();
  constructor(private route:ActivatedRoute, private ecs:EmicommonService) { }

  ngOnInit() {
    alert(this.route.snapshot.params.emiDetailsId);
this.ecs.getsingle(parseInt(this.route.snapshot.params.emiDetailsId)).subscribe(data=>this.data=data)
  }

}