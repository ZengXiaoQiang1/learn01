package guistudy.testswing03;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * window
 *
 * @author zengxiaoqiang
 * @create 2021-04-26-7:47
 */
public class MyJFrame extends JFrame {

    JButton jButton = new JButton("显示时间");
    JLabel jLabel = new JLabel("00:00:00");


   public MyJFrame(String title){
       super(title);
       Container contentPane =getContentPane();
       contentPane.setLayout(new FlowLayout());
       contentPane.add(jButton);
       contentPane.add(jLabel);
       jButton.addActionListener( (e)->{
           changejLabel();
       });



   }

    private void changejLabel() {
       SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
       String date = sdf.format(new Date());
       jLabel.setText(date);
    }

}
