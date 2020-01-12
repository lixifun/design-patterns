package fun.lixi.study.designpatterns.p2d1;

public class Main {

    double total = 0;

    private void btnOkClick(String txtPrice, String txtNum) {

        double totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum);
        total = total + totalPrices;
        System.out.println("单价: " + txtPrice + " 数量: " + txtNum + " 合计: " + totalPrices);
    }


}
