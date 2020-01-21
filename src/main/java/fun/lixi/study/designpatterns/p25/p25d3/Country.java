package fun.lixi.study.designpatterns.p25.p25d3;

public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
