class NetworkDevice {
    NetworkDevice() {
        System.out.println("Default NetworkDevice constructor invoked");
    }

    NetworkDevice(int networkId, String name, String type, double bandwidth, boolean isSecured) {
        this.networkId = networkId;
        this.name = name;
        this.type = type;
        this.bandwidth = bandwidth;
        this.isSecured = isSecured;
    }
	    int networkId;
    String name;
    String type;
    double bandwidth;
    boolean isSecured;
    void printNetworkDeviceInfo() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Bandwidth: " + bandwidth + " Mbps");
        System.out.println("Is Secured: " + isSecured);
        System.out.println();
    }
}
