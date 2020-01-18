package fun.lixi.study.designpatterns.p15.p15d7;

import fun.lixi.study.designpatterns.p15.p15d3.AccessUser;
import fun.lixi.study.designpatterns.p15.p15d3.IUser;
import fun.lixi.study.designpatterns.p15.p15d3.SqlserverUser;
import fun.lixi.study.designpatterns.p15.p15d4.AccessDepartment;
import fun.lixi.study.designpatterns.p15.p15d4.IDepartment;
import fun.lixi.study.designpatterns.p15.p15d4.SqlserverDepartment;

public class DataAccess {

    private static final String db = "Sqlserver";
//    private static final String db = "Access";

    public static IUser createUser() {
        IUser result = null;

        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
            default:
                break;
        }

        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;

        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
            default:
                break;
        }

        return result;
    }


}
