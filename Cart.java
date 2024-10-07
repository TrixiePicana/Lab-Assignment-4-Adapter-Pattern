public class Cart implements HotelService //Service Class 3
{
    public void requestCart(int numberOfCarts)
    {
        numberOfCarts = 5;
        System.out.println("Request to carry " + numberOfCarts + " carts");
    }

    @Override
    public void manageHotelServices()
    {
        requestCart(5);
    }
}
