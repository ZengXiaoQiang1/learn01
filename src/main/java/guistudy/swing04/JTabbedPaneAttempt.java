package guistudy.swing04;

import javax.swing.*;
import java.awt.*;

/**
 * window
 *
 * @author zengxiaoqiang
 * @create 2021-04-28-9:04
 */
public class JTabbedPaneAttempt {

    public static void main(String[] args) {
// 面板组件
        JPanel taskPanel = new JPanel();
        JPanel dbPanel = new JPanel();
        JTabbedPane tabbedPane = buildJTabbedPane(taskPanel, dbPanel);
        buildFrame(tabbedPane);
    }

    private static JTabbedPane buildJTabbedPane(JPanel taskPanel, JPanel dbPanel) {
// 选项卡面板
        JTabbedPane tabbedPane = new JTabbedPane();
// 通过BorderFactory来设置边框的特性
        tabbedPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tabbedPane.add("执行任务", taskPanel);
        tabbedPane.add("数据源配置", dbPanel);
        return tabbedPane;
    }

    private static void buildFrame(JComponent component) {
// 窗体容器
        JFrame frame = new JFrame("数据同步工具");
        frame.add(component);
// JFrame.EXIT_ON_CLOSE 退出
// JFrame.HIDE_ON_CLOSE 最小化隐藏
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
// 设置布局
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(BorderLayout.CENTER, component);
// 设置窗口最小尺寸
        frame.setMinimumSize(new Dimension(1060, 560));
// 调整此窗口的大小，以适合其子组件的首选大小和布局
        frame.pack();
// 设置窗口相对于指定组件的位置
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
// 设置窗口尺寸是否固定不变
        frame.setResizable(true);
    }
}





