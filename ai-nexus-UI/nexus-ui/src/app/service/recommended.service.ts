import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RecommendedService  {

  private baseUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) {}

  getRecommendedCards(toolTag: string): Observable<any> {
     return this.http.get<any>(`${this.baseUrl}/api/tool-details/by-tag/${toolTag}`);
}
}
