import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable ,map } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  
  private baseUrl = 'http://localhost:8080'; // Replace with your backend URL
  
  constructor(private http: HttpClient) { }
  
  getCategoryNames(): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}/categories/all`);
  }
  
  
}
// http://localhost:8080/tools/all
// http://localhost:8080/categories/all-name