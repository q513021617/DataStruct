package DataStruct;
import java.awt.event.*;
import javax.swing.*;
 
public class JSliderDemo extends JFrame implements ActionListener{
    JSlider jsl;
    public JSliderDemo() {
        jsl = new JSlider(0,100,50);
        jsl.setMajorTickSpacing(20);//主刻度的间隔
        jsl.setPaintTicks(true);//显示刻度
        jsl.setPaintLabels(true);//显示刻度的文字
        JButton jb1 = new JButton("减小");
        jb1.setActionCommand("less");
        jb1.addActionListener(this);
        JButton jb2 = new JButton("增加");
        jb2.setActionCommand("more");
        jb2.addActionListener(this);
        JPanel jp = new JPanel();
        jp.add(jb1);
        jp.add(jsl);
        jp.add(jb2);
        add(jp);
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 100, 360, 120);
        setVisible(true);      
    }
    public static void main(String[] args) {
        new JSliderDemo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("less")){
            jsl.setValue(jsl.getValue()-1);//减少,每次减少一点,JSL移动一下
        }
        if(e.getActionCommand().equals("more")){//用线程增加
            Thread t = new Thread(new Runnable() {
                 
                @Override
                public void run() {
                    while(jsl.getValue()<100){
                        jsl.setValue(jsl.getValue()+1);//每次增加一点
                        try {
                            Thread.sleep(100);//100毫秒暂停
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
            t.start();//启动线程
        }
    }
}