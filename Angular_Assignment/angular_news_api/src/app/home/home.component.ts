import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  news: any;
  entertainmentNews: any;
  sportsNews: any;
    constructor(private http: HttpClient) {
        this.getNews();
        this.getEntertainmentNews();
        this.getSportsNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=c79c930fa56348fd8168477e9003076e').subscribe(data => {
        this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfelly');
    });
  }
    getEntertainmentNews() {
        // tslint:disable-next-line: max-line-length
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=c79c930fa56348fd8168477e9003076e').subscribe(data => {
        this.entertainmentNews = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfelly');
    });
  }
  getSportsNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=c79c930fa56348fd8168477e9003076e').subscribe(data => {
    this.sportsNews = data.articles;
}, err => {
    console.log(err);
}, () => {
    console.log('news got successfelly');
});
}
  ngOnInit() {
  }
}
