package model;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxModel {

    private String name;
    private BigDecimal money;
    private BigDecimal percent;
    private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    public TaxModel(String name, BigDecimal money, BigDecimal percent){
        this.name = name;
        this.money = money;
        this.percent = percent;
    }

    public BigDecimal getTax(){
        return this.money.multiply(this.percent).divide(ONE_HUNDRED, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }
}



