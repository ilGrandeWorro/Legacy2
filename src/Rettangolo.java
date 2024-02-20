package src;

public class Rettangolo extends Forma{

    public double calcolaArea(double base, double altezza){
        double area = (base * altezza);
        System.out.println(area);
        return area;
    }
}
