package models;

public class Calculadora {
    private final float pi = 3.14f;
//    una variable que no se va actualizar nunca, se pone un final delante
//    no permite que se actualicen las variables que lo tengan.
    public float getPi(){
        return pi;
    }
}
