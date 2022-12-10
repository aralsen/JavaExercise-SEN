import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultiExecutor {

    private final List<Runnable> tasks;

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Executes all the tasks concurrently
     */
    public void executeAll() {
        List<Thread> threads = tasks.stream()
                .map(Thread::new)
                .collect(Collectors.toCollection(() -> new ArrayList<>(tasks.size())));

        threads.forEach(Thread::start);
    }
}
