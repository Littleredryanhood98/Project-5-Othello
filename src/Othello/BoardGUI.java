package Othello;

//this comment is to be able to push again 

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BoardGUI extends Board implements ActionListener {
	private static final GridLayout layout = new GridLayout(8,8);
	private static final String spacee = "\t \t";
	private static int choice = 0;
	private static int wait = 0;
	
	private JFrame window = new JFrame("Othello");
	private JTextArea space = new JTextArea(spacee, 1, 10);
	
	private static JButton button1 = new JButton();
	private static JButton button2 = new JButton();
	private static JButton button3 = new JButton();
	private static JButton button4 = new JButton();
	private static JButton button5 = new JButton();
	private static JButton button6 = new JButton();
	private static JButton button7 = new JButton();
	private static JButton button8 = new JButton();
	private static JButton button9 = new JButton();
	private static JButton button10 = new JButton();
	private static JButton button11 = new JButton();
	private static JButton button12 = new JButton();
	private static JButton button13 = new JButton();
	private static JButton button14 = new JButton();
	private static JButton button15 = new JButton();
	private static JButton button16 = new JButton();
	private static JButton button17 = new JButton();
	private static JButton button18 = new JButton();
	private static JButton button19 = new JButton();
	private static JButton button20 = new JButton();
	private static JButton button21 = new JButton();
	private static JButton button22 = new JButton();
	private static JButton button23 = new JButton();
	private static JButton button24 = new JButton();
	private static JButton button25 = new JButton();
	private static JButton button26 = new JButton();
	private static JButton button27 = new JButton();
	private static JButton button28 = new JButton();
	private static JButton button29 = new JButton();
	private static JButton button30 = new JButton();
	private static JButton button31 = new JButton();
	private static JButton button32 = new JButton();
	private static JButton button33 = new JButton();
	private static JButton button34 = new JButton();
	private static JButton button35 = new JButton();
	private static JButton button36 = new JButton();
	private static JButton button37 = new JButton();
	private static JButton button38 = new JButton();
	private static JButton button39 = new JButton();
	private static JButton button40 = new JButton();
	private static JButton button41 = new JButton();
	private static JButton button42 = new JButton();
	private static JButton button43 = new JButton();
	private static JButton button44 = new JButton();
	private static JButton button45 = new JButton();
	private static JButton button46 = new JButton();
	private static JButton button47 = new JButton();
	private static JButton button48 = new JButton();
	private static JButton button49 = new JButton();
	private static JButton button50 = new JButton();
	private static JButton button51 = new JButton();
	private static JButton button52 = new JButton();
	private static JButton button53 = new JButton();
	private static JButton button54 = new JButton();
	private static JButton button55 = new JButton();
	private static JButton button56 = new JButton();
	private static JButton button57 = new JButton();
	private static JButton button58 = new JButton();
	private static JButton button59 = new JButton();
	private static JButton button60 = new JButton();
	private static JButton button61 = new JButton();
	private static JButton button62 = new JButton();
	private static JButton button63 = new JButton();
	private static JButton button64 = new JButton();
	private static JButton button65 = new JButton();
	
	private static ArrayList<JButton> buttonList = new ArrayList<JButton>();
	
	public BoardGUI(){
		
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		space.setBackground(window.getBackground());
		window.setLayout(layout);
		
		buttonList.add(button1);
		buttonList.add(button2);
		buttonList.add(button3);
		buttonList.add(button4);
		buttonList.add(button5);
		buttonList.add(button6);
		buttonList.add(button7);
		buttonList.add(button8);
		buttonList.add(button9);
		buttonList.add(button10);
		buttonList.add(button11);
		buttonList.add(button12);
		buttonList.add(button13);
		buttonList.add(button14);
		buttonList.add(button15);
		buttonList.add(button16);
		buttonList.add(button17);
		buttonList.add(button18);
		buttonList.add(button19);
		buttonList.add(button20);
		buttonList.add(button21);
		buttonList.add(button22);
		buttonList.add(button23);
		buttonList.add(button24);
		buttonList.add(button25);
		buttonList.add(button26);
		buttonList.add(button27);
		buttonList.add(button28);
		buttonList.add(button29);
		buttonList.add(button30);
		buttonList.add(button31);
		buttonList.add(button32);
		buttonList.add(button33);
		buttonList.add(button34);
		buttonList.add(button35);
		buttonList.add(button36);
		buttonList.add(button37);
		buttonList.add(button38);
		buttonList.add(button39);
		buttonList.add(button40);
		buttonList.add(button41);
		buttonList.add(button42);
		buttonList.add(button43);
		buttonList.add(button44);
		buttonList.add(button45);
		buttonList.add(button46);
		buttonList.add(button47);
		buttonList.add(button48);
		buttonList.add(button49);
		buttonList.add(button50);
		buttonList.add(button51);
		buttonList.add(button52);
		buttonList.add(button53);
		buttonList.add(button54);
		buttonList.add(button55);
		buttonList.add(button56);
		buttonList.add(button57);
		buttonList.add(button58);
		buttonList.add(button59);
		buttonList.add(button60);
		buttonList.add(button61);
		buttonList.add(button62);
		buttonList.add(button63);
		buttonList.add(button64);
		
		for(int i = 0; i < buttonList.size(); i ++) {
			window.add(buttonList.get(i));
		}
		
		window.setVisible(true);
		
		//top left corner
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 1;
				button1.setEnabled(false);
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 2;
				button2.setEnabled(false);
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 3;
				button3.setEnabled(false);
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 4;
				button4.setEnabled(false);
			}
		});
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 5;
				button5.setEnabled(false);
			}
		});
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 6;
				button6.setEnabled(false);
			}
		});
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 7;
				button7.setEnabled(false);
			}
		});
