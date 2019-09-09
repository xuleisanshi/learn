package com.lei.learn.javabasic.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(19);
        linkedList.add(5);
        linkedList.add(6);


        System.out.println("=========LinkedList基本操作========");
        linkedList.addFirst(0);//添加元素到list头
        linkedList.add(7);//添加元素到队尾；
        linkedList.add(4, 4);//添加4到位置4
        linkedList.addLast(8);//添加到队尾
        System.out.println(linkedList);

        Integer[] integers = {10, 11, 12};//添加到list尾
        linkedList.addAll(Arrays.asList(integers));
        System.out.println(linkedList);
        linkedList.addAll(0, Arrays.asList(integers));//添加到指定位置
        System.out.println(linkedList);

        System.out.println("getFirst: " + linkedList.getFirst());
        System.out.println("getLast: " + linkedList.getLast());
        System.out.println("getIndex: " + linkedList.get(1));
        System.out.println(linkedList);
        System.out.println("removeFirst: " + linkedList.removeFirst());
        System.out.println("poll: " + linkedList.poll());
        System.out.println("remove: " + linkedList.remove());
        System.out.println(linkedList);
        System.out.println("pollLast: " + linkedList.pollLast());
        System.out.println("removeLast: " + linkedList.removeLast());
        System.out.println(linkedList);
        System.out.println("remove by index: " + linkedList.remove(1));
        System.out.println("offer: " + linkedList.offer(19));
        System.out.println("remove an object: " + linkedList.remove(new Integer(11)));
        System.out.println("contain: " + linkedList.contains(new Integer(2)));
        System.out.println("size: " + linkedList.size());
        System.out.println(linkedList);

        System.out.println("=========位置操作=======");
        linkedList.set(0, 1);
        System.out.println("lastIndexOf: " + linkedList.lastIndexOf(1));
        System.out.println("indexOf: " + linkedList.indexOf(1));

        System.out.println(linkedList);
        System.out.println("peek: " + linkedList.peek());
        System.out.println("peekFirst: " + linkedList.peekFirst());
        System.out.println("peekLast: " + linkedList.peekLast());
        System.out.println("pop: " + linkedList.pop());
        System.out.println(linkedList);


        System.out.println("==========遍历操作============");
        linkedList.clear();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }

        System.out.println("");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(" " + linkedList.get(i));
        }
    }
}
