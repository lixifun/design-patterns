package fun.lixi.study.designpatterns.p1d8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("请输入数字A: ");
            String strNumberA = reader.readLine();

            System.out.println("请选择运算符号(+、-、*、/): ");
            String strOperate = reader.readLine();

            System.out.println("请输入数字B: ");
            String strNumberB = reader.readLine();

            String strResult = Double.toString(Operation.getResult(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB), strOperate));

            System.out.println("结果是：" + strResult);

        } catch (IOException e) {
            System.out.println("您的输入有错：" + e.getMessage());
        }

    }
}
