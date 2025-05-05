class Division {
    private int NuM1;
    private int NuM2;

    public int getNuM1() {
        return NuM1;
    }

    public void setNuM1(int nuM1) {
        this.NuM1 = nuM1;
    }

    public int getNuM2() {
        return NuM2;
    }

    public void setNuM2(int nuM2) {
        this.NuM2 = nuM2;
    }

    public void divideNumbers() {
        try {
            double result = (double) NuM1 / NuM2;
            System.out.println(NuM1 + " / " + NuM2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

public class DivisionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();

        System.out.println("Enter two numbers starting from 10 downwards:");

        while (true) {
            System.out.print("Enter NuM1: ");
            int num1 = scanner.nextInt();
            division.setNuM1(num1);

            System.out.print("Enter NuM2: ");
            int num2 = scanner.nextInt();
            division.setNuM2(num2);

            if (num2 == 0) {
                System.out.println("Process terminated as NuM2 is 0.");
                break;
            }

            division.divideNumbers();
        }
    }
}