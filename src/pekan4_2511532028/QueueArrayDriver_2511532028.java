package pekan4_2511532028;

public class QueueArrayDriver_2511532028 {

	public static void main(String[] args) {
		QueueArray_2511532028 queue_2028 = new QueueArray_2511532028(1000);
		queue_2028.enqueue_2028(10);
		queue_2028.enqueue_2028(20);
		queue_2028.enqueue_2028(30);
		queue_2028.enqueue_2028(40);
		System.out.println("item di depan " + queue_2028.front_2028);
		System.out.println("item paling belakang " + queue_2028.rear_2028);
		System.out.println("tampilan queue");
		queue_2028.display_2028();
		System.out.println();
		System.out.println(queue_2028.dequeue_2028() + " dihapus dari queue ");
		System.out.println("item di depan : " + queue_2028.front_2028);
		System.out.println("item paling belakang : " + queue_2028.rear_2028);
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_2028.display_2028();

	}

}
