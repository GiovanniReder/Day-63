package pratica.es1;

public class DueRettangoli {
    //ATTRIBUTI
    private double larghezza;
    private double altezza;
    private double larghezza2;
    private double altezza2;
    //COSTRUTTORE
    public DueRettangoli(double larghezza, double altezza, double larghezza2, double altezza2) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.larghezza2 = larghezza2;
        this.altezza2 = altezza2;
    }
    //METODO
    public void stampaDueRettangoli(){
        System.out.println("Ciao siamo due rettangoli, le nostre aree sono: "
                + ((this.altezza * this.larghezza) + (this.altezza2 * this.larghezza2) ) + " I nostri perimetri sono: " +
                ( (this.larghezza * 2) + (this.altezza * 2) + (this.larghezza2 * 2) + (this.altezza2 * 2) ) + " La nostra fusione massima è: "
        + ( ((this.altezza * this.larghezza) + (this.altezza2 * this.larghezza2) ) +  ( (this.larghezza * 2) + (this.altezza * 2) + (this.larghezza2 * 2) + (this.altezza2 * 2) ) ) );
    }
}
