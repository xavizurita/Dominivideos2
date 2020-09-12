package Excepcions3;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

public class BB_main {
	public static void main(String[] args) {

		BB_Usuari ObjUsuari[] = new BB_Usuari[20];
		BB_Video ObjVideo[] = new BB_Video[20];
		
		Date fecha = new Date();
		DateFormat formatDia = new SimpleDateFormat("dd/MM/yyyy");
		String Videourl = "";
		String Videotitol = "";
		String Videotag = "";
		String Usuarinom = "";
		String Usuaricognom = "";
		String Usuaripass = "";
		String Usuaridata1 = "";
		String controlUsu="";
		String controlGral="";
		String controlVid="";
		
		boolean gestBucleUsu = true;
		boolean gestBucleVid = true;
		boolean gestBucleGral = true;
		
		int indexArray = 0;
		int indexArrayusu = 0;
		int indexArrayvid = 0;
		int resp = 0;
		String pppp="Superman";		// carregara per defecte aqeust nom en preguntar el nom del video

		while (gestBucleGral) {
			try {
					controlGral = (JOptionPane.showInputDialog("1.- GESTIO USUARIS \n2.- GESTIO VIDEOS  \n3 SORTIR"));
					if (controlGral.equals("")) {
						BB_clase.ControlEntrada3();
					}
					BB_clase.ControlEntrada2(controlGral);	//Verifica que es un numero, Q NO TE LLETRES I QUE NO ESTA VUITa i entre 1 i 3
					gestBucleUsu = true; 
					gestBucleVid = true;
					switch (Integer.parseInt(controlGral)) {
					case 1:
						while (gestBucleUsu) {
							BB_clase hh = new BB_clase();
							try {
									controlUsu = (JOptionPane.showInputDialog("1.- ALTA USUARIO \n2.- CONSULTA USUARIS  \n3 Menu PRINCIPAL \n4.- SALIR"));
									BB_clase.ControlEntrada(controlUsu);	//Verifica que es un numero, Q NO TE LLETRES I QUE NO ESTA VUITa i entre 1 i 4
									switch (Integer.parseInt(controlUsu)) {
									case 1: 
										gestBucleUsu = true;
										Usuarinom = JOptionPane.showInputDialog("Nom");
										Usuaricognom = JOptionPane.showInputDialog("Cognoms");
										Usuaripass = JOptionPane.showInputDialog("Password");
										Usuaridata1 = JOptionPane.showInputDialog("Data", formatDia.format(fecha));
										ObjUsuari[indexArrayusu]= new BB_Usuari(Usuarinom, Usuaricognom, Usuaripass, Usuaridata1);
										indexArrayusu ++;
										break;
									case 2:
										int counter = 0;		//ens contara el numero de registres existents per no tenir error de null recorrent l'array
										for (BB_Usuari ob : ObjUsuari) {
											if (ob != null) {
												counter ++;	
											} else {
//												JOptionPane.showConfirmDialog(null, "Sense Registres ", "             - - - A T E N C I O - - -", JOptionPane.CLOSED_OPTION);
												break;
											}
										}
										for (int tt=0; tt<counter; tt++) {
//										for (int tt=0; tt<ObjUsuari.length; tt++) {
											if (ObjUsuari[tt].getUsuarinom() != null) { 
											System.out.println("L'Usuari ("+ tt +") es: "+ ObjUsuari[tt].getUsuarinom() + " " + ObjUsuari[tt].getUsuaricognom() 
													+ " " + ObjUsuari[tt].getUsuaripass() + " " + ObjUsuari[tt].getUsuaridata1());	
											}
										}
										gestBucleUsu = true; 
										break;
									case 3:
										gestBucleUsu = false; 
										break;
									default:
										System.exit(0); 
									}
								} catch (Exception e) {
									System.out.println(e.getMessage());
								}
						}
						break;
					case 2:
						while (gestBucleVid) {
							try {
									controlVid = (JOptionPane.showInputDialog("1.- ALTA VIDEO \n2.- CONSULTA VIDEOS  \n3 Menu PRINCIPAL \n4.- SALIR"));
									BB_clase.ControlEntrada(controlVid);	
									switch (Integer.parseInt(controlVid)) {
									case 1: 
										gestBucleVid = true;
										Videotitol = JOptionPane.showInputDialog("Titol Video", pppp);
										Videourl = JOptionPane.showInputDialog("URL", "http://");
										do {
											Videotag = JOptionPane.showInputDialog("Tag");
											resp = JOptionPane.showConfirmDialog(null, "Introducir mas TAGS", "    - - Confirmar opcion - -", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
											ObjVideo[indexArrayvid]= new BB_Video(Videotitol, Videourl, Videotag);
											indexArrayvid ++;
										}while (resp == 0);
										break;
									case 2:
										int counter = 0;		//ens contara el numero de registres existents per no tenir error de null recorrent l'array
										for (BB_Video ob : ObjVideo) {
											if (ob != null) {
												counter ++;	
											} else {
//												JOptionPane.showConfirmDialog(null, "Sense Registres ", "             - - - A T E N C I O - - -", JOptionPane.CLOSED_OPTION);
												break;
											}
										}
										for (int tt=0; tt<counter; tt++) {
											if (ObjVideo[tt].getVideotitol() != null) { 
												System.out.print("Video Numero ("+ tt +") , Titol: "+ ObjVideo[tt].getVideotitol() + " " + ObjVideo[tt].getVideourl() 
													+ " " + ObjVideo[tt].getVideotag());
												while ((tt<(counter-1)) && (ObjVideo[tt].getVideotitol().equals(ObjVideo[tt+1].getVideotitol()))) {
													System.out.print(" " + ObjVideo[tt+1].getVideotag() + " ");
													tt++;
												}
												System.out.println("");
											}
										}
										gestBucleVid = true; 
										break;
									case 3:
										gestBucleVid = false; 
										break;
									default:
										System.exit(0); 
									}
								} catch (Exception e) {
									System.out.println(e.getMessage());
								}
						}
						break;
					default:
						System.out.println("L'opcio triada es SORTIR");
						System.exit(0);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
			}
		}
	}
}
