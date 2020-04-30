import interfaces.BoardLogger;

public class ProxyExample {
    public static void main(String[] args) {
        BoardLogger logger = new ProxyBoardLogger();
        logger.add();
        logger.add();
        logger.showColumns();
    }
}
