import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from "@angular/forms";

import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from './app.component';
import { AddProductComponent } from './add-product/add-product.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { UpdateComponent } from './update/update.component';
import { SearchNameComponent } from './search-name/search-name.component';
import { SearchCategoryComponent } from './search-category/search-category.component';
import { SearchCompanyComponent } from './search-company/search-company.component';
import { CartComponent } from './cart/cart.component';


@NgModule({
  declarations: [
    AppComponent,
    AddProductComponent,
    HeaderComponent,
    UpdateComponent,
    SearchNameComponent,
    SearchCategoryComponent,
    SearchCompanyComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: "addproduct", component: AddProductComponent },
      {path:"searchname",component:SearchNameComponent},
      {path:"searchcompany",component:SearchCompanyComponent},
      {path:"searchcategory",component:SearchCategoryComponent},
      {path:"update",component:UpdateComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
