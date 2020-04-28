public class MyTaskBuilder extends TaskBuilder {
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
    public TaskBuilder timeframe(String data) {
        task.setTimeframe(new Timeframe());
        return this;
    }
}
