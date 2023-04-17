import java.util.Scanner;
public class DuongTron extends DIEM {
	private int r;
	public DuongTron() {
		super();
		r=0;
	}
	public DuongTron(int x,int y,int r) {
		super(x,y);
		this.r=r;
	}
	public void nhapDuongTron() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
	    System.out.print(" Nhap ban kinh r : ");
	    r=sc.nextInt();

		
	}
	public void intDuongTron() {
		System.out.println("Tam cua duong tron la : "+"("+getX()+","+getY()+")");
		System.out.println("Ban kinh cua duong tron la : "+r);
		
		
	}
	public void chuViDuongtron() {
		double cvdt = (2*r)*Math.PI;
		System.out.println("Chu vi cua duong tron la : "+cvdt);

    }
	public void dienTichDuongTron() {
		double dtdt = r*r*Math.PI;
		System.out.println("Dien tich cua hinh tron la : "+dtdt);
		
		
	}	
	
}
		
		
		
		
		
