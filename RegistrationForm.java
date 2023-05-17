import java.awt.*;
import javax.swing.*;
 

public class Register {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500,100,500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        JLabel message=new JLabel("Register a new Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        frame.add(message);

        //Amar Kumar
        JLabel nameLabel=new JLabel("Name");
        JTextField nameField=new JTextField();
        frame.add(nameLabel);
        frame.add(nameField);

        JLabel genderLabel= new JLabel("Gender");
        JRadioButton genderMale= new JRadioButton("Male", true);
        JRadioButton genderFemale= new JRadioButton("Female");

        frame.add(genderLabel);
        frame.add(genderMale);
        frame.add(genderFemale);
        ButtonGroup genderGroup= new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        JLabel mobileNOLabel=new JLabel("Mobile No");
        JTextField mobileNoField=new JTextField();
        frame.add(mobileNOLabel);
        frame.add(mobileNoField);

        JLabel passwordLabel=new JLabel("Password");
        JLabel rePasswordLabel=new JLabel("Re Password");
        JPasswordField passwordField=new JPasswordField();
        JPasswordField rePasswordField=new JPasswordField();
        frame.add(passwordField);
        frame.add(passwordLabel);
        frame.add(rePasswordField);
        frame.add(rePasswordLabel);

        JLabel programLabel=new JLabel("Courses");
        JComboBox<String> programList=new JComboBox<String>();
        programList.addItem("ME/M Tech");
        programList.addItem("BE/B Tech");
        programList.addItem("Ph.D. ");
        frame.add(programList);
        frame.add(programLabel);

        JLabel branchLabel=new JLabel("Branch");
        JComboBox<String> branchList= new JComboBox<String>();
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Telecommunication");
        branchList.addItem("Information Technology");
        branchList.addItem("Electrical and Electronics Engineering");
        branchList.addItem("Electrical Engineering");
        branchList.addItem("Civil Engineering");
        frame.add(branchLabel);
        frame.add(branchList);

        JButton registration=new JButton("Register");
        frame.add(registration);

     
    

        message.setBounds(50,10,600,30);
        nameLabel.setBounds(50,60, 100, 30);
        nameField.setBounds(130, 60, 200 ,30);
        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240,160,100,30);
        mobileNOLabel.setBounds(50,260,100,30);
        mobileNoField.setBounds(130,260,200,30);
        passwordLabel.setBounds(50,310,100,30);
        passwordField.setBounds(130,310,200,30);
        rePasswordLabel.setBounds(50,360,100,30);
        rePasswordField.setBounds(130,360,200,30);
        programLabel.setBounds(50,410,100,30);
        programList.setBounds(130,410,200,30);
        branchLabel.setBounds(50,460,100,30);
        branchList.setBounds(130,460,200,30);
        registration.setBounds(130,550,200,30);



    }

}
