let alumnos = [
    {nombre:"Javi", nota:10},
    {nombre:"Joaquin", nota:3},
    {nombre:"Mar", nota:10},
    {nombre:"Pedro", nota:4}
];

let aprobados = alumnos.filter(alumno => alumno.nota >= 5);
console.log(aprobados);

function Libro (titulo, autor, anio){
    this.titulo=titulo;
    this.autor=autor;
    this.anio=anio;
}
function Libro(titulo,autor,anio,ISBN){
    this.titulo=titulo;
    this.autor=autor;
    this.anio=anio;
    this.ISBN=ISBN;
}
let libro1 = new Libro("El Quijote", "Cervantes", 1853);
console.log(libro1);
let libro2 = new Libro("El principito", "Anónimo", 1543, 675757898);
console.log(libro2);

let empresa = {
    nombre: "FlipiNext S.A",
    direccion:{
        calle: "Prado de la Fonda",
        Numero: 8,
        codPostal: 40410,
        ciudad: "San Rafael",
        provincia: "Segovia"
    }
}
console.log(`La empresa ${empresa.nombre} esta en la calle ${empresa.direccion.calle} numero ${empresa.direccion.Numero}, con código postal ${empresa.direccion.codPostal}, en la ciudad de ${empresa.direccion.ciudad}`);

let json = JSON.stringify(empresa);
console.log("Conversion a JSON:", json);

let objeto = JSON.parse(json);
console.log("Conversion a objeto:", objeto)


function animal(tipo, sonido){
    this.tipo=tipo;
    this.sonido=sonido;
}

animal.prototype.hacerSonido= function (){
    console.log(`${this.tipo}, ${this.sonido}`)
}

let perro = new animal("cánido", "ladra");

perro.hacerSonido();

class Persona {

    constructor(nombre, edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    saludar(){
        return `hola soy ${this.nombre} y tengo ${this.edad}`;
    }

}

let person1 = new Persona ("Javi", 29);
console.log(person1.saludar());
