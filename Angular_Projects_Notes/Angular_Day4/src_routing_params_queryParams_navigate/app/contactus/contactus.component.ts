import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {


    data:any = [];


    constructor(private route:ActivatedRoute){

        this.route.queryParams.subscribe(

              (inputs)=>{  this.data = inputs  }
        );

        console.log(this.data)


    }


}
