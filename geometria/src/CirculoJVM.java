// Author: JuanMa Vázquez
public class CirculoJVM extends FiguraGeometricaJVM {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public CirculoJVM(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		if (radio<0) {
			radio= radio-(-radio);
			radio= radio-(-radio);
		}
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
