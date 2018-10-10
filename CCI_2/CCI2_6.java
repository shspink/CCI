
public class CCI2_6 {
	node head = null;
	node tail = null;
 class node{
	 char element;
	 node next = null;
	 node pre = null;
	 node(char element){
		 this.element = element;
	 }
 }
 void add(char element) {
	 if(head == null) {
		 head = new node(element);
		 tail = head;
	 }
	 
	 else {
		 tail.next = new node(element);
		 tail.next.pre = tail;
	     tail = tail.next;
	 }
 }
 
 boolean check_palindrome(String str) {
	 int str_len = str.length(), index = 0;
	 
	 while(str_len != index) {
		 add(str.charAt(index));
		 index++;
	 }
	 
	 index = 0 ;
	 str_len = str_len >> 1;
	 node front = this.head,back = this.tail;
	 while(str_len != index) {
		 if(front.element != back.element)
			 return false;
		 front = front.next;
		 back = back.pre;
		 index++;
	 }
	 return true;
 }
 boolean check_palindrome_2(String str) {
	 int str_len = str.length() >> 1, index = 0;
	 
	 while(str_len != index) {
		 add(str.charAt(index));
		 index++;
	 }
	 
	 if(str_len << 1 != str.length())
	 index ++;
	 
	 str_len = str_len >> 1;
	 node back = this.tail;
	 while(str.length() != index) {
		 if(str.charAt(index) != back.element)
			 return false;
		 back = back.pre;
		 index++;
	 }
	 return true;
 }
 public static void main(String[] args) {
	 CCI2_6 cci = new CCI2_6();
	 if(cci.check_palindrome("dlevvvelda"))
		 System.out.println("palindrome!");
	 if(cci.check_palindrome_2("dlevveld"))
		 System.out.println("palindrome_2!");
 }
}
