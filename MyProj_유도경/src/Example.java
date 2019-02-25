import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Example extends JFrame {
	
	/**
	 * 제품소프트웨어 패키징 시험용 클래스 
	 */
	private static final long serialVersionUID = 1L;
	public Example(String name) {		
		Toolkit t = Toolkit.getDefaultToolkit();
		this.setTitle("시험용 프로그램_"+name);
		int eWidth = (int)t.getScreenSize().getWidth();
		int eHeight = (int)t.getScreenSize().getHeight();
		this.setSize(eWidth/2,eHeight/2);
		int sx = eWidth/4;
		int sy = eHeight/4;
		Container con = this.getContentPane();
		JButton jbtn = new JButton(name);
		jbtn.setFont(new Font("굴림", Font.PLAIN, 40));		
		con.add(jbtn);
		this.setLocation(sx, sy);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//내부 출력 이름
		new Example("자바웹앱과정:유도경");
	}	
}
