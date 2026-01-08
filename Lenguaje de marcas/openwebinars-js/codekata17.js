function* extractNumber(attemps){
    for(let i=0; i <attemps; i++){
        yield Math.floor(Math.random()*91);/*lo multiplico por 91 para que este entre 1 y 90*/
        /* Math.floor es para redondear y que no salgan decimales*/
    }
}
let cpu = 0;
let player=0;
/*Tiradas CPU*/
let cpuGenerator = extractNumber(2);
cpu += cpuGenerator.next().value;
cpu += cpuGenerator.next().value;

let playerGenerator = extractNumber(2);
player += playerGenerator.next().value;
player += playerGenerator.next().value;
console.log((cpu>player)?"CPU WIN":"PLAYER WIN");
console.log(player);
console.log(cpu);
/* next().value es para pedir el valor a la funcion generadora*/