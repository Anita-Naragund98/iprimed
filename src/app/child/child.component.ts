import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  //@Input() empList:string="";
  @Input() uname:string="";
  @Input() password:string="";
  @Input() msg:string="";
  constructor() { }

  ngOnInit() {
  }

}
