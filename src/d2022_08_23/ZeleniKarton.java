package d2022_08_23;

public class ZeleniKarton {

	private String imeStudenta;
	private int borjIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
	
	public ZeleniKarton(String imeStudenta, int borjIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
		super();
		this.imeStudenta = imeStudenta;
		this.borjIndexa = borjIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public int getBorjIndexa() {
		return borjIndexa;
	}

	public void setBorjIndexa(int borjIndexa) {
		this.borjIndexa = borjIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		}else {
			return false;
		}
	}
	
	public void print() {
		System.out.println("naziv predmeta:" + this.nazivPredmeta +" - ocena: " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + ", broj indexa: "+ this.borjIndexa);
		System.out.println("Profesor: " + this.imeProfesora);
	}
}
