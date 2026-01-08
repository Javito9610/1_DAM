package pokemon;

public class PrincipalPokemon {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon("charmander", 120, 23, FamiliaPokemon.FUEGO );

        if (charmander.getFamilia()== FamiliaPokemon.HIELO){
            System.out.println("Es hielo ");
        } else if (charmander.getFamilia()==FamiliaPokemon.FUEGO) {
            System.out.println("Es fuego");
        }

        String nombre ="Manolo";
        System.out.println(nombre);
        System.out.println(charmander);
    }

}
