package Javier;

public class Impresion {
  public static void   main(String[] args){
    String saludo = "Hola mundo";
    int numero = 22;
    int numero2 =21;
    boolean quieroComer = true;
    System.out.println(saludo);
//    para medir length(). Es una funcion del elemento String.
//      el null no se puede medir
//    los tipos primitivos son: int,char,float,double,short,boolean
      System.out.println(numero);
      System.out.println(numero + saludo + numero2);
//       un texto mas un numero no es un erro es una concatenacion
//      siempre que hay dos numeros de por medio aunque sean decimales se va a sumar
      System.out.println(quieroComer);
//       lo que no se puede hacer es restar texto con texto o texto con numero
//      hay un libro que se llama clean code que te enseña nomenclatura para escrribir legible

  }
}
