package fun.lixi.study.designpatterns.p1.p1d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * p1.1
 */
public class Program_1_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入数字A: ");
        // 命名不规范
        String A = reader.readLine();

        System.out.println("请选择运算符号(+、-、*、/): ");
        // 命名不规范
        String B = reader.readLine();

        System.out.println("请输入数字B: ");
        // 命名不规范
        String C = reader.readLine();

        // 命名不规范
        String D = "";

        // 判断分支，每次都是 if 意味着每个条件都要做判断，等于计算机做了三次无用功
        if ("+".equals(B)) {
            D = Double.toString(Double.parseDouble(A) + Double.parseDouble(C));
        }

        if ("-".equals(B)) {
            D = Double.toString(Double.parseDouble(A) - Double.parseDouble(C));
        }

        if ("*".equals(B)) {
            D = Double.toString(Double.parseDouble(A) * Double.parseDouble(C));
        }

        if ("/".equals(B)) {
            // 除法要注意分母是否为 0
            D = Double.toString(Double.parseDouble(A) / Double.parseDouble(C));
        }

        System.out.println("结果是: " + D);

    }
}
