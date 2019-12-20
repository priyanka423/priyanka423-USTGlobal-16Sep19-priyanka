import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  getUsers: any;
  constructor(private http: HttpClient) { }
registerUser(user):Observable<any>{
  return this.http.post('http://localhost:8080/register',user);
}
getTodo(name): Observable<any>{
  console.log(name);
  let URL = "http://localhost:8080/get-name/?name=" + name.name;
  return this.http.get(URL,name);
}

getCategory(category):Observable<any>{
  console.log(category);
  let URL = "http://localhost:8080/get-category/?category=" + category.category;
  return this.http.get(URL,category);
}

getCompny(company):Observable<any>{
  console.log(company);
  let URL = "http://localhost:8080/get-company/?company=" + company.company;
  return this.http.get(URL,company);
}
updatesUser(product):Observable<any>{
  
  return this.http.put('http://localhost:8080/update',product);
  }
}