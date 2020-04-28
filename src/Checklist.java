import interfaces.ICreator;
import persistens.MainEntity;

import java.util.LinkedList;
import java.util.List;

public class Checklist extends MainEntity implements ICreator {
    List checklist = new LinkedList<>();

    public Element find(String name){
        return null;
    }

    @Override
    public void add() {
        checklist.add(new Element());
    }

    public Checklist(String name) {
        setName(name);
    }

    public Checklist() {
    }

    @Override
    public void remove(Object o) {
        checklist.remove(o);
    }
}
