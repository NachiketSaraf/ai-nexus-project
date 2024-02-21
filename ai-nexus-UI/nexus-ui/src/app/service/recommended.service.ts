import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppSettings } from '../AppSettings';
@Injectable({
  providedIn: 'root'
})
export class RecommendedService  {
  private baseUrl = AppSettings.BACKEND_API 
  constructor(private http: HttpClient) {}

  getRecommendedCards(toolTag: string): Observable<any> {
     return this.http.get<any>(`${this.baseUrl}/api/tool-details/by-tag/${toolTag}`);
}
}
