//package All Kind of Java;

import All Kind of Java.linked_list.node;

public class CCI2_4 {

	void move_right_smaller_than_X_node(linked_list L_list, int X) {
		node tmp_node = L_list.head_node, tmp_pre_node = L_list.new node(), smaller_than_X_head_node = null,
				smaller_than_X_tail_node = null;
		tmp_pre_node.next = L_list.head_node;

		while (tmp_node != null) {
// === Check tmp_node element smaller than X 
			if (tmp_node.element < X) {
// === Check tmp_node is head_node 
				if (tmp_node == L_list.head_node) {
					L_list.head_node = L_list.head_node.next;
					tmp_pre_node.next = L_list.head_node;
				}

				else
					tmp_pre_node.next = tmp_node.next;
// === Check small node list is empty 
				if (smaller_than_X_head_node == null) {
					smaller_than_X_head_node = tmp_node;
					smaller_than_X_tail_node = tmp_node;
				}

				else {
					smaller_than_X_tail_node.next = tmp_node;
					smaller_than_X_tail_node = tmp_node;
				}
				

				tmp_node = tmp_pre_node.next;
			}

			else {
				tmp_node = tmp_node.next;
				tmp_pre_node = tmp_pre_node.next;
			}

		}
// === Combine as One list 
		smaller_than_X_tail_node.next = L_list.head_node;
		L_list.head_node = smaller_than_X_head_node;
		tmp_pre_node.next = null;
	}

}
