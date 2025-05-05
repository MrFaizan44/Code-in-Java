// Interface Display with method show()
interface Display {
    void show();
}

// Aircraft interface extending Display
interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

// PassengerJet class
class PassengerJet implements Aircraft {
    private int rows;
    private int seatsPerRow;

    public PassengerJet(int rows, int seatsPerRow) {
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    @Override
    public String aircraftType() {
        return "Passenger Jet";
    }

    @Override
    public int calculateCapacity() {
        return rows * seatsPerRow;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Passenger Capacity: " + calculateCapacity());
    }
}

// CargoPlane class
class CargoPlane implements Aircraft {
    private double length;
    private double width;
    private static final double CONVERSION_FACTOR = 1.5; // Area to capacity estimate

    public CargoPlane(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String aircraftType() {
        return "Cargo Plane";
    }

    @Override
    public int calculateCapacity() {
        return (int)(length * width / CONVERSION_FACTOR);
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Estimated Equivalent Capacity: " + calculateCapacity());
    }
}

// PrivateJet class
class PrivateJet implements Aircraft {
    private int seats;

    public PrivateJet(int seats) {
        this.seats = seats;
    }

    @Override
    public String aircraftType() {
        return "Private Jet";
    }

    @Override
    public int calculateCapacity() {
        return seats;
    }

    @Override
    public void show() {
        System.out.println("Aircraft Type: " + aircraftType());
        System.out.println("Luxury Passenger Capacity: " + calculateCapacity());
    }
}

// Main class to run the application
public class AirlineManagement {
    public static void main(String[] args) {
        Aircraft passengerJet = new PassengerJet(30, 6);
        Aircraft cargoPlane = new CargoPlane(50, 10);
        Aircraft privateJet = new PrivateJet(12);

        System.out.println("=== Passenger Jet ===");
        passengerJet.show();

        System.out.println("\n=== Cargo Plane ===");
        cargoPlane.show();

        System.out.println("\n=== Private Jet ===");
        privateJet.show();
    }
}
