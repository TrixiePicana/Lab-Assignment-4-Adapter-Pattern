public class HouseKeeping implements HotelService //Service Class 2
{
    public void cleanRoom(int roomNumber)
    {
        //Implement request to clean a specific room number accordingly.
    }

    @Override
    public void manageHotelServices()
    {

        cleanRoom(110);
    }
}
