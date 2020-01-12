package fun.lixi.study.designpatterns.p2d5;

import fun.lixi.study.designpatterns.p2d3.CashNormal;
import fun.lixi.study.designpatterns.p2d3.CashRebate;
import fun.lixi.study.designpatterns.p2d3.CashReturn;

public class Main {

    double total = 0;

    /**
     * 点击确定按钮
     * <p>
     * 此时 判断又到了客户端
     *
     * @param price   单价
     * @param num     数量
     * @param cbxType 打折选项
     */
    private void btnOkClick(double price, int num, String cbxType) {

        CashContext ctx = null;

        switch (cbxType) {
            case "正常收费":
                ctx = new CashContext(new CashNormal());
                break;
            case "满 300 减 100":
                ctx = new CashContext(new CashReturn(300, 100));
                break;
            case "打 8 折":
                ctx = new CashContext(new CashRebate(0.8));
                break;
        }

        double totalPrices = ctx.getResult(price * num);

        total = total + totalPrices;
        System.out.println("单价: " + price + " 数量: " + num + " 合计: " + totalPrices);
    }
}
