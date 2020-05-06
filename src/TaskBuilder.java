import interfaces.Observer;

public abstract class TaskBuilder {
    protected  MyTask task;

    public MyTask getTask() {
        return task;
    }

    public TaskBuilder createNewTask(){
        task = new MyTask();
        return this;
    }
    public abstract TaskBuilder name();
    public abstract TaskBuilder description(String description);
    public abstract TaskBuilder checklist();
    public abstract TaskBuilder timeframe(Observer observer, String data);
}
