import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentModel } from '../PaymentModel';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {

    uname = '';
    pwd = '';


     billInfo!:PaymentModel;


    constructor(private route:ActivatedRoute , private router:Router){


            this.billInfo = {id:101,cardName:'visa',amount:2000,dop:new Date()};


          this.route.params.subscribe(

              (inputs)=>{   
                this.uname = inputs['username'] ;
                this.pwd = inputs['password'];
                  
              }


          );


    }



     doPayment(){

          console.log('doPayment ',this.billInfo)

          this.router.navigate(['/payment/'+this.billInfo]);



     }



}
