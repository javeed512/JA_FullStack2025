

class  Test{


        add(a,b = 5){

                return a+b;


        }

        
        sum(id,name,...x){  // x[]


                    console.log('sum() is called');

        }


        


}

var t = new Test();

console.log("Result : "+t.add(10,20))

t.sum(101,'javeed',1,2,3,4);