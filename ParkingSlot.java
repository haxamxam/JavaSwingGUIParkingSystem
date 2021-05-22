
/**
 * The ParkingSlot class contains information about the spot id, if it is occupied, if it belongs to staff
 * It also contains a vehicle instance and LocalDateTime to add the vehicle and time to the spot.
 *
 * @author Hamza Suhail
 * @version 11.0.2, Date 11/04/2021, Student id: 102666611
 */
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ParkingSlot
{
    private String id;                                  // the id of the parkingslot
    private Vehicle vehicleInParkingSlot;               // vehicle instance
    private boolean isOccupied;                         // if parkingslot is occupied
    private boolean isStaff;                            // if parkingslot belongs to staff
    private LocalDateTime arrivalTime;                  // the arrival time
    
    
    /**
     * Constructor for Visitor ParkingSlot
     * By default it assigns isOccupied and isStaff to false.
     *
     * @param id of the parkingspot
     */
    
    public ParkingSlot(String sId)
    {
        this.id = sId;
        isOccupied = false;
        isStaff = false;
    }
    
    /**
     * Constructor for Staff ParkingSlot
     *
     * @param id of the parkingspot
     * @param isStaff boolean to assign staff
     */
    
    public ParkingSlot(String sId, boolean isStaff)
    {
        this.id = sId;
        isOccupied = false;
        this.isStaff = isStaff;
    }
    
    /**
     * Method to add visitor vehicle to parking spot
     * It sets occupied status to true.
     * It also sets isStaff to false.
     *
     * @param Vehicle vehicleInParkingSlot, the vehicle instance
     * 
     */
    
    
    public void addVisitorVehicle(Vehicle vehicleInParkingSlot)
    {
        this.vehicleInParkingSlot = vehicleInParkingSlot;
        isOccupied = true;
        isStaff = false;
        arrivalTime = LocalDateTime.now();
    }
    
    /**
     * Method to add staff vehicle to parking spot
     * It sets occupied status to true.
     * It also sets isStaff to true.
     *
     * @param Vehicle vehicleInParkingSlot, the vehicle instance
     * 
     */
    
    public void addStaffVehicle(Vehicle vehicleInParkingSlot)
    {
        this.vehicleInParkingSlot = vehicleInParkingSlot;
        isOccupied = true;
        isStaff = true;
        arrivalTime = LocalDateTime.now();
    }
    
    /**
     * Gets the id of the parkingslot
     *
     * @return id, the id of the parking slot
     * 
     */
    
    public String getParkingSlotId()
    {
        return id;
    }
    
    /**
     * Removes the vehicle from parking slot.
     * sets is occupied to false so other vehicles can park
     *
     * @return vehicleInParkingSlot, the instance of vehicle
     * 
     */
    
    public Vehicle removeVehicle()
    {
        isOccupied = false;
        return vehicleInParkingSlot;
    }
    
        
    /**
     * Gets the vehicle from parking slot.
     *
     * @return vehicleInParkingSlot, the instance of vehicle
     * 
     */
    
    public Vehicle getVehicle()
    {
        return vehicleInParkingSlot;
    }
    
    /**
     * Gets the occupied status of the parking slot.
     * Boolean returns true or false.
     *
     * @return isOccupied, the status of the parking slot,if it is occupied then true else false
     * 
     */
    
    
    public boolean getIsOccupied()
    {
        return isOccupied;
    }
    
    /**
     * Gets the status of parking slot, if it belongs to staff
     * Boolean returns true or false.
     *
     * @return isStaff, the status of the parking slot, if it belongs to staff then true else false
     * 
     */
    
    public boolean getIsStaff()
    {
        return isStaff;
    }
    
    /**
     * Setter if we want to change status of staff slot.
     * 
     * @param boolean isStaff, can be set to true or false
     * 
     */
    
    public void setStaff(boolean isStaff)
    {
        this.isStaff = isStaff;
    }
    
    /**
     * Gets the arrival time
     * 
     * @return arrivalTime, Vehicle arrival time
     * 
     */
    
    public LocalDateTime getArrivalTime()
    {
        return arrivalTime;
    }
    
    /**
     * Gives the details of the ParkingSlot
     * 
     * @return id, parkingslot id
     * @return isStaff, if belongs to staff then true else false
     * @return isOccupied, if vehicle parked then true else false
     */
    
    public String toString()
    {
        if(vehicleInParkingSlot != null)
        {  
          /* we check if it is a car instance  */
          if(vehicleInParkingSlot.getClass().isInstance(Car.class))
          { 
            return "ParkingSlot Id : "+id+"\nVehicle In ParkingSlot : "+((Car)vehicleInParkingSlot).getrego()+"\nStaff Slot : "+isStaff+"\nOccupied : "+(isOccupied?"Yes":"No")+"\nArrivalTime(atParkingSlot) : "+arrivalTime+"\n";
          }
        }         
        
        return"ParkingSlot Id : "+id+"\nStaffSlot : "+isStaff+"\nOccupied? : " + (isOccupied?"Yes\n":"No\n");
        
    }
}
