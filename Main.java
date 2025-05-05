// Abstract class VisitorPass
abstract class VisitorPass {
    public abstract int calculateTicketPrice(int numberOfVisitors);
}

// Class VIPPass
class VIPPass extends VisitorPass {
    private final int pricePerPerson = 5000;

    @Override
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * pricePerPerson;
    }
}

// Class FamilyPass
class FamilyPass extends VisitorPass {
    private final int pricePerPerson = 3000;
    private final int discountPercentage = 10;

    @Override
    public int calculateTicketPrice(int numberOfVisitors) {
        int totalPrice = numberOfVisitors * pricePerPerson;
        if (numberOfVisitors >= 2) {
            totalPrice -= (totalPrice * discountPercentage) / 100;
        }
        return totalPrice;
    }
}

// Class GeneralPass
class GeneralPass extends VisitorPass {
    private final int pricePerPerson = 1000;

    @Override
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * pricePerPerson;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        int vipVisitors = 5;
        int familyVisitors = 4;
        int generalVisitors = 10;

        VisitorPass vipPass = new VIPPass();
        VisitorPass familyPass = new FamilyPass();
        VisitorPass generalPass = new GeneralPass();

        int vipPrice = vipPass.calculateTicketPrice(vipVisitors);
        System.out.println("VIP Pass: " + vipPrice + " PKR");

        int familyPrice = familyPass.calculateTicketPrice(familyVisitors);
        System.out.println("Family Pass: " + familyPrice + " PKR");

        int generalPrice = generalPass.calculateTicketPrice(generalVisitors);
        System.out.println("General Pass: " + generalPrice + " PKR");
    }
}
