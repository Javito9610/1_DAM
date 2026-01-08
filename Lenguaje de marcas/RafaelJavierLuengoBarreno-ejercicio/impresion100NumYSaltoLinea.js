/*Crear un bucle "for" para imprimir por pantalla números del 1 al 100. Además, cada 10 elementos, debe añadir un salto de línea*/
let resultado = "";

for (let i = 1; i <= 100; i++) {
    resultado += i + " ";

    if (i % 10 === 0) {
        resultado += "\n";
    }
}

console.log(resultado);
