import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class GUI {
    int x = 0;
    public GUI() {
        JFrame frame = new JFrame();


        JButton button = new JButton("Click me!");
        button.addActionListener(e -> rickroll());
        button.setBackground(Color.RED);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBorderPainted(false);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("RoanHead.png"));

    }
    public void rickroll() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
