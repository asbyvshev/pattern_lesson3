import interfaces.ICreator;
import persistens.MainEntity;

import java.util.LinkedList;
import java.util.List;

public class MyTask extends MainEntity implements ICreator {

    private String description;
    private boolean done;
    private List checklists = new LinkedList<>();
    private Timeframe timeframe;

    public Timeframe getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(Timeframe timeframe) {
        this.timeframe = timeframe;
    }

    public List getChecklists() {
        return checklists;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public void add() {
        checklists.add(new Checklist("Список"));
    }

    @Override
    public void remove(Object o) {
        checklists.remove(o);
    }
}
