import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userupdate',
  templateUrl: './userupdate.component.html',
  styleUrls: ['./userupdate.component.css']
})
export class UserupdateComponent implements OnInit {

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
