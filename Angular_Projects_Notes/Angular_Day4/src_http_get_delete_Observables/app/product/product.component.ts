import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../Product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {


      productList:Product[] = [];

      constructor(private  productService:ProductService){


      }


      delete(id:number){

          // below code delete only from productList
           // this.productList.splice(i,1);

            this.productService.deleteById(id).subscribe(

                (response)=>{ 
                  console.log('record delted with id '+id);
                  this.getAllProducts()

                 }

            );


         



      }


      getAllProducts(){


            this.productService.getAll().subscribe(

                  (products)=>{  this.productList  = products;   }


            );


      }


}
