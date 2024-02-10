
public class Main {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.Insert_Tail("duyanh", 1, 1);
		list.Insert_Tail("dy", 2, 2);
		list.Insert_After(2, "dyb", 3, 3);
		list.Insert_Tail("dya", 4, 4);
		//list.Del_Head();
		//list.Del_After(4);
		//list.Del_Key(1);
		//list.Del_Tail();
		//list.Sort();
		//list.processList();
		list.Search(5);
	}
}
