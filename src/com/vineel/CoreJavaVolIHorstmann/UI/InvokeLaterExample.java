package com.vineel.CoreJavaVolIHorstmann.UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vineel on 10/3/16.
 */

class SimpleFrame extends JFrame{
    private static int DEFAULT_WIDTH = 300;
    private static int DEFAULT_HEIGHT = 300;

    public SimpleFrame() throws HeadlessException {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class InvokeLaterExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleFrame sf = new SimpleFrame();
            sf.setVisible(true);
        });
    }
}
