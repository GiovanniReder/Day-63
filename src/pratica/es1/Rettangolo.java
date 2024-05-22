package pratica.es1;

public class Rettangolo {
    // ATTRIBUTI
    private double larghezza;
    private double altezza;


    // COSTRUTTORI
    public Rettangolo(double larghezza, double altezza){
        this.larghezza=larghezza;
        this.altezza=altezza;
    }



    // METODI
    public void calcPerimetro(){
        System.out.println("Ciao sono un rettangolo, il mio perimetro è "
                + ((this.larghezza * 2) + (this.altezza * 2)));
    }public void calcArea(){
        System.out.println("Ciao sono un rettangolo, la mia area è "
                + (this.altezza * this.larghezza) );
    }


}
/*
*
*
*
*
* */