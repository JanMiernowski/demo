import {Component, OnInit} from '@angular/core';
import {Car} from "../models/Car";
import {ClientService} from "./services/client.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'demo-angular';
  car = {name: "", year: 0};

  constructor(private service: ClientService) {
  }

  ngOnInit(): void {
    this.service.getCar().subscribe(
      (car:Car) => this.car = {
        name: car.name,
        year: car.year
      }
    );
  }
}
