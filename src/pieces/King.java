package pieces;

import java.util.List;

public class King extends Piece {
    public King(Color color, Coordinates coordinates) {
        super(color,coordinates);
    }

    @Override
    protected boolean pieceTypeAbilityToMove(Piece piece, Coordinates to) {
        return false;
    }

    @Override
    public List<Coordinates> everyStepToPoint(Piece piece, Coordinates to) throws RuntimeException {
        return null;
    }


}
