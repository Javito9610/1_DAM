import models.Tienda;

public class SistemaDeTiendas {
    public static void main(String[] args) {
        Tienda alcampo = new Tienda(23,12,23,"Alcampo");
        Tienda lidl = new Tienda(256,23,11,"Lidl");
        Tienda nuevaTienda = new Tienda(23,12,"Nueva Segovia");
        alcampo.getNumeroEstanterias();
//        Esto es invocarlo o declararlo
//        Si yo lo ejecuto va a hacer la funcion para la que se predeterminó.
//        Cuando yo la declaro, me permite acceder a los atributos enlazados a esa función constructora.
        alcampo.setNombre("Alcampo");
//        alcampo.cantidadCajasRegistradoras = 5;
////        Cuando yo pongo el punto estoy accediendo a todos los metodos de la clase.
//        System.out.println(alcampo.cantidadCajasRegistradoras);
//        lidl.cantidadCajasRegistradoras = 20;
//        System.out.println(lidl.cantidadCajasRegistradoras);
        alcampo.setCantidadCajasRegistradoras(10);
        System.out.println(alcampo.setCantidadCajasRegistradoras());
        alcampo.ImprimirNombre();
//        Si la función cantidadCajasRegistradoras es privada no puedo acceder a ella pero mediante GetCantidadCajasRegistradoras() si que puedo acceder
//        En medida de lo posible hay que intentar que las funciones o metodos en las clases sean privadas
        alcampo.Imprimirdatos();




    }
}
