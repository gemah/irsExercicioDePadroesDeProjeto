package mapaProjecao;

public class BibliotecaCalculosGeograficos1 {

	private static String MESSAGE = "Dist�ncia %s da classe BibliotecaCalculosGeograficos1";

	public float distanciaUTM(float x1, float x2, float y1, float y2){
		/**
		 * Calcula a dist�ncia entre dois pontos de coordenada UTM. Para simplificar
		 * os c�lculos, considera-se sempre que as coordenadas est�o sempre na mesma
		 * Zona. Do contr�rio os calculos seriam demasiadamente complexos.
		 */

		System.out.printf(MESSAGE, "UTM");

		return (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}

	public float distanciaLatLong(float x1, float x2, float y1, float y2){
		double dx = Math.toRadians(x2 - x1);
		double dy = Math.toRadians(y2 - y1);

		double x1Rad = Math.toRadians(x1);
		double x2Rad = Math.toRadians(x2);

		double a = Math.pow(Math.sin(dx/2),2) + Math.pow(Math.sin(dy/2),2) * Math.cos(x1Rad) * Math.cos(x2Rad);
		double c = 2 * Math.asin(Math.sqrt(a));

		System.out.printf(MESSAGE, "Latitude/Longitude");

		float dist = (float) (6372.8*c);

		return dist;
	}

}
