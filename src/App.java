import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import UserInterface.FrameLogin;
import UserInterface.FrameTabla;

public class App {
    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrameTabla().setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
