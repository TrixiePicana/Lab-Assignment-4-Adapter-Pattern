public class Valet implements HotelService //Service Class 1
{
    public void pickUpVehicle(String plateNumber)
    {
        //Request valet to pick up a vehicle with specific plate number accordingly.
    }

    @Override
    public void manageHotelServices()
    {
        pickUpVehicle("ABC1234");
    }
}
