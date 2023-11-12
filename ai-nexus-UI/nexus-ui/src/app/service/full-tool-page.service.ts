import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class FullToolPageService {

  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }
  getTool(toolName :string ): Observable<any>{
    const url = `${this.baseUrl}/api/tool-details/by-name/${toolName}`;
    console.log(url);
    return this.http.get(url);
  }
}
