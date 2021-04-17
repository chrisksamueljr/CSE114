package LAB_10;

import java.util.Scanner;


public class TicTacToe_V2 {
    public static void printMatrix(char[][] the_Matrix) {
    for(char[] row:the_Matrix) {
    for(char v:row)
        System.out.print(v + " ");
    System.out.println();
    }
    }
    public static int getScannerInputFromUser(Scanner scan) {
      int scanInput = scan.nextInt() - 1; // Minus one cause 0-9
        return scanInput;
    }
    public static void checkForUnusedSpots(char[][] a_matrix, int latitude, int longitude) {
        if(a_matrix[latitude][longitude] == 'X' || a_matrix[latitude][longitude] == 'O') {
            System.out.println("That location is already used");
           }
    }
    public static void check_If_player_X_won(char[][] some_matrix, char player, int numberOfTries) {
        char[][] the_Matrix = some_matrix;
        int totalNumberOfTries = numberOfTries;
        char getCurrentPlayer = player;
        for(int longitude_index=0; longitude_index< the_Matrix.length; longitude_index++) {
            boolean win = true;
            for(int latitude_index=0; latitude_index<the_Matrix[longitude_index].length; latitude_index++)
            if(the_Matrix[longitude_index][latitude_index] != getCurrentPlayer);
            win = false;
            if(win) {
            System.out.println("Player " + (totalNumberOfTries%2==0?1:2) + " won");
            System.exit(1); // Exit the game.s
            }
        }
    }
    public static void check_If_player_O_won(char[][] some_matrix, char player, int numberOfTries) {
        char[][] the_Matrix = some_matrix;
        int totalNumberOfTries = numberOfTries;
        char getCurrentPlayer = player;
        for(int latitude_index=0; latitude_index<the_Matrix[0].length; latitude_index++) {
            boolean win = true;
            for(int longitude_index=0; longitude_index<the_Matrix.length; longitude_index++)
            if(the_Matrix[longitude_index][latitude_index] != getCurrentPlayer)
            win = false;
            if(win) {
            System.out.println("Player " + (totalNumberOfTries%2==0?1:2) + " won");
            System.exit(1);
            }
        }
    }
public static void main(String[] args) {
    char[][] the_Matrix = {{'e','e','e'},{'e','e','e'},{'e','e','e'}};
    Scanner scan = new Scanner(System.in);
    int totalNumberOfTries = 0;
    int theLengthOfTheMatrix  = the_Matrix.length - 1; // because of 0-9



    while(totalNumberOfTries < theLengthOfTheMatrix) {
    printMatrix(the_Matrix);
    System.out.print("Player " + (totalNumberOfTries%2==0?1:2) + " move (row 1..3 & column 1..3):");
    int longitude = getScannerInputFromUser(scan);
    int  latitude = getScannerInputFromUser(scan);
    checkForUnusedSpots(the_Matrix, longitude, latitude);
    the_Matrix[longitude][latitude] = (totalNumberOfTries%2==0?'X':'O');
    char getCurrentPlayer = (totalNumberOfTries%2==0?'X':'O');
    
    // check for win
    check_If_player_X_won(the_Matrix, getCurrentPlayer, totalNumberOfTries);
    check_If_player_O_won(the_Matrix, getCurrentPlayer, totalNumberOfTries);

    if(the_Matrix[0][0]==getCurrentPlayer && the_Matrix[1][1]==getCurrentPlayer && the_Matrix[2][2]==getCurrentPlayer){
        System.out.println("Player " + (totalNumberOfTries%2==0?1:2) + " won");
        System.exit(1);
    }
    if(the_Matrix[0][2]==getCurrentPlayer && the_Matrix[1][1]==getCurrentPlayer && the_Matrix[2][0]==getCurrentPlayer){
        System.out.println("Player " + (totalNumberOfTries%2==0?1:2) + " won");
        System.exit(1);
    }
    
    totalNumberOfTries++;
    }
    System.out.print("Draw");
    
    

    }

    }

