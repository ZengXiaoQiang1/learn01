package guistudy.swing01;

import javax.swing.*;

/**
 * 主类
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-8:55
 */
public class SwingDemo {
    private static void creatAndShowGUI(){
        MyJFrame myJFrame =new MyJFrame("Demo");
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setSize(400,300);
        myJFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatAndShowGUI();
            }
        });
    }

}
