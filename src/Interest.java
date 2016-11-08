import acm.program.*;

public class Interest extends ConsoleProgram {
    public void run() {
        double balance = readDouble("Enter balance:");
        double interest = readDouble("Enter interest:");
        double interestMultiplicator = 1 + interest / 100;
        for (int years = 0; years <= 2; years++) {
            println("Balance after " + years + " years: " + balance * Math.pow(interestMultiplicator, years));
        }
    }
}
