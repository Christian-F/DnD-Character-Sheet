package nezandfish.dnd.charactersheet.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Interface extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTabbedPane tabbedPane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	
	public static void startInterface(){
		
	}

	public void createWindow(){
		setTitle("Character Sheet");
		setSize(1000,800);
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getContentPane().add(topPanel);
		
		//create the tabs
		/*
		genInfoTab();
		genStatsTab();
		genACItemsTab();
		genDomain-SchoolTab();
		genFeatsTab();
		genGearTab();
		genLevelTab();
		genMoneyTab();
		genSkillsTab();
		genSpellsTab();
		genWeaponsTab();
		*/
	}
	
}
