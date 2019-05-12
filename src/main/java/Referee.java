import java.util.Random;

public class Referee {
    private Playable pX;
    private Playable p0;
    private Playboard board;

    public Referee(Playboard board, Playable a, Playable b) {
        this.board = board;
        Random r = new Random();
        if (r.nextBoolean()) {
            this.pX = a;
            a.setSymbol(Symbol.SYMBOL_X);
            this.p0 = b;
            b.setSymbol(Symbol.SYMBOL_0);
        } else {
            this.pX = b;
            b.setSymbol(Symbol.SYMBOL_X);
            this.p0 = a;
            a.setSymbol(Symbol.SYMBOL_0);
        }
    }

    public void start() {
        Playable currentPlayer = pX;
        int moves = 0;
        while (true) {
            int[] coord = currentPlayer.getCoord();
            if (board.isEmpty(coord)) {
                board.fill(coord, currentPlayer.getSymbol());
                System.out.println(board);
                if (board.winner().equals(Symbol.SYMBOL_X)) {
                    System.out.println("Castigatorul este: " + this.pX);
                    break;
                }
                if (board.winner().equals(Symbol.SYMBOL_0)) {
                    System.out.println("Castigatorul este: " + this.p0);
                    break;
                }
                if (moves == 9) {
                    System.out.println("Remiza!");
                    break;
                }
                if (currentPlayer == pX) {
                    currentPlayer = p0;
                } else currentPlayer = pX;
                System.out.println("Player: " + currentPlayer);

                moves++;

            } else System.out.println("Gresit!");
        }
    }
}
