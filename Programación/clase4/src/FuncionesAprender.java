public class FuncionesAprender {
    public static void Imprimir (float valor){
        System.out.println(valor);
    }
    public static void Imprimir (String valor){
        System.out.println(valor);
    }
    public static void Imprimir(){}
    public static void Imprimir(boolean booleano){
        System.out.println(booleano);
    }
    public static void main(String[] args) {
        Imprimir(2.3f);
        Imprimir("hola");
        Imprimir();
        Imprimir(true);
    }
}
