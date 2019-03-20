import { Injectable } from '@angular/core';
import { Hr } from './hr';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(
   private http: HttpClient
  ) {
  }
  getHttpHrlist(): Observable<Hr[]> {
      return this.http.get<Hr[]>('http://192.168.137.1:8080/hrlist');
  }
  postHttpHradd(hr?: Hr): Observable<Hr[]> {
      return this.http.post<Hr[]>('http://192.168.137.1:8080/hradd', hr , {
        params : new  HttpParams().set('', '')
      } );
  }
}
