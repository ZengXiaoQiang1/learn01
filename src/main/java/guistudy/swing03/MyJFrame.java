package guistudy.swing03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间显示
 *
 * @author zengxiaoqiang
 * @create 2021-04-25-12:49
 */
public class MyJFrame extends JFrame {
    JButton jButton = new JButton("显示时间");
    JLabel jLabel = new JLabel("00:00:00");

    public MyJFrame(String title){
        super(title);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(jButton);
        contentPane.add(jLabel);
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                showTime();
            }
        };
//        jButton.addActionListener(actionListener);


        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTime();
            }
        });
        jLabel.setToolTipText("www.baidu.com");//鼠标放标签上会提示该设置
        jLabel.setFont(new Font("微软雅黑",1,13));//字体设置
        jLabel.setForeground(Color.blue);//字体颜色设置


    }

   private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            showTime();
        }
    }

    private void showTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String date = sdf.format(new Date());
        jLabel.setText(date);
    }
}
