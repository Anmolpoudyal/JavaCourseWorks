/**
 * This is a parent class of the program.
 *
 * @author (Anmol Poudyal)
 * @version (2023/12/29)
 */
public class Teacher
{
   private int teacherId;
   private int workingHr;
   private String teacherName;
   private String address;
   private String workType;
   private String employeeStatus;
   //creating the constructor to inniatialize value
   public Teacher(int teacherId,String teacherName,String address,String workType,String employeeStatus)
   {
       this.teacherId = teacherId;
       this.teacherName = teacherName;
       this.address = address;
       this.workType = workType;
       this.employeeStatus = employeeStatus;
   }
   /* creating the getter metghod for every instances that are private which could be used to access when needed in other classes */
   public int getTeacherId()
   {
       return teacherId;
   }    
   
   public String getTeacherName()
   {
       return teacherName;
   }
   
   public String getAddress()
   {
       return address;
   } 
   
   public String getWorkType()
   {
       return workType;
   }
    
   public String getEmployeeStatus()
    {
        return employeeStatus;
    }
    
    public int getWorkingHr()
    {
        return workingHr;
    }

    public void setWorkingHr(int workingHr)
    {
        this.workingHr = workingHr;
    }
    
    public void displayInfo() //this method displays the values for the teaacher class
    {
        System.out.println("The allocated teacher_id is "+teacherId);
        System.out.println("The name of the teacher_name is "+teacherName);
        System.out.println("The teacher address is "+address);
        System.out.println("The working type of that particular teacher is "+ workType);
        System.out.println("The teacher is currently "+employeeStatus);
        if (workingHr == 0)          // if the worrking hr is 0 we assume that the working hr is not set yet
        {
            System.out.println(" oppps!! The working hour is not assigned yet ");    
        }
        else           
        {
            System.out.println("the working hour is "+workingHr);
        }
    }
}

