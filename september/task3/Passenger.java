package september.task3;
import java.util.*;

interface Bookable {
    void bookTrip(String date, String destination);
    Optional<List<String>> getTripsByDate(String date);
}

interface Cancellable {
    void cancelTrip(String date, String destination);
    Optional<String> getLastCancelledTrip();
}

class Passenger implements Bookable, Cancellable {
    private String name;
    private Map<String, List<String>> bookedTrips;
    private String lastCancelled;

    public Passenger(String name) {
        this.name = name;
        this.bookedTrips = new HashMap<>();
        this.lastCancelled = lastCancelled;
    }

    @Override 
    public void bookTrip(String date, String destination) {
        if(!bookedTrips.containsKey(date)) {
            bookedTrips.put(date, new ArrayList<>());
        } else {
            bookedTrips.get(date).add(destination);
        }
    }

    @Override
    public Optional<List<String>> getTripsByDate(String date) {
        if(bookedTrips.containsKey(date)) {
            return Optional.of(bookedTrips.get(date));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void cancelTrip(String date, String destination) {
        if(bookedTrips.containsKey(date) && bookedTrips.get(date).contains(destination)) {
            bookedTrips.get(date).remove(destination);
            lastCancelled = destination;
        }
    }

    @Override
    public Optional<String> getLastCancelledTrip() {
        if(lastCancelled == null) {
            return Optional.empty();
        } else {
            return Optional.of(lastCancelled);
        }
    }
}
