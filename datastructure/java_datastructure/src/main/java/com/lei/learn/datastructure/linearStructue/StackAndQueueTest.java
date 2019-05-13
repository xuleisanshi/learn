package com.lei.learn.datastructure.linearStructue;

public class StackAndQueueTest {
  public static void main(String[] args) {
    StackObject<String> stackObject = new StackObject<>();
    stackObject.push("a");
    stackObject.push("b");
    stackObject.push("c");
    System.out.println(stackObject.pop());
    System.out.println(stackObject.pop());
    System.out.println(stackObject.top());
    System.out.println(stackObject.isEmpty());

    QueueObject<String> queueObject = new QueueObject<>();
    queueObject.add("a1");
    queueObject.add("b1");
    queueObject.add("c1");
    System.out.println(queueObject.getSize());

    System.out.println(queueObject.poll());
    System.out.println(queueObject.isEmpty());
  }
}
