import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-name',
  templateUrl: './search-name.component.html',
  styleUrls: ['./search-name.component.css']
})
export class SearchNameComponent implements OnInit {

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
      
    },err=>{
      console.log(err);
      this.error=err.error.message;
    
    });
  }

  ngOnInit() {
  }

}
