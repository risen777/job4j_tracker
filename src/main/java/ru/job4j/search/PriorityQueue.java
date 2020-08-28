package ru.job4j.search;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Sergey
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {

        }
        this.tasks.add(index, task);
        Collections.sort(tasks,new TaskComp());
    }

    public Task take() {
        return tasks.poll();
    }
    class TaskComp implements Comparator<Task>{

        @Override
        public int compare(Task o1, Task o2) {
            if(o1.getPriority() > o2.getPriority()){
                return 1;
            } else {
                return -1;
            }

        }
    }

}
