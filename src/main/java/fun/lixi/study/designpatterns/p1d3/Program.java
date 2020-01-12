package fun.lixi.study.designpatterns.p1d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * p1.3 代码规范
 * idea 中选中代码块 使用 ctrl + alt + t 可快速添加 try...catch
 */
public class Program {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("请输入数字A: ");
            String strNumberA = reader.readLine();

            System.out.println("请选择运算符号(+、-、*、/): ");
            String strOperate = reader.readLine();

            System.out.println("请输入数字B: ");
            String strNumberB = reader.readLine();

            String strResult = "";

            switch (strOperate) {
                case "+":
                    strResult = Double.toString(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                    break;
                case "-":
                    strResult = Double.toString(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                    break;
                case "*":
                    strResult = Double.toString(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                    break;
                case "/":
                    if (!"0".equals(strNumberB)) {
                        strResult = Double.toString(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                    } else {
                        strResult = "除数不能为 0";
                    }
                    break;
            }
            System.out.println("结果是: " + strResult);

        } catch (IOException e) {
            System.out.println("您的输入有错：" + e.getMessage());
        }
    }
}
