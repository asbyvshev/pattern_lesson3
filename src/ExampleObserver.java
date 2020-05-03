import java.util.Date;

public class ExampleObserver {
    public static void main(String[] args) {
        Board board = new Board();
        board.add(); // создали колонку
        //требуется передать в конку билдер задач
        TaskBuilder myTaskBuilder = new MyTaskBuilder();
        board.getColumns().get(0).setTaskBuilder(myTaskBuilder);

        board.getColumns().get(0).add(board); // создали задачу (с датой) в колонке и передали слушателя
        MyTask task1 = board.getColumns().get(0).getTaskList().get(0);
        task1.getTimeframe().setDataExecution(new Date()); // в задачу задали срок исполнения

        // проверим сроки всех задач (срок исполниния должен уже истечь)
        for (Column col : board.getColumns()) {
            for (MyTask task: col.getTaskList()) {
                task.getTimeframe().verifyDeadlines();
            }
        }
    }
}
