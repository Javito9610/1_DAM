let city="Madrid";
var town= "Centro"
/*Hoisting:A las variables contruidas por var se les reserva un espacio en la memoria*/ 
console.log(city, town);
const year="2023";
console.log(town, year);
town="surf"; /*Town se puede cambiar de valor, pero let no*/
console.log(town, year);

