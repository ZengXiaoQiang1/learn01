package guistudy.swing01;

import javax.swing.*;
import java.awt.*;

/**
 * 定义窗体
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-8:48
 */
public class MyJFrame extends JFrame {
    MyJFrame(String jframeName){
        super(jframeName);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(new JLabel("Hello World"));
        container.add(new JButton("测试"));
    }
}
