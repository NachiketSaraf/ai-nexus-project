import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AppSettings } from '../AppSettings';

@Injectable({
  providedIn: 'root'
})
export class TrendingService {

  private baseUrl = AppSettings.BACKEND_API 
  constructor(private http: HttpClient) { }

  getTrendingCards(toolTag: string): Observable<any> {
    return this.http.get<any>(`${this.baseUrl}/api/tool-details/by-tag/${toolTag}`);
  }
}