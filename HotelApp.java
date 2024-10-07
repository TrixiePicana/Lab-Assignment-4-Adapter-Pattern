
public class HotelApp //Client class
{
    public static void main(String[] args)
    {

        //Create Services
        Valet valet = new Valet();
        FrontDesk frontDeskForValet = new FrontDesk(valet);

        HouseKeeping houseKeeping = new HouseKeeping();
        FrontDesk frontDeskForHousekeeping = new FrontDesk(houseKeeping);

        Cart cart = new Cart();
        FrontDesk frontDeskForLuggageCart = new FrontDesk(cart);

        //Delegate requests to the appropriate services.
        frontDeskForValet.delegateServices();
        frontDeskForHousekeeping.delegateServices();
        frontDeskForLuggageCart.delegateServices();

    }
}
