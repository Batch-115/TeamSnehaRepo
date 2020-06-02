import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppLetterLoginComponent } from './app-letter-login.component';

describe('AppLetterLoginComponent', () => {
  let component: AppLetterLoginComponent;
  let fixture: ComponentFixture<AppLetterLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppLetterLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppLetterLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
