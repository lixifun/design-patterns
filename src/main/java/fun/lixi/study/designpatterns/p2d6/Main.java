package fun.lixi.study.designpatterns.p2d6;

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

        // 对比 p2d3 这里客户端只需要认识 CashContext 一个类
        CashContext ctx = new CashContext(cbxType);

        double totalPrices = ctx.getResult(price * num);
        total = total + totalPrices;
        System.out.println("单价: " + price + " 数量: " + num + " 合计: " + totalPrices);
    }
}
