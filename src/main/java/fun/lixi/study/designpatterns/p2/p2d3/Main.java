package fun.lixi.study.designpatterns.p2.p2d3;

public class Main {

    double total = 0;

    /**
     * 点击确定按钮
     *
     * @param price 单价
     * @param num   数量
     * @param cbxType  打折选项
     */
    private void btnOkClick(double price, int num, String cbxType) {


        // 对比 p2d6 中，这里客户端需要认识
        // CashSuper 和 CashFactory 两个类
        CashSuper cashSuper = CashFactory.createCashAccept(cbxType);

        double totalPrices = cashSuper.acceptCash(price * num);
        total = total + totalPrices;
        System.out.println("单价: " + price + " 数量: " + num + " 合计: " + totalPrices);
    }
}
