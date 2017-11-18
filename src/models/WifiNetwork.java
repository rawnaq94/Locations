package models;

public class WifiNetwork {
	public String ssid;
	public String mac;
	public String frequency;
	public double signal;

	public WifiNetwork(String ssid, String mac, String frequency, double signal) {
		super();
		this.ssid = ssid;
		this.mac = mac;
		this.frequency = frequency;
		this.signal = signal;
	}

}
