import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;

public class TeacherGUI {

  private JTextField workingHrTf;
  private JTextField teacherNameTf;
  private JTextField teacherIdTf;
  private JTextField addressTf;
  private JTextField worktypeTf;
  private JTextField employeeStatusTf;
  private JTextField departmentTf;
  private JTextField gradedScoreTf;
  private JTextField yearsOfExperinceTf;
  private JTextField salaryTf;
  private JTextField specializationTf;
  private JTextField academicQualificationTf;
  private JTextField performanceIndex;
  private JFrame frame;
  private JButton addlecturer;
  private JTextField teacherIdGATextField;
  private JTextField gradedScoreGATextField;
  private JTextField departmentGATextField;
  private JTextField yearsOfexpGATextField;
  private JTextField dempartmentTF;

    JButton gradeAssignment;

    // instance var for the tutor panel section
  private JTextField teacheridTU;
  private JTextField teacherNameTU;
  private JTextField addressTU;
  private JTextField workTypeTU;
  private JTextField employementStatusTU;
  private JTextField workingHrTU;
  private JTextField salaryTU;
  private JTextField specializationTU;
  private JTextField acedemicQualificationTU;
  private JTextField performanceIndexTU;
  private JButton addTutorButton;

    // instance for setsalary
  private JTextField teacherIdSalary;
  private JTextField salarySalary;
  private JTextField performanceIndexSalary;
  private JButton setsalary;

    // instance remove tutor instance
  private JTextField teacehrIDTutor;
  private JButton removeTutor;

    // instances for the button
  private JButton clear;
  private JButton display;

    // array to store teachers object
    ArrayList<Teacher> teacherListArray = new ArrayList<>();

    // The methods are below:>>

