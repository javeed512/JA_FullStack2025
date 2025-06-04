import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[ngChangeColor]'
})
export class CardHoverDirective {

  constructor(private el:ElementRef , private renderer:Renderer2) {


   }

   @HostListener('mouseover')
    onMouseOver(){


        this.renderer.setStyle(this.el.nativeElement , 'backgroundColor' , 'red');
        this.renderer.setStyle(this.el.nativeElement,'color','blue') 

        alert('mouser over the context , color will change')


    }




}
