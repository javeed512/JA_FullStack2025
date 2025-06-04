import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

    day:number =0;

    course:string = "";

    mycolor ="blue"
    bgcolor = "pink"


    flag:boolean = true;


    val = 100;


     list:number[] = [10,20,30,40,50];


     employees = [
      { name: 'Anderson', age: 35, city: 'Sao Paulo' },
      { name: 'John', age: 12, city: 'Miami' },
      { name: 'Peter', age: 22, city: 'New York' }
      ];




     message: string = '';
     isClicked = false;
     getMessage() {
         this.isClicked = !this.isClicked;
         if (this.isClicked) {
             this.message = 'Welcome to GFG!!!';
         } else {
             this.message = '';
         }
     }




}
