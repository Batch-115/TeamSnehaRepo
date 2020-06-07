import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomercibilComponent } from './customercibil.component';

describe('CustomercibilComponent', () => {
  let component: CustomercibilComponent;
  let fixture: ComponentFixture<CustomercibilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomercibilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomercibilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
