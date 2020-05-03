import interfaces.BoardLogger;
import interfaces.Observer;
import persistens.MainEntity;
import persistens.SubjectObservations;

import java.util.LinkedList;
import java.util.List;

public class Board extends MainEntity implements BoardLogger, Observer {
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

    public List<Column> getColumns() {
        return columns;
    }

    @Override
    public void remove(Object o) {
        columns.remove(o);
    }

    @Override
    public void update(SubjectObservations subject, Object arg) {
        System.out.println(arg);
    }


}
