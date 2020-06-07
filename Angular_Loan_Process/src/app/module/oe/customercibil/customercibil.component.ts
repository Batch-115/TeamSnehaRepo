import { Component, OnInit } from '@angular/core';
import { OeserviceService } from '../shared/oeservice.service';
import { CustomerCibil } from '../customercibil';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-customercibil',
  templateUrl: './customercibil.component.html',
  styleUrls: ['./customercibil.component.scss']
})
export class CustomercibilComponent implements OnInit {

  constructor(public cibilservice:OeserviceService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit() {
  }
  onSubmit(customercibil:CustomerCibil){
    if(this.cibilservice.customercibilform.get('cibilId').value==null){
   this.cibilservice.saveCibilData( this.cibilservice.customercibilform.value).subscribe();
   console.log(this.cibilservice.saveCibilData);
    }
    else{
      this.cibilservice.updateCibilData( this.cibilservice.customercibilform.value).subscribe();
    }
}
resetdata(){
  this.cibilservice.customercibilform=Object.assign({},null);
}
showCibilDetails(){
  this.router.navigate(['../customercibillist'],{relativeTo:this.route})
  }

  }


