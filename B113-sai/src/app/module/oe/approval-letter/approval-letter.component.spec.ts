import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApprovalLetterComponent } from './approval-letter.component';

describe('ApprovalLetterComponent', () => {
  let component: ApprovalLetterComponent;
  let fixture: ComponentFixture<ApprovalLetterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApprovalLetterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApprovalLetterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
