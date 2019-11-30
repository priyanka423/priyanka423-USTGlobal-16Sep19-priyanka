import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
    get name() {
   return this.form.get('name');
   }
   get price() {
    return this.form.get('price');
  }
   get address() {
    return this.form.get('address');
  }
  get img() {
    return this.form.get('img');
  }
  
    form = new FormGroup({
        name : new FormControl('' , [Validators.required]),
        price: new FormControl('' , [Validators.required]),
        address: new FormControl('', [Validators.required]),
        img: new FormControl('', [Validators.required])
  
    });
  

  constructor() { }

  ngOnInit() {
  }
  addproductData(form) {
    console.log(form);

  }
}
