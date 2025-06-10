import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DemoComponent } from './demo/demo.component';
import { HelloComponent } from './hello/hello.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet , CommonModule , DemoComponent , HelloComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  providers:[]
})
export class AppComponent {
  title = 'myapp18';

  isLoggedIn:boolean = true;


  users= [

    {"id":1,"name":"king","age":26},
    {"id":2,"name":"smith","age":24},
    {"id":3,"name":"ford","age":25},
    {"id":4,"name":"tom","age":29}


];



}
