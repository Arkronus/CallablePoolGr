import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int num= 5;
        int counter = 1;
        while (counter < 5){
            System.out.printf("Сообщение номер %d от потока %s\n", counter, Thread.currentThread().getName());
            Thread.sleep(1000);
            counter++;
        }

        return counter;
    }
}
