package pokemon;

public class Pokemon {
    private String nombre;
    private int ataque;
    private  int defensa;
    private FamiliaPokemon familia;

    public Pokemon() {
        this.nombre = "";
        this.ataque = 0;
        this.defensa= 0;
        this.familia = FamiliaPokemon.DEFAULT;
    }

    public Pokemon(String nombre, int ataque, int defensa, FamiliaPokemon familia) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.familia = familia;
    }

    public Pokemon(FamiliaPokemon familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public FamiliaPokemon getFamilia() {
        return familia;
    }

    public void setFamilia(FamiliaPokemon familia) {
        this.familia = familia;
    }
//    @Override
//    public String toString(){
//        return "Javito el de los clavitos";
//    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", familia=" + familia +
                '}';
    }
}
