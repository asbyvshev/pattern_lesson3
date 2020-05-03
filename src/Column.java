import interfaces.ICreator;
import interfaces.Observer;
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

    public List<MyTask> getTaskList() {
        return taskList;
    }

    public Column(String name) {
        setName(name);
    }

    public Column() {
    }


    @Override
    public void add() {
        taskList.add(taskBuilder.createNewTask()
                                .name()
                                .description("Описание: Сделать что-то.")
                                .checklist()
        .getTask());
    }

    public void add(Observer observer) {
        taskList.add(taskBuilder.createNewTask()
                .name()
                .description("Описание: Сделать что-то.")
                .checklist()
                .timeframe(observer,"какая-то дата")
                .getTask());
    }

    @Override
    public void remove(Object o) {
        taskList.remove(o);
    }
}
