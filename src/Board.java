import interfaces.BoardLogger;
import persistens.MainEntity;

import java.util.LinkedList;
import java.util.List;

public class Board extends MainEntity implements BoardLogger {
    private List <Column> columns = new LinkedList();

    @Override
    public void currentDate() {
    }

    @Override
    public void showColumns() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Column column:columns) {
            stringBuilder.append(column.getName() + " ");
        }
        System.out.println(stringBuilder);
    }

    @Override
    public void add() {
        columns.add(new Column("Новая колонка"));
    }

    @Override
    public void remove(Object o) {
        columns.remove(o);
    }
}
