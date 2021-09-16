package duck;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing extends JFrame {
	private static final long serialVersionUID = 1L;

	private GridBagLayout 			gridBagLayout;
	private JTextArea 				textArea;
	private JComboBox<String> 		comboBox;
	private GridBagConstraints 		gbc_textArea, gbc_comboBox;
	private String[] 				strArr;
	
	// 생성자
	public Swing() {
		super("스윙 오리");
		
		this.init();
		this.setLayout();
		this.addListener();
		this.showFrame();
	}
	
	// 초기화
	private void init() {
		this.gridBagLayout 							= new GridBagLayout();
		this.gridBagLayout.columnWidths 			= new int[]{0, 0, 0};
		this.gridBagLayout.rowHeights 				= new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		this.gridBagLayout.columnWeights 			= new double[]{1.0, 1.0, Double.MIN_VALUE};
		this.gridBagLayout.rowWeights 				= new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		this.textArea 								= new JTextArea();
		this.gbc_textArea 							= new GridBagConstraints();
		this.gbc_textArea.gridheight 				= 11;
		this.gbc_textArea.gridwidth					= 2;
		this.gbc_textArea.insets 					= new Insets(0, 0, 5, 5);
		this.gbc_textArea.gridx 					= 0;
		this.gbc_textArea.gridy 					= 0;
		
		this.strArr 								= new String[] {"선택", "청둥오리", "빨간머리오리", "모형오리", "뮤트오리"};
		this.comboBox 								= new JComboBox<String>(this.strArr);
		this.gbc_comboBox 							= new GridBagConstraints();
		this.gbc_comboBox.gridwidth 				= 2;
		this.gbc_comboBox.fill 						= GridBagConstraints.HORIZONTAL;
		this.gbc_comboBox.gridx 					= 0;
		this.gbc_comboBox.gridy 					= 11;
	}
	
	// 구성요소 설정
	private void setLayout() {
		this.setLayout(gridBagLayout);
		this.textArea.setEditable(false);
		
		this.add(textArea, gbc_textArea);
		this.add(comboBox, gbc_comboBox);

	}
	
	// 콤보박스 배열에 각 오리들을 배치해서 특색이 있는 오리들을 불러 오는 코드
	private void addListener() {
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (comboBox.getSelectedIndex() == 1) {
					textArea.setText(new MallardDuck().toString());
				} else if (comboBox.getSelectedIndex() == 2) {
					textArea.setText(new RedheadDuck().toString());
				} else if (comboBox.getSelectedIndex() == 3) {
					textArea.setText(new DecoyDuck().toString());
				} else if (comboBox.getSelectedIndex() == 4) {
					textArea.setText(new MuteDuck().toString());
				}
			}
		});
	}
	
	// 프레임 창
	private void showFrame() {
		this.setSize(400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing();
	} //main
}
