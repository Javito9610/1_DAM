package models;
// Es un modelo. No va a tener main. porque no vamos a ejecutar esta clase. La vamos a utilizar como modelos
// En los atributos se pueden poner, delante: O public, o private, o protected
// Por seguridad es mejor private, porque con public podremos acceder desde fuera sin necesidad de hacer nada.
// Cuando es privado solo se puede acceder desde dentro de la clase.
public class Tienda {
//    >Public: Accedemos desde donde quiera
//    >Private: Solo se puede acceder desde la misma clase.
//    >Protected: Solo te permite accederlo desde la misma clase (como private), pero tambien desde las clases en el mismo paquete
   private int cantidadCajasRegistradoras;
   private int numeroEmpleados;
   private int numeroEstanterias;
   private String nombre;
   private int edad;
   private  boolean esMayorDeEdad;
// Estos son atributos de la clase que seran utilizados por la funcion creadora.
// Todo esto de aqui arriva es la plantilla que le hemos puesto
// Cuando yo vaya a crear una tienda java va a llamar a una funcion que se llama funcion constructora
// Cuando nosotros definimos la clase de un objeto lo denominamos public y el nombre de la clase.
    public Tienda(
            int cantidadCajasRegistradoras,
            int numeroEmpleados,
            int numeroEstanterias,
            String nombre){

        this.cantidadCajasRegistradoras=cantidadCajasRegistradoras;
        this.numeroEmpleados=numeroEmpleados;
        this.numeroEstanterias=numeroEstanterias;
        this.nombre=nombre;

    }
    public Tienda(
            int cantidadCajasRegistradoras,
            int numeroEstanterias,
            String nombre){
        this.cantidadCajasRegistradoras=cantidadCajasRegistradoras;
        this.numeroEstanterias=numeroEstanterias;
        this.numeroEmpleados=0;
//        Aunque no tengas variable de empleados hay que inicializar la variable para que no de nulo.
        this.nombre=nombre;
//        Hay que inicializar todas las variables.
}
// Podemos jugar con el constructor
// Las funciones entran dentro de la clase Tienda
    public  void ImprimirNombre(){
        System.out.println(nombre);
    }
//    Para que me deje utilizar el private desde fuera, recurro a una función publica
//    Llamo a este método que me las va a devolver
//    Hay que poner int para que nos devuelva un entero
    public int setCantidadCajasRegistradoras(){
        return cantidadCajasRegistradoras;
    }
//    Con esto no puedo acceder al atributo de cantidadCajasRegistradoras pero puedo acceder a la función que me devuelve la catidad de cajas registradoras.
    public void setCantidadCajasRegistradoras(int cantidad){
        cantidadCajasRegistradoras=cantidad;
    }
    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }
    public void setNumeroEmpleados(int numero){
        numeroEmpleados=numero;
    }
    public int getNumeroEstanterias(){
        return numeroEstanterias;
    }
    public void setNumeroEstanterias(int numero){
        numeroEstanterias=numero;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        System.out.println(nombre);
        System.out.println(this.nombre);
//        Con .this me estoy refiriendo al "nombre" del atributo
//        Sin .this me estoy refiriendo al"nombre" del parametro
    }
    public void setEdad(int edad){
        this.edad=edad;
        if (edad>18){
            esMayorDeEdad=true;
//        Cuando introduzca la edad ya no tenemos que preocuparnos de meter un set a esMayorDeEdad porque el mismo set de edad ya lo está actualizando.
        }else {
            esMayorDeEdad=false;
        }
    }
//     En los set no se devuelve nada (por lo tanto no tengo que poner return), lo único que se hace en el set es actualizar el valor de la variable, por lo tanto pongo void.
    public void Imprimirdatos(){
        System.out.println("Esta tienda tiene"+ numeroEmpleados+"empleados"+numeroEstanterias+"estanterias"+cantidadCajasRegistradoras+"cajas");
    }

}


