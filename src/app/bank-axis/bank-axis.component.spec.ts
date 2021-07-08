import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BankAxisComponent } from './bank-axis.component';

describe('BankAxisComponent', () => {
  let component: BankAxisComponent;
  let fixture: ComponentFixture<BankAxisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BankAxisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BankAxisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
