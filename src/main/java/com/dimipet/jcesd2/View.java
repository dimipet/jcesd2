package com.dimipet.jcesd2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.apache.commons.codec.digest.DigestUtils;

public class View extends JPanel implements DocumentListener {

	private static final long serialVersionUID = 1L;

	private JComboBox<Integer> cmbAge;
	private JComboBox<String> cmbSex, cmbEdu;
	private JButton btnSubmit, btnCancel;
	private JMenuBar menuBar;
	private JMenu fileMenu, helpMenu;
	private JMenuItem resetMenuItem, randomMenuItem, exitMenuItem, aboutMenuItem;

	private JLabel lbl0, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15,
			lbl16, lbl17, lbl18, lbl19, lblAge, lblSex, lblEdu, lblA, lblB, lblC, lblD;

	private ButtonGroupExtended btnGrp0, btnGrp1, btnGrp2, btnGrp3, btnGrp4, btnGrp5, btnGrp6, btnGrp7, btnGrp8,
			btnGrp9, btnGrp10, btnGrp11, btnGrp12, btnGrp13, btnGrp14, btnGrp15, btnGrp16, btnGrp17, btnGrp18, btnGrp19;

	private JCheckBox chkBx0_0, chkBx0_1, chkBx0_2, chkBx0_3, chkBx1_0, chkBx1_1, chkBx1_2, chkBx1_3, chkBx2_0,
			chkBx2_1, chkBx2_2, chkBx2_3, chkBx3_0, chkBx3_1, chkBx3_2, chkBx3_3, chkBx4_0, chkBx4_1, chkBx4_2,
			chkBx4_3, chkBx5_0, chkBx5_1, chkBx5_2, chkBx5_3, chkBx6_0, chkBx6_1, chkBx6_2, chkBx6_3, chkBx7_0,
			chkBx7_1, chkBx7_2, chkBx7_3, chkBx8_0, chkBx8_1, chkBx8_2, chkBx8_3, chkBx9_0, chkBx9_1, chkBx9_2,
			chkBx9_3, chkBx10_0, chkBx10_1, chkBx10_2, chkBx10_3, chkBx11_0, chkBx11_1, chkBx11_2, chkBx11_3, chkBx12_0,
			chkBx12_1, chkBx12_2, chkBx12_3, chkBx13_0, chkBx13_1, chkBx13_2, chkBx13_3, chkBx14_0, chkBx14_1,
			chkBx14_2, chkBx14_3, chkBx15_0, chkBx15_1, chkBx15_2, chkBx15_3, chkBx16_0, chkBx16_1, chkBx16_2,
			chkBx16_3, chkBx17_0, chkBx17_1, chkBx17_2, chkBx17_3, chkBx18_0, chkBx18_1, chkBx18_2, chkBx18_3,
			chkBx19_0, chkBx19_1, chkBx19_2, chkBx19_3;

	private JTextField txtFld0, txtFld1, txtFld2, txtFld3, txtFld4, txtFld5, txtFld6, txtFld7, txtFld8, txtFld9,
			txtFld10, txtFld11, txtFld12, txtFld13, txtFld14, txtFld15, txtFld16, txtFld17, txtFld18, txtFld19,
			txtFldTestCode, txtFldSum;

	private List<JTextField> textFieldGroup;
	private List<ButtonGroupExtended> btnGrpExtList;

	public View() {

		init();

	}

