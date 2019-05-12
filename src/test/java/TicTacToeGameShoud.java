import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicTacToeGameShoud {
    @Test
    public void stopAfterPlaying(){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("src/test/java/testWinX.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Referee r = new Referee(new Playboard(),new HumanPlayer("Ion", sc) ,new HumanPlayer("Alt Ion", sc));
        //assert Equals(Symbol.SYMBOL, r.start());
        r.start();
    }
}
