import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


import { Observable, tap } from 'rxjs';
import { AppSettings } from '../AppSettings';


@Injectable({
  providedIn: 'root'
})
export class CardService {
  cards: any[] = [];
  private baseUrl = AppSettings.BACKEND_API ; // Replace with your backend URL
  constructor(private http: HttpClient) { }


  getCard(categoryName: string): Observable<any> {
    const url = `${this.baseUrl}/api/tool-details/${categoryName}`;
    console.log(url);
    return this.http.get(url);

  }
  
setCards(cards: any[]) {
  this.cards = cards;
}

getCards(): any[] {
  return this.cards;
}


}


