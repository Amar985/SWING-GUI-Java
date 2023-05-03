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

        //
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

        



    }

}
