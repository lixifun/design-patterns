package fun.lixi.study.designpatterns.p24.p24d5;

import fun.lixi.study.designpatterns.p24.p24d2.Request;

public abstract class Manager {
    protected String name;

    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
