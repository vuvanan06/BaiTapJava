import java.util.Scanner;

public class Bai3{
	public static void main(String[] args) {
		int tuoi,namsinh;
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		namsinh = sc.nextInt();
		tuoi = 2023 - namsinh;
	if(tuoi < 16) {
		System.out.println(ten +" o do tuoi vi thanh nien");
	}else if(tuoi >= 16 && tuoi < 18) {
		System.out.println(ten +" o do tuoi truong thanh");
	}else {
		System.out.println(ten +" da gia");
	}
	}
}