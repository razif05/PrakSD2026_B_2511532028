package pekan4_2511532028;

public class QueueArrayDriver_2511532028 {

	public static void main(String[] args) {
		QueueArray_2511532028 queue = new QueueArray_2511532028(1000);
		queue.enqueue_2028(10);
		queue.enqueue_2028(20);
		queue.enqueue_2028(30);
		queue.enqueue_2028(40);
		System.out.println("item di depan " + queue.front_2028);
		System.out.println("item paling belakang " + queue.rear_2028);
		System.out.println("tampilan queue");
		queue.display_2028();
		System.out.println();
		System.out.println(queue.dequeue_2028() + " dihapus dari queue ");
		System.out.println("item di depan : " + queue.front_2028);
		System.out.println("item paling belakang : " + queue.rear_2028);
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_2028();

	}

}
