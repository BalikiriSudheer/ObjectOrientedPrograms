package com.Commerial;

import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    private String filename;
    private double accountValue;
    private List<CompanyShare> companyShares;

    public StockAccount(String filename) {
        this.filename = filename;
        this.accountValue = 0.0;
        this.companyShares = new ArrayList<>();
    }
    public double valueof(){
        return accountValue;

    }
    public void buy(int amount, String symbol) {
        accountValue -= amount;
        CompanyShare shares = findCompanyShares(symbol);
        if (shares != null) {
            shares.numberOfShares += amount;
        } else {
            companyShares.add(new CompanyShare(symbol, amount));

        }
    }
        public void sell(int amount, String symbol) {
            accountValue += amount;
            CompanyShare shares = findCompanyShares(symbol);
            if (shares != null) {
                shares.numberOfShares -= amount;
                if (shares.numberOfShares <= 0) {
                    companyShares.remove(shares);
                }


            } else {

                System.out.println("Error: No shares of " + symbol + " to sell.");
            }
        }
    private CompanyShare  findCompanyShares(String symbol) {
        for (CompanyShare shares : companyShares) {
            if (shares.getSymbol().equals(symbol)) {
                return shares;
            }
        }
        return null;
    }

    public void save(String filename) {
    }

    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount("account_data.txt");
        stockAccount.buy(200, "AAPL");
        stockAccount.sell(50, "AAPL");
        System.out.println("Account Value: $" + stockAccount.valueof());
        stockAccount.save("updated_account_data.txt");
    }



}
