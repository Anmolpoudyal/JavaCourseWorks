/**
 * This is a child class of the program.
 *
 * @author (Anmol Poudyal)
 * @version (2023/12/29)
 */
public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    public Tutor(int teacherId,String teacherName,String address,String workType,String employeeStatus,int workingHr,double salary,
    String specialization,String academicQualifications,int performanceIndex)
    {
        super(teacherId,teacherName,address,workType,employeeStatus);   //calling the super class constructor and initializing the values
        super.setWorkingHr(workingHr);
        this.salary=salary;
        this.specialization=specialization;
        this.academicQualifications=academicQualifications;
        this.performanceIndex=performanceIndex;
        this.isCertified=false;
        
    }
    public double getSalary()   //all the get method below are used to accesss instance variable 
    {
        return salary;
    }
    
    public String getSpecialization()
    {
        return specialization;
    }
    
    public String getAcademicQualifications()
    {
        return academicQualifications;
    }
    
    public int  getPerformanceIndex()
    {
        return  performanceIndex;
    }
    
    public boolean getIsCertified()
    {
        return isCertified;
    }
    
    public void setSalary(double Salary,int PerformanceIndex)   //this method sets the salary of the teacher according to course work critearea
    {
        
        if ( PerformanceIndex>=5 && getWorkingHr()>20 )
        {
            if (PerformanceIndex>=5 && PerformanceIndex<=7)
            {
                Salary = (Salary + ((5/100f)*Salary));
                  this.salary=Salary;
                  this.isCertified=true;
            }
            else if(PerformanceIndex>=8 && PerformanceIndex<=9)
            {
                Salary = (Salary + ((10/100f)*Salary));
                  this.salary=Salary;
                  this.isCertified=true;
            }
            else if(PerformanceIndex>10)
            {
                Salary = (Salary + ((20/100f)*Salary));
                  this.salary=Salary;
                  this.isCertified=true;
            }
            else
            {
                System.out.println("invalid result");
            }
        }
        else
        {
            System.out.println("your salary cannot be approved");
        }
        
    }
    public void removeTutor()   //this method removes the teacher if any of them are not certified 
    {
    
         if (isCertified == false)
         {
             this.salary= 0;
             this.specialization="";
             this.academicQualifications="";
             this.performanceIndex=0;
             System.out.println("removed successfully......Thank u");
             this.isCertified=false;
         }
    }
    public void displayInfo() // this method displays the information
    {
        super.displayInfo(); 

        if (isCertified)
        {
            System.out.println("The salary is " + salary);
            System.out.println("Specialized in " +specialization);
            System.out.println("Academic qualification " +academicQualifications);
            System.out.println("teachers performance index is  " +performanceIndex);
        }
    }
}