package guistudy;

import javax.swing.*;
import java.awt.*;

/**
 * oracle官网swing入门框架
 *
 * @author zengxiaoqiang
 * @create 2021-04-24-18:12
 */
public class HelloWorldSwing {

    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Hello worldSwing");//create and set up the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体时，退出程序
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello World");//add the ubiquitous(十分普遍的) "Hello World" label
        contentPane.add(label);//frame add content pan that label
        contentPane.add(new JButton("按钮"));
        contentPane.add(new JButton("按钮1"));
        frame.setSize(400,300);

        //frame.pack(); //display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
