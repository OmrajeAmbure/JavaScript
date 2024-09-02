var a = 10;
function b(){
    var x = 10;
}
console.log(window.a);// the window global object can store all global variable and function  inside the window object.
console.log(this.a);// by default call this keyword as window global object 
console.log(a);// it will print  in our globaley define the variable.  
console.log(x);// it is an local scope it will not print on global execution context.

