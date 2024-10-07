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
        valet.pickUpVehicle("ABC1234");
        houseKeeping.cleanRoom(110);
        cart.requestCart(5);
    }
}