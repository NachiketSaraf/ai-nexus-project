import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
<<<<<<< HEAD
<<<<<<< HEAD
import { Observable, tap } from 'rxjs';
=======
import { Observable } from 'rxjs';
>>>>>>> d37c9a7 (category)
=======
import { Observable, tap } from 'rxjs';
>>>>>>> cc2e4e1 (card)

@Injectable({
  providedIn: 'root'
})
export class CardService {
  cards: any[] = [];
  private baseUrl = 'http://localhost:8080'; // Replace with your backend URL
  constructor(private http: HttpClient) {} 
<<<<<<< HEAD
  
<<<<<<< HEAD
    getCard(categoryName :string ): Observable<any>{
      const url = `${this.baseUrl}/api/tool-details/${categoryName}`;
      console.log(url);
      return this.http.get(url);
=======
=======
>>>>>>> d37c9a7 (category)
  
<<<<<<< HEAD
    getCard(categoryName :string ): Observable<string[]>{
      const url = `${this.baseUrl}/api/tool-details${categoryName}`;
      return this.http.get<string[]>(url) ;
>>>>>>> 3e6e2ac (stuff)
    }
<<<<<<< HEAD
=======
    getCard(categoryName :string ): Observable<any>{
      const url = `${this.baseUrl}/api/tool-details/${categoryName}`;
      console.log(url);
      return this.http.get(url);
    }
>>>>>>> cc2e4e1 (card)
    setCards(cards: any[]) {
      this.cards = cards;
    }
  
    getCards(): any[] {
      return this.cards;
    }
    
}
<<<<<<< HEAD
=======
// .pipe(): The .pipe() method is commonly used in functional programming and is often associated with libraries like RxJS for handling asynchronous operations. It allows you to create a chain of data processing steps.hope so be sile

// map(): The map() function is used to transform the data within the data stream. In this context, it's being used as a method applied to a stream of data. It takes a function as an argument, and for each item in the data stream, it applies this function to transform the item.

// (response: any) => response as string[]: This is the function provided to the map() method. It takes a parameter response of type any and casts it as an array of strings (string[]). This means it's expecting the response to be an array, and it's explicitly stating that it should be treated as an array of strings.
>>>>>>> 3e6e2ac (stuff)
=======
    
}
>>>>>>> d37c9a7 (category)
