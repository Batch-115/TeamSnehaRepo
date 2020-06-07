import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomercibillistComponent } from './customercibillist.component';

describe('CustomercibillistComponent', () => {
  let component: CustomercibillistComponent;
  let fixture: ComponentFixture<CustomercibillistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomercibillistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomercibillistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
