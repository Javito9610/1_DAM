/*SI ESTA INDEXADO*/
let namedCollection=["Javi", "paz", "Sandra", "diana"];
console.log(namedCollection);
console.log(namedCollection[0]);
console.log(namedCollection[1]);
console.log(namedCollection[2]);
console.log(namedCollection[3]);

let num = new Set([1,2,3,4,"hola"]);
console.log(num);
/*console.log(num[0]); ESTO NO SE PUEDE HACER PORQUE, SET NO ESTA INDEXADO, NO TIENE INDICES*/
console.log(num.has(true));
console.log(num.has(3));
/*ESTO DE AQUI ARRIBA ES COMPROBAR SI ESTAN LOS ELEMENTOS EN LES SET*/
/*AHORA PARA AÑADIR:*/
num.add("ADIOS");
console.log(num);
/*ESTO DE AQUI ABAJO ES MAP Y ES UNA LISTA QUE TIENE UNA CLAVE POR CADA ELEMENTO*/

let mapeo= new Map([
    ["nombre", "Jota"],
    ["apellido1", "Luengo"],
    ["apellido2", "Barreno"]
]);
console.log(mapeo);
/*PARA CAMBIAR ELEMENTOS*/
mapeo.set("nombre", "Javierin");
console.log(mapeo);
console.log(mapeo.get("apellido2"));
/*ESTO DE AQUI ABAJO ES OBJET*/
let objeto = {
    marca: "seat",
    modelo: "ibiza"
};
console.log(objeto);
/*PARA IMPRIMIR EN CONSOLA LSO ELEMENTOS AISLADOS*/
console.log(objeto.marca);
let currentDate= new Date();
console.log(currentDate);
let secondCurrentDate= new Date;
console.log(secondCurrentDate);
/* LA FECHA QUE VA A CREAR, VA DIFERIR EN EL MOMENTO EN EL QUE SE CREA*/

