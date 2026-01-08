/*Crear una condición que permita decidir si una persona tiene derecho a descuento en función de:
a) Si es mayor de 65 años: 100% de descuento.
b) Si es menor de 12 años: 50% de descuento.
c) Otros: 0% de descuento.*/
/*ESTE EJERCICIO TIENE QUE REALIZARSE EN CMD PORQUE EN VS CODE NO SIEMPRE SE PROCESAN BIEN LAS ENTRADAS INTERACTIVAS DE READLINE*/
/*POR LO TANTO. ABRA LA CONSOLA ACCEDA HASTA EL DIRECTORIO EN EL QUE SE ENCUENTRA EL ARCHIVO Y ESCRIBA: node condicionales.js Y SE EJECUTARA CORRECTAMENTE YA QUE EN VISUAL NO SE PROCESAN BIEN ESTE TIPO DE ENTRADAS*/

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let precioBilleteMadridSegovia=7.50;

console.log("El precio del billete Madrid-Segovia es:"+" "+precioBilleteMadridSegovia+" "+"Euros.")

console.log("a) Si es mayor de 65 años: 100% de descuento\nb) Si es menor de 12 años: 50% de descuento.\nc) Otros: 0% de descuento.")

rl.question("Introduzca su edad:", (respuesta)=>{

    edad=Number(respuesta);

    if(edad>65){

    console.log("El billete con el descuento del 100% le sale gratis.");

    }else if(edad<12){

    precioBilleteMadridSegovia*=0.5;
    console.log("El precio del billete le costará:"+" "+precioBilleteMadridSegovia);

    }
    else{
        console.log("El precio del billete le costará:"+" "+precioBilleteMadridSegovia);
    }


    rl.close();

});