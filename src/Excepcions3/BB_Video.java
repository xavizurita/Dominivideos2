package Excepcions3;

public class BB_Video {
	private String Videourl;
	private String Videotitol;
	private String Videotag;
	public BB_Video( String videotitol, String videourl, String videotag) {
		super();
		this.Videourl = videourl;
		this.Videotitol = videotitol;
		this.Videotag = videotag;
	}
	public String getVideourl() {
		return Videourl;
	}
	public void setVideourl(String videourl) {
		Videourl = videourl;
	}
	public String getVideotitol() {
		return Videotitol;
	}
	public void setVideotitol(String videotitol) {
		Videotitol = videotitol;
	}
	public String getVideotag() {
		return Videotag;
	}
	public void setVideotag(String videotag) {
		Videotag = videotag;
	}
}
