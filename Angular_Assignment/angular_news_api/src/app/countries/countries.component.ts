import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  countriesNews: any;
  bbcNews: any;
  constructor(public http: HttpClient) {
    this.getCountriesNews();
    this.getBbcNews();
   }
   getCountriesNews() {
     this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c79c930fa56348fd8168477e9003076e').subscribe(data => {
       this.countriesNews = data.articles;
   }, err => {
     console.log();
   }, () => {
     console.log('news got successfully');
   });
  }
  getBbcNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=c79c930fa56348fd8168477e9003076e').subscribe(data => {
      this.bbcNews = data.articles;
  }, err => {
    console.log();
  }, () => {
    console.log('news got successfully');
  });
 }
  ngOnInit() {
  }
}
