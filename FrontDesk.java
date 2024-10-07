public class FrontDesk //Facade Class
{
    private Valet valet;
    public FrontDesk (Valet valet)
    {
        this.valet = valet;
    }

    private HouseKeeping houseKeeping;
    public FrontDesk (HouseKeeping houseKeeping)
    {
        this.houseKeeping = houseKeeping;
    }

    private Cart cart;
    public FrontDesk(Cart cart)
    {
        this.cart = cart;
    }

    public void delegateServices()
    {
        if (valet != null)
        {
            String plateNumber = "ABC1234";
            System.out.println("The valet picks up the vehicle with plate number " + plateNumber);
            valet.pickUpVehicle("ABC1234");
        }


        if (houseKeeping != null)
        {
            int roomNumber = 110;
            System.out.println("Request to clean room number " + roomNumber);
            houseKeeping.cleanRoom(110);
        }


        if (cart != null)
        {
            int numberOfCarts = 5;
            System.out.println("Request to carry " + numberOfCarts + " carts");
            cart.requestCart(5);
        }


    }
}