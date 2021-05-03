package guistudy.swing04;

/**
 * main
 *
 * @author zengxiaoqiang
 * @create 2021-04-27-23:13
 */
public class SwingDemo {
    private static  void createAndShowGUI(){
        MyJFrame demo = new MyJFrame("demo");
        demo.setSize(500,300);
        demo.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()->{
            createAndShowGUI();
        });
    }
}
