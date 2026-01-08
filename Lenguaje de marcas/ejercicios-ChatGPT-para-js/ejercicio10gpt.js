// 10. Filtrar números pares en un array
// Dado un array de números, devuelve un nuevo array solo con los pares.
function contadorParesArray(array){

    let contador= 0;

    for(let i=0; i<array.length; i++){
        if(array[i]%2===0){
            contador++;
        }
        
    }
    return contador;
}

console.log(contadorParesArray([1,2,3,4,5,6,7,8,9,10]));