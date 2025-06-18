package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SnakeGame extends JPanel implements ActionListener {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int UNIT_SIZE = 20;
    private static final int DELAY = 150;

    private List<Point> snake;
    private Point food;
    private int score;
    private Direction direction;
    private boolean isGameOver;
    private Timer timer;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new GameKeyAdapter());

        initGame();
    }

    private void initGame() {
        snake = new ArrayList<>();
        snake.add(new Point(5, 5)); // Initial snake position
        food = createFood();
        score = 0;
        direction = Direction.RIGHT;
        isGameOver = false;

        timer = new Timer(DELAY, this);
        timer.start();
    }

    private Point createFood() {
        Random rand = new Random();
        int x = rand.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE;
        int y = rand.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE;
        return new Point(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            move();
            checkCollision();
            repaint();
        }
    }

    private void move() {
        // Move the snake by adding a new head and removing the tail
        Point newHead = getNextHead();
        snake.add(0, newHead);

        // Check if the snake has eaten the food
        if (newHead.equals(food)) {
            score++;
            food = createFood();
        } else {
            snake.remove(snake.size() - 1); // Remove the tail
        }
    }

    private Point getNextHead() {
        Point head = snake.get(0);
        int x = head.x;
        int y = head.y;

        switch (direction) {
            case UP:
                y -= UNIT_SIZE;
                break;
            case DOWN:
                y += UNIT_SIZE;
                break;
            case LEFT:
                x -= UNIT_SIZE;
                break;
            case RIGHT:
                x += UNIT_SIZE;
                break;
        }

        return new Point(x, y);
    }

    private void checkCollision() {
        Point head = snake.get(0);

        // Check collision with walls
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT) {
            isGameOver = true;
            timer.stop();
            return;
        }

        // Check self-collision
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                isGameOver = true;
                timer.stop();
                return;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw food
        g.setColor(Color.RED);
        g.fillRect(food.x, food.y, UNIT_SIZE, UNIT_SIZE);

        // Draw snake
        g.setColor(Color.GREEN);
        for (Point point : snake) {
            g.fillRect(point.x, point.y, UNIT_SIZE, UNIT_SIZE);
        }

        // Draw score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Score: " + score, 10, 30);

        // Draw game over message
        if (isGameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over", 120, HEIGHT / 2);
        }
    }

    private class GameKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if ((key == KeyEvent.VK_LEFT) && (direction != Direction.RIGHT)) {
                direction = Direction.LEFT;
            } else if ((key == KeyEvent.VK_RIGHT) && (direction != Direction.LEFT)) {
                direction = Direction.RIGHT;
            } else if ((key == KeyEvent.VK_UP) && (direction != Direction.DOWN)) {
                direction = Direction.UP;
            } else if ((key == KeyEvent.VK_DOWN) && (direction != Direction.UP)) {
                direction = Direction.DOWN;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SnakeGame());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

enum Direction {
    UP, DOWN, LEFT, RIGHT
}
