import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
<<<<<<< HEAD
<<<<<<< HEAD
import { Observable } from 'rxjs/internal/Observable';
=======
<<<<<<< HEAD
<<<<<<< HEAD
import { Observable, tap } from 'rxjs';
=======
import { Observable } from 'rxjs';
>>>>>>> d5a9c5c (category)
=======
import { Observable, tap } from 'rxjs';
>>>>>>> 9ea63d0 (card)
>>>>>>> 5550945 (card)
=======
import { Observable, tap } from 'rxjs';

>>>>>>> 9b18927 (..)

@Injectable({
  providedIn: 'root'
})
export class CardService {
  cards: any[] = [];
  private baseUrl = 'http://localhost:8080'; // Replace with your backend URL
  constructor(private http: HttpClient) {} 

    getCard(categoryName :string ): Observable<any>{
      const url = `${this.baseUrl}/api/tool-details/${categoryName}`;
      console.log(url);
      return this.http.get(url);
<<<<<<< HEAD
  
<<<<<<< HEAD
    }
=======
<<<<<<< HEAD
    getCard(categoryName :string ): Observable<string[]>{
      const url = `${this.baseUrl}/api/tool-details${categoryName}`;
      return this.http.get<string[]>(url) ;
>>>>>>> 32be760 (stuff)
    }
<<<<<<< HEAD
=======
    getCard(categoryName :string ): Observable<any>{
      const url = `${this.baseUrl}/api/tool-details/${categoryName}`;
      console.log(url);
      return this.http.get(url);
    }
>>>>>>> 9ea63d0 (card)
>>>>>>> 5550945 (card)
=======

    }

>>>>>>> 9b18927 (..)
    setCards(cards: any[]) {
      this.cards = cards;
    }
  
    getCards(): any[] {
      return this.cards;
    }
    
}


