import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PaymentModel } from '../PaymentModel';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {

        paymentInfo!:PaymentModel;


      constructor(private activatedRoute:ActivatedRoute){

            this.activatedRoute.params.subscribe(

                (inputs)=>{

                    console.log("payment comp ",inputs['billInfo'])

                      this.paymentInfo  = inputs['billInfo'];


                }


            );

      }



}
