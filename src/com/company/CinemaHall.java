package com.company;

public class CinemaHall {
    private static int incomeCurrent = 0;
    private static int numOfTicketPurchase = 0;

    public static int getIncomeCurrent() {
        return incomeCurrent;
    }

    public static int getNumOfTicketPurchase() {
        return numOfTicketPurchase;
    }

    public static String[][] createMatrix(int rows, int seats) {
        String[][] matrix = new String[rows][seats];
        for (int i = 1; i < rows; i++) {
            matrix[i][0] = Integer.toString( i );
            matrix[0][0] = " ";
            for (int j = 1; j < seats; j++) {
                matrix[0][j] = Integer.toString( j );
                matrix[i][j] = "S";
            }

        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix, int rows, int seats) {
        System.out.println();
        System.out.println( "Cinema:" );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print( matrix[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }


    /**
     * Method that sets the reserved space
     *
     * @return String array modification actually state cinema hall
     */
    public static String[][] modifyMatrix() {

        String[][] matrix = Menu.getMatrix();
        int row = Menu.getRow();
        int seat = Menu.getSeat();
        try {
            if (matrix[row][seat].equals( "B" )) {

                System.out.println( "That ticket has already been purchased!" );
                Menu.printAskingForTheSeatBuy();
                CinemaHall.modifyMatrix();

            } else {
                matrix[row][seat] = "B";
                numOfTicketPurchase++;
                incomeCurrent++;
                return matrix;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "Wrong input!" );
            Menu.printAskingForTheSeatBuy();
            CinemaHall.modifyMatrix();
        }
        return matrix;
    }
}