    public TeacherGUI() {

        // for the main frame
        this.frame = new JFrame("Acedemic System");
        frame.setSize(1000, 750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBackground(Color.RED);

        // for the layout
        GridLayout lectureGridLayout = new GridLayout();
        lectureGridLayout.setColumns(2);
        lectureGridLayout.setRows(9);

        // gradeassignment lecturer panel lay out
        GridLayout gradeassignmenLayout = new GridLayout();
        gradeassignmenLayout.setColumns(2);
        gradeassignmenLayout.setRows(4);

        GridLayout tutoGridLayout = new GridLayout();
        tutoGridLayout.setColumns(2);
        tutoGridLayout.setRows(10);

        GridLayout setSalaGridLayout = new GridLayout();
        setSalaGridLayout.setColumns(2);
        setSalaGridLayout.setRows(3);

        // for the boarder line in panels
        Border teacherinputBorder = BorderFactory.createTitledBorder("ADD LECTURER"); // for lecturer panel
        Border gradeAssignmBorder = BorderFactory.createTitledBorder("GRADE ASSIGNMENT");// for gradeassignment panel
                                                                                         // panel
        Border tutorpanelborder = BorderFactory.createTitledBorder("ADD TUTOR");
        Border setsalaryBorder = BorderFactory.createTitledBorder("SET SALARY");
        Border removetutBorder = BorderFactory.createTitledBorder("REMOVE TUTOR");

        // for the toplable
        JLabel toplable = new JLabel("Acedemic System");
        frame.add(toplable);
        toplable.setBounds(400, 10, 250, 50);
        toplable.setFont(new Font("Verdana", Font.BOLD, 25));

        // panel for the lecturer
        JPanel teacherJPanel = new JPanel();
        frame.add(teacherJPanel);
        teacherJPanel.setBounds(70, 70, 400, 200);
        teacherJPanel.setLayout(lectureGridLayout);
        teacherJPanel.setBorder(teacherinputBorder);
        teacherJPanel.setBackground(Color.getHSBColor(134, 56, 50));

        // components for the addlecturer panel
        JLabel teacherId = new JLabel("Teacher ID");
        teacherJPanel.add(teacherId);

        this.teacherIdTf = new JTextField();
        teacherJPanel.add(teacherIdTf);

        JLabel workingHr = new JLabel("Working Hour");
        teacherJPanel.add(workingHr);

        this.workingHrTf = new JTextField();
        teacherJPanel.add(workingHrTf);

        JLabel teacherName = new JLabel("Teacher Name");
        teacherJPanel.add(teacherName);

        this.teacherNameTf = new JTextField();
        teacherJPanel.add(teacherNameTf);

        JLabel address = new JLabel("Address");
        teacherJPanel.add(address);

        this.addressTf = new JTextField();
        teacherJPanel.add(addressTf);

        JLabel workType = new JLabel("Work Type");
        teacherJPanel.add(workType);

        this.worktypeTf = new JTextField();
        teacherJPanel.add(worktypeTf);

        JLabel employeeStatus = new JLabel("Employee status");
        teacherJPanel.add(employeeStatus);

        this.employeeStatusTf = new JTextField();
        teacherJPanel.add(employeeStatusTf);

        JLabel gradedScore = new JLabel("Graded score");
        teacherJPanel.add(gradedScore);

        this.gradedScoreTf = new JTextField();
        teacherJPanel.add(gradedScoreTf);

        JLabel yearsofexp = new JLabel("Years of experience");
        teacherJPanel.add(yearsofexp);

        this.yearsOfExperinceTf = new JTextField();
        teacherJPanel.add(yearsOfExperinceTf);

        JLabel department = new JLabel("Department");
        teacherJPanel.add(department);

        this.dempartmentTF = new JTextField();
        teacherJPanel.add(dempartmentTF);

        // adding button for the add lecturer button
        this.addlecturer = new JButton("Add lecturer");
        frame.add(addlecturer);
        addlecturer.setBounds(190, 300, 150, 30);
        addlecturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLectureInfo();
            }
        });

        // panel for grade assignment
        JPanel gradeassignmentpanel = new JPanel();
        frame.add(gradeassignmentpanel);
        gradeassignmentpanel.setBounds(70, 350, 400, 300);
        gradeassignmentpanel.setBorder(gradeAssignmBorder);
        gradeassignmentpanel.setLayout(gradeassignmenLayout);
        gradeassignmentpanel.setBackground(Color.cyan);
        
        

        // adding components for the gradeassignment panels like,,,,gradedscore,teacher
        // id,deppartmnt,years of exp
        JLabel teacherIdGA = new JLabel("Teacher ID:");
        gradeassignmentpanel.add(teacherIdGA);

        this.teacherIdGATextField = new JTextField();
        gradeassignmentpanel.add(teacherIdGATextField);

        JLabel gradedScoreGA = new JLabel("Graded score");
        gradeassignmentpanel.add(gradedScoreGA);

        this.gradedScoreGATextField = new JTextField();
        gradeassignmentpanel.add(gradedScoreGATextField);

        JLabel departmentGA = new JLabel("Department");
        gradeassignmentpanel.add(departmentGA);

        this.departmentGATextField = new JTextField();
        gradeassignmentpanel.add(departmentGATextField);

        JLabel yearsofexpGA = new JLabel("Years of exp");
        gradeassignmentpanel.add(yearsofexpGA);

        this.yearsOfexpGATextField = new JTextField();
        gradeassignmentpanel.add(yearsOfexpGATextField);

        // adding button for the grade assignment
        this.gradeAssignment = new JButton("Grade assignment");
        frame.add(gradeAssignment);
        gradeAssignment.setBounds(190, 650, 150, 30);
        gradeAssignment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gradeAssignment();
            }
        });

        // panel for adding tutor

        JPanel tutorPanel = new JPanel();
        frame.add(tutorPanel);
        tutorPanel.setBounds(550, 75, 400, 200);
        tutorPanel.setBorder(tutorpanelborder);
        tutorPanel.setLayout(tutoGridLayout);
        tutorPanel.setBackground(Color.getHSBColor(134, 56, 50));

        // adding components for the tutor panel

        JLabel teacherIdJLabelTU = new JLabel("Teacher Id");
        tutorPanel.add(teacherIdJLabelTU);

        this.teacheridTU = new JTextField();
        tutorPanel.add(teacheridTU);

        JLabel teacherNameLabelTU = new JLabel("Teacher name ");
        tutorPanel.add(teacherNameLabelTU);

        this.teacherNameTU = new JTextField();
        tutorPanel.add(teacherNameTU);

        JLabel addressJLabelTU = new JLabel("Address");
        tutorPanel.add(addressJLabelTU);

        this.addressTU = new JTextField();
        tutorPanel.add(addressTU);

        JLabel workingtypeJLabelTU = new JLabel("Working type");
        tutorPanel.add(workingtypeJLabelTU);

        this.workTypeTU = new JTextField();
        tutorPanel.add(workTypeTU);

        JLabel employeeStatusJlableTU = new JLabel("Employeement Status");
        tutorPanel.add(employeeStatusJlableTU);

        this.employementStatusTU = new JTextField();
        tutorPanel.add(employementStatusTU);

        JLabel workinHrJLabelTU = new JLabel("Working Hr");
        tutorPanel.add(workinHrJLabelTU);

        this.workingHrTU = new JTextField();
        tutorPanel.add(workingHrTU);

        JLabel salaryJLabelTU = new JLabel("Salary");
        tutorPanel.add(salaryJLabelTU);

        this.salaryTU = new JTextField();
        tutorPanel.add(salaryTU);

        JLabel specializationtJLabelTU = new JLabel("Specialization");
        tutorPanel.add(specializationtJLabelTU);

        this.specializationTU = new JTextField();
        tutorPanel.add(specializationTU);

        JLabel academicqualificationJLabelTU = new JLabel("Academic Qualification");
        tutorPanel.add(academicqualificationJLabelTU);

        this.acedemicQualificationTU = new JTextField();
        tutorPanel.add(acedemicQualificationTU);

        JLabel performanceIndexJLabelTU = new JLabel("Performance Index");
        tutorPanel.add(performanceIndexJLabelTU);

        this.performanceIndexTU = new JTextField();
        tutorPanel.add(performanceIndexTU);

        // button for adding the tutor
            this.addTutorButton = new JButton("ADD Tutor");
            frame.add(addTutorButton);
            addTutorButton.setBounds(700, 300, 150, 30);
        addTutorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTutor();
            }
        });

        // panel for setsalary part
        JPanel setsalaryJPanel = new JPanel();
        frame.add(setsalaryJPanel);
        setsalaryJPanel.setBounds(500, 380, 200, 190);
        setsalaryJPanel.setBorder(setsalaryBorder);
        setsalaryJPanel.setLayout(setSalaGridLayout);
        setsalaryJPanel.setBackground(Color.MAGENTA);

        // set salary components
        JLabel teacheriDJPanelSalary = new JLabel("Teacher ID");
        setsalaryJPanel.add(teacheriDJPanelSalary);

        this.teacherIdSalary = new JTextField();
        setsalaryJPanel.add(teacherIdSalary);

        JLabel salarylJLabelsalary = new JLabel("Salary");
        setsalaryJPanel.add(salarylJLabelsalary);

        this.salarySalary = new JTextField();
        setsalaryJPanel.add(salarySalary);

        JLabel performanceIndexJLabelSalary = new JLabel("Perfoemance index");
        setsalaryJPanel.add(performanceIndexJLabelSalary);

        this.performanceIndexSalary = new JTextField();
        setsalaryJPanel.add(performanceIndexSalary);

        // button for setting slary
        this.setsalary = new JButton("SET SALARY");
        frame.add(setsalary);
        setsalary.setBounds(530, 580, 150, 30);
        setsalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSalary();
            }
        });

        // layout for remove tutor
        GridLayout removeGridLayout = new GridLayout();
        removeGridLayout.setColumns(2);
        removeGridLayout.setRows(1);

        // for the remove tutor
        JPanel removeTutJPanel = new JPanel();
        frame.add(removeTutJPanel);
        removeTutJPanel.setBounds(710, 410, 200, 100);
        removeTutJPanel.setBorder(removetutBorder);
        removeTutJPanel.setLayout(removeGridLayout);
        removeTutJPanel.setBackground(Color.getHSBColor(36, 65, 76));

        JLabel teacheridJPanelTutor = new JLabel("Teacher ID");
        removeTutJPanel.add(teacheridJPanelTutor);

        this.teacehrIDTutor = new JTextField();
        removeTutJPanel.add(teacehrIDTutor);

        // button for removing tutor
        this.removeTutor = new JButton("Remove tutor");
        frame.add(removeTutor);
        removeTutor.setBounds(730, 510, 150, 50);
        removeTutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeTutor();
            }
        });

        // Overall display button
        this.display = new JButton("Disply");
        frame.add(display);
        display.setBounds(600, 650, 150, 30);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display();
            }
        });

        frame.setVisible(true);

        // clear button
        this.clear = new JButton("Clear");
        frame.add(clear);
        clear.setBounds(750, 650, 150, 30);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearAllTextFields();
            }
        });
    }

    public void addLectureInfo() {
        try {
            int teacherId = convetToInt(getTextproper(teacherIdTf));
            String teacherName = getTextproper(teacherNameTf);
            String address = getTextproper(addressTf);
            String workingType = getTextproper(worktypeTf);
            String employmentStatus = getTextproper(employeeStatusTf);
            String department = getTextproper(dempartmentTF);
            int yearsOfExp = convetToInt(getTextproper(yearsOfExperinceTf));
            int workingHr = convetToInt(getTextproper(workingHrTf));
            if (!isIdUnique(teacherId)) {
                JOptionPane.showMessageDialog(frame, "Id already exist", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create a new Lecturer object
            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus, department,
                    yearsOfExp, workingHr);

            // Add the lecturer to the ArrayList of teachers
            teacherListArray.add(lecturer);

            // Optionally, display a message or perform other actions
            JOptionPane.showMessageDialog(frame, "Lecturer added successfully.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "Invalid entry 'teacherid,years of experience and working hours must be in numbers only'", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the fields", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    // this is for adding the tutor to the list
    public void addTutor() {
        try {
            int teacherID = convetToInt(getTextproper(teacheridTU));
            String teacherName = getTextproper(teacheridTU);
            String address = getTextproper(addressTU);
            String workType = getTextproper(workTypeTU);
            String employeeStatus = getTextproper(employementStatusTU);
            int workingHr = convetToInt(getTextproper(workingHrTU));
            int salary = convetToInt(getTextproper(salaryTU));
            String specialization = getTextproper(specializationTU);
            String academicQualifications = getTextproper(acedemicQualificationTU);
            int performanceIndex = convetToInt(getTextproper(performanceIndexTU));

            if (!isIdUnique(teacherID)) {
                JOptionPane.showMessageDialog(frame, "Id already exist", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Tutor tutor = new Tutor(teacherID, teacherName, address, workType, employeeStatus, workingHr, salary,
                    specialization, academicQualifications, performanceIndex);
            teacherListArray.add(tutor);// Add the tutor to the ArrayList of teachers
            // Optionally, display a message or perform other actions
            JOptionPane.showMessageDialog(frame, "tutor added successfully.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,
                    "hi please enter The teacherid,years of experience and working hours in numbers only", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the fields", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    // for converting integer from string in th field

    public int convetToInt(String text) {
        int intValue = Integer.parseInt(text);
        return intValue;
    }

    // this is for getting proprer trimed text from the textfield
    public String getTextproper(JTextField tf) {
        String text = tf.getText().trim();
        if (text.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return text;
    }

    /// this method is for the checking if id is unque or not in a list
    private boolean isIdUnique(int id) {
        for (Teacher teacher : teacherListArray) {
            if (teacher.getTeacherId() == id) {
                return false;
            }
        }
        return true;
    }

    private void gradeAssignment() {
        try {
            int teacherId = convetToInt(getTextproper(teacherIdGATextField));
            int gradedScore = convetToInt(getTextproper(gradedScoreGATextField));
            String department = getTextproper(departmentGATextField);
            int yearsOfExp = convetToInt(getTextproper(yearsOfexpGATextField));

            // to find check given teacher ID
            Teacher teacher = getTeacherById(teacherId);
            if (teacher == null) {
                JOptionPane.showMessageDialog(frame, "Teacher with ID " + teacherId + " not found.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (yearsOfExp < 5 ) {
                JOptionPane.showMessageDialog(frame, "need to have more than 5 yrs of experience", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the teacher is a lecturer
            if (!(teacher instanceof Lecturer)) {

                JOptionPane.showMessageDialog(frame, "Only lecturers can grade assignments.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                // after grading
                return;

            }

            Lecturer lecturer = (Lecturer) teacher;
            // Grade the assignment
            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure? \n ");
            if (choice == JOptionPane.OK_OPTION) {

                JOptionPane.showMessageDialog(frame, "Assignment graded successfully.");
                lecturer.gradeAssignment(gradedScore, department, yearsOfExp);
                return;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Only enter valid numeric values", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Fill all the fields", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    private Teacher getTeacherById(int id) {
        for (Teacher teacher : teacherListArray) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        return null; // Return null if teacher with the given ID is not found
    }

    // ((Tutor) teacher).getPerformanceIndex()
    public void setSalary() {

        try {
            int teacherId = convetToInt(getTextproper(teacherIdSalary));
            int salary = convetToInt(getTextproper(salarySalary));
            int performanceIndex = convetToInt(getTextproper(performanceIndexSalary));

            // Find the tutor in the teacherArrayList based on teacherId
            Tutor tutor = null;
            for (Teacher teacher : teacherListArray) {
                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                    tutor = (Tutor) teacher;
                    break;
                }
            }

            if (tutor == null) {
                JOptionPane.showMessageDialog(null, "Tutor not found with ID: " + teacherId, "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (performanceIndex < 5 || tutor.getWorkingHr() <= 20) {
                JOptionPane.showMessageDialog(frame,
                        "cannot set salary performance index must be greater than 5 and working hours must be greater than 20",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }

            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure? \n ");
            if (choice == JOptionPane.OK_OPTION) {

                JOptionPane.showMessageDialog(null, "Salary set successfully.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                tutor.setSalary(salary, performanceIndex);
                return;

            }

            tutor.setSalary(salary, performanceIndex);
            // after setting salary

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error: Invalid input. Please enter numeric values for salary and performance index.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void removeTutor() {

        try {
            int teacherId = convetToInt(getTextproper(teacehrIDTutor));
            Tutor tutor = null;
            for (Teacher teacher : teacherListArray) {
                if (teacher instanceof Tutor && teacher.getTeacherId() == teacherId) {
                    tutor = (Tutor) teacher;
                    break;
                }
            }

            if (tutor == null) {
                JOptionPane.showMessageDialog(null, "Tutor not found with ID: " + teacherId, "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (tutor.getIsCertified() == true) {
                JOptionPane.showMessageDialog(null, "Cannot remove a certified tutor", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Remove the tutor
            // teacherListArray.remove(tutor);
            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure? \n ");
            if (choice == JOptionPane.OK_OPTION) {
                tutor.removeTutor();
                teacherListArray.remove(tutor);
                JOptionPane.showMessageDialog(null, "Tutor removed successfully.", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

            } // choice
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error: Invalid input. Please enter valid teacher id", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // for clearing all the fields
    public void clearAllTextFields() {
        teacherIdTf.setText("");
        workingHrTf.setText("");
        teacherNameTf.setText("");
        addressTf.setText("");
        worktypeTf.setText("");
        employeeStatusTf.setText("");
        gradedScoreTf.setText("");
        yearsOfExperinceTf.setText("");
        dempartmentTF.setText("");

        teacherIdGATextField.setText("");
        gradedScoreGATextField.setText("");
        departmentGATextField.setText("");
        yearsOfexpGATextField.setText("");

        teacheridTU.setText("");
        teacherNameTU.setText("");
        addressTU.setText("");
        workTypeTU.setText("");
        employementStatusTU.setText("");
        workingHrTU.setText("");
        salaryTU.setText("");
        specializationTU.setText("");
        acedemicQualificationTU.setText("");
        performanceIndexTU.setText("");

        teacherIdSalary.setText("");
        salarySalary.setText("");
        performanceIndexSalary.setText("");

        teacehrIDTutor.setText("");
    }

    public void display() {
        for (Teacher teacher : teacherListArray) {
            teacher.displayInfo();
            System.out.println();
            JOptionPane.showMessageDialog(null, "Teacher Details in Terminal", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
