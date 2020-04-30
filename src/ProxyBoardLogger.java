import interfaces.BoardLogger;

import java.util.Date;

public class ProxyBoardLogger implements BoardLogger {
    private final Board board = new Board();

    public ProxyBoardLogger() {
        currentDate();
    }

    @Override
    public void currentDate() {
        System.out.println("New board create at: " + new Date().toString());
    }

    @Override
    public void showColumns() {
        board.showColumns();
    }

    @Override
    public void add() {
        board.add();
    }

    @Override
    public void remove(Object o) {
        board.remove(o);
    }
}
