public class HotelApp //Client class
{
    public static void main(String[] args)
    {
        //Create Services
        Valet valet = new Valet();
        FrontDesk frontDeskForValet = new FrontDesk(valet);

        HouseKeeping roomNumber = new HouseKeeping();
        FrontDesk frontDeskForHousekeeping = new FrontDesk(roomNumber);

        Cart numberOfCarts = new Cart();
        FrontDesk frontDeskForLuggageCart = new FrontDesk(numberOfCarts);

        //Delegate requests to the appropriate services.
        frontDeskForValet.delegateServices();
        frontDeskForHousekeeping.delegateServices();
        frontDeskForLuggageCart.delegateServices();

    }
}
