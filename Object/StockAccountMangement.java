package com.Object;

import java.util.Scanner;

public class StockAccountMangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of stocks: ");
        int n=sc.nextInt();
        StockPortfolio stockPortfolio=new StockPortfolio(n);
        for(int i=0;i<n;i++){
            System.out.println("enter the details for stock "+(i+1)+":");
            System.out.println("stock Name: ");
            String stockName=sc.next();
            System.out.println("number of shares");
            int numberofShares= sc.nextInt();
            System.out.println("shareprice: $");
            double sharePrice=sc.nextDouble();
            System.out.println("stockRating");
            String stockRating=sc.next();
            stockPortfolio.addStock(i,stockName,numberofShares,sharePrice,stockRating);

        }
        stockPortfolio.printStockReport();
    }
}
