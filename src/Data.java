
public class Data {
	public String name;
	public int ma;
	public float dtb;
	public Data(String namesv, int masv, int diem) {
		this.name=namesv;
		this.ma=masv;
		this.dtb=diem;
	}
	public void printInfor() {
		System.out.println(this.name+" - "+this.ma+" - "+this.dtb);
	}
}
