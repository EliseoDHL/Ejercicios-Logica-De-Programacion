let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let numerosIngresados = [];

while (true) {
    let numeroIngresado = prompt("Adivina un número del 1 al 100: ");
    numerosIngresados.push(numeroIngresado);

    if (numeroIngresado === numeroSecreto) {
        console.log("¡Adivinaste! El número secreto era " + numeroSecreto);
        console.log("Los números ingresados fueron: " + numerosIngresados);
        break;
    } else if (numeroIngresado < numeroSecreto) {
        console.log("El número que adivinaste es menor al número secreto.");
    } else {
        console.log("El número que adivinaste es mayor al número secreto.");
    }
}