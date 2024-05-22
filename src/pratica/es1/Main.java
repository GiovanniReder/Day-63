package pratica.es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rect = new Rettangolo(20,10);
        rect.calcPerimetro();
        Rettangolo rect2 = new Rettangolo(20,10);
        rect2.calcArea();
        DueRettangoli rect3 = new DueRettangoli(20,10, 40,20);
        rect3.stampaDueRettangoli();
    }
}
