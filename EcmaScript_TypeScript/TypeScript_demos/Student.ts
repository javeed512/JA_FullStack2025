

 export class  Student{

     private   sid:number;
      private  sname:string;

 
      public  constructor(sid , sname){

                this.sid = sid;
                this.sname = sname;

        }

      public  showStudentDetails(){


                console.log(this.sid +"  "+this.sname)


        }

        setSid(sid){


            this.sid = sid;
        }

        getSid(){

            return this.sid;
        }


}

let s1 = new Student(111,"king");


s1.showStudentDetails();