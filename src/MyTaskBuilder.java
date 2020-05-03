public class MyTaskBuilder extends TaskBuilder {
    static int count = 0;

    @Override
    public TaskBuilder description(String description) {
        task.setDescription(description);
        return this;
    }

    @Override
    public TaskBuilder checklist() {
        task.add();
        return this;
    }

    @Override
    public TaskBuilder name() {
        ++count;
        task.setName("Задача" + count);
        return this;
    }

    @Override
    public TaskBuilder timeframe(String data) {
        task.setTimeframe(new Timeframe());
        return this;
    }
}
