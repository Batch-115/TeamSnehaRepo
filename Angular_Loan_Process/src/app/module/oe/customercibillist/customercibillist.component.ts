import { Component, OnInit } from '@angular/core';
import { CustomerCibil } from '../customercibil';
import { OeserviceService } from '../shared/oeservice.service';

@Component({
  selector: 'app-customercibillist',
  templateUrl: './customercibillist.component.html',
  styleUrls: ['./customercibillist.component.scss']
})
export class CustomercibillistComponent implements OnInit {
  customercibil:CustomerCibil[];
  constructor(public customercibillist:OeserviceService) { }

  ngOnInit() {
    this.customercibillist.getCibilData().subscribe((data:CustomerCibil[])=>{this.customercibil=data});
  }
  editdata(customercibil:CustomerCibil){
    this.customercibillist.loanDeatailForm.setValue(customercibil);
  }
  deleteloandetails(customercibil:CustomerCibil){
    this.customercibillist.deleteCibilData(customercibil).subscribe();
  }
}
