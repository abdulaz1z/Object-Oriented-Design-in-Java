import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
    private Customer customer;
    private List<Product> productList;

    public CustomerTransaction(Customer customer, List<Product> productList) {
        this.customer = customer;
        this.productList = productList;
    }

    @Override
    public void prepareInvoice() {
        System.out.println("preparing invoice");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charging customer");
    }

    @Override
    public void getName() {
        System.out.println("get customer name");
    }

    @Override
    public void getDate() {
        System.out.println("get date");
    }

    @Override
    public void getProductBreakdown() {
        System.out.println("get product breakdown");
    }
}

/*
main take away from this is to use interfaces to create separation
for different module needing different methods

*/

