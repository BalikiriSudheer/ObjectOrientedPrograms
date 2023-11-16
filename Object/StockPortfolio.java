package com.Object;

public class StockPortfolio {
    Stock [] stocks;
    public StockPortfolio(int n){
        stocks =new Stock[n];

    }
    public void addStock(int index,String stockName, int numberofShares,double sharePrice,String stockRating){
        stocks[index]=new Stock(stockName,numberofShares,sharePrice,stockRating);
    }
    public double CalculateTotalPortfolioValue(){
        double totalValue=0;
        for(Stock stock :stocks) {
            totalValue += stock.calculateStockValue();
        }
        return  totalValue;
    }
    public void printStockReport(){
        System.out.println("stock Report:");
        System.out.println("---------------");
        for(Stock stock :stocks){
            System.out.println("stock:"+stock.getStockname());
            System.out.println("Numberof share:"+stock.getNumOfShares());
            System.out.println("share Price:"+stock.getSharePrice());
            System.out.println("stockrating:"+stock.getStockRating());
            System.out.println("StockValue:"+stock.calculateStockValue());
            System.out.println("------------------");
        }

    }
}
