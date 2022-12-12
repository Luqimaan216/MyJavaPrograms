import java.util.Scanner;

public class TicTacToa {
	
	public static void main(String[] args) {

	    Scanner keyboard = new Scanner(System.in);
	    char a1 = ' ';
	    char a2 = ' ';
	    char a3 = ' ';
	    char b1 = ' ';
	    char b2 = ' ';
	    char b3 = ' ';
	    char c1 = ' ';
	    char c2 = ' ';
	    char c3 = ' ';
	    int turn = 1;
	    int y = 0;

	    while (y <= 9) {
	        if (turn == 1) {
	            System.out.println("Player 1 it is your turn You are Crosses. Pick a spot you would like to enter.\n Ex: top middle,botton left,middle left etc.");
	            String input = keyboard.nextLine();

	            if (input.equals("top left")) {
	                if (a1 == ' ') {
	                    a1 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("top middle")) {
	                if (b1 == ' ') {
	                    b1 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("top right")) {
	                if (c1 == ' ') {
	                    c1 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("middle left")) {
	                if (a2 == ' ') {
	                    a2 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("middle middle")) {
	                if (b2 == ' ') {
	                    b2 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("middle right")) {
	                if (c2 == ' ') {
	                    c2 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("bottom left")) {
	                if (a3 == ' ') {
	                    a3 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("bottom middle")) {
	                if (b3 == ' ') {
	                    b3 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else if (input.equals("bottom right")) {
	                if (c3 == ' ') {
	                    c3 = 'x';
	                    turn++;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its already been taken");
	                }
	            } else {
	                System.out.println("You have entered an invalid sapce"
	                        + "please try again.");
	            }
	             System.out.printf(" %c | %c | %c \n", a1, b1, c1);
	            System.out.printf("____________\n");
	            System.out.printf(" %c | %c | %c \n", a2, b2, c2);
	            System.out.printf("____________\n");
	            System.out.printf(" %c | %c | %c \n", a3, b3, c3);
	            if (a1 == 'x') {
	                if (a2 == 'x') {
	                    if (a3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	             if (b1 == 'x') {
	                if (b2 == 'x') {
	                    if (b3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	              if (c1 == 'x') {
	                if (c2 == 'x') {
	                    if (c3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	               if (a1 == 'x') {
	                if (b2 == 'x') {
	                    if (c3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                if (a1 == 'x') {
	                if (b1 == 'x') {
	                    if (c1 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                 if (a2 == 'x') {
	                if (b2 == 'x') {
	                    if (c2 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                  if (a3 == 'x') {
	                if (b3 == 'x') {
	                    if (c3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                   if (c1 == 'x') {
	                if (b2 == 'x') {
	                    if (a3 == 'x') {
	                        System.out.println("Player 1 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }


	            if(y == 9)
	            {
	                System.out.println("the game ends in a draw.");
	                System.exit(1);
	            }

	        }
	        if (turn == 2) {
	            System.out.println("Player 2 it is your turn. You are Naughts. Pick a spot would like to enter.\n Ex: top middle,botton left,middle left etc.");
	            String input = keyboard.nextLine();

	            if (input.equals("top left")) {
	                if (a1 == ' ') {
	                    a1 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("top middle")) {
	                if (b1 == ' ') {
	                    b1 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("top right")) {
	                if (c1 == ' ') {
	                    c1 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("middle left")) {
	                if (a2 == ' ') {
	                    a2 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("middle middle")) {
	                if (b2 == ' ') {
	                    b2 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("middle right")) {
	                if (c2 == ' ') {
	                    c2 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("bottom left")) {
	                if (a3 == ' ') {
	                    a3 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("bottom middle")) {
	                if (b3 == ' ') {
	                    b3 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else if (input.equals("bottom right")) {
	                if (c3 == ' ') {
	                    c3 = 'o';
	                    turn--;
	                    y++;
	                } else {
	                    System.out.println("you cant pick that space its"
	                            + " already been taken");
	                }
	            } else {
	                System.out.println("You have entered an invalid sapce"
	                        + "please try again.");
	            }
	            System.out.printf(" %c | %c | %c \n", a1, b1, c1);
	            System.out.printf("____________\n");
	            System.out.printf(" %c | %c | %c \n", a2, b2, c2);
	            System.out.printf("____________\n");
	            System.out.printf(" %c | %c | %c \n", a3, b3, c3);
	            if (a1 == 'o') {
	                if (a2 == 'o') {
	                    if (a3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	             if (b1 == 'o') {
	                if (b2 == 'o') {
	                    if (b3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	              if (c1 == 'o') {
	                if (c2 == 'o') {
	                    if (c3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	               if (a1 == 'o') {
	                if (b2 == 'o') {
	                    if (c3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                if (a1 == 'o') {
	                if (b1 == 'o') {
	                    if (c1 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                 if (a2 == 'o') {
	                if (b2 == 'o') {
	                    if (c2 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                  if (a3 == 'o') {
	                if (b3 == 'o') {
	                    if (c3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }
	                   if (c1 == 'o') {
	                if (b2 == 'o') {
	                    if (a3 == 'o') {
	                        System.out.println("Player 2 wins!!!");
	                        System.exit(1);
	                    }
	                }
	            }                

	        }

	    }

	}

	}