import { BrowserModule } from "@angular/platform-browser";
import { NgModule, Component } from "@angular/core";
import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from "./app.component";
import { HeaderComponent } from "./header/header.component";
import { RegisterComponent } from "./register/register.component";
import { RouterModule } from "@angular/router";
import { FormsModule } from "@angular/forms";
import { LoginComponent } from "./login/login.component";
import { AdminComponent } from "./admin/admin.component";
import { UserComponent } from "./user/user.component";
import { LogoutComponent } from "./logout/logout.component";
import { HomeComponent } from "./home/home.component";
import { AuthGuard } from "auth.guard";
import { ShowUserComponent } from './show-user/show-user.component';
import { UserupdateComponent } from './userupdate/userupdate.component';
import { BookInventoryComponent } from './admin/book-inventory/book-inventory.component';
import { BookissuedComponent } from './admin/bookissued/bookissued.component';
import { RequestUserComponent } from './request-user/request-user.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RegisterComponent,
    LoginComponent,
    AdminComponent,
    UserComponent,
    LogoutComponent,
    HomeComponent,
    ShowUserComponent,
    UserupdateComponent,
    BookInventoryComponent,
    BookissuedComponent,
    RequestUserComponent,
    ChangepasswordComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: "home", component: HomeComponent },
      { path: "register", component: RegisterComponent },
      { path: "login", component: LoginComponent },
      { path: "admin", component: AdminComponent, canActivate:[AuthGuard],data:{roles:['admin']}},
      { path: "user", component: UserComponent,canActivate:[AuthGuard],data:{roles:['admin','user']}},
      { path: "logout", component: LogoutComponent },
      {path:"search",component:ShowUserComponent},
      {path:"update",component:UserupdateComponent},
      {path:"addbook",component:BookInventoryComponent},
      {path:"requestBook",component:RequestUserComponent},
      {path:"bookIssued",component:BookissuedComponent},
      {path:"changepassword",component:ChangepasswordComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
