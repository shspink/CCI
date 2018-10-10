
import java.util.ArrayList;

public class CCI2_8 {
node head;
class node{
    node next;
}
node find_cir_node(node head){
	ArrayList<node> node_arr = new ArrayList<node>();
	node ret = null, tmp_node = head , tmp_for_null = tmp_node;
	while(tmp_node.next!=null) {
		node_arr.add(tmp_node.next);
		tmp_node = tmp_node.next;
		tmp_for_null.next = null;
		tmp_for_null = tmp_node;
	}	
	ret = tmp_node;
	tmp_node = head;
	while(!node_arr.isEmpty()) {
		tmp_node.next = node_arr.get(0);
		node_arr.remove(0);
		tmp_node = tmp_node.next;
	}	
	return ret;
 }
}
