
public class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal) 
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        if (empSal > 100000) {
            return empSal * 0.08; // 8%
        } else if (empSal >= 50000) {
            return empSal * 0.06; // 6%
        } else if (empSal >= 30000) {
            return empSal * 0.05; // 5%
        } else if (empSal >= 10000) {
            return empSal * 0.04; // 4%
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}
