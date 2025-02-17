import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean play = false;
        String playerA;
        String playerB;
        String yorn;
        String menu = "\nR-Rock \t P-Paper \t S-Scissors \nEnter R, P, or S: ";
        String playAgain = "\nwould you like to play again? [Y/N]: ";

        do {
            //Player A choice
            System.out.println("\nplayer 1" + menu);
            playerA = in.nextLine();
            playerA = playerA.toUpperCase();
            //Player B choice
            System.out.println("\nplayer 2" + menu);
            playerB = in.nextLine();
            playerB = playerB.toUpperCase();

            switch (playerA) {
                case "R":
                    if (playerB.equals("R")) {
                        System.out.println("\nRock vs Rock. TIE.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    } else if (playerB.equals("P")) {
                        System.out.println("\nPaper Covers Rock. Player 2 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    } else if (playerB.equals("S")) {
                        System.out.println("\nRock Breaks Scissors. Player 1 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    } else {
                        System.out.println("Player 2 " + playerB + " is a invalid input.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();

                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                case "P":
                    if (playerB.equals("R")) {
                        System.out.println("\nPaper Covers Rock. Player 1 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else if (playerB.equals("P")) {
                        System.out.println("\nPaper vs Paper. TIE.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else if (playerB.equals("S")) {
                        System.out.println("\nScissors Cut Paper. Player 2 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else {
                        System.out.println("Player 2 " + playerB + " is a invalid input.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                case "S":
                    if (playerB.equals("R")) {
                        System.out.println("\nRock Breaks Scissors. Player 2 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else if (playerB.equals("P")) {
                        System.out.println("\nScissors Cut Rock. Player 1 WINS!");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else if (playerB.equals("S")) {
                        System.out.println("\nScissors vs Scissors. TIE.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                    else {
                        System.out.println("Player 2 " + playerB + " is a invalid input.");
                        System.out.println(playAgain);
                        yorn = in.nextLine();
                        yorn = yorn.toUpperCase();
                        if (yorn.equals("N")) {
                            play = true;
                        }
                        break;
                    }
                default:
                    System.out.println("Player 1 " + playerA + " is a invalid input.");
                    System.out.println(playAgain);
                    yorn = in.nextLine();
                    yorn = yorn.toUpperCase();
                    if (yorn.equals("N")) {
                        play = true;
                    }
                    break;

            }
        }
        while(!play);
    }
}