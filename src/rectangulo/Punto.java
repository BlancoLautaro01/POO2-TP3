package rectangulo;

public class Punto {
	
	private int x, y;

	public Punto(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	public Punto() {
		super();
		this.setX(0);
		this.setY(0);
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void mover(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Punto sumarPuntos(Punto p) {
		Punto puntoNuevo = new Punto((this.getX() + p.getX()), (this.getY() + p.getY()));
		return puntoNuevo;
	}
}
