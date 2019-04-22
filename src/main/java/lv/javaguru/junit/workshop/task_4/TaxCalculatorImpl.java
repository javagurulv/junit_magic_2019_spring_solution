package lv.javaguru.junit.workshop.task_4;

public class TaxCalculatorImpl implements TaxCalculator {

    private TaxRateFinder taxRateFinder;
    private EmailSender emailSender;

    public TaxCalculatorImpl(TaxRateFinder taxRateFinder,
                             EmailSender emailSender) {
        this.taxRateFinder = taxRateFinder;
        this.emailSender = emailSender;
    }

    @Override
    public double calculateTax(int year, double income) {
        if (income > 20000) {
            EmailInfo emailInfo = new EmailInfo(year, income);
            emailSender.sendEmail(emailInfo);
        }
        double taxRate = taxRateFinder.getTaxRate(year);
        return income * taxRate;
    }

}
