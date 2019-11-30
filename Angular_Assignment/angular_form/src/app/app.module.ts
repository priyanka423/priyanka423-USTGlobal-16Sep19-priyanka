import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SheduleinterviewComponent } from './sheduleinterview/sheduleinterview.component';
import { AdduserComponent } from './adduser/adduser.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { RouterModule } from '@angular/router';
import { AddrequestComponent } from './addrequest/addrequest.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SheduleinterviewComponent,
    AdduserComponent,
    AddproductComponent,
    AddrequestComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'add' , component : AddproductComponent},
      {path : 'request' , component : AddrequestComponent},
      {path:'interview', component: SheduleinterviewComponent},
      {path:'user',component: AdduserComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
