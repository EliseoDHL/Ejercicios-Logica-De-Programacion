//Se solicitan los 3 numeros al usuario por medio del prompt
let num1 = parseFloat(prompt("Ingresa el primer numero"));
let num2 = parseFloat(prompt("Ingresa el segundo numero"));
let num3 = parseFloat(prompt("Ingresa el tercer numero"));

//Se meten los numeros en un arreglo 
let numeros = [num1, num2, num3];

//Aqui es donde se acomodan los numeros de menor a mayor usando sort
var menorAMayor = numeros.sort(function(a, b){
    return a - b;
});

//Se imprime el primer arreglo y el en segundo console.log se le aplica un reverse para que ahora este arreglado de mayor a menor
console.log("Menor a Mayor: " + menorAMayor.join(", "));
console.log("Mayor a Menor: " + menorAMayor.reverse().join(", "));
