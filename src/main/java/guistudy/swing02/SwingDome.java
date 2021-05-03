package guistudy.swing02;

import javax.swing.*;

/**
 * 主类
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-9:51
 */
public class SwingDome {
    private static void createAndShowGUI(){
        MyJFrame jFrame = new MyJFrame("time dome");
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
