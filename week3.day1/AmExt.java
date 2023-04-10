package week3.day1;

public class AmExt extends MobileInh{
	public void takeVideo() {
		System.out.println("takeVideo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmExt takeVideo = new AmExt();
		takeVideo.sendmsg();
		takeVideo.makeCall();
		takeVideo.savecontact();
		takeVideo.takeVideo();

	}

}
