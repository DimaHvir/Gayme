import cs1.Keyboard;

public class play {
    static int[][] sizeBoard = new int[8][8];
    static boolean[][] loyaltyBoard = new boolean[8][8];
    static int len = sizeBoard.length;
    public static void setup() { //sets up the board when you first run
	for (int i = 0; i < len; i++) {
	    sizeBoard[0][i] = 1;
	    loyaltyBoard[0][i] = true;
	    sizeBoard[1][i] = 1;
	    loyaltyBoard[1][i] = true;
	    sizeBoard[len - 1][i] = 1;
	    loyaltyBoard[len - 1][i] = false;
	    sizeBoard[len - 2][i] = 1;
	    loyaltyBoard[len - 2][i] = false;
	}
    }
    public static void display() {//displays the board, one loyalty:false is negative
	for(int i = len - 1; i >= 0; i--) {
	    for (int j = 0; j < len; j++) {
		if (sizeBoard[i][j] >= 1) {
		    if (loyaltyBoard[i][j]) {
			System.out.print("  " + sizeBoard[i][j] + " ");
		    }
		    else {
			System.out.print(" " +-1 * sizeBoard[i][j] + " ");
		    }
		}
		else {
		    System.out.print("  _ ");
		}
	    }
	    System.out.println();
	}
	System.out.println("\n");
    }
    public static void game() {//plays the game
	int x, y, tarx, tary;
	while (0 == 0){
	    display();
	    while (0 == 0) {
		System.out.println("\n White's Turn: what would you like to move? \n");
		System.out.print("x-coord of piece you're moving: ");
		y = Keyboard.readInt() - 1;
		System.out.print("\ny-coord of piece you're moving: ");
		x = Keyboard.readInt() - 1;
		System.out.print("\nx-coord of target");
		tary = Keyboard.readInt() - 1;
		System.out.print("/ny-coord of target");
		tarx = Keyboard.readInt() - 1;
		if(x < len && x >= 0 && y < len && y >= 0 && tarx < len && tarx >= 0 && tary < len && tary >= 0 && loyaltyBoard[x][y] == true && sizeBoard[x][y] != 0) { //Just checking if the pieces are within the boundaries and are owned by the user
		    if(Math.abs(x - tarx) < 3 && Math.abs(y - tary) < 3) {
			if(sizeBoard[tarx][tary] == 0) {
			    sizeBoard[tarx][tary] = sizeBoard[x][y];
			    sizeBoard[x][y] = 0;
			    loyaltyBoard[tarx][tary] = true;
			    break;
			}
			else if(loyaltyBoard[tarx][tary]) {
 			    sizeBoard[tarx][tary] = sizeBoard[tarx][tary] + sizeBoard[x][y];
			    sizeBoard[x][y] = 0;
			    break;
			}
			else if(sizeBoard[tarx][tary] < sizeBoard[x][y]) {
			    System.out.println("swag");
			    sizeBoard[tarx][tary] = sizeBoard[x][y];
			    sizeBoard[x][y] = 0;
			    loyaltyBoard[tarx][tary] = true;
			    break;
			}
			    System.out.println("Your piece is not big enough to take over that target");
		    }
		    else {
			System.out.println("that target is too far away");
		    }	    
		}
		else {
		    System.out.println("That is not your piece(or that piece doesn't exist/ is outside of the boundaries");
		}
	    }
	}
    }
    
    public static void main(String[] args) {
        setup();
	display();
	game();
    }
}
