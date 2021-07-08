import { Component, OnInit } from '@angular/core';
import { VirtualTimeScheduler } from 'rxjs';

@Component({
  selector: 'app-drctvs',
  templateUrl: './drctvs.component.html',
  styleUrls: ['./drctvs.component.css']
})
export class DrctvsComponent{

 id:number=101;
 name:string="Anita";
 age:number=23;
 phone:number=9977664432;
 blood:string="A+";

 show:boolean=false;

 toggle(){
   this.show=!this.show;
 }

}
