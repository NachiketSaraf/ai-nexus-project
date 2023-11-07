import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrendingService {

  private baseUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  getTrendingCards(toolTag: string): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/api/tool-details/by-tag?tag=${toolTag}`);
  }
}