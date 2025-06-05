import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 

  parentData = "Hello , This is message from Parent";

  jsonData = {"id":101,"name":"javeed","dob":"1991-06-19"};

   data:string = '';

  fetchChildData(obj:string){

      console.log(obj);

      this.data = obj;
  }



}
