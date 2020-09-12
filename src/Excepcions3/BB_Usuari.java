package Excepcions3;
import java.util.Date;

public class BB_Usuari {
	private String Usuarinom;
	private String Usuaricognom;
	private String Usuaripass;
	private String Usuaridata1;
	
	public BB_Usuari(String usuarinom, String usuaricognom, String usuaripass, String usuaridata1) {
		super();
		this.Usuarinom = usuarinom;
		this.Usuaricognom = usuaricognom;
		this.Usuaripass = usuaripass;
		this.Usuaridata1 = usuaridata1;
	}
	public String getUsuarinom() {
		return Usuarinom;
	}
	public void setUsuarinom(String usuarinom) {
		Usuarinom = usuarinom;
	}
	public String getUsuaricognom() {
		return Usuaricognom;
	}
	public void setUsuaricognom(String usuaricognom) {
		Usuaricognom = usuaricognom;
	}
	public String getUsuaripass() {
		return Usuaripass;
	}
	public void setUsuaripass(String usuaripass) {
		Usuaripass = usuaripass;
	}
	public String getUsuaridata1() {
		return Usuaridata1;
	}
	public void setUsuaridata1(String usuaridata1) {
		Usuaridata1 = usuaridata1;
	}
}
