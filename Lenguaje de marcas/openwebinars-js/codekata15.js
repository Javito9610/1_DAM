/*BUCLE FOR*/
let lista = [];
for(let i=0; i<=10;i++){
    lista[i]=i;
}
console,console.log(lista);
/*BULE WHILE*/
let limit=13;
let variable=1;
do{
  console.log(variable++)  
}while(variable<=13);
/*BUCLE FOR IN con un objet*/
let frutas={"A":"naranja", "B":"manzana", "C":"melocoton"};
for(let claveElemento in frutas){
    console.log(claveElemento);
    /*CCON ESTO TE DICEN LAS CLAVES*/
    console.log(frutas[claveElemento]);
    /*Y CON ESTO EL VALOR DEL ELEMENTO, PORQUE EL INDICE ES LA CLAVE,POR LO TANTO PARA CADA CLAVE RECORRIDA POR LA ITERACION FOR TENEMOS UN ELEMNTO*/
    
}

