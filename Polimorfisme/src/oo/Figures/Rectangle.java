package oo.Figures;


public class  Rectangle extends Figura {
    private double c1;
    private double c2;

    public Rectangle(double c1, double c2){
        this.c1 =c1;
        this.c2=c2;
    }
    public double area() {
        return this.c1*this.c2;
    }

    public double getC1() {
        return c1;
    }

    public double getC2() {
        return c2;
    }

    @Override
    public String toString(){
        return "Rectangle c1:" + this.c1 +", c2:"+this.c2 + ", area:(("+ this.area() + "))";
    }
}
