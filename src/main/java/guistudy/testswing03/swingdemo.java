package guistudy.testswing03;

import javax.swing.*;

/**
 * main
 *
 * @author zengxiaoqiang
 * @create 2021-04-26-8:03
 */
public class swingdemo {

    private static void createAndShowGUI(){
        MyJFrame jFrame = new MyJFrame("GUIfortestswing03");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
