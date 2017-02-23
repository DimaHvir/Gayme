
public class play {
    static int[][] sizeBoard = new int[8][8];
    static boolean[][] loyaltyBoard = new boolean[8][8];

    public static void display() {
	for(int i = sizeBoard.length - 1; i >= 0; i--) {
	    for (int j = 0; j < sizeBoard.length; j++) {
		if (sizeBoard[i][j] == 1) {
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
    }
    
    public static void main(String[] args) {
	for (int i = 0; i < sizeBoard.length; i++) {
	    sizeBoard[0][i] = 1;
	    loyaltyBoard[0][i] = true;
	    sizeBoard[1][i] = 1;
	    loyaltyBoard[1][i] = true;
	    sizeBoard[sizeBoard.length - 1][i] = 1;
	    loyaltyBoard[sizeBoard.length - 1][i] = false;
	    sizeBoard[sizeBoard.length - 2][i] = 1;
	    loyaltyBoard[sizeBoard.length - 2][i] = false;
	}
	display();
    }
}
