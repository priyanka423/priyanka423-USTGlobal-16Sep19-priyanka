import { Component, OnInit, Injectable } from '@angular/core';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-show-user',
  templateUrl: './show-user.component.html',
  styleUrls: ['./show-user.component.css']
})


export class ShowUserComponent implements OnInit {
  error: any;
  userSession: any;
  arrayOfKeys: string[];
  getTodo: any;
  selectedUser: any;

  constructor(private auth:UserService,private router:Router){
    localStorage.setItem('UserDeatails',null)
    if(localStorage.getItem('UserDeatails')!=null){
      this.arrayOfKeys = Object.keys(localStorage.getItem('UserDeatails'));

    }
  }
    get user(): any {
      return localStorage.getItem('UserDeatails')?JSON.parse(localStorage.getItem('UserDeatails')):[];
  }

  search(form:NgForm){
    var login;
    this.error=null;
    console.log(form.value);
    this.auth.getTodo(form.value).subscribe(data=>{
      this.getTodo=data;
      
      // console.log('Response of login',data);
      // if(data){
      //   login = data.userBeans[0];
      //   localStorage.setItem('UserDeatails',JSON.parse(login));
      //   this.userSession =localStorage.getItem('UserDeatails');
        // this.router.navigateByUrl('/home');
      
    
      // form.reset();
    },err=>{
      console.log(err);
      this.error=err.error.message;
    
    });
  }
  ngOnInit() {
    
  }

}
