import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { BankAxisComponent } from './bank-axis/bank-axis.component';
import { TestExComponent } from './test-ex/test-ex.component';
import { TeslaCarComponent } from './tesla-car/tesla-car.component';
import { ParachuteComponent } from './parachute/parachute.component';
import { ForestComponent } from './forest/forest.component';


@NgModule({
  declarations: [
    AppComponent,
    BankAxisComponent,
    TestExComponent,
    TeslaCarComponent,
    ParachuteComponent,
    ForestComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }