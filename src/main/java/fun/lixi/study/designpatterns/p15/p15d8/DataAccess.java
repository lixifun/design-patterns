package fun.lixi.study.designpatterns.p15.p15d8;

import fun.lixi.study.designpatterns.p15.p15d3.IUser;
import fun.lixi.study.designpatterns.p15.p15d4.IDepartment;

public class DataAccess {

    private static final String AssemblyName = "抽象工厂模式";
    private static final String db = "Sqlserver";

    public static IUser createUser() {
        String className = AssemblyName + "." + db + "User";
        IUser iUser = null;
        try {
            iUser = (IUser) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return iUser;
    }

    public static IDepartment createDepartment() {
        String className = AssemblyName + "." + db + "Department";
        IDepartment iDepartment = null;

        try {
            iDepartment = (IDepartment) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return iDepartment;
    }
}
