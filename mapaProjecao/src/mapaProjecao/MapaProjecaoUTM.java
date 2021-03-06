package mapaProjecao;

public class MapaProjecaoUTM extends MapaProjecao {

	public MapaProjecaoUTM() {
		super();
	}

	@Override
	public float calcularDistancia(float x1, float x2, float y1, float y2) {
		if (this.getAdaptadora() == null) {
			return 0;
		}
		return this.getAdaptadora().calcularDistanciaUTM(x1, y1, x2, y2);
	}

}
