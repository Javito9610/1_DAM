// 8. Función para invertir una cadena
// Dada una cadena, devuelve una nueva cadena con los caracteres en orden inverso.

let cadenaTexto= "Hola soy Javier."
function revertirCadena(x){
    return x.split('').reverse().join('');
}
console.log(revertirCadena(cadenaTexto));