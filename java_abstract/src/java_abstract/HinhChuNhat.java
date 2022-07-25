package java_abstract;

public class HinhChuNhat extends Hinh {
	private double chieuDai  , chieuRong ;

	public HinhChuNhat(TaoDo toaDo, double chieuDai, double chieuRong) {
		super(toaDo);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.chieuDai*this.chieuRong;
	}
	
}
