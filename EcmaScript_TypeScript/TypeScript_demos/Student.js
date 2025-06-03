"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(sid, sname) {
        this.sid = sid;
        this.sname = sname;
    }
    Student.prototype.showStudentDetails = function () {
        console.log(this.sid + "  " + this.sname);
    };
    Student.prototype.setSid = function (sid) {
        this.sid = sid;
    };
    Student.prototype.getSid = function () {
        return this.sid;
    };
    return Student;
}());
exports.Student = Student;
var s1 = new Student(111, "king");
s1.showStudentDetails();
