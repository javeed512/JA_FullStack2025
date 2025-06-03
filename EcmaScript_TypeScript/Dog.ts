class Dog{


     methodOne(){

            let   x = 10;

        console.log('methodOne from Dog class');

        if(x > 0){

            let  y  = 30;

            console.log("x value in methodOne() ",x);
            console.log("y value is "+y);


        }

      


     }



}


let  d =  new  Dog();

d.methodOne();