import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Car} from "../../models/Car";
import {tap} from "rxjs/operators";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  url = 'http://localhost:8080/car'

  constructor(private http: HttpClient) {  }

  public getCar(): Observable<Car>{
    console.log(window.location.href);
    return this.http.get<Car>(window.location.href + '/car')
      .pipe(tap(console.log));
  }
}
