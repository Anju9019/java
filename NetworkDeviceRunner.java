class NetworkDeviceRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        NetworkDevice d1 = new NetworkDevice(1, "Router-X1", "Router", 1000.0, true);
        /*
        d1.networkId = 1;
        d1.name = "Router-X1";
        d1.type = "Router";
        d1.bandwidth = 1000.0;
        d1.isSecured = true;
        */

        NetworkDevice d2 = new NetworkDevice(2, "Switch-Pro", "Switch", 500.0, true);
        /*
        d2.networkId = 2;
        d2.name = "Switch-Pro";
        d2.type = "Switch";
        d2.bandwidth = 500.0;
        d2.isSecured = true;
        */

        NetworkDevice d3 = new NetworkDevice(3, "AccessPoint-A1", "Access Point", 300.0, false);
        /*
        d3.networkId = 3;
        d3.name = "AccessPoint-A1";
        d3.type = "Access Point";
        d3.bandwidth = 300.0;
        d3.isSecured = false;
        */

        NetworkDevice d4 = new NetworkDevice(4, "Firewall-Z", "Firewall", 800.0, true);
        /*
        d4.networkId = 4;
        d4.name = "Firewall-Z";
        d4.type = "Firewall";
        d4.bandwidth = 800.0;
        d4.isSecured = true;
        */

        NetworkDevice d5 = new NetworkDevice(5, "Modem-5G", "Modem", 250.0, false);
        /*
        d5.networkId = 5;
        d5.name = "Modem-5G";
        d5.type = "Modem";
        d5.bandwidth = 250.0;
        d5.isSecured = false;
        */

        NetworkDevice d6 = new NetworkDevice(6, "Repeater-Range", "Repeater", 150.0, false);
        /*
        d6.networkId = 6;
        d6.name = "Repeater-Range";
        d6.type = "Repeater";
        d6.bandwidth = 150.0;
        d6.isSecured = false;
        */

        NetworkDevice d7 = new NetworkDevice(7, "CoreSwitch-9000", "Switch", 2000.0, true);
        /*
        d7.networkId = 7;
        d7.name = "CoreSwitch-9000";
        d7.type = "Switch";
        d7.bandwidth = 2000.0;
        d7.isSecured = true;
        */

        NetworkDevice d8 = new NetworkDevice(8, "EdgeRouter", "Router", 1200.0, true);
        /*
        d8.networkId = 8;
        d8.name = "EdgeRouter";
        d8.type = "Router";
        d8.bandwidth = 1200.0;
        d8.isSecured = true;
        */

        NetworkDevice d9 = new NetworkDevice(9, "BridgeLink", "Bridge", 400.0, false);
        /*
        d9.networkId = 9;
        d9.name = "BridgeLink";
        d9.type = "Bridge";
        d9.bandwidth = 400.0;
        d9.isSecured = false;
        */

        NetworkDevice d10 = new NetworkDevice(10, "SecureHub", "Hub", 100.0, false);
        /*
        d10.networkId = 10;
        d10.name = "SecureHub";
        d10.type = "Hub";
        d10.bandwidth = 100.0;
        d10.isSecured = false;
        */

        NetworkDevice d11 = new NetworkDevice(11, "SmartRouter", "Router", 900.0, true);
        /*
        d11.networkId = 11;
        d11.name = "SmartRouter";
        d11.type = "Router";
        d11.bandwidth = 900.0;
        d11.isSecured = true;
        */

        NetworkDevice d12 = new NetworkDevice(12, "MeshNode-1", "Mesh Node", 600.0, true);
        /*
        d12.networkId = 12;
        d12.name = "MeshNode-1";
        d12.type = "Mesh Node";
        d12.bandwidth = 600.0;
        d12.isSecured = true;
        */

        NetworkDevice d13 = new NetworkDevice(13, "IoT-Gateway", "Gateway", 350.0, false);
        /*
        d13.networkId = 13;
        d13.name = "IoT-Gateway";
        d13.type = "Gateway";
        d13.bandwidth = 350.0;
        d13.isSecured = false;
        */

        NetworkDevice d14 = new NetworkDevice(14, "CloudRouter", "Router", 1500.0, true);
        /*
        d14.networkId = 14;
        d14.name = "CloudRouter";
        d14.type = "Router";
        d14.bandwidth = 1500.0;
        d14.isSecured = true;
        */

        NetworkDevice d15 = new NetworkDevice(15, "BackupSwitch", "Switch", 700.0, true);
        /*
        d15.networkId = 15;
        d15.name = "BackupSwitch";
        d15.type = "Switch";
        d15.bandwidth = 700.0;
        d15.isSecured = true;
        */

        NetworkDevice d16 = new NetworkDevice(16, "NanoRepeater", "Repeater", 120.0, false);
        /*
        d16.networkId = 16;
        d16.name = "NanoRepeater";
        d16.type = "Repeater";
        d16.bandwidth = 120.0;
        d16.isSecured = false;
        */

        NetworkDevice d17 = new NetworkDevice(17, "SecureFirewall", "Firewall", 1800.0, true);
        /*
        d17.networkId = 17;
        d17.name = "SecureFirewall";
        d17.type = "Firewall";
        d17.bandwidth = 1800.0;
        d17.isSecured = true;
        */

        NetworkDevice d18 = new NetworkDevice(18, "EnterpriseSwitch", "Switch", 2500.0, true);
        /*
        d18.networkId = 18;
        d18.name = "EnterpriseSwitch";
        d18.type = "Switch";
        d18.bandwidth = 2500.0;
        d18.isSecured = true;
        */

        NetworkDevice d19 = new NetworkDevice(19, "WiFiExtender", "Extender", 200.0, false);
        /*
        d19.networkId = 19;
        d19.name = "WiFiExtender";
        d19.type = "Extender";
        d19.bandwidth = 200.0;
        d19.isSecured = false;
        */

        NetworkDevice d20 = new NetworkDevice(20, "VirtualRouter", "Router", 1600.0, true);
        /*
        d20.networkId = 20;
        d20.name = "VirtualRouter";
        d20.type = "Router";
        d20.bandwidth = 1600.0;
        d20.isSecured = true;
        */

        // Printing all network devices info
        d1.printNetworkDeviceInfo();
        d2.printNetworkDeviceInfo();
        d3.printNetworkDeviceInfo();
        d4.printNetworkDeviceInfo();
        d5.printNetworkDeviceInfo();
        d6.printNetworkDeviceInfo();
        d7.printNetworkDeviceInfo();
        d8.printNetworkDeviceInfo();
        d9.printNetworkDeviceInfo();
        d10.printNetworkDeviceInfo();
        d11.printNetworkDeviceInfo();
        d12.printNetworkDeviceInfo();
        d13.printNetworkDeviceInfo();
        d14.printNetworkDeviceInfo();
        d15.printNetworkDeviceInfo();
        d16.printNetworkDeviceInfo();
        d17.printNetworkDeviceInfo();
        d18.printNetworkDeviceInfo();
        d19.printNetworkDeviceInfo();
        d20.printNetworkDeviceInfo();

        System.out.println("Main ended");
    }
}
