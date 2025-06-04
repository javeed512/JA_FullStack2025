import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  name = "javeed";

  salary = 90000;

  doj = new Date()


  data = {id:101, name:"king",age:30,city:"pune"}

}
