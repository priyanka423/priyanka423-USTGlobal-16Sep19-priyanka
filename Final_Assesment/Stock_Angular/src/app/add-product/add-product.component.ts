import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  error:string;
  constructor(private auth: UserService,private router:Router) { }
  register(form: NgForm){

      this.error=null;
       this.auth.registerUser(form.value).subscribe(res =>{
         console.log(res);
         alert('Registeration successfully');
         this.router.navigateByUrl('/login');
         form.reset();
       },err=>{
         console.log(err);
         this.error=err.error.message;
      
      });
    }
    
    get user(): any {
      return localStorage.getItem('UserDeatails')? JSON.parse(localStorage.getItem('UserDeatails')):[];;
  }
    ngOnInit() {
    }
  }
