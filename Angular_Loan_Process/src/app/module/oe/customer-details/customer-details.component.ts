import { Component, OnInit } from '@angular/core';
import { CustomerDetails } from '../CustomerDetails.model';
import { SharedServiceService } from '../sharedStatement/shared-service.service';

@Component({
  selector: 'app-customer-details',
  templateUrl: './customer-details.component.html',
  styleUrls: ['./customer-details.component.scss']
})
export class CustomerDetailsComponent implements OnInit {

  cs:CustomerDetails[];
  constructor(public s:SharedServiceService) { }

  ngOnInit() {
    this.s.customergetdata().subscribe((data:CustomerDetails[])=>{this.cs=data})
  }

}
