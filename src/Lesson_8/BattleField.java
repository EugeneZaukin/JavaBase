package Lesson_8;

import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BattleField extends JPanel {
    private GameWindow gameWindow;
    private int mode;
    private int fieldSize;
    private int winninig;

    private boolean isInit;

    private int cellWidth;
    private int cellHeight;


    public BattleField(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                clickBattleField(e);
            }
        });
    }

    private void clickBattleField(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        repaint();

        if (!Logic.isFinished) {
            Logic.humanTurn(cellX, cellY);
        }
    }


    public void startNewGame(int mode, int fieldSize, int winninig) {
        this.mode = mode;
        this.fieldSize = fieldSize;
        this.winninig = winninig;

        isInit = true;

        repaint();



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!isInit) {
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSize;
        cellWidth = panelWidth / fieldSize;

        g.setColor(Color.BLACK);

        for (int i = 0; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    draw_X(g, j, i);
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    draw_O(g, j, i);
                }
            }

        }
    }

        private void draw_X(Graphics g, int x, int y){
            ((Graphics2D) g).setStroke(new BasicStroke(5));
            g.setColor(Color.RED);
            g.drawLine(cellWidth * x, cellHeight * y, cellWidth * (x + 1), cellHeight * (y + 1));
            g.drawLine(cellWidth * x, cellHeight * (y + 1), cellWidth * (x + 1), cellHeight * y);
        }

        private void draw_O(Graphics g, int x, int y) {
            ((Graphics2D) g).setStroke(new BasicStroke(5));
            g.setColor(Color.BLUE);
            g.drawOval(cellWidth * x, cellHeight * y, cellWidth, cellHeight);
        }
}


