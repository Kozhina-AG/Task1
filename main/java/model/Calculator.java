package model;


// model - моя логика

public class Calculator {
    private Double number;
    private Double percent;

    //private Double temp;

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double calc() {
        return number * percent / 100;
    }
}