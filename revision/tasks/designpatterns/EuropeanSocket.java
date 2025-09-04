package revision.tasks.designpatterns;

public interface EuropeanSocket {
    void provideElectricity();
}

class USPlug {
    public void connectToUSOutlet() {
        System.out.println("connected to us outlet");
    }
}

class SocketAdapter implements EuropeanSocket {
    private USPlug usPlug;

    public SocketAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    public void provideElectricity() {
        usPlug.connectToUSOutlet();
    }
}

class Main {
    public static void main(String[] args) {
        USPlug usPlug = new USPlug();
        EuropeanSocket adapter = new SocketAdapter(usPlug);
        adapter.provideElectricity();
    }
}