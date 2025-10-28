import java.awt.*;
import javax.swing.*;

public class tictactoe extends JFrame {
    private final JButton[][] buttons;
    private boolean isXTurn;
    private final JLabel statusLabel;
    private int movesCount;

    public tictactoe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 450);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Initialize game state
        buttons = new JButton[3][3];
        isXTurn = true;
        movesCount = 0;

        // Create status label
        statusLabel = new JLabel("Player X's turn", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(statusLabel, BorderLayout.NORTH);

        // Create game board
        JPanel boardPanel = new JPanel(new GridLayout(3, 3, 5, 5));
        boardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create and add buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                buttons[i][j].setFocusPainted(false);
                final int row = i;
                final int col = j;
                buttons[i][j].addActionListener(__ -> handleButtonClick(row, col));
                boardPanel.add(buttons[i][j]);
            }
        }

        add(boardPanel, BorderLayout.CENTER);

        // Add reset button
        JButton resetButton = new JButton("New Game");
        resetButton.addActionListener(__ -> resetGame());
        add(resetButton, BorderLayout.SOUTH);
    }

    private void handleButtonClick(int row, int col) {
        // If button is already clicked or game is over, return
        if (!buttons[row][col].getText().isEmpty()) {
            return;
        }

        // Set X or O based on current turn
        buttons[row][col].setText(isXTurn ? "X" : "O");
        movesCount++;

        // Check for win
        if (checkWin(row, col)) {
            statusLabel.setText((isXTurn ? "Player X" : "Player O") + " wins!");
            disableAllButtons();
            return;
        }

        // Check for draw
        if (movesCount == 9) {
            statusLabel.setText("It's a draw!");
            return;
        }

        // Switch turns
        isXTurn = !isXTurn;
        statusLabel.setText((isXTurn ? "Player X" : "Player O") + "'s turn");
    }

    private boolean checkWin(int row, int col) {
        String mark = buttons[row][col].getText();
        
        // Check row
        if (buttons[row][0].getText().equals(mark) && 
            buttons[row][1].getText().equals(mark) && 
            buttons[row][2].getText().equals(mark)) {
            return true;
        }
        
        // Check column
        if (buttons[0][col].getText().equals(mark) && 
            buttons[1][col].getText().equals(mark) && 
            buttons[2][col].getText().equals(mark)) {
            return true;
        }
        
        // Check diagonals
        if (row == col && 
            buttons[0][0].getText().equals(mark) && 
            buttons[1][1].getText().equals(mark) && 
            buttons[2][2].getText().equals(mark)) {
            return true;
        }
        
        if (row + col == 2 && 
            buttons[0][2].getText().equals(mark) && 
            buttons[1][1].getText().equals(mark) && 
            buttons[2][0].getText().equals(mark)) {
            return true;
        }
        
        return false;
    }

    private void disableAllButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
        isXTurn = true;
        movesCount = 0;
        statusLabel.setText("Player X's turn");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tictactoe().setVisible(true);
        });
    }
}
