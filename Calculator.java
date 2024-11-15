
public class Calculator {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        // Test cases
        testTaxCalculator("Ron", false, 34000, taxCalculator); // Test Case 1
        testTaxCalculator("Tim", true, 1000, taxCalculator);   // Test Case 2
        testTaxCalculator("Jack", true, 55000, taxCalculator); // Test Case 3
        testTaxCalculator("", true, 30000, taxCalculator);     // Test Case 4
    }

    private static void testTaxCalculator(String empName, boolean isIndian, double empSal, TaxCalculator taxCalculator) {
        try {
            double tax = taxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
