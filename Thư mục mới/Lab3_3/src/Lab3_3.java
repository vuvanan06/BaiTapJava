import java.util.ArrayList;
import java.util.Scanner;
class HangHoa{
	String maHang, tenHang, nhaXuatBan;
	double gia;
	public HangHoa(String maHang, String tenHang, String nhaXuatBan, double gia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.nhaXuatBan = nhaXuatBan;
		this.gia = gia;
	}
		
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma hang: ");
		maHang = sc.nextLine();
		System.out.println("Nhap ten hang : ");
		tenHang = sc.nextLine();
		System.out.println("Nhapnha san xuat: ");
		nhaXuatBan =sc.nextLine();
		System.out.println("nhap gia: ");
		gia = sc.nextDouble();
		
	}
	
	public String toString() {
        return("\nMa hang: "+maHang+"\tTen hang: "+tenHang+"\tNha san xuat: "+nhaXuatBan+"\tGia: "+gia);
        
	}	
}
class HangDienMay extends HangHoa{
	private String thoiGianBaoHanh;
	private int dienAp;
	private float congSuat;
	
	public HangDienMay(String maHang, String tenHang, String nhaXuatBan, double gia,String thoiGianBaoHanh , int dienAp , float congSuat) {
		super(maHang, tenHang, nhaXuatBan, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("NHap thoi gian bao hanh la: ");
		thoiGianBaoHanh = sc.nextLine();
		System.out.println("Nhập điện áp : ");
		dienAp = sc.nextInt();
		System.out.println(" Nhập công suất : ");
		congSuat = sc.nextFloat();
		
	}
	public String toString() {

		return("\nHang dien may\tMa hang: "+maHang+"\tTen hang: "+tenHang+"\tNha san xuat: "+nhaXuatBan+"\tGia: "+gia+"\tThoi gian bao hanh: "+(String)thoiGianBaoHanh +"\tDien ap: "+dienAp+"\tCong suat: "+congSuat);
    }
}
public class HangThucPham extends HangHoa {
	String ngaySanXuat, ngayHetHan;
	Scanner sc =new Scanner(System.in);
	public void nhsp() {
		super.nhap();
		System.out.println("NHap ngay san xuat");
		ngaySanXuat=sc.nextLine();
		System.out.println("Nhap ngay het han: ");
		ngayHetHan=sc.nextLine();
	}
	public String toString() {
		return("\nHang thuc pham\tMa hang: "+maHang+"\tTen hang: "+tenHang+"\tNha san xuat: "+nhaXuatBan+"\tGia: \"+gia+\"\\tNgay san xuat: \"+ ngaySanXuat+\"\\tNgay het han: \"+ ngayHetHan)");
				
	}
}
class hangSanhSu extends HangHoa{
	String loaiNguyenLieu;
	Scanner sc = new Scanner (System.in);
	public void nhap() {
		super.nhap();
		System.out.println("Nhap loai nguyen lieu: ");
		loaiNguyenLieu=sc.nextLine();	
	}
	  public String toString() {
		  return("\nHang Sanh Su\tMa hang: \"+maHang+\"\\tTen hang: \"+tenHang+\"\\tNha san xuat: \"+nhaXuaBan+\"\\tGia: \"+gia+\"\\tLoai nguyen lieu: \"+ loaiNguyenLieu)");
		  				  
	  }
}
public class MAIN{
	public static void main(String[] args) {
		 ArrayList<HangHoa> dsHH = new ArrayList<HangHoa>();
	     Scanner sc = new Scanner(System.in);
	        int lc;
	        do{
	            System.out.println("\n1. Nhap hang dien may\n2. Nhap hang thuc pham\n3. Nhap hang sanh su\n4. In toan bo danh sach\n0. Thoat");
	            System.out.println("Nhap lua chon cua minh: ");
	            lc = sc.nextInt();
	        switch(lc){  
	        case 1:
            {
                HangDienMay dm = new HangDienMay();
                dm.nhap();
                dsHH.add(dm);
                break;
            }
	        case 2:
            {
                HangThucPham tp = new HangThucPham();
                tp.nhap();
                dsHH.add(tp);
                break;
            }   
	        case 3:
            {
                hangSanhSu ss = new hangSanhSu();
                ss.nhap();
                dsHH.add(ss);
                break;
            }
	        case 4:
            {
                if(dsHH.size()==0){ 
                    System.out.println("Danh sach rong!"); 
                    break;}
                else 
                    for(HangHoa i : dsHH){
                    System.out.println(i);
                    System.out.println();}
                    break;
            default: {
                System.out.println("Da thoat");
                break;
            
            }
            }
	        
 

