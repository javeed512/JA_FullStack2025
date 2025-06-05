import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {





  @Input()
  inputData:string = 'No Data';

  @Input()
  input2:any;


  childData = "This is child data from child component"

  @Output()
  emitterEvent:EventEmitter<string> = new EventEmitter<string>();

  


  sendData(){

      this.emitterEvent.emit(this.childData);


  }




  constructor(){

      console.log(this.inputData)

  }


}
