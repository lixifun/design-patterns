package fun.lixi.study.designpatterns.p1.p1d9;

public abstract class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public abstract double getResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
