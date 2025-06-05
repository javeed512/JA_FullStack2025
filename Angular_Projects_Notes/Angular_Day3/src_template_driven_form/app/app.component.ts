import { Component } from '@angular/core';
import { Employee } from './Employee';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  emp!:Employee;



   fetchFormData(data:Employee){

      console.log(data);

      this.emp = data;


   }


   test(val:number){

    console.log(val)

   }

  
}
