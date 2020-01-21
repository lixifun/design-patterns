package fun.lixi.study.designpatterns.p24.p24d3;

public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setHandler(h2);
        h2.setHandler(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.HandleRequest(request);
        }

    }
}
