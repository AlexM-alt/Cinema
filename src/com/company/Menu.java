package com.company;

import java.util.Scanner;

public class Menu extends CinemaHall {
    private static int row;
    private static int seat;
    private static int rows;
    private static int seats;
    private static String matrix[][];

    public static String[][] getMatrix() {
        return matrix;
    }

    public static int getRow() {
        return row;
    }

    public static int getSeat() {
        return seat;
    }

    public static void setRow(int row) {
        Menu.row = row;
    }

    public static void setSeat(int seat) {
        Menu.seat = seat;
    }

    /**
     * Method that print menu
     */
    public static void menu() {
        System.out.println( "1. Show the seats" );
        System.out.println( "2. Buy a ticket" );
        System.out.println( "3. Statistics" );
        System.out.println( "0. Exit" );
        System.out.println();
    }

    public void printAskAboutHallCinema() {
        Scanner scanner = new Scanner( System.in );

        // variables
        System.out.println( "Enter the number of rows:" );
        rows = scanner.nextInt() + 1;
        System.out.println( "Enter the number of seats in each row:" );
        seats = scanner.nextInt() + 1;
        System.out.println();
        matrix = createMatrix( rows, seats );

    }

    public void menuChoose() {
        Scanner scanner = new Scanner( System.in );


        while (true) {
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    printMatrix( matrix, rows, seats );
                    break;
                case 2:
                    printAskingForTheSeatBuy();
                    CinemaHall.modifyMatrix();
                    Tickets.printPriceOfTicket(Tickets.priceOfTicket(row, rows, seats));
                    break;
                case 3:
                    Statistic statistic = new Statistic();
                    statistic.printStatistic( rows,seats );
                    break;
                case 0:
                    System.exit( 0 );
                    break;

            }
            menu();
        }
    }

    public void printAllMenu() {

        printAskAboutHallCinema();
        menu();
        menuChoose();
    }
    public static void printAskingForTheSeatBuy(){
        Scanner sc = new Scanner(System.in);
        // asking for the seat to buy
        System.out.println("Enter a row number:");
        row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        seat = sc.nextInt();
        System.out.println();

    }
}
