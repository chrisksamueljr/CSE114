import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        char [][] board = new char[3][3];
        boolean win = false;int round = 0;
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k <3; k++) {board[i][k] = ' ';}
        }while(win == false || round < 10) {
            for(int i =0; i< 3; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            System.out.println("player 1 Enter your location (0-2): ");
            int x = input.nextInt();int y = input.nextInt();
            while((x < 0 || x > 2) || (y < 0 || y > 2)) {
                input.nextLine();System.out.println("Incorrect input, plz enter 0-2:");
                x = input.nextInt();y = input.nextInt();}if(board[x][y] == ' ') {
                    board[x][y] = '1';
                }
            else {
                while(board[x][y] != ' ') {input.nextLine();
                    System.out.println("player 1, re-enter your location (0-2): ");
                    x = input.nextInt();y = input.nextInt();
                    while((x < 0 || x > 2) || (y < 0 || y > 2)) {input.nextLine();
                        System.out.println("Incorrect input, plz enter 0-2:");
                        x = input.nextInt();y = input.nextInt();}}board[x][y] = '1';
                    }
                        if(round >= 4 ) {
                            win = checkhorizontal(board);
                            if( win == true) {
                            System.out.println("Player 1 wins");
                            break;
                        }
                            win = checkvertical(board);
                            if( win == true) {System.out.println("Player 1 wins");
                            break;
                        }
                            win = checkmainDiag(board);if( win == true) {
                                System.out.println("Player 1 wins");
                                break;
                            }
                            win = checkminorDiag(board);if( win == true) {
                                System.out.println("Player 1 wins");
                                break;
                            }


}round ++; // ends player 1
if(round > 8) {break;}for(int i =0; i< 3; i++) {
    System.out.println(Arrays.toString(board[i]));}
    System.out.println("player 2 Enter your location (0-2): ");
    x = input.nextInt();
    y = input.nextInt();while((x < 0 || x > 2) || (y < 0 || y > 2)) {
        input.nextLine();System.out.println("Incorrect input, plz enter 0-2:");
        x = input.nextInt();y = input.nextInt();}if(board[x][y] == ' ') {board[x][y] = '2';
    }


else {while(board[x][y] != ' ') {
    input.nextLine();System.out.println("player 2, re-enter your location (0-2): ");
    x = input.nextInt();y = input.nextInt();
    while((x < 0 || x > 2) || (y < 0 || y > 2)) {
        input.nextLine();System.out.println("Incorrect input, plz enter 0-2:");
        x = input.nextInt();
        y = input.nextInt();
    }
}
    board[x][y] = '2';}

if(round >=4 ) {
    win = checkhorizontal(board);
    if( win == true) {
        System.out.println("Player 2 wins");
        break;
    }
    win = checkvertical(board);
    if( win == true) {
        System.out.println("Player 2 wins");
        break;} win = checkmainDiag(board);
        if( win == true) {
            System.out.println("Player 2 wins");
            break;
        } 
        win = checkminorDiag(board);
        if( win == true) {
            System.out.println("Player 2 wins");
            break;
        }
    }
        round ++; // ends player 2}


for(int i =0; i< 3; i++) {
    System.out.println(Arrays.toString(board[i]));}
    if(round > 9) {
        System.out.println("It's a draw");
    }
}
    public static boolean checkhorizontal(char [][] board) {
    for(int i = 0; i < 3; i++) {
        char start = board[i][0];if(start == ' ') {
        continue;
    }
    for(int k = 1; k<= 2; k++) {if(start != board[i][k]) {
            break;
        }
            if(k == 2) {
                return true;
            }
        }
    }
    return false;
}

for(int i = 0;i<3;i++)
    {
        char start = board[0][i];
        if (start == ' ') {
            continue;
        }
        for (int k = 1; k <= 2; k++) {
            if (start != board[k][i]) {
                break;
            }
            if (k == 2) {
                return true;
            }
        }
    }
    return false;}

    public static boolean checkmainDiag(char[][] board) {
        // checks 00, 11, 22
        char start = board[0][0];
        for (int i = 1; i < 3; i++) {
            if (start != board[i][i]) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkminorDiag(char[][] board) {
        // checks 02, 11, 20
        char start = board[0][2];
        int left = 1;
        for (int i = 1; i >= 0; i--) {
            if (start != board[left][i]) {
                break;
            }
            if (i == 0) {
                return true;
            }
            // left --;
        }
        return false;
    }
}
