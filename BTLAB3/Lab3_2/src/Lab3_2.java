import java.util.Scanner;
public class DIEM {
    private int x,y;


    public void NHAPDIEM(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void NHAPDIEM() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x=sc.nextInt();
		System.out.print("Nhap y: ");
		y=sc.nextInt();

	}
	public void inDIEM() {
		System.out.println("("+x+","+y+")");
	}
}