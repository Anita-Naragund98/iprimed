import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DrctvsComponent } from './drctvs.component';

describe('DrctvsComponent', () => {
  let component: DrctvsComponent;
  let fixture: ComponentFixture<DrctvsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DrctvsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DrctvsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
