package monopoly;

public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;

    public void takeTurn(){
        int fvTo = 0;
        for(Die die :dice ){
            die.roll();
            int fv = die.getFaceValue();
            fvTo += fv;
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTo);
        piece.setLocation(newLoc);
    }
}
