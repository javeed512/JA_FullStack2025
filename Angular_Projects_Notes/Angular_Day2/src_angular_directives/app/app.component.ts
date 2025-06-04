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


}