//top right corner
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 8;
				button8.setEnabled(false);
			}
		});
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 9;
				button9.setEnabled(false);
			}
		});
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 10;
				button10.setEnabled(false);
			}
		});
		button11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 11;
				button11.setEnabled(false);
			}
		});
		button12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 12;
				button12.setEnabled(false);
			}
		});
		button13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 13;
				button13.setEnabled(false);
			}
		});
		button14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 14;
				button14.setEnabled(false);
			}
		});
		button15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 15;
				button15.setEnabled(false);
			}
		});
		button16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 16;
				button16.setEnabled(false);
			}
		});
		button17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 17;
				button17.setEnabled(false);
			}
		});
		button18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 18;
				button18.setEnabled(false);
			}
		});
		button19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 19;
				button19.setEnabled(false);
			}
		});
		button20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 20;
				button20.setEnabled(false);
			}
		});
		button21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 21;
				button21.setEnabled(false);
			}
		});
		button22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 22;
				button22.setEnabled(false);
			}
		});
		button23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 23;
				button23.setEnabled(false);
			}
		});
		button24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 24;
				button24.setEnabled(false);
			}
		});
		button25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 25;
				button25.setEnabled(false);
			}
		});
		button26.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 26;
				button26.setEnabled(false);
			}
		});
		button27.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 27;
				button27.setEnabled(false);
			}
		});
		button28.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 28;
				button28.setEnabled(false);
			}
		});
		button29.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 29;
				button29.setEnabled(false);
			}
		});
		button30.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 30;
				button30.setEnabled(false);
			}
		});
		button31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 31;
				button31.setEnabled(false);
			}
		});
		button32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 32;
				button32.setEnabled(false);
			}
		});
		button33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 33;
				button33.setEnabled(false);
			}
		});
		button34.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 34;
				button34.setEnabled(false);
			}
		});
		button35.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 35;
				button35.setEnabled(false);
			}
		});
		button36.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 36;
				button36.setEnabled(false);
			}
		});
		button37.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 37;
				button37.setEnabled(false);
			}
		});
		button38.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 38;
				button38.setEnabled(false);
			}
		});
		button39.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 39;
				button39.setEnabled(false);
			}
		});
		button40.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 40;
				button40.setEnabled(false);
			}
		});
		button41.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 41;
				button41.setEnabled(false);
			}
		});
		button42.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 42;
				button42.setEnabled(false);
			}
		});
		button43.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 43;
				button43.setEnabled(false);
			}
		});
		button44.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 44;
				button44.setEnabled(false);
			}
		});
		button45.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 45;
				button45.setEnabled(false);
			}
		});
		button46.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 46;
				button46.setEnabled(false);
			}
		});
		button47.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 47;
				button47.setEnabled(false);
			}
		});
		button48.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 48;
				button48.setEnabled(false);
			}
		});
		button49.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 49;
				button49.setEnabled(false);
			}
		});
		button50.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 50;
				button50.setEnabled(false);
			}
		});
		button51.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 51;
				button51.setEnabled(false);
			}
		});
		button52.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 52;
				button52.setEnabled(false);
			}
		});
		button53.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 53;
				button53.setEnabled(false);
			}
		});
		button54.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 54;
				button54.setEnabled(false);
			}
		});
		button55.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 55;
				button55.setEnabled(false);
			}
		});
		button56.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 56;
				button56.setEnabled(false);
			}
		});
		button57.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 57;	
				button57.setEnabled(false);
			}
		});
//bottom left corner
		button58.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 58;
				button58.setEnabled(false);
			}
		});
		button59.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 59;
				button59.setEnabled(false);
			}
		});
		button60.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 60;
				button60.setEnabled(false);
			}
		});
		button61.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 61;
				button61.setEnabled(false);
			}
		});
		button62.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 62;	
				button62.setEnabled(false);
			}
		});
		button63.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 63;
				button63.setEnabled(false);
			}
		});
		//bottom right corner
		button64.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				wait = 1; choice = 64;
				button64.setEnabled(false);
			}
		});
		
		}
	public void playerMove(int place, char type) {
		if(type == 'O') {
			for(int i = 1; i <= 64; i++) {
				if(place == i) {
					buttonList.get(i-1).setBackground(Color.WHITE);;
						}
					}
				}
		if(type == 'X') {
			for(int i = 1; i <= 64; i++) {
				if(place == i) {
					buttonList.get(i-1).setBackground(Color.BLACK);;
						}
					}
				}
	
		return;
	}
	public static int getInput() {
		choice = 0;
		while(choice == 0) {
			System.out.print("");
		}
		return choice;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
