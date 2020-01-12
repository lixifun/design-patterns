package fun.lixi.study.designpatterns.p6d4;

/**
 * 装饰模式 (Decorator)
 * 动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更灵活
 */
public abstract class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
