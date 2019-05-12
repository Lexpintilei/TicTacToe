public class Playboard {
    private Symbol[][] matrix;
    public Playboard(){
        matrix = new Symbol[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = Symbol.SYMBOL_FREE;
            }
        }
    }
    public boolean isEmpty(int[] coord){
        return matrix [coord[0]][coord[1]] == Symbol.SYMBOL_FREE;
    }

    public void fill(int[] coord, Symbol symbol) {
        matrix[coord[0]][coord[1]] = symbol;
    }

    public Symbol winner(){
        Symbol winner = Symbol.SYMBOL_FREE;
       if(matrix[0][0] != Symbol.SYMBOL_FREE && matrix[0][0].equals(matrix[0][1]) && matrix[0][0].equals(matrix[0][2])
            || matrix[0][0] != Symbol.SYMBOL_FREE && matrix[0][0].equals(matrix[1][0]) && matrix[0][0].equals(matrix[2][0])){
           winner = matrix[0][0];
       }
       if(matrix[1][1] != Symbol.SYMBOL_FREE && matrix[1][0].equals(matrix[1][1]) && matrix[1][0].equals(matrix[1][2])
            || matrix[1][1] != Symbol.SYMBOL_FREE && matrix[1][1].equals(matrix[0][1]) && matrix[1][1].equals(matrix[2][1])){
           winner = matrix[1][1];
       }
       if(matrix[2][2] != Symbol.SYMBOL_FREE && matrix[2][0].equals(matrix[2][1]) && matrix[2][0].equals(matrix[2][2])
            || matrix[2][2] != Symbol.SYMBOL_FREE && matrix[2][2].equals(matrix[0][2]) && matrix[2][2].equals(matrix[1][2])){
           winner = matrix[2][2];
       }
       if(matrix[1][1] != Symbol.SYMBOL_FREE && matrix[1][1].equals(matrix[0][0]) && matrix[1][1].equals(matrix[2][2])
            || matrix[1][1] != Symbol.SYMBOL_FREE && matrix[1][1].equals(matrix[0][2]) && matrix[1][1].equals(matrix[2][0])){
           winner = matrix[1][1];
       }
        return winner;
    }

@Override
    public String toString(){
        String s =  matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + "\n" +
                    matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + "\n" +
                    matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + "\n";
        return s;
}
}
