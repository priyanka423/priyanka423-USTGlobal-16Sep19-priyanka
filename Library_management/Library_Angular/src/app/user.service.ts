import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import{HttpClient} from '@angular/common/http';
import {map} from 'rxjs/operators';




@Injectable({
  providedIn: 'root'
})

export class UserService {
  getUsers: any;

  constructor(private http: HttpClient) { }
  registerUser(user):Observable<any>{
    return this.http.post('http://localhost:8080/library/register',user);
  }

  loginUser(login):Observable<any>{
    let URL = "http://localhost:8080/library/login/?email=" + login.email + 
    "&password="+login.password;
    return this.http.post(URL,login);
  } 
  
  getTodo(id): Observable<any>{
    console.log(id);
    let URL = "http://localhost:8080/library/get/?user_id=" + id.user_id;
    return this.http.get(URL,id);
} 
    
updatesUser(user):Observable<any>{
  
  return this.http.put('http://localhost:8080/library/update',user);
  }
  
  bookAddInventory(book):Observable<any>{
    // adding new book to database
    return this.http.post('http://localhost:8080/library/book/add',book);
  }

  getBookList():Observable<any>{
    // getting all book list in inventory
    return this.http.get('http://localhost:8080/library/book/getList');
  }

  deleteBook(ibook_id):Observable<any>{
    return this.http.delete('http://localhost:8080/library/book/delete/'+ibook_id,ibook_id);
  }

  updateBook(bookData):Observable<any>{
    return this.http.put('http://localhost:8080/library/book/update',bookData);
  }

  getBookById(bookId):Observable<any>{
      console.log(bookId);
      let URL = "http://localhost:8080/library/book/get/?book_inventory_id=" + bookId;
      return this.http.get(URL,bookId);
  } 

  //........... bookIssued.................//

  bookAddIssued(bookIssued):Observable<any>{
    // adding new book Issued to database
    return this.http.post('http://localhost:8080/library/book/issued/add',bookIssued);
  }

  getIssuedList():Observable<any>{
    // getting all book list in inventory
    return this.http.get('http://localhost:8080/library/book/issued/getList');
  }
  getBookIssuedById(bookIssuedId):Observable<any>{
    console.log(bookIssuedId);
    let URL = "http://localhost:8080/library/book/issued/get/?book_issued_id=" + bookIssuedId;
    return this.http.get(URL,bookIssuedId);
} 

UpdateIssued(bookIssuedData):Observable<any>{
  return this.http.put('http://localhost:8080/library/book/issued/update',bookIssuedData);
}

deleteIssuedBook(issuedbook_id):Observable<any>{
  return this.http.delete('http://localhost:8080/library/book/issued/delete/'+issuedbook_id,issuedbook_id);
}

//................User....................

ChangePasswordUser(changepasswordData):Observable<any>{
  return this.http.put('http://localhost:8080/library/changepassword',changepasswordData);
}
}
  

