import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bank-axis',
  templateUrl: './bank-axis.component.html',
  styleUrls: ['./bank-axis.component.css']
})
export class BankAxisComponent {

  show1:boolean=false;
disp:boolean=false;
display:boolean=false;
cust:boolean=false;
mobile:boolean=false;
show(){
  this.show1=!this.show1;
  this.disp=false;
  this.display=false;
  this.cust=false;
  this.mobile=false;
}

Disp(){
  this.disp=!this.disp;
  this.show1=false;
  this.display=false;
  this.cust=false;
  this.mobile=false;
}

Display(){
  this.display=!this.display;
  this.show1=false;
  this.disp=false;
  this.cust=false;
  this.mobile=false;
}

Customer(){
  this.cust=!this.cust;
  this.show1=false;
  this.display=false;
  this.disp=false;
  this.mobile=false;
}

Contact(){
  this.mobile=!this.mobile;
  this.show1=false;
  this.display=false;
  this.cust=false;
  this.disp=false;
}

}
