
public class time {
	private int hora;
	private int minuto;
	private int segundo;
	

public void setTime(int hora, int minuto, int segundo) {
	this.hora = hora;
	this.minuto = minuto;
	this.segundo = segundo;
}

public String  exibirHoraUniversal() {
	String HoraUniversal;
	HoraUniversal = hora +  ":"  +minuto+  ":"  +segundo;
	return HoraUniversal;
			
}
public void imprimir() {
	System.out.println("Hora Universal: "+exibirHoraUniversal());
}
}