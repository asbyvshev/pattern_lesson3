public class BuilderExample {
    public static void main(String[] args) {
        TaskBuilder myTaskBuilder = new MyTaskBuilder();
        Column column = new Column();

        column.setTaskBuilder(myTaskBuilder);
        column.add();
        column.add();
        column.showTasks();
    }
}
