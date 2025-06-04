import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'multiply'
})
export class SqrtPipe implements PipeTransform {

  transform(value: number, ...args: number[]): unknown {
    return  value * args[0];
  }

}
