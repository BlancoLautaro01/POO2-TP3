package rectangulo;

public class Rectangulo {
	
	protected Punto esquinaSuperiorIzquierda;
	protected int altura, base;

	public Rectangulo(Punto esquinaSuperiorIzquierda, int base, int altura) {
		super();
		this.setEsquinaSuperiorIzquierda(esquinaSuperiorIzquierda);
		this.setBase(base);
		this.setAltura(altura);
	}

	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public void setEsquinaSuperiorIzquierda(Punto esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int area() {
		return (this.getBase() * this.getAltura());
	}
	
	public int perimetro() {
		return ((this.getBase()*2) + (this.getAltura()*2));
	}
	
	public boolean esVertical() {
		return (this.getAltura() > this.getBase());
	}
}
