//package All Kind of Java;

import practice.linked_list.node;

public class CCI2_4 {

	void move_right_smaller_than_X_node(linked_list L_list, int X) {
		node tmp_node = L_list.head_node, tmp_pre_node = L_list.head_node, smaller_than_X_head_node = null,
				smaller_than_X_tail_node = null;

		if (tmp_node.element < X) {
			if (tmp_node == L_list.head_node)
				L_list.head_node = L_list.head_node.next;
			else
				tmp_pre_node.next = tmp_node.next;
			
			if (smaller_than_X_head_node == null)
				smaller_than_X_head_node = tmp_node;
			else
				smaller_than_X_tail_node.next = tmp_node;
			smaller_than_X_tail_node = tmp_node;
			
		}

	}
}
