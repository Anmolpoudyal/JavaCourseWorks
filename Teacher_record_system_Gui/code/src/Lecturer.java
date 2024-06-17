/**
 * This is a child class of the program.
 *
 * @author (Anmol Poudyal)
 * @version (2023/12/29)
 */

 public class Lecturer extends Teacher
 {
     private String department; 
     private int yearsOfExp; 
     private int gradedScore;
     private boolean hasGraded;
     
     public Lecturer(int teacherId,String teacherName,String address,String workType,String employeeStatus,String department,int yearsOfExp,int workingHr)
     {
        super(teacherId,teacherName,address,workType,employeeStatus);    //calling the constructor of the parent class 
        super.setWorkingHr(workingHr);                                      //calling the method which sets the valie of instance in parent class
        this.department =department;                                    //here this represents the instance of this class
        this.yearsOfExp= yearsOfExp;
        this.gradedScore= 12;
        this.hasGraded= false;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public int yearsOfExp()
    {
        return yearsOfExp;
    }
    
    public boolean hasGraded()
    {
        return hasGraded;
    }
    
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
    // this method grades the assignment according to the critearea provided by the coursework 
    public void  gradeAssignment(int gradedScore,String department,int yearsOfExp)  
    {
        if (yearsOfExp >= 5 )              
        {
            if(gradedScore>=70 || gradedScore<=100)
            {
                System.out.println("congratulation.... you have achived A");
                this.setGradedScore(gradedScore);
                this.hasGraded=true;
            }
            else if(gradedScore>=60)
            {
                System.out.println("congratulation.... you have achived B");
                this.setGradedScore(gradedScore);
                this.hasGraded=true;
            }
            else if(gradedScore>=50)
            {
                System.out.println("congratulation.... you have achived C");
                this.setGradedScore(gradedScore);
                this.hasGraded=true;
            }
            else if(gradedScore>=40)
            {
                System.out.println("congratulation.... you have achived D");
                this.setGradedScore(gradedScore);
                this.hasGraded=true;
             }
            else if(gradedScore<40)
            {
                 System.out.println("congratulation.... you have achived E");
                 this.setGradedScore(gradedScore);
                 this.hasGraded=true;
            }
            else
            {
                System.out.println("wrong entry");
            }
            
        }
        else
        {
            System.out.println("Grading failed only lecturer has the power to grade assignment");
        }
     }
     
    public void displayInfo()        // this method overwrites the method of the teacher class by displaying additional infos
     {
         super.displayInfo();          // this part calls the display method of the super class that is tesacher class
         System.out.println("the Department is "+department);
         System.out.println("the Years of experience is"+yearsOfExp);
         if (hasGraded == true) //here the boolean itself is compared for the understanding reason
         {
              System.out.println("the graded Score is "+gradedScore);
         }
         else
         {
             System.out.println("The assignment is not graded yet");
         }
     }   
 }
