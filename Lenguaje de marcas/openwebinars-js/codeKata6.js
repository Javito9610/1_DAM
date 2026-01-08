
let result= function (name, year, formatter){
    /*AQUI FORMATTER ESTA ACTUANDO COMO PARAMETRO. SE DECLARA COMO PARAMETRO*/
    let copyRight = formatter(name,year);
    return copyRight;
    }

let formatter = function(name,year){
    return name + " | " + year;
}
/*AQUI A FORMATTER SE LE DA EL VALOR DE VARIABLE*/

console.log(result("Javito",2025,formatter));
/*AQUI FORMATTER RECIBE EL COMPORTAMIENTO DE ARGUMENTO*/
/*EL CALLBACK EN UNA FUNCION ES UN PARAMETRO QEU SE COMPORTA COMO ARGUMENTO Y VICEVERSA Y QUE A SU VEZ ES UNA FUNCIO*/


/*AHORA VAMOS A VER LAS FUNCIONES AUTOINVOCADA*/

(function(namee, yeaar){
    console.log(namee, yeaar);
})("Javierin", 2025);