package guistudy.swing04;

import javax.swing.*;
import java.awt.*;

/**
 * window
 *
 * @author zengxiaoqiang
 * @create 2021-04-27-22:50
 */
public class MyJFrame extends JFrame {

    JLabel jLabel;
    JTextField jTextField;
    JButton jButton;

    MyJFrame(String title){
        super(title);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        jLabel = new JLabel("文本");
        jLabel.setFont(new Font("宋体",1,14));
        jLabel.setForeground(Color.BLUE);
        contentPane.add(jLabel);
        jTextField = new JTextField(16);
        contentPane.add(jTextField);
        jButton = new JButton("确定");
        contentPane.add(jButton);
        jButton.addActionListener((e -> {
            toButton();
        }));

    }

    private void toButton() {

        String str = jTextField.getText();

        JOptionPane.showMessageDialog(this,"输入了"+str);
    }

}
