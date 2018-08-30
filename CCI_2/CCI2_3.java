//package All Kind of Java;

public class CCI2_3 {
	class node {
		char element;
		node next;
	}

	void delete_middle_node(node head_node, node middle_node) {
		node tmp_node = head_node, tmp_next_node = tmp_node.next;

		while (tmp_next_node != null) {

			if (tmp_next_node == middle_node) {
				tmp_node.next = tmp_next_node.next;
				tmp_next_node = null;
				break;
			}

			tmp_node = tmp_node.next;
			tmp_next_node = tmp_node.next;

		}
	}

}
