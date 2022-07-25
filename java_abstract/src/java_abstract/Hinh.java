
package java_abstract;

public abstract class Hinh {
	protected TaoDo toaDo;

	public Hinh(TaoDo toaDo) {
		this.toaDo = toaDo;
	}
	public TaoDo getToaDo() {
		return toaDo;
	}
	public void setToaDo(TaoDo toaDo) {
		this.toaDo = toaDo;
	}
	public abstract double tinhDienTich();
}
