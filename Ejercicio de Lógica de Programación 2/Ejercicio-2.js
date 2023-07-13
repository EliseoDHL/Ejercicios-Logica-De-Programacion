//Se crea una variable para la temperatura
let temperaturaCelsius;

while (true) {
    // Aqui se le solicita al usuario que ingrese un numero y se asigna a una variable 
    let input = prompt("Ingrese la temperatura en grados Celsius:");

    //aqui se evalua el valor ingresado por el usuario, si no es un numero, mandara un mensaje pidiendo un valor adecuado
    if (validarNumero(input)) {
        temperaturaCelsius = parseFloat(input);
        break;
    } else {
        alert("No es un numero, por favor ingresa un valor adecuado");
    }
}

// Aqui se realizan las operaciones para convertir la temperatura a Fahrenheit y Kelvin
let temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
let temperaturaKelvin = temperaturaCelsius + 273.15;

// Aqui se imprime en consola el resultado
console.log("Grados Fahrenheit: " + temperaturaFahrenheit);
console.log("Grados Kelvin: " + temperaturaKelvin);

// Aqui se revisa que el dato ingresado sea valido
function validarNumero(input) {
    return !isNaN(parseFloat(input)) && isFinite(input);
}
