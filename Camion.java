package Practico_5_clase;

public class Camion {

    //atributos de los camiones
    private int chapa;
    private String color;
    private int añoCompra;

    //constructores
    public Camion(){
        this.chapa=1000;
        this.color="Negro";
        this.añoCompra=2021;
        //System.out.println("*****Constructor sin parametros******");
        //System.out.println("Se creo un camión negro de chapa 1000");
    }

    public Camion(String unColor){
        this.chapa=1000;
        this.color=unColor;
        this.añoCompra=2021;
        //System.out.println("*****Constructor con 1 parametros******");
        //System.out.println("Se creo un camión "  + this.color + " de chapa 1000 ");
    }

    public Camion (String unColor, int unaChapa){
        this.chapa=unaChapa;
        this.color=unColor;
        this.añoCompra=2021;
        //System.out.println("*****Constructor con dos parametros******");
        //System.out.println("Se creo un camión "  + this.color + " de chapa " + this.chapa);
    }

    public void setChapa(int unaChapa){
        this.chapa=unaChapa;

    }

    public int getChapa(){
        return this.chapa;
    }

    public void setColor(String unColor){
        this.color=unColor;
    }

    public String getColor(){
        return this.color;
    }

    public void setAñoCompra(int unAñoCompra){
        this.añoCompra=unAñoCompra;
    }

    public int getAñoCompra(){
        return this.añoCompra;
    }

    public boolean leTocaRevision(){
        if (añoCompra<2015){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String infoDelcamion = "El color del camion es " + this.color + " y la chapa es " + this.chapa;
        infoDelcamion=infoDelcamion + ". El año de compra es " + this.añoCompra;

        if(this.leTocaRevision()==true){
            infoDelcamion=infoDelcamion + " y le toca revisión";
        } else{
            infoDelcamion=infoDelcamion + " y No le toca revisión!!";
        }

        return infoDelcamion;
    }




}
