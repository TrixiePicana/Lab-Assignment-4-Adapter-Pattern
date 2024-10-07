public class Valet implements HotelService //Service Class 1
{
    public void pickUpVehicle(String plateNumber)
    {
        plateNumber = "ABC1234";
        System.out.println("The valet picks up the vehicle with plate number " + plateNumber);
    }

    @Override
    public void manageHotelServices()
    {
        pickUpVehicle("ABC123");
    }
}
