package practice;

public class CCI2_1 {
class Link_list{
	char element;
	Link_list next;
}

void del_overlap_element(Link_list link_list) {
	int convert_ASCII_index, convert_element_to_int;
	Link_list point_link = link_list;
	int [] ASCII_index_bit = new int[3];
	
	while(point_link != null) {
	convert_element_to_int =  point_link.element - 32;
	convert_ASCII_index = convert_element_to_int/ 32;
	if( (ASCII_index_bit[convert_ASCII_index]>>(convert_element_to_int%32) & 1)== 1) {
	//remove Link_list	
	}
	else
	ASCII_index_bit[convert_ASCII_index] |= 1 << (convert_element_to_int%32);
	
	point_link = link_list.next;
	}
}

}
