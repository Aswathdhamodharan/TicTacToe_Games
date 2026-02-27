import java.util.Scanner;

// Player Class
class Player {
    String name;
    char symbol;

    Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}

// Board Class
class Board {

    char[][] grid;

    Board() {
        grid = new char[3][3];

        // initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(grid[i][0] + " | " + grid[i][1] + " | " + grid[i][2]);
            if (i < 2)
                System.out.println("---------");
        }
        System.out.println();
    }

    boolean placeMove(int row, int col, char symbol) {

        if (row < 0 || row > 2 || col < 0 || col > 2)
            return false;

        if (grid[row][col] != ' ')
            return false;

        grid[row][col] = symbol;
        return true;
    }

    boolean checkWinner(char symbol) {

        // Rows
        for (int i = 0; i < 3; i++)
            if (grid[i][0] == symbol &&
                    grid[i][1] == symbol &&
                    grid[i][2] == symbol)
                return true;

        // Columns
        for (int i = 0; i < 3; i++)
            if (grid[0][i] == symbol &&
                    grid[1][i] == symbol &&
                    grid[2][i] == symbol)
                return true;

        // Diagonals
        if (grid[0][0] == symbol &&
                grid[1][1] == symbol &&
                grid[2][2] == symbol)
            return true;

        if (grid[0][2] == symbol &&
                grid[1][1] == symbol &&
                grid[2][0] == symbol)
            return true;

        return false;
    }

    boolean isFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i][j] == ' ')
                    return false;

        return true;
    }
}

// Game Controller + Main Class
public class TICTACTOE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Board board = new Board();
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        Player currentPlayer = player1;

        while (true) {

            board.printBoard();

            System.out.println(currentPlayer.name +
                    " enter row and column (0-2): ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!board.placeMove(row, col, currentPlayer.symbol)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (board.checkWinner(currentPlayer.symbol)) {
                board.printBoard();
                System.out.println(currentPlayer.name + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("Game Draw!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == player1)
                    ? player2 : player1;
        }

        sc.close();
    }
}