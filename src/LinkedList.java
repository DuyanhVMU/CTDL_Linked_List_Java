
public class LinkedList {
	private Node pHead;
	private Node pTail;
	private int spt;
	// Cấu tử khởi tạo
	public LinkedList() {
		this.spt=0;
		this.pHead=null;
		this.pTail=null;
	}
	// Kiểm tra danh sách rỗng
	public boolean EmptyList() {
	    return this.spt == 0;
	}
	// Chèn đầu danh sách
	public void Insert_Head(String namesv, int masv, int diem) {
		Node newNode=new Node(namesv, masv, diem);
		if(this.EmptyList()) {
			this.pHead=newNode;
			this.pTail=newNode;
		}
		else {
			newNode.link=this.pHead;
			this.pHead=newNode;
		}
		this.spt++;
	}
	// Chèn cuối danh sách
	public void Insert_Tail(String namesv, int masv, int diem) {
		Node newNode=new Node(namesv, masv, diem);
		if(this.EmptyList()) {
			this.pHead=newNode;
			this.pTail=newNode;
		}
		else {
			this.pTail.link=newNode;
			this.pTail=newNode;
		}
		this.spt++;
	}
	// Chèn sau một mã sinh viên key
	public void Insert_After(int key,String namesv, int masv, int diem) {
		Node newNode=new Node(namesv, masv, diem);
		Node current= this.pHead;
		while(current!=null && current.infor.ma!=key) {
			current=current.link;
		}
		if(current==null){
			return;
		}
		else {
			newNode.link=current.link;
			current.link=newNode;
			if(current==this.pTail) {
				this.pTail=newNode;
			}
			this.spt++;
		}
	}
	// Xóa phần tử đầu của danh sách
	public void Del_Head() {
		if(this.EmptyList()) {
			return;
		}
		else {
			this.pHead=this.pHead.link;
			this.spt--;
			if(this.pHead==null) {
				this.pTail=null;
			}
		}
	}
	// Xóa phần tử sau Node chứa mã sinh viên key
	public void Del_After(int key) {
		Node current=this.pHead;
		while(current!=null && current.infor.ma!=key) {
			current=current.link;
		}
		if(current==null || current.link==null){
			return;
		}
		else {
			current.link=current.link.link;
			this.spt--;
			if(this.pTail==null) {
				current=this.pTail;
			}
		}
	}
	// Xóa phần tử chứa mã sinh viên key
	public void Del_Key(int key) {
		Node current=this.pHead;
		Node prev=null;
		while(current!=null && current.infor.ma!=key) {
			prev=current;
			current=current.link;
		}
		if(current==null){
			return;
		}
		else if(current==this.pHead) {
			this.pHead=this.pHead.link;
			this.spt--;
			if(this.pHead==null) {
				this.pTail=null;
			}
		}
		else {
			prev.link=current.link;
			this.spt--;
			if(this.pTail==null) {
				current=this.pTail;
			}
		}
	}
	// Xóa phần tử cuối danh sách
	public void Del_Tail() {
		Node current=this.pHead;
		Node prev=null;
		while(current!=this.pTail) {
			prev=current;
			current=current.link;
		}
		if(current==null){
			return;
		}
		else if(current==this.pHead) {
			this.pHead=this.pHead.link;
			this.spt--;
			if(this.pHead==null) {
				this.pTail=null;
			}
		}
		else {
			prev.link=current.link;
			this.spt--;
			if(this.pTail==null) {
				current=this.pTail;
			}
		}
	}
	// Sắp xếp danh sách
	public void Sort() {
		Node i = null;
		Node j = null;
		for(i=this.pHead;i!=null;i=i.link) {
			for(j=i;j!=null;j=j.link) {
				if(i.infor.ma<j.infor.ma) {
					Data temp=i.infor;
					i.infor=j.infor;
					j.infor=temp;
				}
			}
		}
	}
	// Tim kiem sinh vien co ma key
	public void Search(int key) {
		Node current=this.pHead;
		while(current!=null && current.infor.ma!=key) {
			current=current.link;
		}
		if(current==null) {
			System.out.println("Không tìm thấy sinh viên có mã "+key+" !");
			return;
		}
		else {
			System.out.println("Thông tin sinh viên tìm kiếm:");
			System.out.println("Tên: "+current.infor.name);
			System.out.println("Mã: "+current.infor.ma);
			System.out.println("Điểm: "+current.infor.dtb);
		}
	}
	// Duyệt danh sách
	public void processList() {
		System.out.println("Thong tin sinh vien: ");
		Node current= this.pHead;
		while(current!=null) {
			current.printData();
			current=current.link;
		}
	}
	
}
