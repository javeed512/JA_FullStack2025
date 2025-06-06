import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  
    username = "javeed";

    password ='tiger';


      constructor(private router:Router){

      }


          go(){

            this.router.navigate(['/aboutus']);




          }



}
