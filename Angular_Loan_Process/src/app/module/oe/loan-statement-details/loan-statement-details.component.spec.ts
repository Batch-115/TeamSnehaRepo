import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanStatementDetailsComponent } from './loan-statement-details.component';

describe('LoanStatementDetailsComponent', () => {
  let component: LoanStatementDetailsComponent;
  let fixture: ComponentFixture<LoanStatementDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoanStatementDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoanStatementDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
