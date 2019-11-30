import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-sheduleinterview',
  templateUrl: './sheduleinterview.component.html',
  styleUrls: ['./sheduleinterview.component.css']
})
export class SheduleinterviewComponent implements OnInit {

  get name() {
    return this.form.get('name');
    }
    get exp() {
      return this.form.get('exp');
    }
    get skills() {
     return this.form.get('skills');
   }
   get cctc() {
     return this.form.get('cctc');
   }
   get ectc() {
    return this.form.get('ectc');
  }
  get relocate() {
    return this.form.get('relocate');
  }
   
     form = new FormGroup({
         name : new FormControl('' , [Validators.required]),
         exp: new FormControl('', [Validators.required]),
         skills: new FormControl('' , [Validators.required]),
         cctc: new FormControl('', [Validators.required]),
         ectc: new FormControl('', [Validators.required]),
         relocate: new FormControl('', [Validators.required])
   
     });
   
 
   constructor() { }
 
   ngOnInit() {
   }
   requestData(form) {
     console.log(form);
 
   }
  }
