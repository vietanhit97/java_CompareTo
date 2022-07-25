package java_abstract;

public class HinhTron extends Hinh {
	private double r ;

	public HinhTron(TaoDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		int a ;
		return a=(int) ((int)Math.PI*Math.pow(r, 2));
	}
	
}
