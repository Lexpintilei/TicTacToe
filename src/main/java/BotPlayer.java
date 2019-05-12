import java.util.Random;
public class BotPlayer implements Playable {
    private String name;
    private Symbol s;

    public BotPlayer(String name){
        this.name = name;
    }

    public int[] getCoord() {
        Random r = new Random();
        return new int[] {r.nextInt(3), r.nextInt(3)};
    }
    public Symbol getSymbol() {
        return s;
    }
    public void setSymbol(Symbol s) {
            this.s = s;
    }
    @Override
    public String toString(){
        return name;
    }
}
