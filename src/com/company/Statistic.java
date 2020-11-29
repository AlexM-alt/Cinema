package com.company;

import java.text.DecimalFormat;

public class Statistic {

    /**
     * Method print statistic
     */
    public  void printStatistic(int rows, int seats){

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("Number of purchased tickets:" + CinemaHall.getNumOfTicketPurchase());
        System.out.println("Percentage: " + decimalFormat.format(((Tickets.getIncomeCurrent()*100)/ (double)Tickets.incomeTotalCalculate( rows,seats ))) + "%");
        System.out.println("Current income: $" + Tickets.getIncomeCurrent());
        System.out.println("Total income: $" + Tickets.incomeTotalCalculate( rows,seats ));
        System.out.println();
    }

}
