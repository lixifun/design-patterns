package fun.lixi.study.designpatterns.p15.p15d2;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        SqlserverUser su = new SqlserverUser();
        su.insert(user);
        su.getUser(1);
    }
}
