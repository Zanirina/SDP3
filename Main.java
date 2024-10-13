public class Main {
    public static void main(String[] args) {
        ShoppingFacade facade = new ShoppingFacade();

        String productID = "111";
        String paymentInfo = "490284242";
        String shippingAddress = "Kabanbaybatyra 33";

        facade.placeOrder(productID, paymentInfo, shippingAddress);
    }
}
