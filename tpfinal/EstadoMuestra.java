package ar.edu.unq.po2.tpfinal;

public abstract class EstadoMuestra {
	
	private Muestra muestra;
	
	public abstract void manejarOpinion(Opinion opinion);

	public Muestra getMuestra() {
		return muestra;
	}

	public void setMuestra(Muestra muestra) {
		this.muestra = muestra;
	}
	
	
	
}
