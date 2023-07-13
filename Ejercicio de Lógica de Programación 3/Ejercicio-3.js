// Solicitamos un numero al usuario
let n = prompt("Ingresa un número para obtener su factorial: ");

function factorial(n) {
    if (n === 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

// Calcula el factorial del número ingresado
let resultadoFactorial = factorial(n);

// Imprime el resultado
console.log("El factorial de " + n + " es " + resultadoFactorial);
