// 9. Contar vocales en una cadena
// Cuenta cuántas vocales hay en una cadena de texto.

function contadorCadenaTexto(cadena){
    let arrayVocales=cadena.match(/[aeiou]/gi); //g busca todas las apariciones. i no distingue entre mayusculas y minusculas
    let contador= arrayVocales.length;
    if(contador>0){
        return contador;
    }
    return 0;
}

console.log(contadorCadenaTexto("holi"));