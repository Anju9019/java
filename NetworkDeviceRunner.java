 class NetworkDeviceRunner {
  public static void main(String[] args) {
        NetworkDevice device1 = new NetworkDevice();
        device1.deviceId = 1;
        device1.deviceName = "Router";
        device1.ipAddress = "192.168.1.1";
        device1.macAddress = "00:0a:95:9d:68:16";
        device1.manufacturer = "Cisco";
        device1.price = 5000.0;
        device1.deviceType = "Wireless";

        System.out.println("Device Id: " + device1.deviceId);
        System.out.println("Device Name: " + device1.deviceName);
        System.out.println("IP Address: " + device1.ipAddress);
        System.out.println("MAC Address: " + device1.macAddress);
        System.out.println("Manufacturer: " + device1.manufacturer);
        System.out.println("Price: " + device1.price);
        System.out.println("Device Type: " + device1.deviceType);

        NetworkDevice device2 = new NetworkDevice();
        device2.deviceId = 2;
        device2.deviceName = "Switch";
        device2.ipAddress = "192.168.1.2";
        device2.macAddress = "00:0b:86:af:21:45";
        device2.manufacturer = "Netgear";
        device2.price = 3000.0;
        device2.deviceType = "Wired";

        System.out.println("Device Id: " + device2.deviceId);
        System.out.println("Device Name: " + device2.deviceName);
        System.out.println("IP Address: " + device2.ipAddress);
        System.out.println("MAC Address: " + device2.macAddress);
        System.out.println("Manufacturer: " + device2.manufacturer);
        System.out.println("Price: " + device2.price);
        System.out.println("Device Type: " + device2.deviceType);

        NetworkDevice device3 = new NetworkDevice();
        device3.deviceId = 3;
        device3.deviceName = "Firewall";
        device3.ipAddress = "192.168.1.3";
        device3.macAddress = "00:0c:29:7d:8e:19";
        device3.manufacturer = "Palo Alto";
        device3.price = 7000.0;
        device3.deviceType = "Security";

        System.out.println("Device Id: " + device3.deviceId);
        System.out.println("Device Name: " + device3.deviceName);
        System.out.println("IP Address: " + device3.ipAddress);
        System.out.println("MAC Address: " + device3.macAddress);
        System.out.println("Manufacturer: " + device3.manufacturer);
        System.out.println("Price: " + device3.price);
        System.out.println("Device Type: " + device3.deviceType);

        NetworkDevice device4 = new NetworkDevice();
        device4.deviceId = 4;
        device4.deviceName = "Modem";
        device4.ipAddress = "192.168.1.4";
        device4.macAddress = "00:0d:56:ad:9c:22";
        device4.manufacturer = "TP-Link";
        device4.price = 2000.0;
        device4.deviceType = "DSL";

        System.out.println("Device Id: " + device4.deviceId);
        System.out.println("Device Name: " + device4.deviceName);
        System.out.println("IP Address: " + device4.ipAddress);
        System.out.println("MAC Address: " + device4.macAddress);
        System.out.println("Manufacturer: " + device4.manufacturer);
        System.out.println("Price: " + device4.price);
        System.out.println("Device Type: " + device4.deviceType);

        NetworkDevice device5 = new NetworkDevice();
        device5.deviceId = 5;
        device5.deviceName = "Access Point";
        device5.ipAddress = "192.168.1.5";
        device5.macAddress = "00:0e:8f:9a:b3:11";
        device5.manufacturer = "Ubiquiti";
        device5.price = 4000.0;
        device5.deviceType = "Wireless";

        System.out.println("Device Id: " + device5.deviceId);
        System.out.println("Device Name: " + device5.deviceName);
        System.out.println("IP Address: " + device5.ipAddress);
        System.out.println("MAC Address: " + device5.macAddress);
        System.out.println("Manufacturer: " + device5.manufacturer);
        System.out.println("Price: " + device5.price);
        System.out.println("Device Type: " + device5.deviceType);
		NetworkDevice device6 = new NetworkDevice();

        NetworkDevice device6 = new NetworkDevice();
        device6.deviceId = 6;
        device6.deviceName = "Load Balancer";
        device6.ipAddress = "192.168.1.6";
        device6.macAddress = "00:0f:a4:cd:78:33";
device6.manufacturer = "F5 Networks";
device6.price = 8500.0;
device6.deviceType = "Networking";

System.out.println("Device Id: " + device6.deviceId);
System.out.println("Device Name: " + device6.deviceName);
System.out.println("IP Address: " + device6.ipAddress);
System.out.println("MAC Address: " + device6.macAddress);
System.out.println("Manufacturer: " + device6.manufacturer);
System.out.println("Price: " + device6.price);
System.out.println("Device Type: " + device6.deviceType);
System.out.println();

NetworkDevice device7 = new NetworkDevice();
device7.deviceId = 7;
device7.deviceName = "Network Analyzer";
device7.ipAddress = "192.168.1.7";
device7.macAddress = "00:1a:2b:3c:4d:57";
device7.manufacturer = "Wireshark";
device7.price = 2500.0;
device7.deviceType = "Monitoring";

System.out.println("Device Id: " + device7.deviceId);
System.out.println("Device Name: " + device7.deviceName);
System.out.println("IP Address: " + device7.ipAddress);
System.out.println("MAC Address: " + device7.macAddress);
System.out.println("Manufacturer: " + device7.manufacturer);
System.out.println("Price: " + device7.price);
System.out.println("Device Type: " + device7.deviceType);
System.out.println();

NetworkDevice device8 = new NetworkDevice();
device8.deviceId = 8;
device8.deviceName = "Bridge";
device8.ipAddress = "192.168.1.8";
device8.macAddress = "00:1b:2c:3d:4e:68";
device8.manufacturer = "D-Link";
device8.price = 1800.0;
device8.deviceType = "Wired";

System.out.println("Device Id: " + device8.deviceId);
System.out.println("Device Name: " + device8.deviceName);
System.out.println("IP Address: " + device8.ipAddress);
System.out.println("MAC Address: " + device8.macAddress);
System.out.println("Manufacturer: " + device8.manufacturer);
System.out.println("Price: " + device8.price);
System.out.println("Device Type: " + device8.deviceType);
System.out.println();

NetworkDevice device9 = new NetworkDevice();
device9.deviceId = 9;
device9.deviceName = "Repeater";
device9.ipAddress = "192.168.1.9";
device9.macAddress = "00:1c:3d:4e:5f:79";
device9.manufacturer = "TP-Link";
device9.price = 1500.0;
device9.deviceType = "Wireless";

System.out.println("Device Id: " + device9.deviceId);
System.out.println("Device Name: " + device9.deviceName);
System.out.println("IP Address: " + device9.ipAddress);
System.out.println("MAC Address: " + device9.macAddress);
System.out.println("Manufacturer: " + device9.manufacturer);
System.out.println("Price: " + device9.price);
System.out.println("Device Type: " + device9.deviceType);
System.out.println();

NetworkDevice device10 = new NetworkDevice();
device10.deviceId = 10;
device10.deviceName = "Gateway";
device10.ipAddress = "192.168.1.10";
device10.macAddress = "00:1d:4e:5f:6a:8a";
device10.manufacturer = "Juniper";
device10.price = 6200.0;
device10.deviceType = "Routing";

System.out.println("Device Id: " + device10.deviceId);
System.out.println("Device Name: " + device10.deviceName);
System.out.println("IP Address: " + device10.ipAddress);
System.out.println("MAC Address: " + device10.macAddress);
System.out.println("Manufacturer: " + device10.manufacturer);
System.out.println("Price: " + device10.price);
System.out.println("Device Type: " + device10.deviceType);
System.out.println();

NetworkDevice device11 = new NetworkDevice();
device11.deviceId = 11;
device11.deviceName = "Proxy Server";
device11.ipAddress = "192.168.1.11";
device11.macAddress = "00:1e:5f:6a:7b:9c";
device11.manufacturer = "Squid";
device11.price = 4500.0;
device11.deviceType = "Security";

System.out.println("Device Id: " + device11.deviceId);
System.out.println("Device Name: " + device11.deviceName);
System.out.println("IP Address: " + device11.ipAddress);
System.out.println("MAC Address: " + device11.macAddress);
System.out.println("Manufacturer: " + device11.manufacturer);
System.out.println("Price: " + device11.price);
System.out.println("Device Type: " + device11.deviceType);
System.out.println();

NetworkDevice device12 = new NetworkDevice();
device12.deviceId = 12;
device12.deviceName = "VPN Concentrator";
device12.ipAddress = "192.168.1.12";
device12.macAddress = "00:1f:6a:7b:8c:ad";
device12.manufacturer = "Cisco";
device12.price = 9200.0;
device12.deviceType = "Security";

System.out.println("Device Id: " + device12.deviceId);
System.out.println("Device Name: " + device12.deviceName);
System.out.println("IP Address: " + device12.ipAddress);
System.out.println("MAC Address: " + device12.macAddress);
System.out.println("Manufacturer: " + device12.manufacturer);
System.out.println("Price: " + device12.price);
System.out.println("Device Type: " + device12.deviceType);
System.out.println();

NetworkDevice device13 = new NetworkDevice();
device13.deviceId = 13;
device13.deviceName = "Network Storage";
device13.ipAddress = "192.168.1.13";
device13.macAddress = "00:2a:7b:8c:9d:ae";
device13.manufacturer = "Synology";
device13.price = 10000.0;
device13.deviceType = "Storage";

System.out.println("Device Id: " + device13.deviceId);
System.out.println("Device Name: " + device13.deviceName);
System.out.println("IP Address: " + device13.ipAddress);
System.out.println("MAC Address: " + device13.macAddress);
System.out.println("Manufacturer: " + device13.manufacturer);
System.out.println("Price: " + device13.price);
System.out.println("Device Type: " + device13.deviceType);
System.out.println();

NetworkDevice device14 = new NetworkDevice();
device14.deviceId = 14;
device14.deviceName = "Media Converter";
device14.ipAddress = "192.168.1.14";
device14.macAddress = "00:2b:8c:9d:ae:bf";
device14.manufacturer = "StarTech";
device14.price = 1200.0;
device14.deviceType = "Converter";

System.out.println("Device Id: " + device14.deviceId);
System.out.println("Device Name: " + device14.deviceName);
System.out.println("IP Address: " + device14.ipAddress);
System.out.println("MAC Address: " + device14.macAddress);
System.out.println("Manufacturer: " + device14.manufacturer);
System.out.println("Price: " + device14.price);
System.out.println("Device Type: " + device14.deviceType);
System.out.println();

NetworkDevice device15 = new NetworkDevice();
device15.deviceId = 15;
device15.deviceName = "Network Controller";
device15.ipAddress = "192.168.1.15";
device15.macAddress = "00:2c:9d:ae:bf:d0";
device15.manufacturer = "Hewlett-Packard";
device15.price = 3000.0;
device15.deviceType = "Control";

System.out.println("Device Id: " + device15.deviceId);
System.out.println("Device Name: " + device15.deviceName);
System.out.println("IP Address: " + device15.ipAddress);
System.out.println("MAC Address: " + device15.macAddress);
System.out.println("Manufacturer: " + device15.manufacturer);
System.out.println("Price: " + device15.price);
System.out.println("Device Type: " + device15.deviceType);
System.out.println();

NetworkDevice device16 = new NetworkDevice();
device16.deviceId = 16;
device16.deviceName = "Patch Panel";
device16.ipAddress = "192.168.1.16";
device16.macAddress = "00:2d:ae:bf:d0:e1";
device16.manufacturer = "Belkin";
device16.price = 1100.0;
device16.deviceType = "Passive";

System.out.println("Device Id: " + device16.deviceId);
System.out.println("Device Name: " + device16.deviceName);
System.out.println("IP Address: " + device16.ipAddress);
System.out.println("MAC Address: " + device16.macAddress);
System.out.println("Manufacturer: " + device16.manufacturer);
System.out.println("Price: " + device16.price);
System.out.println("Device Type: " + device16.deviceType);
System.out.println();

NetworkDevice device17 = new NetworkDevice();
device17.deviceId = 17;
device17.deviceName = "Transceiver";
device17.ipAddress = "192.168.1.17";
device17.macAddress = "00:2e:bf:d0:e1:f2";
device17.manufacturer = "Finisar";
device17.price = 2200.0;
device17.deviceType = "Fiber";

System.out.println("Device Id: " + device17.deviceId);
System.out.println("Device Name: " + device17.deviceName);
System.out.println("IP Address: " + device17.ipAddress);
System.out.println("MAC Address: " + device17.macAddress);
System.out.println("Manufacturer: " + device17.manufacturer);
System.out.println("Price: " + device17.price);
System.out.println("Device Type: " + device17.deviceType);
System.out.println();

NetworkDevice device18 = new NetworkDevice();
device18.deviceId = 18;
device18.deviceName = "Network Camera";
device18.ipAddress = "192.168.1.18";
device18.macAddress = "00:2f:d0:e1:f2:03";
device18.manufacturer = "Axis";
device18.price = 5200.0;
device18.deviceType = "Surveillance";

System.out.println("Device Id: " + device18.deviceId);
System.out.println("Device Name: " + device18.deviceName);
System.out.println("IP Address: " + device18.ipAddress);
System.out.println("MAC Address: " + device18.macAddress);
System.out.println("Manufacturer: " + device18.manufacturer);
System.out.println("Price: " + device18.price);
System.out.println("Device Type: " + device18.deviceType);
System.out.println();

NetworkDevice device19 = new NetworkDevice();
device19.deviceId = 19;
device19.deviceName = "Network Printer";
device19.ipAddress = "192.168.1.19";
device19.macAddress = "00:30:e1:f2:03:14";
device19.manufacturer = "HP";
device19.price = 4500.0;
device19.deviceType = "Peripheral";

System.out.println("Device Id: " + device19.deviceId);
System.out.println("Device Name: " + device19.deviceName);
System.out.println("IP Address: " + device19.ipAddress);
System.out.println("MAC Address: " + device19.macAddress);
System.out.println("Manufacturer: " + device19.manufacturer);
System.out.println("Price: " + device19.price);
System.out.println("Device Type: " + device19.deviceType);
System.out.println();

NetworkDevice device20 = new NetworkDevice();
device20.deviceId = 20;
device20.deviceName = "Cloud Gateway";
device20.ipAddress = "192.168.1.20";
device20.macAddress = "00:31:f2:03:14:25";
device20.manufacturer = "AWS";
device20.price = 15000.0;
device20.deviceType = "Cloud";

System.out.println("Device Id: " + device20.deviceId);
System.out.println("Device Name: " + device20.deviceName);
System.out.println("IP Address: " + device20.ipAddress);
System.out.println("MAC Address: " + device20.macAddress);
System.out.println("Manufacturer: " + device20.manufacturer);
System.out.println("Price: " + device20.price);
System.out.println("Device Type: " + device20.deviceType);
System.out.println();



    }
}