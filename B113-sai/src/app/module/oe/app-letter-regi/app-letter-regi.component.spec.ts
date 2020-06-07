import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppLetterRegiComponent } from './app-letter-regi.component';

describe('AppLetterRegiComponent', () => {
  let component: AppLetterRegiComponent;
  let fixture: ComponentFixture<AppLetterRegiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppLetterRegiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppLetterRegiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