	public void init() {
		setLayout(null);

		this.removeAll();
		this.revalidate();
		this.repaint();

		resetMenuItem = new JMenuItem();
		randomMenuItem = new JMenuItem();
		exitMenuItem = new JMenuItem();
		aboutMenuItem = new JMenuItem();
		resetMenuItem.setText("Reset");
		randomMenuItem.setText("Random");
		exitMenuItem.setText("Exit");
		aboutMenuItem.setText("About");

		fileMenu = new JMenu();
		helpMenu = new JMenu();
		fileMenu.setText("File");
		helpMenu.setText("Help");

		fileMenu.add(resetMenuItem);
		fileMenu.add(randomMenuItem);
		fileMenu.add(exitMenuItem);
		helpMenu.add(aboutMenuItem);

		menuBar = new JMenuBar();
		menuBar.setSize(600, 21);
		menuBar.setLocation(0, 0);
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		add(menuBar);

		cmbAge = new JComboBox<Integer>();
		cmbSex = new JComboBox<String>();
		cmbEdu = new JComboBox<String>();

		btnSubmit = new JButton();
		btnCancel = new JButton();

		lbl0 = new javax.swing.JLabel();
		lbl1 = new javax.swing.JLabel();
		lbl2 = new javax.swing.JLabel();
		lbl3 = new javax.swing.JLabel();
		lbl4 = new javax.swing.JLabel();
		lbl5 = new javax.swing.JLabel();
		lbl6 = new javax.swing.JLabel();
		lbl7 = new javax.swing.JLabel();
		lbl8 = new javax.swing.JLabel();
		lbl9 = new javax.swing.JLabel();
		lbl10 = new javax.swing.JLabel();
		lbl11 = new javax.swing.JLabel();
		lbl12 = new javax.swing.JLabel();
		lbl13 = new javax.swing.JLabel();
		lbl14 = new javax.swing.JLabel();
		lbl15 = new javax.swing.JLabel();
		lbl16 = new javax.swing.JLabel();
		lbl17 = new javax.swing.JLabel();
		lbl18 = new javax.swing.JLabel();
		lbl19 = new javax.swing.JLabel();
		lblAge = new javax.swing.JLabel();
		lblSex = new javax.swing.JLabel();
		lblEdu = new javax.swing.JLabel();
		lblA = new javax.swing.JLabel();
		lblB = new javax.swing.JLabel();
		lblC = new javax.swing.JLabel();
		lblD = new javax.swing.JLabel();

		btnGrp0 = new ButtonGroupExtended();
		btnGrp1 = new ButtonGroupExtended();
		btnGrp2 = new ButtonGroupExtended();
		btnGrp3 = new ButtonGroupExtended();
		btnGrp4 = new ButtonGroupExtended();
		btnGrp5 = new ButtonGroupExtended();
		btnGrp6 = new ButtonGroupExtended();
		btnGrp7 = new ButtonGroupExtended();
		btnGrp8 = new ButtonGroupExtended();
		btnGrp9 = new ButtonGroupExtended();
		btnGrp10 = new ButtonGroupExtended();
		btnGrp11 = new ButtonGroupExtended();
		btnGrp12 = new ButtonGroupExtended();
		btnGrp13 = new ButtonGroupExtended();
		btnGrp14 = new ButtonGroupExtended();
		btnGrp15 = new ButtonGroupExtended();
		btnGrp16 = new ButtonGroupExtended();
		btnGrp17 = new ButtonGroupExtended();
		btnGrp18 = new ButtonGroupExtended();
		btnGrp19 = new ButtonGroupExtended();

		chkBx0_0 = new javax.swing.JCheckBox();
		chkBx0_1 = new javax.swing.JCheckBox();
		chkBx0_2 = new javax.swing.JCheckBox();
		chkBx0_3 = new javax.swing.JCheckBox();
		chkBx1_0 = new javax.swing.JCheckBox();
		chkBx1_1 = new javax.swing.JCheckBox();
		chkBx1_2 = new javax.swing.JCheckBox();
		chkBx1_3 = new javax.swing.JCheckBox();
		chkBx2_0 = new javax.swing.JCheckBox();
		chkBx2_1 = new javax.swing.JCheckBox();
		chkBx2_2 = new javax.swing.JCheckBox();
		chkBx2_3 = new javax.swing.JCheckBox();
		chkBx3_0 = new javax.swing.JCheckBox();
		chkBx3_1 = new javax.swing.JCheckBox();
		chkBx3_2 = new javax.swing.JCheckBox();
		chkBx3_3 = new javax.swing.JCheckBox();
		chkBx4_0 = new javax.swing.JCheckBox();
		chkBx4_1 = new javax.swing.JCheckBox();
		chkBx4_2 = new javax.swing.JCheckBox();
		chkBx4_3 = new javax.swing.JCheckBox();
		chkBx5_0 = new javax.swing.JCheckBox();
		chkBx5_1 = new javax.swing.JCheckBox();
		chkBx5_2 = new javax.swing.JCheckBox();
		chkBx5_3 = new javax.swing.JCheckBox();
		chkBx6_0 = new javax.swing.JCheckBox();
		chkBx6_1 = new javax.swing.JCheckBox();
		chkBx6_2 = new javax.swing.JCheckBox();
		chkBx6_3 = new javax.swing.JCheckBox();
		chkBx7_0 = new javax.swing.JCheckBox();
		chkBx7_1 = new javax.swing.JCheckBox();
		chkBx7_2 = new javax.swing.JCheckBox();
		chkBx7_3 = new javax.swing.JCheckBox();
		chkBx8_0 = new javax.swing.JCheckBox();
		chkBx8_1 = new javax.swing.JCheckBox();
		chkBx8_2 = new javax.swing.JCheckBox();
		chkBx8_3 = new javax.swing.JCheckBox();
		chkBx9_0 = new javax.swing.JCheckBox();
		chkBx9_1 = new javax.swing.JCheckBox();
		chkBx9_2 = new javax.swing.JCheckBox();
		chkBx9_3 = new javax.swing.JCheckBox();
		chkBx10_0 = new javax.swing.JCheckBox();
		chkBx10_1 = new javax.swing.JCheckBox();
		chkBx10_2 = new javax.swing.JCheckBox();
		chkBx10_3 = new javax.swing.JCheckBox();
		chkBx11_0 = new javax.swing.JCheckBox();
		chkBx11_1 = new javax.swing.JCheckBox();
		chkBx11_2 = new javax.swing.JCheckBox();
		chkBx11_3 = new javax.swing.JCheckBox();
		chkBx12_0 = new javax.swing.JCheckBox();
		chkBx12_1 = new javax.swing.JCheckBox();
		chkBx12_2 = new javax.swing.JCheckBox();
		chkBx12_3 = new javax.swing.JCheckBox();
		chkBx13_0 = new javax.swing.JCheckBox();
		chkBx13_1 = new javax.swing.JCheckBox();
		chkBx13_2 = new javax.swing.JCheckBox();
		chkBx13_3 = new javax.swing.JCheckBox();
		chkBx14_0 = new javax.swing.JCheckBox();
		chkBx14_1 = new javax.swing.JCheckBox();
		chkBx14_2 = new javax.swing.JCheckBox();
		chkBx14_3 = new javax.swing.JCheckBox();
		chkBx15_0 = new javax.swing.JCheckBox();
		chkBx15_1 = new javax.swing.JCheckBox();
		chkBx15_2 = new javax.swing.JCheckBox();
		chkBx15_3 = new javax.swing.JCheckBox();
		chkBx16_0 = new javax.swing.JCheckBox();
		chkBx16_1 = new javax.swing.JCheckBox();
		chkBx16_2 = new javax.swing.JCheckBox();
		chkBx16_3 = new javax.swing.JCheckBox();
		chkBx17_0 = new javax.swing.JCheckBox();
		chkBx17_1 = new javax.swing.JCheckBox();
		chkBx17_2 = new javax.swing.JCheckBox();
		chkBx17_3 = new javax.swing.JCheckBox();
		chkBx18_0 = new javax.swing.JCheckBox();
		chkBx18_1 = new javax.swing.JCheckBox();
		chkBx18_2 = new javax.swing.JCheckBox();
		chkBx18_3 = new javax.swing.JCheckBox();
		chkBx19_0 = new javax.swing.JCheckBox();
		chkBx19_1 = new javax.swing.JCheckBox();
		chkBx19_2 = new javax.swing.JCheckBox();
		chkBx19_3 = new javax.swing.JCheckBox();

		chkBx0_0.setActionCommand("0");
		chkBx0_1.setActionCommand("1");
		chkBx0_2.setActionCommand("2");
		chkBx0_3.setActionCommand("3");
		chkBx1_0.setActionCommand("0");
		chkBx1_1.setActionCommand("1");
		chkBx1_2.setActionCommand("2");
		chkBx1_3.setActionCommand("3");
		chkBx2_0.setActionCommand("0");
		chkBx2_1.setActionCommand("1");
		chkBx2_2.setActionCommand("2");
		chkBx2_3.setActionCommand("3");
		chkBx3_0.setActionCommand("3");
		chkBx3_1.setActionCommand("2");
		chkBx3_2.setActionCommand("1");
		chkBx3_3.setActionCommand("0");
		chkBx4_0.setActionCommand("0");
		chkBx4_1.setActionCommand("1");
		chkBx4_2.setActionCommand("2");
		chkBx4_3.setActionCommand("3");
		chkBx5_0.setActionCommand("0");
		chkBx5_1.setActionCommand("1");
		chkBx5_2.setActionCommand("2");
		chkBx5_3.setActionCommand("3");
		chkBx6_0.setActionCommand("0");
		chkBx6_1.setActionCommand("1");
		chkBx6_2.setActionCommand("2");
		chkBx6_3.setActionCommand("3");
		chkBx7_0.setActionCommand("3");
		chkBx7_1.setActionCommand("2");
		chkBx7_2.setActionCommand("1");
		chkBx7_3.setActionCommand("0");
		chkBx8_0.setActionCommand("0");
		chkBx8_1.setActionCommand("1");
		chkBx8_2.setActionCommand("2");
		chkBx8_3.setActionCommand("3");
		chkBx9_0.setActionCommand("0");
		chkBx9_1.setActionCommand("1");
		chkBx9_2.setActionCommand("2");
		chkBx9_3.setActionCommand("3");
		chkBx10_0.setActionCommand("0");
		chkBx10_1.setActionCommand("1");
		chkBx10_2.setActionCommand("2");
		chkBx10_3.setActionCommand("3");
		chkBx11_0.setActionCommand("3");
		chkBx11_1.setActionCommand("2");
		chkBx11_2.setActionCommand("1");
		chkBx11_3.setActionCommand("0");
		chkBx12_0.setActionCommand("0");
		chkBx12_1.setActionCommand("1");
		chkBx12_2.setActionCommand("2");
		chkBx12_3.setActionCommand("3");
		chkBx13_0.setActionCommand("0");
		chkBx13_1.setActionCommand("1");
		chkBx13_2.setActionCommand("2");
		chkBx13_3.setActionCommand("3");
		chkBx14_0.setActionCommand("0");
		chkBx14_1.setActionCommand("1");
		chkBx14_2.setActionCommand("2");
		chkBx14_3.setActionCommand("3");
		chkBx15_0.setActionCommand("3");
		chkBx15_1.setActionCommand("2");
		chkBx15_2.setActionCommand("1");
		chkBx15_3.setActionCommand("0");
		chkBx16_0.setActionCommand("0");
		chkBx16_1.setActionCommand("1");
		chkBx16_2.setActionCommand("2");
		chkBx16_3.setActionCommand("3");
		chkBx17_0.setActionCommand("0");
		chkBx17_1.setActionCommand("1");
		chkBx17_2.setActionCommand("2");
		chkBx17_3.setActionCommand("3");
		chkBx18_0.setActionCommand("0");
		chkBx18_1.setActionCommand("1");
		chkBx18_2.setActionCommand("2");
		chkBx18_3.setActionCommand("3");
		chkBx19_0.setActionCommand("0");
		chkBx19_1.setActionCommand("1");
		chkBx19_2.setActionCommand("2");
		chkBx19_3.setActionCommand("3");

		btnGrp0.add(chkBx0_0);
		btnGrp0.add(chkBx0_1);
		btnGrp0.add(chkBx0_2);
		btnGrp0.add(chkBx0_3);
		btnGrp1.add(chkBx1_0);
		btnGrp1.add(chkBx1_1);
		btnGrp1.add(chkBx1_2);
		btnGrp1.add(chkBx1_3);
		btnGrp2.add(chkBx2_0);
		btnGrp2.add(chkBx2_1);
		btnGrp2.add(chkBx2_2);
		btnGrp2.add(chkBx2_3);
		btnGrp3.add(chkBx3_0);
		btnGrp3.add(chkBx3_1);
		btnGrp3.add(chkBx3_2);
		btnGrp3.add(chkBx3_3);
		btnGrp4.add(chkBx4_0);
		btnGrp4.add(chkBx4_1);
		btnGrp4.add(chkBx4_2);
		btnGrp4.add(chkBx4_3);
		btnGrp5.add(chkBx5_0);
		btnGrp5.add(chkBx5_1);
		btnGrp5.add(chkBx5_2);
		btnGrp5.add(chkBx5_3);
		btnGrp6.add(chkBx6_0);
		btnGrp6.add(chkBx6_1);
		btnGrp6.add(chkBx6_2);
		btnGrp6.add(chkBx6_3);
		btnGrp7.add(chkBx7_0);
		btnGrp7.add(chkBx7_1);
		btnGrp7.add(chkBx7_2);
		btnGrp7.add(chkBx7_3);
		btnGrp8.add(chkBx8_0);
		btnGrp8.add(chkBx8_1);
		btnGrp8.add(chkBx8_2);
		btnGrp8.add(chkBx8_3);
		btnGrp9.add(chkBx9_0);
		btnGrp9.add(chkBx9_1);
		btnGrp9.add(chkBx9_2);
		btnGrp9.add(chkBx9_3);
		btnGrp10.add(chkBx10_0);
		btnGrp10.add(chkBx10_1);
		btnGrp10.add(chkBx10_2);
		btnGrp10.add(chkBx10_3);
		btnGrp11.add(chkBx11_0);
		btnGrp11.add(chkBx11_1);
		btnGrp11.add(chkBx11_2);
		btnGrp11.add(chkBx11_3);
		btnGrp12.add(chkBx12_0);
		btnGrp12.add(chkBx12_1);
		btnGrp12.add(chkBx12_2);
		btnGrp12.add(chkBx12_3);
		btnGrp13.add(chkBx13_0);
		btnGrp13.add(chkBx13_1);
		btnGrp13.add(chkBx13_2);
		btnGrp13.add(chkBx13_3);
		btnGrp14.add(chkBx14_0);
		btnGrp14.add(chkBx14_1);
		btnGrp14.add(chkBx14_2);
		btnGrp14.add(chkBx14_3);
		btnGrp15.add(chkBx15_0);
		btnGrp15.add(chkBx15_1);
		btnGrp15.add(chkBx15_2);
		btnGrp15.add(chkBx15_3);
		btnGrp16.add(chkBx16_0);
		btnGrp16.add(chkBx16_1);
		btnGrp16.add(chkBx16_2);
		btnGrp16.add(chkBx16_3);
		btnGrp17.add(chkBx17_0);
		btnGrp17.add(chkBx17_1);
		btnGrp17.add(chkBx17_2);
		btnGrp17.add(chkBx17_3);
		btnGrp18.add(chkBx18_0);
		btnGrp18.add(chkBx18_1);
		btnGrp18.add(chkBx18_2);
		btnGrp18.add(chkBx18_3);
		btnGrp19.add(chkBx19_0);
		btnGrp19.add(chkBx19_1);
		btnGrp19.add(chkBx19_2);
		btnGrp19.add(chkBx19_3);

		btnGrpExtList = new ArrayList<ButtonGroupExtended>(Arrays.asList(btnGrp0, btnGrp1, btnGrp2, btnGrp3, btnGrp4,
				btnGrp5, btnGrp6, btnGrp7, btnGrp8, btnGrp9, btnGrp10, btnGrp11, btnGrp12, btnGrp13, btnGrp14, btnGrp15,
				btnGrp16, btnGrp17, btnGrp18, btnGrp19));

		chkBx0_0.setSelected(false);
		chkBx0_1.setSelected(false);
		chkBx0_2.setSelected(false);
		chkBx0_3.setSelected(false);
		chkBx1_0.setSelected(false);
		chkBx1_1.setSelected(false);
		chkBx1_2.setSelected(false);
		chkBx1_3.setSelected(false);
		chkBx2_0.setSelected(false);
		chkBx2_1.setSelected(false);
		chkBx2_2.setSelected(false);
		chkBx2_3.setSelected(false);
		chkBx3_0.setSelected(false);
		chkBx3_1.setSelected(false);
		chkBx3_2.setSelected(false);
		chkBx3_3.setSelected(false);
		chkBx4_0.setSelected(false);
		chkBx4_1.setSelected(false);
		chkBx4_2.setSelected(false);
		chkBx4_3.setSelected(false);
		chkBx5_0.setSelected(false);
		chkBx5_1.setSelected(false);
		chkBx5_2.setSelected(false);
		chkBx5_3.setSelected(false);
		chkBx6_0.setSelected(false);
		chkBx6_1.setSelected(false);
		chkBx6_2.setSelected(false);
		chkBx6_3.setSelected(false);
		chkBx7_0.setSelected(false);
		chkBx7_1.setSelected(false);
		chkBx7_2.setSelected(false);
		chkBx7_3.setSelected(false);
		chkBx8_0.setSelected(false);
		chkBx8_1.setSelected(false);
		chkBx8_2.setSelected(false);
		chkBx8_3.setSelected(false);
		chkBx9_0.setSelected(false);
		chkBx9_1.setSelected(false);
		chkBx9_2.setSelected(false);
		chkBx9_3.setSelected(false);
		chkBx10_0.setSelected(false);
		chkBx10_1.setSelected(false);
		chkBx10_2.setSelected(false);
		chkBx10_3.setSelected(false);
		chkBx11_0.setSelected(false);
		chkBx11_1.setSelected(false);
		chkBx11_2.setSelected(false);
		chkBx11_3.setSelected(false);
		chkBx12_0.setSelected(false);
		chkBx12_1.setSelected(false);
		chkBx12_2.setSelected(false);
		chkBx12_3.setSelected(false);
		chkBx13_0.setSelected(false);
		chkBx13_1.setSelected(false);
		chkBx13_2.setSelected(false);
		chkBx13_3.setSelected(false);
		chkBx14_0.setSelected(false);
		chkBx14_1.setSelected(false);
		chkBx14_2.setSelected(false);
		chkBx14_3.setSelected(false);
		chkBx15_0.setSelected(false);
		chkBx15_1.setSelected(false);
		chkBx15_2.setSelected(false);
		chkBx15_3.setSelected(false);
		chkBx16_0.setSelected(false);
		chkBx16_1.setSelected(false);
		chkBx16_2.setSelected(false);
		chkBx16_3.setSelected(false);
		chkBx17_0.setSelected(false);
		chkBx17_1.setSelected(false);
		chkBx17_2.setSelected(false);
		chkBx17_3.setSelected(false);
		chkBx18_0.setSelected(false);
		chkBx18_1.setSelected(false);
		chkBx18_2.setSelected(false);
		chkBx18_3.setSelected(false);
		chkBx19_0.setSelected(false);
		chkBx19_1.setSelected(false);
		chkBx19_2.setSelected(false);
		chkBx19_3.setSelected(false);

		txtFld0 = new javax.swing.JTextField();
		txtFld1 = new javax.swing.JTextField();
		txtFld2 = new javax.swing.JTextField();
		txtFld3 = new javax.swing.JTextField();
		txtFld4 = new javax.swing.JTextField();
		txtFld5 = new javax.swing.JTextField();
		txtFld6 = new javax.swing.JTextField();
		txtFld7 = new javax.swing.JTextField();
		txtFld8 = new javax.swing.JTextField();
		txtFld9 = new javax.swing.JTextField();
		txtFld10 = new javax.swing.JTextField();
		txtFld11 = new javax.swing.JTextField();
		txtFld12 = new javax.swing.JTextField();
		txtFld13 = new javax.swing.JTextField();
		txtFld14 = new javax.swing.JTextField();
		txtFld15 = new javax.swing.JTextField();
		txtFld16 = new javax.swing.JTextField();
		txtFld17 = new javax.swing.JTextField();
		txtFld18 = new javax.swing.JTextField();
		txtFld19 = new javax.swing.JTextField();
		txtFldTestCode = new javax.swing.JTextField();
		txtFldSum = new javax.swing.JTextField();

		textFieldGroup = new ArrayList<JTextField>(Arrays.asList(txtFld0, txtFld1, txtFld2, txtFld3, txtFld4, txtFld5,
				txtFld6, txtFld7, txtFld8, txtFld9, txtFld10, txtFld11, txtFld12, txtFld13, txtFld14, txtFld15,
				txtFld16, txtFld17, txtFld18, txtFld19));

		lbl0.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl2.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl3.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl4.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl5.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl6.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl7.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl8.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl9.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl10.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl11.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl12.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl13.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl14.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl15.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl16.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl17.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl18.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lbl19.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblA.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblB.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblC.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblD.setFont(new Font("Monospaced", Font.PLAIN, 11));

		txtFld0.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld2.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld3.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld4.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld5.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld6.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld7.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld8.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld9.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld10.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld11.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld12.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld13.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld14.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld15.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld16.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld17.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld18.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFld19.setFont(new Font("Monospaced", Font.PLAIN, 11));

		txtFld0.setEnabled(false);
		txtFld1.setEnabled(false);
		txtFld2.setEnabled(false);
		txtFld3.setEnabled(false);
		txtFld4.setEnabled(false);
		txtFld5.setEnabled(false);
		txtFld6.setEnabled(false);
		txtFld7.setEnabled(false);
		txtFld8.setEnabled(false);
		txtFld9.setEnabled(false);
		txtFld10.setEnabled(false);
		txtFld11.setEnabled(false);
		txtFld12.setEnabled(false);
		txtFld13.setEnabled(false);
		txtFld14.setEnabled(false);
		txtFld15.setEnabled(false);
		txtFld16.setEnabled(false);
		txtFld17.setEnabled(false);
		txtFld18.setEnabled(false);
		txtFld19.setEnabled(false);

		txtFldSum.setBounds(10, 30, 30, 30);
		txtFldTestCode.setBounds(40, 30, 500, 30);
		txtFldTestCode.setEnabled(false);
		txtFldSum.setEnabled(false);


		lblAge.setBounds(10, 65, 25, 30);
		lblAge.setText("Age");
		for (int i = 14; i <= 99; i++) {
			cmbAge.addItem(i);
		}
		cmbAge.setBounds(35, 65, 40, 30);

		lblSex.setBounds(80, 65, 30, 30);
		lblSex.setText("Φύλο");
		cmbSex.addItem("Αρσενικό");
		cmbSex.addItem("Θυληκό");
		cmbSex.setBounds(110, 65, 90, 30);

		lblEdu.setBounds(205, 65, 75, 30);
		lblEdu.setText("Εκπαίδευση");
		cmbEdu.addItem("ΑΕΙ/ΤΕΙ");
		cmbEdu.addItem("Μεταπτυχιακό");
		cmbEdu.addItem("Διδακτορικό");
		cmbEdu.addItem("Λύκειο");
		cmbEdu.addItem("Γυμνάσιο");
		cmbEdu.addItem("Δημοτικό");
		cmbEdu.setBounds(280, 65, 90, 30);
		
		btnCancel.setBounds(380, 65, 80, 30);
		btnCancel.setText("Reset");
		btnSubmit.setBounds(455, 65, 80, 30);
		btnSubmit.setText("Submit");

		
		txtFldSum.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtFldTestCode.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblAge.setFont(new Font("Monospaced", Font.PLAIN, 11));
		cmbAge.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblSex.setFont(new Font("Monospaced", Font.PLAIN, 11));
		cmbSex.setFont(new Font("Monospaced", Font.PLAIN, 11));
		lblEdu.setFont(new Font("Monospaced", Font.PLAIN, 11));
		cmbEdu.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnCancel.setFont(new Font("Monospaced", Font.PLAIN, 11));
		btnSubmit.setFont(new Font("Monospaced", Font.PLAIN, 11));

		txtFldSum.setVisible(false);
		txtFldTestCode.setVisible(false);
		lblAge.setVisible(false);
		cmbAge.setVisible(false);
		lblSex.setVisible(false);
		cmbSex.setVisible(false);
		lblEdu.setVisible(false);
		cmbEdu.setVisible(false);
		btnCancel.setVisible(false);
		btnSubmit.setVisible(false);

		add(txtFldSum);
		add(txtFldTestCode);
		add(lblAge);
		add(cmbAge);
		add(lblSex);
		add(cmbSex);
		add(lblEdu);
		add(cmbEdu);
		add(btnCancel);
		add(btnSubmit);
		
		

		int x, y, lblW, lblH, chBoxW, chBoxH, txtW, txtH;
		x = 10;
		y = 110;
		lblW = 360;
		lblH = 30;
		chBoxW = 30;
		chBoxH = 30;
		txtW = 30;
		txtH = 30;

		int snap1, snap2, snap3, snap4, snap5;
		snap1 = 370;
		snap2 = 400;
		snap3 = 430;
		snap4 = 460;
		snap5 = 490;

		lbl0.setBounds(x, y, lblW, lblH);
		lbl0.setText("<html>Ενοχλούμουν από πράγματα που συνήθως δεν ενοχλούμαι<html>");
		chkBx0_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx0_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx0_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx0_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld0.setBounds(x + snap5, y, txtW, txtH);
		add(lbl0);
		add(chkBx0_0);
		add(chkBx0_1);
		add(chkBx0_2);
		add(chkBx0_3);
		add(txtFld0);

		y = y + 35;
		lbl1.setBounds(x, y, lblW, lblH);
		lbl1.setText("<html>Δεν είχα όρεξη για φαγητό. Είχα κακή όρεξη για φαγητό<html>");
		chkBx1_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx1_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx1_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx1_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld1.setBounds(x + snap5, y, txtW, txtH);
		add(lbl1);
		add(chkBx1_0);
		add(chkBx1_1);
		add(chkBx1_2);
		add(chkBx1_3);
		add(txtFld1);

		y = y + 35;
		lbl2.setBounds(x, y, lblW, lblH);
		lbl2.setText(
				"<html>Αισθανόμουν ότι δεν μπορούσα να ξεφύγω από την στενοχώρια μου, ακόμα και με βοήθεια των γύρω μου<html>");
		chkBx2_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx2_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx2_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx2_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld2.setBounds(x + snap5, y, txtW, txtH);
		add(lbl2);
		add(chkBx2_0);
		add(chkBx2_1);
		add(chkBx2_2);
		add(chkBx2_3);
		add(txtFld2);

		y = y + 35;
		lbl3.setBounds(x, y, lblW, lblH);
		lbl3.setText("<html>Αισθανόμουν τόσο καλά όσο και οι υπόλοιποι<html>");
		chkBx3_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx3_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx3_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx3_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld3.setBounds(x + snap5, y, txtW, txtH);
		add(lbl3);
		add(chkBx3_0);
		add(chkBx3_1);
		add(chkBx3_2);
		add(chkBx3_3);
		add(txtFld3);

		y = y + 35;
		lbl4.setBounds(x, y, lblW, lblH);
		lbl4.setText("<html>Είχα προβλήματα να συμμαζέψω την σκέψη μου σε αυτό που έκανα<html>");
		chkBx4_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx4_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx4_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx4_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld4.setBounds(x + snap5, y, txtW, txtH);
		add(lbl4);
		add(chkBx4_0);
		add(chkBx4_1);
		add(chkBx4_2);
		add(chkBx4_3);
		add(txtFld4);

		y = y + 35;
		lbl5.setBounds(x, y, lblW, lblH);
		lbl5.setText("<html>Αισθανόμουν κατάθλιψη<html>");
		chkBx5_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx5_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx5_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx5_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld5.setBounds(x + snap5, y, txtW, txtH);
		add(lbl5);
		add(chkBx5_0);
		add(chkBx5_1);
		add(chkBx5_2);
		add(chkBx5_3);
		add(txtFld5);

		y = y + 35;
		lbl6.setBounds(x, y, lblW, lblH);
		lbl6.setText("<html>Αισθανόμουν ότι όλα όσα έκανα ήθελαν πολύ προσπάθεια<html>");
		chkBx6_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx6_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx6_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx6_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld6.setBounds(x + snap5, y, txtW, txtH);
		add(lbl6);
		add(chkBx6_0);
		add(chkBx6_1);
		add(chkBx6_2);
		add(chkBx6_3);
		add(txtFld6);

		y = y + 35;
		lbl7.setBounds(x, y, lblW, lblH);
		lbl7.setText("<html>Αισθανόμουν αισιόδοξος για το μέλλον<html>");
		chkBx7_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx7_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx7_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx7_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld7.setBounds(x + snap5, y, txtW, txtH);
		add(lbl7);
		add(chkBx7_0);
		add(chkBx7_1);
		add(chkBx7_2);
		add(chkBx7_3);
		add(txtFld7);

		y = y + 35;
		lbl8.setBounds(x, y, lblW, lblH);
		lbl8.setText("<html>Αισθανόμουν ότι η ζωή μου ήταν μια αποτυχία<html>");
		chkBx8_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx8_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx8_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx8_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld8.setBounds(x + snap5, y, txtW, txtH);
		add(lbl8);
		add(chkBx8_0);
		add(chkBx8_1);
		add(chkBx8_2);
		add(chkBx8_3);
		add(txtFld8);

		y = y + 35;
		lbl9.setBounds(x, y, lblW, lblH);
		lbl9.setText("<html>Φοβόμουν<html>");
		chkBx9_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx9_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx9_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx9_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld9.setBounds(x + snap5, y, txtW, txtH);
		add(lbl9);
		add(chkBx9_0);
		add(chkBx9_1);
		add(chkBx9_2);
		add(chkBx9_3);
		add(txtFld9);

		y = y + 35;
		lbl10.setBounds(x, y, lblW, lblH);
		lbl10.setText("<html>Είχα ανήσυχο ύπνο / ύπνο που δεν με ξεκούραζε<html>");
		chkBx10_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx10_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx10_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx10_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld10.setBounds(x + snap5, y, txtW, txtH);
		add(lbl10);
		add(chkBx10_0);
		add(chkBx10_1);
		add(chkBx10_2);
		add(chkBx10_3);
		add(txtFld10);

		y = y + 35;
		lbl11.setBounds(x, y, lblW, lblH);
		lbl11.setText("<html>Αισθανόμουν δυστυχισμένος<html>");
		chkBx11_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx11_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx11_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx11_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld11.setBounds(x + snap5, y, txtW, txtH);
		add(lbl11);
		add(chkBx11_0);
		add(chkBx11_1);
		add(chkBx11_2);
		add(chkBx11_3);
		add(txtFld11);

		y = y + 35;
		lbl12.setBounds(x, y, lblW, lblH);
		lbl12.setText("<html>Μιλούσα λιγότερο από όσο μιλάω κανονικά<html>");
		chkBx12_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx12_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx12_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx12_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld12.setBounds(x + snap5, y, txtW, txtH);
		add(lbl12);
		add(chkBx12_0);
		add(chkBx12_1);
		add(chkBx12_2);
		add(chkBx12_3);
		add(txtFld12);

		y = y + 35;
		lbl13.setBounds(x, y, lblW, lblH);
		lbl13.setText("<html>Αισθανόμουν μόνος<html>");
		chkBx13_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx13_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx13_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx13_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld13.setBounds(x + snap5, y, txtW, txtH);
		add(lbl13);
		add(chkBx13_0);
		add(chkBx13_1);
		add(chkBx13_2);
		add(chkBx13_3);
		add(txtFld13);

		y = y + 35;
		lbl14.setBounds(x, y, lblW, lblH);
		lbl14.setText("<html>Οι άνθρωποι δεν ήταν φιλικοί μαζί μου<html>");
		chkBx14_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx14_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx14_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx14_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld14.setBounds(x + snap5, y, txtW, txtH);
		add(lbl14);
		add(chkBx14_0);
		add(chkBx14_1);
		add(chkBx14_2);
		add(chkBx14_3);
		add(txtFld14);

		y = y + 35;
		lbl15.setBounds(x, y, lblW, lblH);
		lbl15.setText("<html>Χαιρόμουν την ζωή μου<html>");
		chkBx15_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx15_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx15_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx15_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld15.setBounds(x + snap5, y, txtW, txtH);
		add(lbl15);
		add(chkBx15_0);
		add(chkBx15_1);
		add(chkBx15_2);
		add(chkBx15_3);
		add(txtFld15);

		y = y + 35;
		lbl16.setBounds(x, y, lblW, lblH);
		lbl16.setText("<html>Έβαζα τα κλάματα<html>");
		chkBx16_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx16_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx16_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx16_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld16.setBounds(x + snap5, y, txtW, txtH);
		add(lbl16);
		add(chkBx16_0);
		add(chkBx16_1);
		add(chkBx16_2);
		add(chkBx16_3);
		add(txtFld16);

		y = y + 35;
		lbl17.setBounds(x, y, lblW, lblH);
		lbl17.setText("<html>Ήμουν λυπημένος<html>");
		chkBx17_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx17_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx17_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx17_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld17.setBounds(x + snap5, y, txtW, txtH);
		add(lbl17);
		add(chkBx17_0);
		add(chkBx17_1);
		add(chkBx17_2);
		add(chkBx17_3);
		add(txtFld17);

		y = y + 35;
		lbl18.setBounds(x, y, lblW, lblH);
		lbl18.setText("<html>Αισθανόμουν ότι δεν αρέσω στους γύρω μου<html>");
		chkBx18_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx18_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx18_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx18_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld18.setBounds(x + snap5, y, txtW, txtH);
		add(lbl18);
		add(chkBx18_0);
		add(chkBx18_1);
		add(chkBx18_2);
		add(chkBx18_3);
		add(txtFld18);

		y = y + 35;
		lbl19.setBounds(x, y, lblW, lblH);
		lbl19.setText("<html>Αισθανόμουν ότι δεν τα κατάφερνα γενικά<html>");
		chkBx19_0.setBounds(x + snap1, y, chBoxW, chBoxH);
		chkBx19_1.setBounds(x + snap2, y, chBoxW, chBoxH);
		chkBx19_2.setBounds(x + snap3, y, chBoxW, chBoxH);
		chkBx19_3.setBounds(x + snap4, y, chBoxW, chBoxH);
		txtFld19.setBounds(x + snap5, y, txtW, txtH);
		add(lbl19);
		add(chkBx19_0);
		add(chkBx19_1);
		add(chkBx19_2);
		add(chkBx19_3);
		add(txtFld19);

		resetMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
			}
		});

		randomMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rnd = new Random();
				for (ButtonGroupExtended bge : btnGrpExtList) {
					bge.getButtons().get(rnd.nextInt(4)).doClick();
				}
			}
		});

		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				init();
			}
		});

		btnGrp0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld0.setText(e.getActionCommand());
			}
		});
		btnGrp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld1.setText(e.getActionCommand());
			}
		});
		btnGrp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld2.setText(e.getActionCommand());
			}
		});
		btnGrp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld3.setText(e.getActionCommand());
			}
		});
		btnGrp4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld4.setText(e.getActionCommand());
			}
		});
		btnGrp5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld5.setText(e.getActionCommand());
			}
		});
		btnGrp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld6.setText(e.getActionCommand());
			}
		});
		btnGrp7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld7.setText(e.getActionCommand());
			}
		});
		btnGrp8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld8.setText(e.getActionCommand());
			}
		});
		btnGrp9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld9.setText(e.getActionCommand());
			}
		});
		btnGrp10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld10.setText(e.getActionCommand());
			}
		});
		btnGrp11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld11.setText(e.getActionCommand());
			}
		});
		btnGrp12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld12.setText(e.getActionCommand());
			}
		});
		btnGrp13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld13.setText(e.getActionCommand());
			}
		});
		btnGrp14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld14.setText(e.getActionCommand());
			}
		});
		btnGrp15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld15.setText(e.getActionCommand());
			}
		});
		btnGrp16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld16.setText(e.getActionCommand());
			}
		});
		btnGrp17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld17.setText(e.getActionCommand());
			}
		});
		btnGrp18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld18.setText(e.getActionCommand());
			}
		});
		btnGrp19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFld19.setText(e.getActionCommand());
			}
		});

		txtFld0.getDocument().addDocumentListener(this);
		txtFld1.getDocument().addDocumentListener(this);
		txtFld2.getDocument().addDocumentListener(this);
		txtFld3.getDocument().addDocumentListener(this);
		txtFld4.getDocument().addDocumentListener(this);
		txtFld5.getDocument().addDocumentListener(this);
		txtFld6.getDocument().addDocumentListener(this);
		txtFld7.getDocument().addDocumentListener(this);
		txtFld8.getDocument().addDocumentListener(this);
		txtFld9.getDocument().addDocumentListener(this);
		txtFld10.getDocument().addDocumentListener(this);
		txtFld11.getDocument().addDocumentListener(this);
		txtFld12.getDocument().addDocumentListener(this);
		txtFld13.getDocument().addDocumentListener(this);
		txtFld14.getDocument().addDocumentListener(this);
		txtFld15.getDocument().addDocumentListener(this);
		txtFld16.getDocument().addDocumentListener(this);
		txtFld17.getDocument().addDocumentListener(this);
		txtFld18.getDocument().addDocumentListener(this);
		txtFld19.getDocument().addDocumentListener(this);

	}

	private void calculate() {
		int number = Integer.MIN_VALUE;
		try {
			number = (txtFld0.getText().equals("") ? 0 : Integer.parseInt(txtFld0.getText()))
					+ (txtFld1.getText().equals("") ? 0 : Integer.parseInt(txtFld1.getText()))
					+ (txtFld2.getText().equals("") ? 0 : Integer.parseInt(txtFld2.getText()))
					+ (txtFld3.getText().equals("") ? 0 : Integer.parseInt(txtFld3.getText()))
					+ (txtFld4.getText().equals("") ? 0 : Integer.parseInt(txtFld4.getText()))
					+ (txtFld5.getText().equals("") ? 0 : Integer.parseInt(txtFld5.getText()))
					+ (txtFld6.getText().equals("") ? 0 : Integer.parseInt(txtFld6.getText()))
					+ (txtFld7.getText().equals("") ? 0 : Integer.parseInt(txtFld7.getText()))
					+ (txtFld8.getText().equals("") ? 0 : Integer.parseInt(txtFld8.getText()))
					+ (txtFld9.getText().equals("") ? 0 : Integer.parseInt(txtFld9.getText()))
					+ (txtFld10.getText().equals("") ? 0 : Integer.parseInt(txtFld10.getText()))
					+ (txtFld11.getText().equals("") ? 0 : Integer.parseInt(txtFld11.getText()))
					+ (txtFld12.getText().equals("") ? 0 : Integer.parseInt(txtFld12.getText()))
					+ (txtFld13.getText().equals("") ? 0 : Integer.parseInt(txtFld13.getText()))
					+ (txtFld14.getText().equals("") ? 0 : Integer.parseInt(txtFld14.getText()))
					+ (txtFld15.getText().equals("") ? 0 : Integer.parseInt(txtFld15.getText()))
					+ (txtFld16.getText().equals("") ? 0 : Integer.parseInt(txtFld16.getText()))
					+ (txtFld17.getText().equals("") ? 0 : Integer.parseInt(txtFld17.getText()))
					+ (txtFld18.getText().equals("") ? 0 : Integer.parseInt(txtFld18.getText()))
					+ (txtFld19.getText().equals("") ? 0 : Integer.parseInt(txtFld19.getText()));

		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
		txtFldSum.setText(String.valueOf(number));
		txtFldTestCode.setText(hash());

		if (btnGrp0.getSelection() != null && btnGrp1.getSelection() != null && btnGrp2.getSelection() != null
				&& btnGrp3.getSelection() != null && btnGrp4.getSelection() != null && btnGrp5.getSelection() != null
				&& btnGrp6.getSelection() != null && btnGrp7.getSelection() != null && btnGrp8.getSelection() != null
				&& btnGrp9.getSelection() != null && btnGrp10.getSelection() != null && btnGrp11.getSelection() != null
				&& btnGrp12.getSelection() != null && btnGrp13.getSelection() != null && btnGrp14.getSelection() != null
				&& btnGrp15.getSelection() != null && btnGrp16.getSelection() != null && btnGrp17.getSelection() != null
				&& btnGrp18.getSelection() != null && btnGrp19.getSelection() != null

		) {
			txtFldSum.setVisible(true);
			txtFldTestCode.setVisible(true);
			lblAge.setVisible(true);
			cmbAge.setVisible(true);
			lblSex.setVisible(true);
			cmbSex.setVisible(true);
			lblEdu.setVisible(true);
			cmbEdu.setVisible(true);
			btnCancel.setVisible(true);
			btnSubmit.setVisible(true);
		}

	}

	private String hash() {
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String answers = (txtFld0.getText().equals("") ? "" : (txtFld0.getText()))
				+ (txtFld1.getText().equals("") ? "" : (txtFld1.getText()))
				+ (txtFld2.getText().equals("") ? "" : (txtFld2.getText()))
				+ (txtFld3.getText().equals("") ? "" : (txtFld3.getText()))
				+ (txtFld4.getText().equals("") ? "" : (txtFld4.getText()))
				+ (txtFld5.getText().equals("") ? "" : (txtFld5.getText()))
				+ (txtFld6.getText().equals("") ? "" : (txtFld6.getText()))
				+ (txtFld7.getText().equals("") ? "" : (txtFld7.getText()))
				+ (txtFld8.getText().equals("") ? "" : (txtFld8.getText()))
				+ (txtFld9.getText().equals("") ? "" : (txtFld9.getText()))
				+ (txtFld10.getText().equals("") ? "" : (txtFld10.getText()))
				+ (txtFld11.getText().equals("") ? "" : (txtFld11.getText()))
				+ (txtFld12.getText().equals("") ? "" : (txtFld12.getText()))
				+ (txtFld13.getText().equals("") ? "" : (txtFld13.getText()))
				+ (txtFld14.getText().equals("") ? "" : (txtFld14.getText()))
				+ (txtFld15.getText().equals("") ? "" : (txtFld15.getText()))
				+ (txtFld16.getText().equals("") ? "" : (txtFld16.getText()))
				+ (txtFld17.getText().equals("") ? "" : (txtFld17.getText()))
				+ (txtFld18.getText().equals("") ? "" : (txtFld18.getText()))
				+ (txtFld19.getText().equals("") ? "" : (txtFld19.getText()))
				+ cmbAge.getSelectedItem().toString()
				+ cmbSex.getSelectedItem().toString()
				+ cmbEdu.getSelectedItem().toString();
		String totalScore = (txtFldSum.getText().equals("") ? "" : (txtFldSum.getText()));
		String sha256hex = DigestUtils.sha256Hex(timeStamp + answers + totalScore);
		return sha256hex;
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		calculate();

	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		calculate();

	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		calculate();

	}

}