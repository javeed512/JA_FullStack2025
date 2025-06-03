

class TypesDemo{

     
      sid:number = 101;
      sname:string = "raju";
      isPresent:boolean = true;

      date:Date = new Date();

      num:Number = new Number();

      obj:Object = new  String();

       object:any = 4.555; // 100 // true // "hello"  // any other data type is possible here
      

    test(){


             let  city:string  = 'hyderabad';

            let  list:number[] =  [10,20,30,40,50];

            let list2: Array<string> =  ["apple","kiwi","mango","orange"]; 

             let    list3  = new Array("a","b","c");

             let   emp: [number,string,number] // emp is a  tuple type

             emp = [101,'javeed',50000.0] 
           
    }







}