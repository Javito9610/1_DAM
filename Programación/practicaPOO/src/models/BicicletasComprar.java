package models;

public class BicicletasComprar {
    private int precio;
    private boolean mullet;
    private String marcaRueda;
    private int medidaRueda;
    private String tallaCuadro;
    private String marcaHorquilla;
    private String modeloHorquilla;
    private int medidaHorquilla;
    private String marcaDiscosFreno;
    private int medidaDiscosFreno;
    private String marcaManetasFrenos;
    private String modeloManetaFrenos;
    private boolean tijaTelescopica;
    private String marcaTija;
    private boolean transmisionElectronica;
    private String marcaTransmision;
    private String marcaPedales;
    private String marcaManillar;
    private int medidaManillar;


    public BicicletasComprar(int precio,boolean mullet, String marcaRueda, int medidaRueda, String tallaCuadro, String marcaHorquilla, String modeloHorquilla, int medidaHorquilla, String marcaDiscosFreno, int medidaDiscosFreno, String marcaManetasFrenos, String modeloManetaFrenos, boolean tijaTelescopica, String marcaTija, boolean transmisionElectronica, String marcaTransmision, String marcaPedales, String marcaManillar, int medidaManillar) {
        this.precio = precio;
        this.mullet = mullet;
        this.marcaRueda = marcaRueda;
        this.medidaRueda = medidaRueda;
        this.tallaCuadro = tallaCuadro;
        this.marcaHorquilla = marcaHorquilla;
        this.modeloHorquilla = modeloHorquilla;
        this.medidaHorquilla = medidaHorquilla;
        this.marcaDiscosFreno = marcaDiscosFreno;
        this.medidaDiscosFreno = medidaDiscosFreno;
        this.marcaManetasFrenos = marcaManetasFrenos;
        this.modeloManetaFrenos = modeloManetaFrenos;
        this.tijaTelescopica = tijaTelescopica;
        this.marcaTija = marcaTija;
        this.transmisionElectronica = transmisionElectronica;
        this.marcaTransmision = marcaTransmision;
        this.marcaPedales = marcaPedales;
        this.marcaManillar = marcaManillar;
        this.medidaManillar = medidaManillar;
    }

    public BicicletasComprar() {
        precio=0;
        mullet=false;
        marcaRueda="";
        medidaRueda=0;
        tallaCuadro="";
        marcaHorquilla="";
        modeloHorquilla="";
        medidaHorquilla=0;
        marcaDiscosFreno="";
        medidaDiscosFreno=0;
        marcaManetasFrenos="";
        modeloManetaFrenos="";
        tijaTelescopica=false;
        marcaTija="";
        transmisionElectronica=false;
        marcaTransmision="";
        marcaPedales="";
        marcaManillar="";
        medidaManillar=0;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getMarcaManillar() {
        return marcaManillar;
    }

    public void setMarcaManillar(String marcaManillar) {
        this.marcaManillar = marcaManillar;
    }

    public String getMarcaPedales() {
        return marcaPedales;
    }

    public void setMarcaPedales(String marcaPedales) {
        this.marcaPedales = marcaPedales;
    }

    public String getMarcaTransmision() {
        return marcaTransmision;
    }

    public void setMarcaTransmision(String marcaTransmision) {
        this.marcaTransmision = marcaTransmision;
    }

    public boolean isTransmisionElectronica() {
        return transmisionElectronica;
    }

    public void setTransmisionElectronica(boolean transmisionElectronica) {
        this.transmisionElectronica = transmisionElectronica;
    }

    public String getMarcaTija() {
        return marcaTija;
    }

    public void setMarcaTija(String marcaTija) {
        this.marcaTija = marcaTija;
    }

    public boolean isTijaTelescopica() {
        return tijaTelescopica;
    }

    public void setTijaTelescopica(boolean tijaTelescopica) {
        this.tijaTelescopica = tijaTelescopica;
    }

    public String getModeloManetaFrenos() {
        return modeloManetaFrenos;
    }

    public void setModeloManetaFrenos(String modeloManetaFrenos) {
        this.modeloManetaFrenos = modeloManetaFrenos;
    }

    public String getMarcaManetasFrenos() {
        return marcaManetasFrenos;
    }

    public void setMarcaManetasFrenos(String marcaManetasFrenos) {
        this.marcaManetasFrenos = marcaManetasFrenos;
    }

    public int getMedidaDiscosFreno() {
        return medidaDiscosFreno;
    }

    public void setMedidaDiscosFreno(int medidaDiscosFreno) {
        this.medidaDiscosFreno = medidaDiscosFreno;
    }

    public String getMarcaDiscosFreno() {
        return marcaDiscosFreno;
    }

    public void setMarcaDiscosFreno(String marcaDiscosFreno) {
        this.marcaDiscosFreno = marcaDiscosFreno;
    }

    public int getMedidaHorquilla() {
        return medidaHorquilla;
    }

    public void setMedidaHorquilla(int medidaHorquilla) {
        this.medidaHorquilla = medidaHorquilla;
    }

    public String getModeloHorquilla() {
        return modeloHorquilla;
    }

    public void setModeloHorquilla(String modeloHorquilla) {
        this.modeloHorquilla = modeloHorquilla;
    }

    public String getMarcaHorquilla() {
        return marcaHorquilla;
    }

    public void setMarcaHorquilla(String marcaHorquilla) {
        this.marcaHorquilla = marcaHorquilla;
    }

    public String getTallaCuadro() {
        return tallaCuadro;
    }

    public void setTallaCuadro(String tallaCuadro) {
        this.tallaCuadro = tallaCuadro;
    }

    public int getMedidaRueda() {
        return medidaRueda;
    }

    public void setMedidaRueda(int medidaRueda) {
        this.medidaRueda = medidaRueda;
    }

    public String getMarcaRueda() {
        return marcaRueda;
    }

    public void setMarcaRueda(String marcaRueda) {
        this.marcaRueda = marcaRueda;
    }

    public boolean isMullet() {
        return mullet;
    }

    public void setMullet(boolean mullet) {
        this.mullet = mullet;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
