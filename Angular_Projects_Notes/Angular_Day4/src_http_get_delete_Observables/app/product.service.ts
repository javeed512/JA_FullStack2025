import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from './Product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {


    baseURL = 'http://localhost:3000/products/';



  constructor(private  http:HttpClient) { 


  }


     deleteById(id:number){


      return   this.http.delete(this.baseURL+id);


     }



    getAll():Observable<Product[]>{


      return    this.http.get<Product[]>(this.baseURL);

          


    }


}
