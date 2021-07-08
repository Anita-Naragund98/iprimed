import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'demo-app';
 // empList="From app.component.ts";

 //uname="";
 //password="";
 //msg=""

 //handleSub(){
   //if(this.uname=="admin" && this.password=="admin"){
     //this.msg="Welcom Admin";
   //}else{
     //this.msg="Invalid user name or password....";
   //}
   //}
   titlt="assignment2";
   main=true;
   thar=false;
   parachute=false;
   forest=false;
   output(num:any){
     this.main=false;
     this.thar=false;
     this.parachute=false;
     this.forest=false;
 
     if(num==1){
       this.thar=true;
     }
     else if(num==2){
       this.parachute=true;
     }
     else if(num==3){
       this.forest=true
     }
   }
   mainmethod(){
     this.main=true;
     this.thar=false;
     this.parachute=false;
     this.forest=false;
   }
}
