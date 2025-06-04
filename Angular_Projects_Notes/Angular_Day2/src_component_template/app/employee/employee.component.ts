import { Component, Inject, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
 templateUrl: './employee.component.html',
 //template:"<h2 class='cls1'>This is Emp Template</h2>",
  //styles: ['.cls1 { background-color:yellow }']
  styleUrls:['./employee.component.css']
  
})
export class EmployeeComponent implements OnInit {

       eid:number = 101;
       ename:string = "javeed";
       salary:number = 90000;


      constructor(){

        
          console.log("Employee constructor called.. object created..")

      }


 
  ngOnInit(): void {
    
    console.log("init method called...")

    this.showEmployee();
  
  }



    showEmployee(){


          console.log(this.eid +" "+ this.ename +"  "+this.salary )


    }



}
