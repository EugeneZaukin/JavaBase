package Lesson_8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    static final int WINDOW_POS_X = 400;
    static final int WINDOW_POS_Y = 100;
    static final int WINDOW_HEIGHT = 555;
    static final int WINDOW_WIDTH = 505;

    private Settings settings;
    private BattleField battleField;

    public GameWindow() {
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        settings = new Settings(this);
        battleField = new BattleField(this);
        add(battleField, BorderLayout.CENTER);

        JPanel panel1 = new JPanel(new GridLayout(1,2));
        JButton  buttonStart = new JButton("Начать новую игру");
        JButton buttonExit = new JButton("Выход");
        panel1.add(buttonStart);
        panel1.add(buttonExit);
        add(panel1, BorderLayout.SOUTH);

        buttonExit.addActionListener(e -> {
            System.exit(0);
        });

        buttonStart.addActionListener(e -> {
            settings.setVisible(true);
        });

        setVisible(true);
    }

    public void startNewGame (int mode, int fieldSize, int winninig) {
       battleField.startNewGame(mode, fieldSize, winninig);
    }
}
