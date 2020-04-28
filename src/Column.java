import interfaces.ICreator;
import persistens.MainEntity;

import java.util.LinkedList;
import java.util.List;

public class Column extends MainEntity implements ICreator {
    private List taskList = new LinkedList();

    @Override
    public void add() {

    }

    @Override
    public void remove(Object o) {

    }
}
