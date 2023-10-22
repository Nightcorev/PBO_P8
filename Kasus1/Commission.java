package com.mycompany.Kasus1;

/*@author Fikri*/
public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phone, String socSecNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phone, socSecNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
        totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPayment = super.pay(); // Call the pay method from Hourly class
        double commissionPayment = totalSales * commissionRate;
        totalSales = 0.0; // Reset total sales to 0
        return hourlyPayment + commissionPayment;
    }

    @Override
    public String toString() {
        String parentToString = super.toString(); // Call the toString method from Hourly class
        return parentToString + "\nTotal Sales: $" + totalSales;
    }
}
