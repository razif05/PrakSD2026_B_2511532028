package pekan4_2511532028;

public class QueueArray_2511532028 {
	int front_2028, rear_2028, size_2028;
	int capacity_2028;
	int array_2028[];
	
	public QueueArray_2511532028(int capacity) {
		this.capacity_2028 = capacity;
		front_2028 = this.size_2028 = 0;
		rear_2028 = capacity - 1;
		array_2028 =new int[this.capacity_2028];
	}
	
	boolean isFull(QueueArray_2511532028 queue) {
		return (queue.size_2028 == queue.capacity_2028);
	}
	
	boolean isEmpty(QueueArray_2511532028 queue) {
		return (queue.size_2028 == 0);
	}
	
	void enqueue_2028(int item_2028) {
		if(isFull(this)) {
			return;
		}
		this.rear_2028 = (this.rear_2028 + 1) % this.capacity_2028;
		this.array_2028[this.rear_2028] = item_2028;
		this.size_2028 = this.size_2028 + 1;
		System.out.println(item_2028 + " enqueue to queue");
	}
	
	int dequeue_2028() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array_2028[this.front_2028];
		this.front_2028  = (this.front_2028 + 1) % this.capacity_2028;
		this.size_2028 = this.size_2028 - 1;
		return item;
	}
	
	int front_2028() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2028[this.front_2028];
	}
	
	int rear_2028() {
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2028[this.rear_2028];
	}
	
	//mencetak elemen antrian
	void display_2028() {
		int i;
		if (front_2028 == rear_2028) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_2028; i < rear_2028; i++) {
			System.out.printf(" %d <-- ", array_2028[i]);
		}
		return;
	}
}
