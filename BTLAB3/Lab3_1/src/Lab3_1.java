import java.util.Scanner;
 class Sach{
	private String maSach, tenSach, tenTacGia;
	private int soTrang,Tap,gia;
	private String loaiSach,nhaXuatBan;
	public void nhapSach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
		maSach = sc.nextLine();
		System.out.println("Nhap ten sach: ");
		tenSach = sc.nextLine();
		System.out.println("Nhap ten tac gia: ");
		tenTacGia = sc.nextLine();
		System.out.println("Nhap so trang: ");
		soTrang = sc.nextLine();
		System.out.println("Nhap loai sach: ");
		loaiSach = sc.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		nhaXuatBan = sc.nextLine();
		System.out.println("Nhap so tap: ");
		Tap = sc.nextLine();
		System.out.println("Nhap gia: ");
		gia = sc.nextLine();
		
	
	}
public void inSach() {
	System.out.println("Ma sach: " + maSach);
	System.out.println("Ten sach: " + tenSach);
	System.out.println("ten tac gia: " + tenTacGia);
	System.out.println("So trang: "+ soTrang);
	System.out.println("Loai sach: " + loaiSach);
	System.out.println("Gia tien: " + gia);
	System.out.println("Loai sach: " +  loaiSach);
	System.out.println("Nha xuat ban: " + nhaXuatBan);
		
    }
	
}

public class Lab3_1 {
    public static void main(String[] args) {
    	int n;
    	Sach SACH[];
    	Scanner scanner = new Scanner(System.in);
    	 System.out.print("Nhap vao so quyen sach: ");
         n=scanner.nextInt();
         SACH = new Sach[n];
         for(int i=0;i<n;i++){
             SACH[i]=new Sach();
             SACH[i].nhapSach();
         }
         System.out.println("Sach sau khi nhap la: ");
         for(int i=0;i<n;i++){
             SACH[i].inSach();
         }
     }
	

}
