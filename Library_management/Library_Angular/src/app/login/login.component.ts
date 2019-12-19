import { Component, OnInit } from "@angular/core";
import { NgForm, FormGroup, FormControl, Validators } from "@angular/forms";
import { UserService } from "../user.service";
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  error: any;
  products;
  userSession: any;
  ngOnInit() {
  }
   
  constructor(private auth:UserService,private router:Router){}
  setErrorMessage:any;
  login(form:NgForm){
    this.error=null;
    console.log(form.value);
    var login;
   
    this.auth.loginUser(form.value).subscribe(data=>{
      //console.log('Response of login',data.userBeans[0]);
      if(data.statusCode===201){
        console.log(data);
        login = data.userBeans[0];
        localStorage.setItem('UserDeatails',JSON.stringify(login));
        this.userSession =localStorage.getItem('UserDeatails');
        this.router.navigateByUrl('/home');
      }
      else{
        this.setErrorMessage ="Wrong email and password combination..";
      }
      form.reset();
    },err=>{
      console.log(err);
      this.error=err.error.message;
    
    });
}
  


}
