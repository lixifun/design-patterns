package fun.lixi.study.designpatterns.p18.p18d2;

public class Main {

    public static void main(String[] args) {
        // 大战 Boss 前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        // 保存进度
        GameRole backup = new GameRole();
        backup.setAtk(lixiaoyao.getAtk());
        backup.setVit(lixiaoyao.getVit());
        backup.setDef(lixiaoyao.getDef());

        // 大战 Boss, 损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        // 恢复之前的状态
        lixiaoyao.setVit(backup.getVit());
        lixiaoyao.setAtk(backup.getAtk());
        lixiaoyao.setDef(backup.getDef());

        lixiaoyao.stateDisplay();
    }
}
