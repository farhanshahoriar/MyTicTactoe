package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameUI {
	private int curplr=0;
	public GameUI() {
		final Font btnfnt= new Font("Arial",Font.PLAIN, 36);
		JFrame frame1=new JFrame("Tic Tac Toe");
		frame1.setSize(280, 280);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLayout(new BorderLayout());
		frame1.setVisible(true);
		JPanel btnpnl=new JPanel();
		btnpnl.setLayout(new GridBagLayout());
		JButton [] btnr= {new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton("."),new JButton(".")};
		
		//JButton []btnr= new JButton[10];
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		for(int i=0;i<9;i++) {
			gbc.gridx=i%3;
			gbc.gridy=i/3;
			btnpnl.add(btnr[i],gbc);
			btnr[i].setFont(btnfnt);
		}
		
		btnr[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(curplr);
				if(curplr%2==0) {
					btnr[0].setText("X");
				}
				else {
					btnr[0].setText("O");
				}
				
				curplr++;
			}
		});
		
		btnr[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[1].setText("X");
				}
				else {
					btnr[1].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[2].setText("X");
				}
				else {
					btnr[2].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[3].setText("X");
				}
				else {
					btnr[3].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[4].setText("X");
				}
				else {
					btnr[4].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[5].setText("X");
				}
				else {
					btnr[5].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[6].setText("X");
				}
				else {
					btnr[6].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[7].setText("X");
				}
				else {
					btnr[7].setText("O");
				}
				curplr++;
			}
		});
		
		btnr[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(curplr%2==0) {
					btnr[8].setText("X");
				}
				else {
					btnr[8].setText("O");
				}
				curplr++;
			}
		});

	
		frame1.add(btnpnl);
	
		
		
	}
}
