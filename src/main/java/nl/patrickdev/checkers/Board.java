package nl.patrickdev.checkers;

public class Board {
    int size = 10;
    TileStatus[][] tiles = new TileStatus[size][size];

    public Board() {
        // Constructor of Board: will only run once on initialisation
        // We use it to fill the initial tile status
        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                tiles[rowIndex][columnIndex] = TileStatus.EMPTY;
            }
        }

        // Fill all the blacks!
        for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                if ((rowIndex + columnIndex) % 2 == 1) {
                    tiles[rowIndex][columnIndex] = TileStatus.BLACK;
                }
            }
        }

        // Fill all the whites!
        for (int rowIndex = 6; rowIndex < 10; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                if ((rowIndex + columnIndex) % 2 == 1) {
                    tiles[rowIndex][columnIndex] = TileStatus.WHITE;
                }
            }
        }
    }

    public void print() {
        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                System.out.println("Cel [" + rowIndex + "," + columnIndex + "] is " + tiles[rowIndex][columnIndex]);
            }
        }

        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {

                char tileRepresentation;
                switch (tiles[rowIndex][columnIndex]) {
                    case EMPTY:
                        tileRepresentation = ' ';
                        break;
                    case WHITE:
                        tileRepresentation = 'w';
                        break;
                    case BLACK:
                        tileRepresentation = 'b';
                        break;
                    default:
                        tileRepresentation = '?';
                        break;
                }

                System.out.print(String.valueOf(tileRepresentation) + " ");
            }
            System.out.println("");
        }
    }
}
