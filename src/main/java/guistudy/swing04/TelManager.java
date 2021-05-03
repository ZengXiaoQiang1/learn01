package guistudy.swing04;

import javax.swing.*;

/**
 * df
 *
 * @author zengxiaoqiang
 * @create 2021-04-28-9:44
 */
public class TelManager {

   public static void main(String[] args) {
      JFrame jFrame = new JFrame("卡片显示");
      JTabbedPane jTabbedPane = new JTabbedPane();
      jTabbedPane.addTab("选项卡一", new JFrame());
      jTabbedPane.addTab("选项卡er", new JPanel());
      jTabbedPane.addTab("选项卡san", new JPanel());
      jFrame.add(jTabbedPane);
      jFrame.setSize(400,300);
      jFrame.setVisible(true);
   }


}

