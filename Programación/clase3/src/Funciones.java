public class Funciones {

//      La suma simple solo pinta el resultado de 2 + 2 porque no se puede guardar su valor ya que no tiene ningún tipo requerido
        public static void SumaSimple() {
            int x = 2;
            int y = 2;

            int resultado1 = x + y;
            System.out.println(resultado1);

        }
//        fuera de la función java no conoce las variables de dentro de la función
//        La suma con retorno sirve para guardarme una variable ya que me la retornará en un futuro cuando la reclame
    public static int SumaSimpleConRetorno() {
        int x = 2;
        int y = 14;

        int resultado2 = (x + y);

        return resultado2;
    }
//     void significa que no retorno nada
//     int retorna un número
//     La min tambien es una función por eso todas las funciones que quiera crear tengo que hacerlo fuera. Por que no puedo crear una función dentro de una función
//     Retorna un float
public static float SumaSimpleConRetornoFloat() {
    float x = 2.3f;
    int y = 14;

    float resultado2 = (x + y);

    return resultado2;
}

    public static String SumaSimpleConRetornoString() {
        return "hola";
    }

    public static boolean SumaSimpleConRetornoBooleano() {
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Voy a hacer la suma simple");
        SumaSimple();
        System.out.println("Voy a hacer una suma simple con retorno");
        int resultado2 = SumaSimpleConRetorno();
        System.out.println(resultado2);


    }


}
