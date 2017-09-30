import java.util.Scanner;

public class TicTacToe {
    public static void initializeBoard (char[][] gameBoard) {
        for (int row=0; row<3; row++) {
            for (int col=0; col<3; col++) {
                gameBoard[row][col] = '.';
            }
        }
    }

    public static void displayBoard (char[][] gameBoard) {
        for (int row=0; row<3; row++) {
            for (int col=0; col<3; col++) {
                if (col<2) {
                    System.out.print(" " + gameBoard[row][col] + " |");
                } else {
                    System.out.print(" " + gameBoard[row][col] + " ");
                }
            }
            System.out.print("\n");
        }

    }

    public static boolean assignSpot (char[][] gameBoard, boolean xTurn, int playSpot) {
        Scanner keyboard = new Scanner(System.in);
        char gamePiece = '.';
        boolean validPlay = true;

        if (xTurn) {
            gamePiece = 'X';         
        } else {
            gamePiece = 'O';          
        }
        //translate playSpot to array location
        //check for exisiting value - if '.' place on board, otherwise give error msg
        int row = 0;
        int col = 0;
        switch (playSpot) {
            case 1 :
            row = 0;
            col = 0;
            break;
            case 2 :
            row = 0;
            col = 1;
            break;
            case 3 :
            row = 0;
            col = 2;
            break;
            case 4 :
            row = 1;
            col = 0;
            break;
            case 5 :
            row = 1;
            col = 1;
            break;
            case 6 :
            row = 1;
            col = 2;
            break;
            case 7 :
            row = 2;
            col = 0;
            break;
            case 8 :
            row = 2;
            col = 1;
            break;
            case 9 :
            row = 2;
            col = 2;
            break;
            default :
            System.out.println("Please choose a valid spot.");
        }
        if (gameBoard[row][col] == '.') {
            gameBoard[row][col] = gamePiece;
            return validPlay;
        } else {
            System.out.println("That space is already occupied.  Please choose again.");
            return !validPlay;
        }
    }

    public static boolean checkForWin (char[][] gameBoard) {
        boolean xWins = false;
        boolean yWins = false;
        boolean gameOver = false;

        int row = 0;
        int col = 0;
        int numInARow = 0;
        char checkWin = '.';
        //check for 3 in row accross
        //System.out.println("Checking for win accross");
        for (row=0; row<3; row++) {
            col = 0;
            numInARow = 0;
            checkWin = gameBoard[row][col]; 
            if (checkWin != '.') {
                for (int c=0; c<3; c++) {
                    if (checkWin == gameBoard[row][c]) {
                        numInARow++;
                    } /*else {
                    numInARow = 0;
                    }*/
                }         
            }

            if (numInARow == 3) {
                gameOver = true;
                //System.out.println("Winner accross");
                if (checkWin == 'X') {
                    xWins = true;
                } else {
                    yWins = true;
                }
            }
        }
        if (!gameOver) {
            //check for 3 in a row down each column
            //System.out.println("Checking for win down");     
            for (col=0; col<3; col++) {
                row = 0;
                numInARow = 0;
                checkWin = gameBoard[row][col];
                if (!gameOver) {
                    //checkWin = gameBoard[row][col];
                    if (checkWin != '.') {
                        for (int r=0; r<3; r++) {
                            if (checkWin == gameBoard[r][col]) {
                                numInARow++;
                            } /*else {
                            numInARow = 0;
                            }*/
                        }         
                        if (numInARow == 3) {
                            gameOver = true;
                            //System.out.println("Winner down");
                            if (checkWin == 'X') {
                                xWins = true;
                            } else {
                                yWins = true;
                            }
                        }
                    }
                }
            }

            //check for diagonal win
            if (!gameOver) {
                //System.out.println("Checking for win diagonal");
                if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != '.') {
                    gameOver = true;
                    if (gameBoard[0][0] == 'X') {
                        xWins = true;
                    } else {
                        yWins = true;
                    }
                } else {
                    if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0] && gameBoard[0][2] != '.') {
                        gameOver = true;
                        if (gameBoard[0][2] == 'X') {
                            xWins = true;
                        } else {
                            yWins = true;
                        }
                    }
                }
            }
            //return gameOver;
        }
        if (gameOver) {
                if (xWins) {
                    System.out.println("Congratulations X wins!");
                } else {
                    System.out.println("Congratulations O wins!");
                }
            }
        return gameOver;
    }

    public static void main (String[] args) {
        char gameBoard[][] = new char[3][3];
        Scanner keyboard = new Scanner(System.in);
        boolean xTurn = true;
        boolean gameOver = false;
        boolean keepPlaying = true;
        int count = 0;
        int xWinCount = 0;
        int oWinCount = 0;
        int tieCount = 0;

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("\nTo play, enter a number for which box to play in:");
        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("\nYou'll need a friend to play with.  X will go first.  Let's begin.");

        do {
            //initialize tic-tac-toe array 
            initializeBoard(gameBoard);
            displayBoard(gameBoard);

            do {
                if (xTurn) {    
                    System.out.print("Where would X like to play? ");
                } else {
                    System.out.print("Where would O like to play? ");
                }
                int playLocation = keyboard.nextInt();
                keyboard.nextLine();

                //check for valid position or if spot already occupied
                if (playLocation < 10) {
                    boolean validPlay = assignSpot(gameBoard, xTurn, playLocation);
                    if (validPlay) {
                        count++; //number of valid game plays
                        //System.out.println("Valid play # " + count);
                        displayBoard(gameBoard);
                        //check for win after the first player has played 3 turns
                        if (count > 4) {
                            gameOver = checkForWin(gameBoard);
                        }

                        if (gameOver && xTurn) {
                            xWinCount++;
                        } else if (gameOver && !xTurn) {
                            oWinCount++;
                        } 
                        //switch player
                        if (xTurn) {
                            xTurn = false;
                        } else {
                            xTurn = true;
                        }

                    } else {
                        displayBoard(gameBoard);
                    }
                } else {
                    System.out.println("Please pick a valid spot on the board 1-9");
                }

            } while (!gameOver && count<9);

            if (!gameOver && count == 9) {
                System.out.println("Game over - it's a tie");
                tieCount++;
                gameOver = true;
            }
            System.out.println(xWinCount + " wins for X and " + oWinCount + " wins for O and " 
                + tieCount + " ties");

            if (gameOver) {
                boolean validChoice = true;
                System.out.print("Would you like to play again? (Y/N) ");
                String playAgain = keyboard.nextLine();
                do {
                    if (playAgain.equalsIgnoreCase("Y")) {
                        keepPlaying = true;
                        validChoice = true;
                        count = 0;
                        gameOver = false;
                        if (xTurn) {
                            System.out.println("X will go first this game.");
                        } else {
                            System.out.println("O will go first this game.");
                        }

                    } else if (playAgain.equalsIgnoreCase("N")) {
                        System.out.println("Thanks for playing!");
                        gameOver = true;
                        keepPlaying = false;
                        validChoice = true;
                    } else {
                        validChoice = false;
                        System.out.println("Invalid Response. Please choose again (Y/N) ");
                        playAgain = keyboard.nextLine();
                    }
                } while (!validChoice);

            }
        } while (keepPlaying);
    } 

}