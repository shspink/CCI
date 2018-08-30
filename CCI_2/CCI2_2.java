//package All Kind of Java;

public class CCI2_2 {
	class node {
		char element;
		node next;
	}

	node k_th_element_from_backmost_list(node head_node, int K) {
		node tmp_node = head_node, ret_node = head_node;
		boolean list_length_smaller_than_K = true;
		int list_length = 1;

		while (tmp_node != null) {
			if (list_length_smaller_than_K && list_length >= K)
				list_length_smaller_than_K = false;
			else
				ret_node = ret_node.next;

			tmp_node = tmp_node.next;
			list_length++;
		}
		
		if (list_length_smaller_than_K)
			ret_node = null;
		
		return ret_node;
	}

}
