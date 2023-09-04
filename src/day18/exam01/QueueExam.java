package day18.exam01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		// 메시지 넣기 
		messageQueue.offer(new Message("send", "happy"));
		messageQueue.offer(new Message("send", "곧 주말"));
		messageQueue.offer(new Message("send", "lalala"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.to);
		}

	}

}
