package guistudy.swing03;

import javax.swing.*;

/**
 * main
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-13:03
 */
public class SwingDemo {
    private static void createAndShowGUI(){
        MyJFrame jFrame = new MyJFrame("new01");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,300);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
