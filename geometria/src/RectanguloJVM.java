/**
 * 
 * @author Juan Manuel Vázquez
 * Versión 1.2
 */
public class RectanguloJVM extends FiguraGeometricaJVM {
	private double l1;
	private double l2;
	/**
	 * 
	 * @param Pide el tipo de figura y dos lados.  
	 */
	public RectanguloJVM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 * Calcula el area.
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 * Calcula el perímetro.
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
