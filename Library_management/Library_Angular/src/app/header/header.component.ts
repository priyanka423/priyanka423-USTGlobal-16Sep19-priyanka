import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
   arrayOfKeys:any;
  userSession:any;
  router: any;
  
  constructor(){}
    
    get user(): any {
      return localStorage.getItem('UserDeatails')?JSON.parse(localStorage.getItem('UserDeatails')):[];;
  }
  
  isLoggedIn(){
    const UserDeatails=JSON.parse(localStorage.getItem('UserDeatails'));
    if(UserDeatails){
      return true;
    }else{
      return false;
    }
  }

  isAdmin(){
    const UserDeatails=JSON.parse(localStorage.getItem('UserDeatails'));
    if(UserDeatails && UserDeatails.is_librarian === 'admin'){
      return true;
    }else{
      return false;
    }
  }

  isUser():boolean{
    const UserDeatails=JSON.parse(localStorage.getItem('UserDeatails'));
    if(UserDeatails && UserDeatails.is_librarian === 'user'){
      return true;
    }else{
      return false;
    }
  }

  logout(){
    localStorage.removeItem('UserDeatails');
    this.router.navigateByUrl('/login');
  }
  
  ngOnInit() {
  }

}
