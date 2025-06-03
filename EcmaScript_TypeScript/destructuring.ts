

class DeStructure{


    test(){

    const obj = {first: 'Asim', last: 'Hussain', age: 39 };

    const f = obj.first;
    const l = obj.last;
    console.log(f); // Asim
    console.log(l); // Hussain


            const{first:f1 , last:l1}  = obj

            console.log(f1)
            console.log(l1)


    }

}


let  d = new DeStructure();

  d.test()