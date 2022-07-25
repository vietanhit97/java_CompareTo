package java_abstract;

public class test {
	public static void main(String[] args) {
		TaoDo taoDo = new TaoDo(10, 0);
		TaoDo taoDo1 = new TaoDo(12, 10);
//		Hinh hinh = new Hinh() ;
		Hinh hinh = new Diem(taoDo1);
		Hinh hinhTronHinh = new HinhTron(taoDo, 2);
		Hinh hinhChuNhatHinh = new HinhChuNhat(taoDo1, 4, 4);
		System.out.println("dien tich diem "+ hinh.tinhDienTich());
		System.out.println("dien tich hinh tròn "+ hinhTronHinh.tinhDienTich());
		System.out.println("dien tich hình chữ nhật "+ hinhChuNhatHinh.tinhDienTich());
				
	}
}
