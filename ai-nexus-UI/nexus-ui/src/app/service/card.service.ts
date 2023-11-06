import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CardService {
  
  private baseUrl = 'http://localhost:8080'; // Replace with your backend URL
  constructor(private http: HttpClient) {} 
  
    getCard(categoryName :string ): Observable<string[]>{
      const url = `${this.baseUrl}/api/tool-details${categoryName}`;
      return this.http.get<string[]>(url) ;
    }
    
}
