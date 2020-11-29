package com.company;

public class Tickets {
    private static int incomeCurrent = 0;

    public static int getIncomeCurrent() {
        return incomeCurrent;
    }

    /**
     *
     * @param priceOfTicket
     */
    public static void printPriceOfTicket(int priceOfTicket) {
        System.out.println("Ticket price: " + "$" + priceOfTicket);
        incomeCurrent += priceOfTicket;
        System.out.println();
        System.out.println();
    }

    /**
     * Method that calculates price of seat
     * @param row variable int row
     * @param rows
     * @param seats
     * @return
     */
    public static int priceOfTicket(int row, int rows, int seats) {
        int total = (seats - 1) * (rows - 1);
        if (total <= 60) {
            return(10);
        } else {
            int firstHalf = (rows - 1) / 2;
            if (row <= firstHalf) {
                return 10;
            }
            if (row > firstHalf) {
                return 8;
            }
        }
        return -1;
    }
    public static int incomeTotalCalculate(int rows,int seats){
        int priceOneTicket = 10;
        int total = (seats - 1) * (rows - 1);
        int incomeTotal = total * priceOneTicket;
        if(total <= 60){
            return incomeTotal;
        }else{
            int halfArea = rows/2;
            if(rows % 2 == 0){
                return (halfArea * seats) * priceOneTicket + (halfArea * seats) * (priceOneTicket - 2);
            }
            if(rows % 2 != 0) {
                return (halfArea * seats) * priceOneTicket + ((halfArea+1) * seats) * (priceOneTicket - 2);
            }
        }
        return 0;
    }
}
