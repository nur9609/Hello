import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NoteService {

  constructor(private  http: HttpClient) {
  }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8000/note');
  }
}
