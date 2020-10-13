package oo.Figures;

public class Quadrat extends Rectangle {

    public Quadrat(int r) {
        super(r,r);
    }
    @Override
    public String toString(){
        return "Quadrat: costat " + super.getC1() + ", area:(("+ this.area() + "))";
    }

}
