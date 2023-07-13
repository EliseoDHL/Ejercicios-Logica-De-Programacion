// Se solicita un numero al usuario
let n = prompt("Ingresa un número: ");

// Se crea una funcion donde se calcula la realiza la serie de fibonacci
function serieFibonacci(n) {
    if (n === 0) {
        return 0;
    } else if (n === 1) {
        return 1;
    } else {
        return serieFibonacci(n - 1) + serieFibonacci(n - 2);
    }
}

// Con este ciclo for, se imprime la serie de fibonacci en la consola
for (let i = 0; i < n; i++) {
    console.log(serieFibonacci(i));
}