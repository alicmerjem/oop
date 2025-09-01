package week12.presentation.adapter;

// european socket provides 220V
class EuropeanSocket {
    public int outputVoltage() {
        return 220;
    }
}

// a US device expects only 110V
class USDevice {
    public void plugIn(int voltage) {
        if(voltage == 110) {
            System.out.println("device running safely");
        } else {
            System.out.println("good job. you just blew up your device");
        }
    }
}

// adapter converts 220V to 110V
class VoltageAdapter {
    private EuropeanSocket socket;

    public VoltageAdapter(EuropeanSocket socket) {
        this.socket = socket;
    }

    public int getConvertedVoltage() {
        int originalVoltage = socket.outputVoltage();
        return originalVoltage / 2;
    }
}

// demo
class VoltageAdapterDemo {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        USDevice usDevice = new USDevice();

        System.out.println("Plugging device directly into European socket:");
        usDevice.plugIn(europeanSocket.outputVoltage()); // should fail

        System.out.println("\nPlugging device through Voltage Adapter:");
        VoltageAdapter adapter = new VoltageAdapter(europeanSocket);
        usDevice.plugIn(adapter.getConvertedVoltage()); // should work        
    }
}