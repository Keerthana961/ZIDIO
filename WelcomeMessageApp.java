import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeMessageApp 
{
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public WelcomeMessageApp() 
    {
        createGUI();
    }

    private void createGUI()
    {
        frame = new JFrame("Welcome Message App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Welcome to our application!");
            }
        });

        label = new JLabel("");

        frame.add(button);
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                new WelcomeMessageApp();
            }
        });
    }
}
