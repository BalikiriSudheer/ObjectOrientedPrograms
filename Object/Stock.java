package com.Object;

public class Stock {
    private String stockname;
    private int numOfShares;
    private   double sharePrice;
    private String stockRating;

    public Stock( String stockname,int numOfShares,double sharePrice,String stockRating) {
        this.stockname=stockname;
        this.numOfShares=numOfShares;
        this.sharePrice=sharePrice;
        this.stockRating=stockRating;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public String getStockRating() {
        return stockRating;
    }

    public void setStockRating(String stockRating) {
        this.stockRating = stockRating;
    }
    public double calculateStockValue(){
        return  numOfShares * sharePrice;
    }
}
