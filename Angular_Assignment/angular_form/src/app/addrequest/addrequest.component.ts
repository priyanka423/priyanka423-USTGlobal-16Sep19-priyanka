import { Component, OnInit } from '@angular/core';
import { Validators, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-addrequest',
  templateUrl: './addrequest.component.html',
  styleUrls: ['./addrequest.component.css']
})
export class AddrequestComponent implements OnInit {
  get name() {
    return this.form.get('name');
    }
    get skills() {
     return this.form.get('skills');
   }
    get exp() {
     return this.form.get('exp');
   }
   get address() {
     return this.form.get('address');
   }
   get mctc() {
    return this.form.get('mctc');
  }
   
     form = new FormGroup({
         name : new FormControl('' , [Validators.required]),
         skills: new FormControl('' , [Validators.required]),
         exp: new FormControl('', [Validators.required]),
         address: new FormControl('', [Validators.required]),
         mctc: new FormControl('', [Validators.required])
   
     });
   
 
   constructor() { }
 
   ngOnInit() {
   }
   requestData(form) {
     console.log(form);
 
   }
 }