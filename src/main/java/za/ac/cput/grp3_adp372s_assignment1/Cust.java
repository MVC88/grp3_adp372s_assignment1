package za.ac.cput.grp3_adp372s_assignment1;

/*
* Muhammad Yaasin Cole
* 218340869
* */
public class Cust {

    private String custName;
    private static int orderID;
    private static String order;


    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public static int getOrderID() {
        return orderID;
    }

    public static void setOrderID(int orderID) {
        Cust.orderID = orderID;
    }

    public static String getOrder() {
        return order;
    }

    public static void setOrder(String order) {
        Cust.order = order;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "custName='" + custName + '\'' +
                '}';
    }
}
