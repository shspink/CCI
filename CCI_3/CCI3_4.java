
public class CCI3_4 {
	Stack deque_stack = new Stack();
	Stack enque_stack = new Stack();

	void enqueue(int element) {
		enque_stack.push(element);
	}

	int dequeue() {
		if (deque_stack.pop_node == null) {
			while (enque_stack.pop_node != null) {
				deque_stack.push(enque_stack.pop());
			}
		}
		return deque_stack.pop();
	}

	class Stack {
		node pop_node = null;

		class node {
			int element;
			node next = null;

			node(int element) {
				this.element = element;
			}
		}

		void push(int element) {
			if (this.pop_node == null) {
				this.pop_node = new node(element);

			}

			else {
				node new_node = new node(element);
				new_node.next = this.pop_node;
				this.pop_node = new_node;
			}
		}

		int pop() {
			if (this.pop_node == null)
				return -1;

			else {
				int ret = this.pop_node.element;
				this.pop_node = this.pop_node.next;
				return ret;
			}
		}
	}

	public static void main(String[] args) {
		CCI3_4 MyQueue = new CCI3_4();
		System.out.println(MyQueue.dequeue());
		MyQueue.enqueue(1);
		MyQueue.enqueue(2);
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		MyQueue.enqueue(3);
		MyQueue.enqueue(4);
		System.out.println(MyQueue.dequeue());
		MyQueue.enqueue(5);
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
	}

}
