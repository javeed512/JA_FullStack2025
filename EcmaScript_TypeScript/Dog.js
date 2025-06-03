"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student_1 = require("./Student");
var Employee = /** @class */ (function () {
    function Employee() {
    }
    return Employee;
}());
var Dog = /** @class */ (function () {
    function Dog() {
        this.sid = undefined;
        this.Employee = null;
    }
    Dog.prototype.methodOne = function () {
        var student1 = new Student_1.Student(112, "tom");
        console.log(student1);
        var name = "javeed";
        var len = name.length;
        console.log(len);
        var x = "10";
        var s1 = x;
        console.log('methodOne from Dog class');
        if (x > 0) {
            var y = 30;
            y = 9000;
            console.log("x value in methodOne() ", x);
            console.log("y value is " + y);
        }
    };
    return Dog;
}());
var d = new Dog();
d.methodOne();
