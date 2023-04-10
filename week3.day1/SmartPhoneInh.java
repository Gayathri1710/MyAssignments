package week3.day1;

public class SmartPhoneInh extends AndroidPhoneInh {
public void ConnectWhatsApp() {
	System.out.println("WhatsApp Connected");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhoneInh sp =new SmartPhoneInh ();
sp.sendmsg();
sp.makeCall();
sp.savecontact();
sp.takeVideo();
sp.ConnectWhatsApp();

	}

}
