var Color;
(function (Color) {
    Color[Color["Green"] = 0] = "Green";
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var EnumDemo = /** @class */ (function () {
    function EnumDemo() {
        this.name = "king";
    }
    EnumDemo.prototype.test = function () {
        var c = Color.Green;
        console.log(c[0]);
    };
    return EnumDemo;
}());
var en = new EnumDemo();
en.test();
