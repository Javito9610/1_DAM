let adress = "Calle prado de la fonda, Nº 8";

let price = 2.33;

let active = false;

let miercoles;

let nulo = null;

console.log("adress es:",typeof adress);

console.log(typeof price);

console.log(typeof active);

console.log(typeof miercoles);

console.log(typeof nulo);
/*EJEMPLOS DE CASTING CON ACTIVE*/

adress=Boolean(adress);

console.log("adress es:",typeof adress);

console.log("y es", adress, "porque tiene contenido. Sino tuviera contenido seria False.");

adress=Number(adress);

console.log("adress es:",typeof adress);

console.log("Y es:",adress, "Porque tiene contenido. Sino sería 0");

adress=undefined;

console.log("adress es:",typeof adress);

adress=null;

console.log("adress es:",typeof adress);

price=Boolean(price);

console.log("price es:", typeof price)

console.log("Y es:", price, "porque tiene contenido y es distinto de cero. Sino seria false.");
/*Si pasamos un true a un nombre nos devuelve un 1 y si paasamos un false nos devuelve un 0. El 1 y el 0 actuan como booleanos en ciertas ocasiones*/ 



