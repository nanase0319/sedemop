package collcetion.queue;

import java.util.PriorityQueue;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/3/3 21:31
 */
public class AboutQueue {
    public static void main(String[] args) {
        // 创建一个PriorityQueue对象，这里使用自然排序（自然顺序由元素自身的Comparable决定）
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // 向队列中添加元素
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(2);

        // 输出队列的内容，注意这不会按照添加顺序输出，而是按照优先级（自然顺序）输出
        System.out.println("PriorityQueue: " + priorityQueue);

        // 取出并移除队列中的优先级最高的元素（即最小的元素，因为Integer实现了Comparable接口，并使用了自然排序）
        Integer highestPriorityElement = priorityQueue.poll();
        System.out.println("Highest priority element: " + highestPriorityElement);

        // 再次输出队列的内容
        System.out.println("PriorityQueue after removing the highest priority element: " + priorityQueue);

        // 如果你想使用自定义的排序规则，可以让你的类实现Comparable接口，并重写compareTo方法
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("Banana");
        stringPriorityQueue.add("Apple");
        stringPriorityQueue.add("Cherry");

        // 默认情况下，String的优先级队列将按照字典序排序
        System.out.println("String PriorityQueue: " + stringPriorityQueue);

    }
}
