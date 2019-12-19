import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookissued',
  templateUrl: './bookissued.component.html',
  styleUrls: ['./bookissued.component.css']
})
export class BookissuedComponent implements OnInit {
  error: any;
  selectedUser: any;
  getBookList: any;
  getIssuedList: any;
  selectedIssued: any;

  constructor(private auth: UserService,private router: Router) { 
    this.IssuedList();
  }
  bookIssued(form: NgForm){

    this.error=null;
     this.auth.bookAddIssued(form.value).subscribe(res =>{
       if(res){
         alert("New Book Issued Successfully");
         location.reload();  //Add this line to your code option 1
          this.ngOnInit();
       }
      
     },err=>{
       console.log(err);
       this.error=err.error.message;
    
    });
  }

  get user(): any {
    return localStorage.getItem('UserDeatails')? JSON.parse(localStorage.getItem('UserDeatails')):[];;
}


IssuedList(){
  
  this.auth.getIssuedList().subscribe(data => {
    console.log(data);
    this.getIssuedList = data.bookIssuedBeans;
  }, err => {
    console.log(err);
  }, () => {
    console.log('data got successfully');
  });
}



deleteIssuedData(issued_id) {
  console.log(issued_id);
  this.auth.deleteIssuedBook(issued_id).subscribe(data => {
       console.log(data);
       alert("Book record deleted");
       location.reload();
  }, err => {
    console.log(err);
  }, () => {
  console.log('data deleted successfully');
  });
  }

  selectIssued(book_issued_id) {
    console.log(book_issued_id);
    this.auth.getBookIssuedById(book_issued_id).subscribe(data=>{
      console.log(data.bookIssuedBeans[0]);
      this.selectedIssued = data.bookIssuedBeans[0];
    });
  }

  updateIssuedData(form:NgForm) {
    console.log(form.value);
    this.auth.UpdateIssued(form.value).subscribe(data => {
      console.log(data);
      this.IssuedList();
  }, err => {
   console.log(err);
  }, () => {
  console.log('data Updated successfully');
  });
  }
  ngOnInit() {
  }

}
