import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit  {

          registerForm!:FormGroup;

          submitted = false;

   
      constructor(private formBuilder:FormBuilder){


      }


  ngOnInit(): void {
    

               this.registerForm =   this.formBuilder.group({

                      username:['enter username',[Validators.required , Validators.pattern]] ,
                      pwd:['enter password min 4 , max 10 ', [Validators.required , Validators.minLength(4) , Validators.maxLength(10)]  ] ,
                      email:['enter email' , [Validators.required , Validators.email]]





                  });



  }


     get f(){

        return this.registerForm.controls;

     }





     fetchFormData(){

        this.submitted = true;

        if(this.registerForm.invalid){

            return ;

        }

        else{

            console.log(this.registerForm.value);

            console.log(this.registerForm)

          alert('registration successful..')

        }

     }



}
