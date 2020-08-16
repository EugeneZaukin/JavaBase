package Lesson_8;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {
    private GameWindow gameWindow;

    private static final int WINDOW_POS_X = GameWindow.WINDOW_POS_X + 50;
    private static final int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y + 50;
    private static final int WINDOW_HEIGHT = GameWindow.WINDOW_HEIGHT - 100;
    private static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 100;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    static final int GAME_MODE_H_VS_AI = 0;
    static final int GAME_MODE_H_VS_H = 1;

    private JRadioButton jrbHumanVsAi;
    private JRadioButton jrbHumanVsHuman;
    private ButtonGroup bgGamemode;
    private JSlider jsFieldSize;
    private JSlider jsWinning;

    public Settings(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Settings");

        setLayout(new GridLayout(8,1));

        add(new JLabel("Режим игры:"));
        jrbHumanVsAi = new JRadioButton("Против компьютера", true);
        jrbHumanVsHuman = new JRadioButton("Против человека");
        bgGamemode = new ButtonGroup();
        bgGamemode.add(jrbHumanVsAi);
        bgGamemode.add(jrbHumanVsHuman);
        add(jrbHumanVsAi);
        add(jrbHumanVsHuman);

        add(new JLabel("Размер поля:"));
        jsFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        jsFieldSize.setMajorTickSpacing(1);
        jsFieldSize.setPaintTicks(true);
        jsFieldSize.setPaintLabels(true);
        add(jsFieldSize);

        add(new JLabel("Количество до победы:"));
        jsWinning = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        jsWinning.setMajorTickSpacing(1);
        jsWinning.setPaintTicks(true);
        jsWinning.setPaintLabels(true);
        add(jsWinning);

        jsFieldSize.addChangeListener(e -> {
            jsWinning.setMaximum(jsFieldSize.getValue());
        });

        JButton buttonGame = new JButton("Ok");
        add(buttonGame);
        buttonGame.addActionListener(e -> {
            int mode;
            if (jrbHumanVsAi.isSelected()) {
                mode = GAME_MODE_H_VS_AI;
            } else {
                mode = GAME_MODE_H_VS_H;
            }

            int fieldSize = jsFieldSize.getValue();
            int winning = jsWinning.getValue();

            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = winning;
            Logic.initMap();
            Logic.isFinished = false;

            gameWindow.startNewGame(mode, fieldSize, winning);

            setVisible(false);
        });



        setVisible(false);
    }
}
