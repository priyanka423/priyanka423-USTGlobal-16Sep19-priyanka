import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {
  error: any;
  constructor(private auth: UserService,private router:Router) {}
  get user(): any {
    return localStorage.getItem('UserDeatails')? JSON.parse(localStorage.getItem('UserDeatails')):[];;
  }

  changePassword(form: NgForm){

   this.error=null;
    
      this.auth.ChangePasswordUser(form.value).subscribe(data=>{
        console.log('Response of login',data);
        if(form.value){
        alert("Password changed"); 
        this.router.navigateByUrl('/login');
        }
        
      },err=>{
        console.log(err);
        this.error=err.error.message;
      
      });
      
 }
 

  ngOnInit() {
  }

}
