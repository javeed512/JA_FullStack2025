import { Student } from "./Student";

class Employee{


}



class Dog{

    sid:any = undefined;

    Employee = null;

    readonly   num = 100;
      



 methodOne(){

        let student1 = new Student(112,"tom");

        console.log(student1)

       let name:any = "javeed";

      //  this.num = 9000;

        console.log(this.num)

        let  len:number = ( <string>name).length;

                console.log(len)


            let   x:any = "10";

                let s1:string  = (<string>x);

                

        console.log('methodOne from Dog class');

        if(x > 0){

          

            y = 9000;

            console.log("x value in methodOne() ",x);
            console.log("y value is "+y);


        }

      


     }



}


let  d =  new  Dog();

d.methodOne();