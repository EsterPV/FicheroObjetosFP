package ficheroArrayPartido;



public class PartidoFutbol {

	private String local;
	private int ptsLocal;
	private String visitante;
	private int ptsVisitante;

	
	
	
	public PartidoFutbol() {
		super();
	}




	public PartidoFutbol(String local, int ptsLocal, String visitante, int ptsVisitante) {
		super();
		this.local = local;
		this.ptsLocal = ptsLocal;
		this.visitante = visitante;
		this.ptsVisitante = ptsVisitante;
	}






	public String getLocal() {
		return local;
	}




	public void setLocal(String local) {
		this.local = local;
	}




	public int getPtsLocal() {
		return ptsLocal;
	}




	public void setPtsLocal(int ptsLocal) {
		this.ptsLocal = ptsLocal;
	}




	public String getVisitante() {
		return visitante;
	}




	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}




	public int getPtsVisitante() {
		return ptsVisitante;
	}




	public void setPtsVisitante(int ptsVisitante) {
		this.ptsVisitante = ptsVisitante;
	}






	


@Override
	public String toString() {
		return "PartidoFutbol [local=" + local + ", ptsLocal=" + ptsLocal + ", visitante=" + visitante
				+ ", ptsVisitante=" + ptsVisitante + "]";
	}














	
	
	
	
	
}
