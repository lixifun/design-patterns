package fun.lixi.study.designpatterns.p18.p18d5;

public class GameRole {

    /**
     * 生命力
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;

    /**
     * 防御力
     */
    private int def;

    /**
     * 状态显示
     */
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力: " + this.vit);
        System.out.println("攻击力: " + this.atk);
        System.out.println("防御力: " + this.def);
    }

    /**
     * 获取初始状态
     */
    public void getInitState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 战斗
     */
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    /**
     * 保存角色状态
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    /**
     * 恢复角色状态
     */
    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
