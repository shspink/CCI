
public class CCI3_5 {
	Stack origin_stack = new Stack();
	Stack tmp_stack = new Stack();
	
	void push(int element) {
			while(origin_stack.pop_node!= null && origin_stack.pop_node.element < element) {			
				tmp_stack.push(origin_stack.pop());
			}
				origin_stack.push(element);
				while(tmp_stack.pop_node != null) {
					origin_stack.push(tmp_stack.pop());
				}
	}
	
	int pop() {
		return origin_stack.pop();
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
		CCI3_5 stack_sort = new CCI3_5();
		System.out.println(stack_sort.pop());
		stack_sort.push(1);
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		stack_sort.push(100);stack_sort.push(6);
		stack_sort.push(20);stack_sort.push(1000);
		stack_sort.push(7);stack_sort.push(1);
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());
		System.out.println(stack_sort.pop());

	}
}
