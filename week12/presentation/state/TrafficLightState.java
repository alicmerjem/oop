package week12.presentation.state;

interface TrafficLightState {
    void showLight();
}

class RedLight implements TrafficLightState {
    public void showLight() {
        System.out.println("red light, stop now");
    }
}

class GreenLight implements TrafficLightState {
    public void showLight() {
        System.out.println("green light, go");
    }
}

class YellowLight implements TrafficLightState {
    public void showLight() {
        System.out.println("yellow light - slow down");
    }
}

// context class
class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(TrafficLightState state) {
        this.state = state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void showLight() {
        state.showLight();
    }
}

class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(new RedLight());

        trafficLight.showLight();  // Red
        trafficLight.setState(new GreenLight());
        trafficLight.showLight();  // Green
        trafficLight.setState(new YellowLight());
        trafficLight.showLight();  // Yellow
    }
}