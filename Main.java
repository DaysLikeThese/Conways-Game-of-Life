import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		final int DISPLAY_WIDTH = 800;
		final int DISPLAY_HEIGHT = 700;
		JFrame f = new JFrame();
		f.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		Display display = new Display(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Conway's Game of Life");
		f.add(display);
		f.setVisible(true);
	}
}
