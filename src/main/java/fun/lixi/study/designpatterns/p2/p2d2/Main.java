package fun.lixi.study.designpatterns.p2.p2d2;

/**
 * 增加打折
 */
public class Main {

    double total = 0;

    /**
     * 点击确定按钮
     *
     * @param txtPrice 单价
     * @param txtNum   数量
     * @param cbxType  打折选项
     */
    private void btnOkClick(String txtPrice, String txtNum, String cbxType) {

        double totalPrices = 0;

        switch (cbxType) {
            case "正常收费":
                totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum);
                break;
            case "打八折":
                totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.8;
                break;
            case "打七折":
                totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.7;
                break;
            case "打五折":
                totalPrices = Double.parseDouble(txtPrice) * Double.parseDouble(txtNum) * 0.5;
                break;
        }

        total = total + totalPrices;
        System.out.println("单价: " + txtPrice + " 数量: " + txtNum + " 合计: " + totalPrices);
    }
}
