package SimpleCurenceMono;

import com.google.gson.annotations.SerializedName;

public class CurrencyRateMono {

    private int currencyCodeA;
    private int currencyCodeB;
    private int date;
    double rateSell;
    double rateBuy;
    private double rateCross;

    public CurrencyRateMono() {
    }

    public int getCurrencyCodeA() {
        return currencyCodeA;
    }

    public void setCurrencyCodeA(int currencyCodeA) {
        this.currencyCodeA = currencyCodeA;
    }

    public int getCurrencyCodeB() {
        return currencyCodeB;
    }

    public void setCurrencyCodeB(int currencyCodeB) {
        this.currencyCodeB = currencyCodeB;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getRateSell() {
        return rateSell;
    }

    public void setRateSell(double rateSell) {
        this.rateSell = rateSell;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
    }

    public double getRateCross() {
        return rateCross;
    }

    public void setRateCross(double rateCross) {
        this.rateCross = rateCross;
    }

    @Override
    public String toString() {
        return "CurrencyRateMono{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }
}
