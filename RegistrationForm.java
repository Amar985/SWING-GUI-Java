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




    }

}
