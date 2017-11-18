package tests;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import models.ScanInfo;
import models.WifiNetwork;
import utils.CsvService;

public class Tests {

	@Test
	public void csvServiceReadTest() {
		Map<ScanInfo, List<WifiNetwork>> scans = new HashMap<ScanInfo, List<WifiNetwork>>();
		List<WifiNetwork> networks = new LinkedList<>();
		networks.add(new WifiNetwork("ssid", "mac", "frequency", -20));
		scans.put(new ScanInfo("1", "2", "3", "4", "5"), networks);
		String output = CsvService.toString(scans);
		Assert.assertTrue(output.contains("1,2,3,4,5"));
		Assert.assertTrue(output.contains("ssid,mac,frequency,-20"));
	}

}
