package com.Commerial;

public class CompanyShare {
    private String Symbol;
    int numberOfShares;
    private double dateOfTime;

    public CompanyShare(String symbol,int numberOfShares) {
      this.Symbol = symbol;
      this.numberOfShares=numberOfShares;
      this.dateOfTime=dateOfTime;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getDateOfTime() {
        return dateOfTime;
    }

    public void setDateOfTime(double dateOfTime) {
        this.dateOfTime = dateOfTime;
    }
}
