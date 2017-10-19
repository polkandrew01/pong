import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

    public static Color[] colors = {Color.white, Color.blue, Color.cyan, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.yellow};
    
    private JFrame frame;
    private JFrame helpFrame;
    private static Game game;
    
    public static void main(String[] args) {
	System.out.println("Staring main Game");
	game = new Game();
	game.mainMenuGui();
    }

    //Gui for main menu ----------------------------------------------------
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

    public void HelpGui() {
	helpFrame = new JFrame();
	JTextArea text = new JTextArea(10,20);
	JButton button = new JButton("Back");
	button.addActionListener(new HelpWListener());

	text.setLineWrap(true);
	text.setText("Player1 uses w and s. \nPlayer2 uses up and down arrows. \nUse space to start the ball moving");

	helpFrame.add(BorderLayout.SOUTH, button);
	helpFrame.add(BorderLayout.NORTH, text);
	helpFrame.setSize(300,300);
	
	helpFrame.setVisible(true);
    }

    //Button listeners ---------------------------------------------------
    class NewGameListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("New game button clicked");
	}
    }
	
    class HelpListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Help button clicked");
		frame.setVisible(false);
		game.HelpGui();
	}
    }

    class ExitListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("Exit button clicked");
		System.exit(0);	
	}
    }

    class HelpWListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
	    System.out.println("Help window back button clicked");
	    helpFrame.setVisible(false);
	}
    }
}
