import { Injectable } from '@angular/core';
import { Hr } from './hr';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Job } from './job';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(
   private http: HttpClient
  ) {
  }
  getHttpHrlist(nm: number): Observable<Hr[]> {
      return this.http.get<Hr[]>(`http://192.168.137.1:8080/hrlist/${nm}`, {
      });
  }
  getHttpjblist(): Observable<Job[]> {
    return this.http.get<Job[]>('http://192.168.137.1:8080/jblist');
 }
  postHttpHradd(hr?: Hr): Observable<Hr[]> {
      return this.http.post<Hr[]>('http://192.168.137.1:8080/hradd', hr , {
        params : new  HttpParams().set('', '')
      } );
  }
  postHttpHrdlt(hr?: Hr): Observable<Hr[]> {
    return this.http.post<Hr[]>('http://192.168.137.1:8080/hrdlt', hr , {
      params : new HttpParams().set('', '')
    });
  }
  postHttpHrsave(hr?: Hr): Observable<Hr[]> {
    return this.http.post<Hr[]>('http://192.168.137.1:8080/hrupdt' , hr, {

    });
  }
  getHttphrnums(): Observable<number[]> {
     return this.http.get<number[]>('http://192.168.137.1:8080/hrnums');
  }
  getHttphrnm(nm: number): Observable<Hr[]> {
      return this.http.get<Hr[]>(`http://192.168.137.1:8080/hrlist/${nm}`);
  }
  gethttphrhye(nm: number): Observable<Hr[]> {
    return this.http.get<Hr[]>(`http://192.168.137.1:8080/hrlist/${nm}`);
  }
}
