package All_Kind_of_Java;

import All_Kind_of_Java.linked_list.node;

public class CCI2_5 {
	
	int sum_of_list(linked_list L_list_1, linked_list L_list_2) {
		node tmp_node_1 = L_list_1.head_node, tmp_node_2 = L_list_2.head_node;
		double ret = 0, n = 0;

		while (tmp_node_1 != null || tmp_node_2 != null) {

			if (tmp_node_1 != null) {
				ret += tmp_node_1.element * Math.pow(10, n);
				tmp_node_1 = tmp_node_1.next;
			}

			if (tmp_node_2 != null) {
				ret += tmp_node_2.element * Math.pow(10, n);
				tmp_node_2 = tmp_node_2.next;
			}
			n++;
		}

		return (int) ret;
	}

	
	int sum_of_list_left(linked_list L_list_1, linked_list L_list_2) {
		node tmp_node_1 = L_list_1.head_node, tmp_node_2 = L_list_2.head_node;
		int ret_1 = 0, ret_2 = 0;

		while (tmp_node_1 != null || tmp_node_2 != null) {

			if (tmp_node_1 != null) {
				ret_1 = ret_1 * 10 + tmp_node_1.element;
				tmp_node_1 = tmp_node_1.next;
			}

			if (tmp_node_2 != null) {
				ret_2 = ret_2 * 10 + tmp_node_2.element;
				tmp_node_2 = tmp_node_2.next;
			}

		}
		return ret_1 + ret_2;
	}
	
	
}
