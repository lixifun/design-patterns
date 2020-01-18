package fun.lixi.study.designpatterns.p18.p18d5;

public class Main {
    public static void main(String[] args) {

        // 大战 Boss 前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        // 保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        // 大战 Boss ,损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        // 恢复之前的状态
        lixiaoyao.recoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();

    }
}
