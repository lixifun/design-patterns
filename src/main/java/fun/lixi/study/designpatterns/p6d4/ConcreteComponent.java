package fun.lixi.study.designpatterns.p6d4;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
