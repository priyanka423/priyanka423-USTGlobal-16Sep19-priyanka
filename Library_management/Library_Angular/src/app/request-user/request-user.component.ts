import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { analyzeAndValidateNgModules } from '@angular/compiler';

@Component({
  selector: 'app-request-user',
  templateUrl: './request-user.component.html',
  styleUrls: ['./request-user.component.css']
})
export class RequestUserComponent implements OnInit {
  getBookList:[];
  City: any = ['Florida', 'South Dakota', 'Tennessee', 'Michigan']

  constructor(private auth:UserService) { }
  bookList(){
  
    this.auth.getBookList().subscribe(data => {
      
      this.getBookList = data.bookInventoryBeans;
      console.log(data)
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

 

  ngOnInit() {
  }

}
