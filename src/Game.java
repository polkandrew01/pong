import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

    private JFrame frame;
    private static Game game;
    
    public static void main(String[] args) {
	System.out.println("Staring main Game");
	game = new Game();
	game.mainMenuGui();
    }

    public void mainMenuGui() {
	frame = new JFrame();
	JPanel panel = new JPanel();
	panel.setBackground(Color.darkGray);

	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	
	//Create buttons and set listeners
	JButton button_new = new JButton("New Game");
	button_new.addActionListener(new NewGameListener());

	JButton button_hlp = new JButton("Help");
	button_hlp.addActionListener(new HelpListener());

	JButton button_ext = new JButton("Exit");
	button_ext.addActionListener(new ExitListener());

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	panel.add(BorderLayout.CENTER, button_new);
	panel.add(BorderLayout.CENTER, button_hlp);
	panel.add(BorderLayout.CENTER, button_ext);
	frame.getContentPane().add(panel);

	panel.setSize(100,100);
	frame.setSize(300,300);
	
	frame.setVisible(true);
    }

    class NewGameListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("New game button clicked");
	}
    }
	
    class HelpListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Help button clicked");	
	}
    }

    class ExitListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Exit button clicked");
		System.exit(0);	
	}
    }
}
