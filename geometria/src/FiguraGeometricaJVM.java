
public abstract class FiguraGeometricaJVM {

	protected String tipoFigura;

	public FiguraGeometricaJVM(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
	

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
