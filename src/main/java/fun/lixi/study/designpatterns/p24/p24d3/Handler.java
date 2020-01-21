package fun.lixi.study.designpatterns.p24.p24d3;

public abstract class Handler {
    protected Handler successor;

    public void setHandler(Handler handler) {
        this.successor = handler;
    }

    public abstract void HandleRequest(int request);
}
