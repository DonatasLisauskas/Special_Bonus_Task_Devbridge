public class Main {
    public static void main(String[] args) {
        try {
            Years.printBonusDatesBetween(1980,2020);
        } catch (InvalidYearsException ex) {
            ex.printStackTrace();
        }
    }
}
