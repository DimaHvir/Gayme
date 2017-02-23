public class piece {
    private int size;
    private boolean loyalty;
    private int x;
    private int y;

    piece () {
    }
    piece (int SIZE, boolean LOYALTY,int X,int Y) {
	size = SIZE;
	loyalty = LOYALTY;
	x = X;
	y = Y;
    }

    public static void main(String[] args) {
	piece swag = new piece(1, true, 0, 0);
    }

}
