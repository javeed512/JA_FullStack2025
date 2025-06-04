import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  username = "king"
  salary = "50000"

  tname = "number"

  imageUrl = "../assets/redcar.jpg";
   

    display(){

      return "Hello friends , display method called";

    }

    show()
    {

        alert("show method is called using event binding");


    }



}
