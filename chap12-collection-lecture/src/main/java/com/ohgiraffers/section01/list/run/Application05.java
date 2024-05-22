package main.java.com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {
    public static void main(String[] args) {
        /*
        * Queue
        *  Queue 는 선형 메모리 공간에 데이터를 저장하는
        *  선입선출 (FIFO - first in first out) 방식의 자료구조이다.
        *  Queue 인터페이스를 상속받는 하위 인터페이스들은
        *  Deque, BlockingQueue, BlochingDeque, TranferQueue 등 다양하지만
        *  대부분의 큐는 LinkedList 를 이용한다.
        *
        *
        * */

      //  Queue<String> que = new Queue<String>();

        Queue<String> que = new LinkedList<>();

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);

        /*
        * peek() : 해당 큐의 가장 앞에 있는 요소 반환
        * poll() : 해당 큐의 가장 앞에 있는 요소 반환 후 제거
        * */

        System.out.println("peek() : " + que.peek());

        System.out.println(que);

        System.out.println("poll() : " + que.poll());
        System.out.println(que);


    }
}
