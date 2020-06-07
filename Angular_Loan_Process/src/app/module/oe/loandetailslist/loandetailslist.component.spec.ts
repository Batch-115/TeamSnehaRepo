import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoandetailslistComponent } from './loandetailslist.component';

describe('LoandetailslistComponent', () => {
  let component: LoandetailslistComponent;
  let fixture: ComponentFixture<LoandetailslistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoandetailslistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoandetailslistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
