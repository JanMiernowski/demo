import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Car} from "../../models/Car";
import {tap} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  url = 'http://localhost:8080/car'

  constructor(private http: HttpClient) {  }

  public getCar(): Observable<Car>{
    return this.http.get<Car>('http://localhost:8080/car')
      .pipe(tap(console.log));
  }
}
