package ar.edu.unq.po2.tpfinal;

public class EstadoMuestraBasico extends EstadoMuestra{

	public void manejarOpinion(Opinion opinion) {
		getMuestra().agregarOpinion(opinion);
	}
}
