let myFruit="sandia";
switch(myFruit){
    case "manzana":
        console.log("Esto es manzana");
        break;
    case "pera":
        console.log("esto es una pera");
        break;
    case "sandia":
        console.log("Bingooo esto es una sandia");
        break;
    default:
        console.log("Tu eres tonto");
}

/*LO DE ANTES ERA SWITCH CASE*/
/*ESTO ES OPERADOR TERNARIO*/
let fruit = "grape";
let knownFruits = new Set(["bananna", "lemon", "watermelon"]);
let isAvailable = (knownFruits.has(fruit) ? "Si contiene grape" : "No tiene grape");
console.log(isAvailable);
let knownFruits2 = new Set(["bananna", "grape", "watermelon"]);
let isAvailable2=(knownFruits2.has(fruit) ? "Si contiene grape" : "NOOOOOO lo contiene");
console.log(isAvailable2);
/*TIPO IN PARA OBJETOS*/
let myFavouriteFruit="orange";
let myAvailableFruit={"Bannana":"tropical", "lemon":"citrico", "orange":"citrico"};
console.log(myFavouriteFruit in myAvailableFruit);
/*TIPO,IN PARA ARRAY*/
let myAvailableFruit2=["naranja", "platano", "melocoton"];
console.log(2 in myAvailableFruit2);