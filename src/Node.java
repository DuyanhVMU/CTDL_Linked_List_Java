
public class Node {
	public Data infor;
	public Node link;
	
	public Node(String namesv, int masv, int diem) {
		this.infor= new Data(namesv, masv, diem);
		this.link=null;
	}
	public void printData() {
		infor.printInfor();
	}
	
	
}
