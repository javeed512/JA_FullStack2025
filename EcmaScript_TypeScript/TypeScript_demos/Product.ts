
export interface  Product{

    pid:number;
    pname:string;
    price:number;


        show();


}

export class  Bus{

     bid:number;
     model:string;
     seats:number;

}

class Impln  implements  Product{
    pid: number;
    pname: string;
    price: number;
    show() {
        throw new Error("Method not implemented.");
    }



}

