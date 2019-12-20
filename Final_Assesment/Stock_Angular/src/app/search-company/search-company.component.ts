import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-search-company',
  templateUrl: './search-company.component.html',
  styleUrls: ['./search-company.component.css']
})
export class SearchCompanyComponent implements OnInit {

  error: any;
  userSession: any;
  arrayOfKeys: string[];
  selectedUser: any;
  getCompny: any;

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
    this.auth.getCompny(form.value).subscribe(data=>{
      this.getCompny=data;
      
    },err=>{
      console.log(err);
      this.error=err.error.message;
    
    });
  }


  ngOnInit() {
  }

}
