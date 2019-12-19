import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book-inventory',
  templateUrl: './book-inventory.component.html',
  styleUrls: ['./book-inventory.component.css']
})
export class BookInventoryComponent implements OnInit {

  error:string;
  getBookList;
  selectedUser:any;
     constructor(private auth: UserService,private router: Router) {
       this.bookList();
     }

     bookAdd(form: NgForm){

      this.error=null;
       this.auth.bookAddInventory(form.value).subscribe(res =>{
         if(res){
           alert("New Book Added Successfully")
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
  bookList(){
  
    this.auth.getBookList().subscribe(data => {
      
      this.getBookList = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

//............................................

  deleteData(book_id) {
    console.log(book_id);
    this.auth.deleteBook(book_id).subscribe(data => {
         console.log(data);
         alert("Book record deleted");
         location.reload();
    }, err => {
      console.log(err);
    }, () => {
    console.log('data deleted successfully');
    });
    }

    
    selectUser(book_inventory_id) {
      console.log(book_inventory_id);
      this.auth.getBookById(book_inventory_id).subscribe(data=>{
        console.log(data.bookInventoryBeans[0]);
        this.selectedUser = data.bookInventoryBeans[0];
      });
    }

    updateData(form:NgForm) {
      console.log(form.value);
      this.auth.updateBook(form.value).subscribe(data => {
        console.log(data);
        this.bookList();
    }, err => {
     console.log(err);
    }, () => {
    console.log('data Updated successfully');
    });
    }
  ngOnInit() {
  }

}
