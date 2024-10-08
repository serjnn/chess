package managers;


import pieces.Color;
import pieces.Coordinates;
import pieces.File;
import pieces.Piece;

import static utils.Game.moveColor;

public class KingManager  {


    public static Coordinates whiteKingCoords;
    public static Coordinates blackKingCoords;

    static {
        whiteKingCoords = new Coordinates(File.C, 3);
        blackKingCoords = new Coordinates(File.C, 6);
    }

    private static Coordinates tempBlackKingCoords;
    private static Coordinates tempWhiteKingCoords;



    public static void rollbackKingCoords(Color color) {
        if (color == Color.BLACK) {
            blackKingCoords = tempBlackKingCoords;
        } else {
            whiteKingCoords = tempWhiteKingCoords;
        }


    }

    public static void mockKingCoords(Color color, Coordinates from, Coordinates to) {
        {
            if (color == Color.BLACK) {
                tempBlackKingCoords = from;
                blackKingCoords = to;
            } else {
                tempWhiteKingCoords = from;
                whiteKingCoords = to;

            }

        }

    }


    public void checkForChangeKingCoords(Piece piece, Coordinates to) {
        if (piece.getClass().getSimpleName().equals("King")) {
            if (moveColor == Color.WHITE) {
                whiteKingCoords = to;
            } else {
                blackKingCoords = to;

            }

        }

    }
}
