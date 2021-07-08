import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AxisLoginComponent } from './axis-login.component';

describe('AxisLoginComponent', () => {
  let component: AxisLoginComponent;
  let fixture: ComponentFixture<AxisLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AxisLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AxisLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
