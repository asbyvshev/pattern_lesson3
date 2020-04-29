import interfaces.ICreator;
import persistens.MainEntity;

import java.util.LinkedList;
import java.util.List;

public class Column extends MainEntity implements ICreator {
    private List <MyTask> taskList = new LinkedList();

    private TaskBuilder taskBuilder;

    public void setTaskBuilder(TaskBuilder taskBuilder) {
        this.taskBuilder = taskBuilder;
    }

    public MyTask getTask() {
        return taskBuilder.getTask();
    }

    public void showTasks() {
        StringBuilder stringBuilder = new StringBuilder();
        for (MyTask task:taskList) {
            stringBuilder.append(task.toString() + " ");
        }
        System.out.println(stringBuilder);
    }

    @Override
    public void add() {
        taskList.add(taskBuilder.createNewTask()
                                .description("Задача")
                                .checklist()
                                .timeframe("выполнить до такой-то даты")
        .getTask());
    }

    @Override
    public void remove(Object o) {
        taskList.remove(o);
    }
}
