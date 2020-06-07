import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApprovalLetterSingleComponent } from './approval-letter-single.component';

describe('ApprovalLetterSingleComponent', () => {
  let component: ApprovalLetterSingleComponent;
  let fixture: ComponentFixture<ApprovalLetterSingleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApprovalLetterSingleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApprovalLetterSingleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
