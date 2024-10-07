public class HouseKeeping implements HotelService //Service Class 2
{
    public void cleanRoom(int roomNumber)
    {
        roomNumber = 110;
        System.out.println("Request to clean room number " + roomNumber);
    }

    @Override
    public void manageHotelServices()
    {
        cleanRoom(110);
    }
}
