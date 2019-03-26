package DataStruct;
import java.awt.event.*;
import javax.swing.*;
 
public class JSliderDemo extends JFrame implements ActionListener{
    JSlider jsl;
    public JSliderDemo() {
        jsl = new JSlider(0,100,50);
        jsl.setMajorTickSpacing(20);//���̶ȵļ��
        jsl.setPaintTicks(true);//��ʾ�̶�
        jsl.setPaintLabels(true);//��ʾ�̶ȵ�����
        JButton jb1 = new JButton("��С");
        jb1.setActionCommand("less");
        jb1.addActionListener(this);
        JButton jb2 = new JButton("����");
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
            jsl.setValue(jsl.getValue()-1);//����,ÿ�μ���һ��,JSL�ƶ�һ��
        }
        if(e.getActionCommand().equals("more")){//���߳�����
            Thread t = new Thread(new Runnable() {
                 
                @Override
                public void run() {
                    while(jsl.getValue()<100){
                        jsl.setValue(jsl.getValue()+1);//ÿ������һ��
                        try {
                            Thread.sleep(100);//100������ͣ
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            });
            t.start();//�����߳�
        }
    }
}