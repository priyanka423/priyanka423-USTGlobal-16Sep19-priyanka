import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  error:string;
   
  constructor(private auth: UserService,private router:Router) {}
  get user(): any {
    return localStorage.getItem('UserDeatails')? JSON.parse(localStorage.getItem('UserDeatails')):[];
  }

  updates(form: NgForm){

   this.error=null;
    this.auth.updatesUser(form.value).subscribe(res =>{
      this.auth.getTodo(form.value).subscribe(data=>{
        console.log('Response of login',data);
        if(form.value){
        localStorage.setItem('UserDeatails',JSON.stringify(data.userBeans[0]));
        alert("Updated"); 
        this.router.navigateByUrl('/user');
        }
        
      },err=>{
        console.log(err);
        this.error=err.error.message;
      
      });
      
    },err=>{
      console.log(err);
      this.error=err.error.message;
   
   });
 }
 

  ngOnInit() {
  }

}
