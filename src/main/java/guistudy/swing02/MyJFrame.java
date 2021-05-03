package guistudy.swing02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 窗体
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-9:41
 */
public class MyJFrame extends JFrame {

    JLabel jLabel =new JLabel("00:00:00");
    JButton jButton =new JButton("显示时间：");

    public MyJFrame(String title){
        super(title);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jButton);
        container.add(jLabel);
        MyActionListener mal = new MyActionListener();
        jButton.addActionListener(mal);

    }

    private class MyActionListener implements ActionListener{

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            showTime();

        }
    }

    private void showTime(){
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
        String dft= sdf.format(new Date());
        jLabel.setText(dft);
    }


}
