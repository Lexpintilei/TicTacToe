import java.util.Scanner;

public class HumanPlayer implements Playable{

    private String name;
    private Scanner sc;
    private Symbol s;

    public  HumanPlayer(String name, Scanner sc){
        this.name = name;
        this.sc = sc;
    }
    public int[] getCoord() {
        return new int[] {sc.nextInt(), sc.nextInt()};
    }

    public Symbol getSymbol() {
        return s ;
    }

    public void setSymbol(Symbol s) {
        this.s = s;
    }

    @Override
    public String toString(){
        return name;
    }
}
