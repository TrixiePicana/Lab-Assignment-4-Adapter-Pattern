public class Cart implements HotelService //Service Class 3
{
    public void requestCart(int numberOfCarts)
    {
        //Implement request to handle specific number of carts accordingly.
    }

    @Override
    public void manageHotelServices()
    {
        requestCart(5);
    }
}
