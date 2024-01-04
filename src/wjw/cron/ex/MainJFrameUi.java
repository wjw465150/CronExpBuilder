/*
 * Created by JFormDesigner on Thu Jan 04 10:41:43 CST 2024
 */

package wjw.cron.ex;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.border.*;

/**
 * @author wjw
 */
public class MainJFrameUi extends JFrame {
	public MainJFrameUi() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		this.jTabbedPane1 = new JTabbedPane();
		this.jPanel_Second = new JPanel();
		this.label = new JLabel();
		this.jSP_SE_From = new JSpinner();
		this.lblSecondStartevery = new JLabel();
		this.jSP_SE_Every = new JSpinner();
		this.lblSecondExecute = new JLabel();
		this.jRB_SE_Loop = new JRadioButton();
		this.jRB_SE_Assign = new JRadioButton();
		this.jPanel_BoxSecond = new JPanel();
		this.jCB_SE_0 = new JCheckBox();
		this.jCB_SE_1 = new JCheckBox();
		this.jCB_SE_2 = new JCheckBox();
		this.jCB_SE_3 = new JCheckBox();
		this.jCB_SE_4 = new JCheckBox();
		this.jCB_SE_5 = new JCheckBox();
		this.jCB_SE_6 = new JCheckBox();
		this.jCB_SE_7 = new JCheckBox();
		this.jCB_SE_8 = new JCheckBox();
		this.jCB_SE_9 = new JCheckBox();
		this.jCB_SE_10 = new JCheckBox();
		this.jCB_SE_11 = new JCheckBox();
		this.jCB_SE_12 = new JCheckBox();
		this.jCB_SE_13 = new JCheckBox();
		this.jCB_SE_14 = new JCheckBox();
		this.jCB_SE_15 = new JCheckBox();
		this.jCB_SE_16 = new JCheckBox();
		this.jCB_SE_17 = new JCheckBox();
		this.jCB_SE_18 = new JCheckBox();
		this.jCB_SE_19 = new JCheckBox();
		this.jCB_SE_20 = new JCheckBox();
		this.jCB_SE_21 = new JCheckBox();
		this.jCB_SE_22 = new JCheckBox();
		this.jCB_SE_23 = new JCheckBox();
		this.jCB_SE_24 = new JCheckBox();
		this.jCB_SE_25 = new JCheckBox();
		this.jCB_SE_26 = new JCheckBox();
		this.jCB_SE_27 = new JCheckBox();
		this.jCB_SE_28 = new JCheckBox();
		this.jCB_SE_29 = new JCheckBox();
		this.jCB_SE_30 = new JCheckBox();
		this.jCB_SE_31 = new JCheckBox();
		this.jCB_SE_32 = new JCheckBox();
		this.jCB_SE_33 = new JCheckBox();
		this.jCB_SE_34 = new JCheckBox();
		this.jCB_SE_35 = new JCheckBox();
		this.jCB_SE_36 = new JCheckBox();
		this.jCB_SE_37 = new JCheckBox();
		this.jCB_SE_38 = new JCheckBox();
		this.jCB_SE_39 = new JCheckBox();
		this.jCB_SE_40 = new JCheckBox();
		this.jCB_SE_41 = new JCheckBox();
		this.jCB_SE_42 = new JCheckBox();
		this.jCB_SE_43 = new JCheckBox();
		this.jCB_SE_44 = new JCheckBox();
		this.jCB_SE_45 = new JCheckBox();
		this.jCB_SE_46 = new JCheckBox();
		this.jCB_SE_47 = new JCheckBox();
		this.jCB_SE_48 = new JCheckBox();
		this.jCB_SE_49 = new JCheckBox();
		this.jCB_SE_50 = new JCheckBox();
		this.jCB_SE_51 = new JCheckBox();
		this.jCB_SE_52 = new JCheckBox();
		this.jCB_SE_53 = new JCheckBox();
		this.jCB_SE_54 = new JCheckBox();
		this.jCB_SE_55 = new JCheckBox();
		this.jCB_SE_56 = new JCheckBox();
		this.jCB_SE_57 = new JCheckBox();
		this.jCB_SE_58 = new JCheckBox();
		this.jCB_SE_59 = new JCheckBox();
		this.jRB_SE_Every = new JRadioButton();
		this.jPanel4 = new JPanel();
		this.jLabel9 = new JLabel();
		this.jSP_MU_From = new JSpinner();
		this.jLabel10 = new JLabel();
		this.jSP_MU_Every = new JSpinner();
		this.jLabel12 = new JLabel();
		this.jRB_MU_Loop = new JRadioButton();
		this.jRB_MU_Assign = new JRadioButton();
		this.jPanel12 = new JPanel();
		this.jCB_MU_0 = new JCheckBox();
		this.jCB_MU_1 = new JCheckBox();
		this.jCB_MU_2 = new JCheckBox();
		this.jCB_MU_3 = new JCheckBox();
		this.jCB_MU_4 = new JCheckBox();
		this.jCB_MU_5 = new JCheckBox();
		this.jCB_MU_6 = new JCheckBox();
		this.jCB_MU_7 = new JCheckBox();
		this.jCB_MU_8 = new JCheckBox();
		this.jCB_MU_9 = new JCheckBox();
		this.jCB_MU_10 = new JCheckBox();
		this.jCB_MU_11 = new JCheckBox();
		this.jCB_MU_12 = new JCheckBox();
		this.jCB_MU_13 = new JCheckBox();
		this.jCB_MU_14 = new JCheckBox();
		this.jCB_MU_15 = new JCheckBox();
		this.jCB_MU_16 = new JCheckBox();
		this.jCB_MU_17 = new JCheckBox();
		this.jCB_MU_18 = new JCheckBox();
		this.jCB_MU_19 = new JCheckBox();
		this.jCB_MU_20 = new JCheckBox();
		this.jCB_MU_21 = new JCheckBox();
		this.jCB_MU_22 = new JCheckBox();
		this.jCB_MU_23 = new JCheckBox();
		this.jCB_MU_24 = new JCheckBox();
		this.jCB_MU_25 = new JCheckBox();
		this.jCB_MU_26 = new JCheckBox();
		this.jCB_MU_27 = new JCheckBox();
		this.jCB_MU_28 = new JCheckBox();
		this.jCB_MU_29 = new JCheckBox();
		this.jCB_MU_30 = new JCheckBox();
		this.jCB_MU_31 = new JCheckBox();
		this.jCB_MU_32 = new JCheckBox();
		this.jCB_MU_33 = new JCheckBox();
		this.jCB_MU_34 = new JCheckBox();
		this.jCB_MU_35 = new JCheckBox();
		this.jCB_MU_36 = new JCheckBox();
		this.jCB_MU_37 = new JCheckBox();
		this.jCB_MU_38 = new JCheckBox();
		this.jCB_MU_39 = new JCheckBox();
		this.jCB_MU_40 = new JCheckBox();
		this.jCB_MU_41 = new JCheckBox();
		this.jCB_MU_42 = new JCheckBox();
		this.jCB_MU_43 = new JCheckBox();
		this.jCB_MU_44 = new JCheckBox();
		this.jCB_MU_45 = new JCheckBox();
		this.jCB_MU_46 = new JCheckBox();
		this.jCB_MU_47 = new JCheckBox();
		this.jCB_MU_48 = new JCheckBox();
		this.jCB_MU_49 = new JCheckBox();
		this.jCB_MU_50 = new JCheckBox();
		this.jCB_MU_51 = new JCheckBox();
		this.jCB_MU_52 = new JCheckBox();
		this.jCB_MU_53 = new JCheckBox();
		this.jCB_MU_54 = new JCheckBox();
		this.jCB_MU_55 = new JCheckBox();
		this.jCB_MU_56 = new JCheckBox();
		this.jCB_MU_57 = new JCheckBox();
		this.jCB_MU_58 = new JCheckBox();
		this.jCB_MU_59 = new JCheckBox();
		this.jRB_MU_Every = new JRadioButton();
		this.jPanel_Hour = new JPanel();
		this.jRB_HH_Every = new JRadioButton();
		this.jRB_HH_Assign = new JRadioButton();
		this.jPanel9 = new JPanel();
		this.jCB_HH_0 = new JCheckBox();
		this.jCB_HH_1 = new JCheckBox();
		this.jCB_HH_2 = new JCheckBox();
		this.jCB_HH_3 = new JCheckBox();
		this.jCB_HH_4 = new JCheckBox();
		this.jCB_HH_5 = new JCheckBox();
		this.jCB_HH_6 = new JCheckBox();
		this.jCB_HH_7 = new JCheckBox();
		this.jCB_HH_8 = new JCheckBox();
		this.jCB_HH_9 = new JCheckBox();
		this.jCB_HH_10 = new JCheckBox();
		this.jCB_HH_11 = new JCheckBox();
		this.jCB_HH_12 = new JCheckBox();
		this.jCB_HH_13 = new JCheckBox();
		this.jCB_HH_14 = new JCheckBox();
		this.jCB_HH_15 = new JCheckBox();
		this.jCB_HH_16 = new JCheckBox();
		this.jCB_HH_17 = new JCheckBox();
		this.jCB_HH_18 = new JCheckBox();
		this.jCB_HH_19 = new JCheckBox();
		this.jCB_HH_20 = new JCheckBox();
		this.jCB_HH_21 = new JCheckBox();
		this.jCB_HH_22 = new JCheckBox();
		this.jCB_HH_23 = new JCheckBox();
		this.jLabel16 = new JLabel();
		this.jLabel17 = new JLabel();
		this.jPanel_Day = new JPanel();
		this.jRB_DD_Every = new JRadioButton();
		this.jRB_DD_Assign = new JRadioButton();
		this.jPanel10 = new JPanel();
		this.jCB_DD_1 = new JCheckBox();
		this.jCB_DD_2 = new JCheckBox();
		this.jCB_DD_3 = new JCheckBox();
		this.jCB_DD_4 = new JCheckBox();
		this.jCB_DD_5 = new JCheckBox();
		this.jCB_DD_6 = new JCheckBox();
		this.jCB_DD_7 = new JCheckBox();
		this.jCB_DD_8 = new JCheckBox();
		this.jCB_DD_9 = new JCheckBox();
		this.jCB_DD_10 = new JCheckBox();
		this.jCB_DD_11 = new JCheckBox();
		this.jCB_DD_12 = new JCheckBox();
		this.jCB_DD_13 = new JCheckBox();
		this.jCB_DD_14 = new JCheckBox();
		this.jCB_DD_15 = new JCheckBox();
		this.jCB_DD_16 = new JCheckBox();
		this.jCB_DD_17 = new JCheckBox();
		this.jCB_DD_18 = new JCheckBox();
		this.jCB_DD_19 = new JCheckBox();
		this.jCB_DD_20 = new JCheckBox();
		this.jCB_DD_21 = new JCheckBox();
		this.jCB_DD_22 = new JCheckBox();
		this.jCB_DD_23 = new JCheckBox();
		this.jCB_DD_24 = new JCheckBox();
		this.jCB_DD_25 = new JCheckBox();
		this.jCB_DD_26 = new JCheckBox();
		this.jCB_DD_27 = new JCheckBox();
		this.jCB_DD_28 = new JCheckBox();
		this.jCB_DD_29 = new JCheckBox();
		this.jCB_DD_30 = new JCheckBox();
		this.jCB_DD_31 = new JCheckBox();
		this.jPanel_Month = new JPanel();
		this.jRB_MM_Every = new JRadioButton();
		this.jRB_MM_Assign = new JRadioButton();
		this.jPanel11 = new JPanel();
		this.jCB_MM_1 = new JCheckBox();
		this.jCB_MM_2 = new JCheckBox();
		this.jCB_MM_3 = new JCheckBox();
		this.jCB_MM_4 = new JCheckBox();
		this.jCB_MM_5 = new JCheckBox();
		this.jCB_MM_6 = new JCheckBox();
		this.jCB_MM_7 = new JCheckBox();
		this.jCB_MM_8 = new JCheckBox();
		this.jCB_MM_9 = new JCheckBox();
		this.jCB_MM_10 = new JCheckBox();
		this.jCB_MM_11 = new JCheckBox();
		this.jCB_MM_12 = new JCheckBox();
		this.jPanel_Week = new JPanel();
		this.jCB_WK_Use = new JCheckBox();
		this.jPanel1_WK = new JPanel();
		this.jCB_WK_1 = new JCheckBox();
		this.jCB_WK_2 = new JCheckBox();
		this.jCB_WK_3 = new JCheckBox();
		this.jCB_WK_4 = new JCheckBox();
		this.jCB_WK_5 = new JCheckBox();
		this.jCB_WK_6 = new JCheckBox();
		this.jCB_WK_7 = new JCheckBox();
		this.jRB_WK_Every = new JRadioButton();
		this.jRB_WK_Assign = new JRadioButton();
		this.jPanel2 = new JPanel();
		this.jLabel1 = new JLabel();
		this.jLabel2 = new JLabel();
		this.jLabel3 = new JLabel();
		this.jLabel4 = new JLabel();
		this.jLabel5 = new JLabel();
		this.jLabel6 = new JLabel();
		this.jLabel7 = new JLabel();
		this.jLabel8 = new JLabel();
		this.jTF_Cron_Second = new JTextField();
		this.jTF_Cron_Minute = new JTextField();
		this.jTF_Cron_Hour = new JTextField();
		this.jTF_Cron_Day = new JTextField();
		this.jTF_Cron_Month = new JTextField();
		this.jTF_Cron_Week = new JTextField();
		this.jTF_Cron_Exp = new JTextField();
		this.jButton_Parse = new JButton();
		this.jPanel13 = new JPanel();
		this.jLabel13 = new JLabel();
		this.jTF_Schedule_Start = new JTextField();
		this.jLabel14 = new JLabel();
		this.jScrollPane1 = new JScrollPane();
		this.jTA_Schedule_Next = new JTextArea();
		this.jPanel3 = new JPanel();
		this.jButton_Copy = new JButton();
		this.jButton_Exit = new JButton();
		this.jButton_Make = new JButton();
		this.buttonGroup0 = new ButtonGroup();
		this.buttonGroup1 = new ButtonGroup();
		this.buttonGroup2 = new ButtonGroup();
		this.buttonGroup3 = new ButtonGroup();
		this.buttonGroup4 = new ButtonGroup();
		this.buttonGroup5 = new ButtonGroup();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("Quartz\u8868\u8fbe\u5f0f\u751f\u6210\u5668(wjw465150@gmail.com)"); //$NON-NLS-1$
		setResizable(false);
		Container contentPane = getContentPane();

		//======== jTabbedPane1 ========
		{
			this.jTabbedPane1.setBorder(new TitledBorder(new EtchedBorder(), "\u65e5\u671f,\u65f6\u95f4")); //$NON-NLS-1$

			//======== jPanel_Second ========
			{

				//---- label ----
				this.label.setText("From"); //$NON-NLS-1$

				//---- jSP_SE_From ----
				this.jSP_SE_From.setEnabled(false);
				this.jSP_SE_From.setModel(new SpinnerNumberModel(0, 0, 59, 1));

				//---- lblSecondStartevery ----
				this.lblSecondStartevery.setText("Second start,Every"); //$NON-NLS-1$

				//---- jSP_SE_Every ----
				this.jSP_SE_Every.setEnabled(false);
				this.jSP_SE_Every.setModel(new SpinnerNumberModel(5, 1, 59, 1));

				//---- lblSecondExecute ----
				this.lblSecondExecute.setText("Second Execute"); //$NON-NLS-1$

				//---- jRB_SE_Loop ----
				this.jRB_SE_Loop.setText("Cycle:"); //$NON-NLS-1$

				//---- jRB_SE_Assign ----
				this.jRB_SE_Assign.setText("Assign:"); //$NON-NLS-1$

				//======== jPanel_BoxSecond ========
				{
					this.jPanel_BoxSecond.setBorder(new EtchedBorder());

					//---- jCB_SE_0 ----
					this.jCB_SE_0.setText("0"); //$NON-NLS-1$
					this.jCB_SE_0.setEnabled(false);

					//---- jCB_SE_1 ----
					this.jCB_SE_1.setText("1"); //$NON-NLS-1$
					this.jCB_SE_1.setEnabled(false);

					//---- jCB_SE_2 ----
					this.jCB_SE_2.setText("2"); //$NON-NLS-1$
					this.jCB_SE_2.setEnabled(false);

					//---- jCB_SE_3 ----
					this.jCB_SE_3.setText("3"); //$NON-NLS-1$
					this.jCB_SE_3.setEnabled(false);

					//---- jCB_SE_4 ----
					this.jCB_SE_4.setText("4"); //$NON-NLS-1$
					this.jCB_SE_4.setEnabled(false);

					//---- jCB_SE_5 ----
					this.jCB_SE_5.setText("5"); //$NON-NLS-1$
					this.jCB_SE_5.setEnabled(false);

					//---- jCB_SE_6 ----
					this.jCB_SE_6.setText("6"); //$NON-NLS-1$
					this.jCB_SE_6.setEnabled(false);

					//---- jCB_SE_7 ----
					this.jCB_SE_7.setText("7"); //$NON-NLS-1$
					this.jCB_SE_7.setEnabled(false);

					//---- jCB_SE_8 ----
					this.jCB_SE_8.setText("8"); //$NON-NLS-1$
					this.jCB_SE_8.setEnabled(false);

					//---- jCB_SE_9 ----
					this.jCB_SE_9.setText("9"); //$NON-NLS-1$
					this.jCB_SE_9.setEnabled(false);

					//---- jCB_SE_10 ----
					this.jCB_SE_10.setText("10"); //$NON-NLS-1$
					this.jCB_SE_10.setEnabled(false);

					//---- jCB_SE_11 ----
					this.jCB_SE_11.setText("11"); //$NON-NLS-1$
					this.jCB_SE_11.setEnabled(false);

					//---- jCB_SE_12 ----
					this.jCB_SE_12.setText("12"); //$NON-NLS-1$
					this.jCB_SE_12.setEnabled(false);

					//---- jCB_SE_13 ----
					this.jCB_SE_13.setText("13"); //$NON-NLS-1$
					this.jCB_SE_13.setEnabled(false);

					//---- jCB_SE_14 ----
					this.jCB_SE_14.setText("14"); //$NON-NLS-1$
					this.jCB_SE_14.setEnabled(false);

					//---- jCB_SE_15 ----
					this.jCB_SE_15.setText("15"); //$NON-NLS-1$
					this.jCB_SE_15.setEnabled(false);

					//---- jCB_SE_16 ----
					this.jCB_SE_16.setText("16"); //$NON-NLS-1$
					this.jCB_SE_16.setEnabled(false);

					//---- jCB_SE_17 ----
					this.jCB_SE_17.setText("17"); //$NON-NLS-1$
					this.jCB_SE_17.setEnabled(false);

					//---- jCB_SE_18 ----
					this.jCB_SE_18.setText("18"); //$NON-NLS-1$
					this.jCB_SE_18.setEnabled(false);

					//---- jCB_SE_19 ----
					this.jCB_SE_19.setText("19"); //$NON-NLS-1$
					this.jCB_SE_19.setEnabled(false);

					//---- jCB_SE_20 ----
					this.jCB_SE_20.setText("20"); //$NON-NLS-1$
					this.jCB_SE_20.setEnabled(false);

					//---- jCB_SE_21 ----
					this.jCB_SE_21.setText("21"); //$NON-NLS-1$
					this.jCB_SE_21.setEnabled(false);

					//---- jCB_SE_22 ----
					this.jCB_SE_22.setText("22"); //$NON-NLS-1$
					this.jCB_SE_22.setEnabled(false);

					//---- jCB_SE_23 ----
					this.jCB_SE_23.setText("23"); //$NON-NLS-1$
					this.jCB_SE_23.setEnabled(false);

					//---- jCB_SE_24 ----
					this.jCB_SE_24.setText("24"); //$NON-NLS-1$
					this.jCB_SE_24.setEnabled(false);

					//---- jCB_SE_25 ----
					this.jCB_SE_25.setText("25"); //$NON-NLS-1$
					this.jCB_SE_25.setEnabled(false);

					//---- jCB_SE_26 ----
					this.jCB_SE_26.setText("26"); //$NON-NLS-1$
					this.jCB_SE_26.setEnabled(false);

					//---- jCB_SE_27 ----
					this.jCB_SE_27.setText("27"); //$NON-NLS-1$
					this.jCB_SE_27.setEnabled(false);

					//---- jCB_SE_28 ----
					this.jCB_SE_28.setText("28"); //$NON-NLS-1$
					this.jCB_SE_28.setEnabled(false);

					//---- jCB_SE_29 ----
					this.jCB_SE_29.setText("29"); //$NON-NLS-1$
					this.jCB_SE_29.setEnabled(false);

					//---- jCB_SE_30 ----
					this.jCB_SE_30.setText("30"); //$NON-NLS-1$
					this.jCB_SE_30.setEnabled(false);

					//---- jCB_SE_31 ----
					this.jCB_SE_31.setText("31"); //$NON-NLS-1$
					this.jCB_SE_31.setEnabled(false);

					//---- jCB_SE_32 ----
					this.jCB_SE_32.setText("32"); //$NON-NLS-1$
					this.jCB_SE_32.setEnabled(false);

					//---- jCB_SE_33 ----
					this.jCB_SE_33.setText("33"); //$NON-NLS-1$
					this.jCB_SE_33.setEnabled(false);

					//---- jCB_SE_34 ----
					this.jCB_SE_34.setText("34"); //$NON-NLS-1$
					this.jCB_SE_34.setEnabled(false);

					//---- jCB_SE_35 ----
					this.jCB_SE_35.setText("35"); //$NON-NLS-1$
					this.jCB_SE_35.setEnabled(false);

					//---- jCB_SE_36 ----
					this.jCB_SE_36.setText("36"); //$NON-NLS-1$
					this.jCB_SE_36.setEnabled(false);

					//---- jCB_SE_37 ----
					this.jCB_SE_37.setText("37"); //$NON-NLS-1$
					this.jCB_SE_37.setEnabled(false);

					//---- jCB_SE_38 ----
					this.jCB_SE_38.setText("38"); //$NON-NLS-1$
					this.jCB_SE_38.setEnabled(false);

					//---- jCB_SE_39 ----
					this.jCB_SE_39.setText("39"); //$NON-NLS-1$
					this.jCB_SE_39.setEnabled(false);

					//---- jCB_SE_40 ----
					this.jCB_SE_40.setText("40"); //$NON-NLS-1$
					this.jCB_SE_40.setEnabled(false);

					//---- jCB_SE_41 ----
					this.jCB_SE_41.setText("41"); //$NON-NLS-1$
					this.jCB_SE_41.setEnabled(false);

					//---- jCB_SE_42 ----
					this.jCB_SE_42.setText("42"); //$NON-NLS-1$
					this.jCB_SE_42.setEnabled(false);

					//---- jCB_SE_43 ----
					this.jCB_SE_43.setText("43"); //$NON-NLS-1$
					this.jCB_SE_43.setEnabled(false);

					//---- jCB_SE_44 ----
					this.jCB_SE_44.setText("44"); //$NON-NLS-1$
					this.jCB_SE_44.setEnabled(false);

					//---- jCB_SE_45 ----
					this.jCB_SE_45.setText("45"); //$NON-NLS-1$
					this.jCB_SE_45.setEnabled(false);

					//---- jCB_SE_46 ----
					this.jCB_SE_46.setText("46"); //$NON-NLS-1$
					this.jCB_SE_46.setEnabled(false);

					//---- jCB_SE_47 ----
					this.jCB_SE_47.setText("47"); //$NON-NLS-1$
					this.jCB_SE_47.setEnabled(false);

					//---- jCB_SE_48 ----
					this.jCB_SE_48.setText("48"); //$NON-NLS-1$
					this.jCB_SE_48.setEnabled(false);

					//---- jCB_SE_49 ----
					this.jCB_SE_49.setText("49"); //$NON-NLS-1$
					this.jCB_SE_49.setEnabled(false);

					//---- jCB_SE_50 ----
					this.jCB_SE_50.setText("50"); //$NON-NLS-1$
					this.jCB_SE_50.setEnabled(false);

					//---- jCB_SE_51 ----
					this.jCB_SE_51.setText("51"); //$NON-NLS-1$
					this.jCB_SE_51.setEnabled(false);

					//---- jCB_SE_52 ----
					this.jCB_SE_52.setText("52"); //$NON-NLS-1$
					this.jCB_SE_52.setEnabled(false);

					//---- jCB_SE_53 ----
					this.jCB_SE_53.setText("53"); //$NON-NLS-1$
					this.jCB_SE_53.setEnabled(false);

					//---- jCB_SE_54 ----
					this.jCB_SE_54.setText("54"); //$NON-NLS-1$
					this.jCB_SE_54.setEnabled(false);

					//---- jCB_SE_55 ----
					this.jCB_SE_55.setText("55"); //$NON-NLS-1$
					this.jCB_SE_55.setEnabled(false);

					//---- jCB_SE_56 ----
					this.jCB_SE_56.setText("56"); //$NON-NLS-1$
					this.jCB_SE_56.setEnabled(false);

					//---- jCB_SE_57 ----
					this.jCB_SE_57.setText("57"); //$NON-NLS-1$
					this.jCB_SE_57.setEnabled(false);

					//---- jCB_SE_58 ----
					this.jCB_SE_58.setText("58"); //$NON-NLS-1$
					this.jCB_SE_58.setEnabled(false);

					//---- jCB_SE_59 ----
					this.jCB_SE_59.setText("59"); //$NON-NLS-1$
					this.jCB_SE_59.setEnabled(false);

					GroupLayout jPanel_BoxSecondLayout = new GroupLayout(this.jPanel_BoxSecond);
					jPanel_BoxSecond.setLayout(jPanel_BoxSecondLayout);
					jPanel_BoxSecondLayout.setHorizontalGroup(
						jPanel_BoxSecondLayout.createParallelGroup()
							.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
									.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_0)
											.addComponent(this.jCB_SE_15))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_16)
											.addComponent(this.jCB_SE_1))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_17)
											.addComponent(this.jCB_SE_2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_18)
											.addComponent(this.jCB_SE_3))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_4)
											.addComponent(this.jCB_SE_19))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_20)
											.addComponent(this.jCB_SE_5))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_6)
											.addComponent(this.jCB_SE_21))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_22)
											.addComponent(this.jCB_SE_7))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_8)
											.addComponent(this.jCB_SE_23))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_24)
											.addComponent(this.jCB_SE_9))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_25)
											.addComponent(this.jCB_SE_10))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_26)
											.addComponent(this.jCB_SE_11))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addComponent(this.jCB_SE_27)
											.addComponent(this.jCB_SE_12))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel_BoxSecondLayout.createParallelGroup()
											.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
												.addComponent(this.jCB_SE_13)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_SE_14))
											.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
												.addComponent(this.jCB_SE_28)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_SE_29))))
									.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
										.addComponent(this.jCB_SE_45)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_46)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_47)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_48)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_49)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_50)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_51)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_52)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_53)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_54)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_55)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_56)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_57)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_58)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_59))
									.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
										.addComponent(this.jCB_SE_30)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_31)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_32)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_33)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_34)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_35)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_36)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_37)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_38)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_39)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_40)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_41)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_SE_42)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_43)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_SE_44)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					jPanel_BoxSecondLayout.setVerticalGroup(
						jPanel_BoxSecondLayout.createParallelGroup()
							.addGroup(jPanel_BoxSecondLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel_BoxSecondLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_SE_0)
									.addComponent(this.jCB_SE_1)
									.addComponent(this.jCB_SE_2)
									.addComponent(this.jCB_SE_3)
									.addComponent(this.jCB_SE_4)
									.addComponent(this.jCB_SE_5)
									.addComponent(this.jCB_SE_6)
									.addComponent(this.jCB_SE_7)
									.addComponent(this.jCB_SE_8)
									.addComponent(this.jCB_SE_9)
									.addComponent(this.jCB_SE_10)
									.addComponent(this.jCB_SE_11)
									.addComponent(this.jCB_SE_12)
									.addComponent(this.jCB_SE_13)
									.addComponent(this.jCB_SE_14))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel_BoxSecondLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_SE_15)
									.addComponent(this.jCB_SE_16)
									.addComponent(this.jCB_SE_17)
									.addComponent(this.jCB_SE_18)
									.addComponent(this.jCB_SE_19)
									.addComponent(this.jCB_SE_20)
									.addComponent(this.jCB_SE_21)
									.addComponent(this.jCB_SE_22)
									.addComponent(this.jCB_SE_23)
									.addComponent(this.jCB_SE_24)
									.addComponent(this.jCB_SE_25)
									.addComponent(this.jCB_SE_26)
									.addComponent(this.jCB_SE_27)
									.addComponent(this.jCB_SE_28)
									.addComponent(this.jCB_SE_29))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel_BoxSecondLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_SE_30)
									.addComponent(this.jCB_SE_31)
									.addComponent(this.jCB_SE_32)
									.addComponent(this.jCB_SE_33)
									.addComponent(this.jCB_SE_34)
									.addComponent(this.jCB_SE_35)
									.addComponent(this.jCB_SE_36)
									.addComponent(this.jCB_SE_37)
									.addComponent(this.jCB_SE_38)
									.addComponent(this.jCB_SE_39)
									.addComponent(this.jCB_SE_40)
									.addComponent(this.jCB_SE_41)
									.addComponent(this.jCB_SE_42)
									.addComponent(this.jCB_SE_43)
									.addComponent(this.jCB_SE_44))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel_BoxSecondLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_SE_45)
									.addComponent(this.jCB_SE_46)
									.addComponent(this.jCB_SE_47)
									.addComponent(this.jCB_SE_48)
									.addComponent(this.jCB_SE_49)
									.addComponent(this.jCB_SE_50)
									.addComponent(this.jCB_SE_51)
									.addComponent(this.jCB_SE_52)
									.addComponent(this.jCB_SE_53)
									.addComponent(this.jCB_SE_54)
									.addComponent(this.jCB_SE_55)
									.addComponent(this.jCB_SE_56)
									.addComponent(this.jCB_SE_57)
									.addComponent(this.jCB_SE_58)
									.addComponent(this.jCB_SE_59))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				//---- jRB_SE_Every ----
				this.jRB_SE_Every.setText("Every Second"); //$NON-NLS-1$
				this.jRB_SE_Every.setSelected(true);

				GroupLayout jPanel_SecondLayout = new GroupLayout(this.jPanel_Second);
				jPanel_Second.setLayout(jPanel_SecondLayout);
				jPanel_SecondLayout.setHorizontalGroup(
					jPanel_SecondLayout.createParallelGroup()
						.addGroup(jPanel_SecondLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel_SecondLayout.createParallelGroup()
								.addComponent(this.jPanel_BoxSecond, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel_SecondLayout.createSequentialGroup()
									.addGroup(jPanel_SecondLayout.createParallelGroup()
										.addComponent(this.jRB_SE_Every)
										.addGroup(jPanel_SecondLayout.createSequentialGroup()
											.addComponent(this.jRB_SE_Loop)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.label)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jSP_SE_From, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.lblSecondStartevery)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jSP_SE_Every, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(3, 3, 3)
											.addComponent(this.lblSecondExecute))
										.addComponent(this.jRB_SE_Assign))
									.addGap(0, 0, Short.MAX_VALUE)))
							.addContainerGap())
				);
				jPanel_SecondLayout.setVerticalGroup(
					jPanel_SecondLayout.createParallelGroup()
						.addGroup(jPanel_SecondLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jRB_SE_Every)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel_SecondLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
								.addComponent(this.jRB_SE_Loop)
								.addComponent(this.label)
								.addComponent(this.jSP_SE_From, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblSecondStartevery)
								.addComponent(this.jSP_SE_Every, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.lblSecondExecute))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jRB_SE_Assign)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel_BoxSecond, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(27, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Second", this.jPanel_Second); //$NON-NLS-1$

			//======== jPanel4 ========
			{

				//---- jLabel9 ----
				this.jLabel9.setText("From"); //$NON-NLS-1$

				//---- jSP_MU_From ----
				this.jSP_MU_From.setEnabled(false);
				this.jSP_MU_From.setModel(new SpinnerNumberModel(0, 0, 59, 1));

				//---- jLabel10 ----
				this.jLabel10.setText("Minute start,Every"); //$NON-NLS-1$

				//---- jSP_MU_Every ----
				this.jSP_MU_Every.setEnabled(false);
				this.jSP_MU_Every.setModel(new SpinnerNumberModel(5, 1, 59, 1));

				//---- jLabel12 ----
				this.jLabel12.setText("Minute Execute"); //$NON-NLS-1$

				//---- jRB_MU_Loop ----
				this.jRB_MU_Loop.setText("Cycle:"); //$NON-NLS-1$

				//---- jRB_MU_Assign ----
				this.jRB_MU_Assign.setText("Assign:"); //$NON-NLS-1$

				//======== jPanel12 ========
				{
					this.jPanel12.setBorder(new EtchedBorder());

					//---- jCB_MU_0 ----
					this.jCB_MU_0.setText("0"); //$NON-NLS-1$
					this.jCB_MU_0.setEnabled(false);

					//---- jCB_MU_1 ----
					this.jCB_MU_1.setText("1"); //$NON-NLS-1$
					this.jCB_MU_1.setEnabled(false);

					//---- jCB_MU_2 ----
					this.jCB_MU_2.setText("2"); //$NON-NLS-1$
					this.jCB_MU_2.setEnabled(false);

					//---- jCB_MU_3 ----
					this.jCB_MU_3.setText("3"); //$NON-NLS-1$
					this.jCB_MU_3.setEnabled(false);

					//---- jCB_MU_4 ----
					this.jCB_MU_4.setText("4"); //$NON-NLS-1$
					this.jCB_MU_4.setEnabled(false);

					//---- jCB_MU_5 ----
					this.jCB_MU_5.setText("5"); //$NON-NLS-1$
					this.jCB_MU_5.setEnabled(false);

					//---- jCB_MU_6 ----
					this.jCB_MU_6.setText("6"); //$NON-NLS-1$
					this.jCB_MU_6.setEnabled(false);

					//---- jCB_MU_7 ----
					this.jCB_MU_7.setText("7"); //$NON-NLS-1$
					this.jCB_MU_7.setEnabled(false);

					//---- jCB_MU_8 ----
					this.jCB_MU_8.setText("8"); //$NON-NLS-1$
					this.jCB_MU_8.setEnabled(false);

					//---- jCB_MU_9 ----
					this.jCB_MU_9.setText("9"); //$NON-NLS-1$
					this.jCB_MU_9.setEnabled(false);

					//---- jCB_MU_10 ----
					this.jCB_MU_10.setText("10"); //$NON-NLS-1$
					this.jCB_MU_10.setEnabled(false);

					//---- jCB_MU_11 ----
					this.jCB_MU_11.setText("11"); //$NON-NLS-1$
					this.jCB_MU_11.setEnabled(false);

					//---- jCB_MU_12 ----
					this.jCB_MU_12.setText("12"); //$NON-NLS-1$
					this.jCB_MU_12.setEnabled(false);

					//---- jCB_MU_13 ----
					this.jCB_MU_13.setText("13"); //$NON-NLS-1$
					this.jCB_MU_13.setEnabled(false);

					//---- jCB_MU_14 ----
					this.jCB_MU_14.setText("14"); //$NON-NLS-1$
					this.jCB_MU_14.setEnabled(false);

					//---- jCB_MU_15 ----
					this.jCB_MU_15.setText("15"); //$NON-NLS-1$
					this.jCB_MU_15.setEnabled(false);

					//---- jCB_MU_16 ----
					this.jCB_MU_16.setText("16"); //$NON-NLS-1$
					this.jCB_MU_16.setEnabled(false);

					//---- jCB_MU_17 ----
					this.jCB_MU_17.setText("17"); //$NON-NLS-1$
					this.jCB_MU_17.setEnabled(false);

					//---- jCB_MU_18 ----
					this.jCB_MU_18.setText("18"); //$NON-NLS-1$
					this.jCB_MU_18.setEnabled(false);

					//---- jCB_MU_19 ----
					this.jCB_MU_19.setText("19"); //$NON-NLS-1$
					this.jCB_MU_19.setEnabled(false);

					//---- jCB_MU_20 ----
					this.jCB_MU_20.setText("20"); //$NON-NLS-1$
					this.jCB_MU_20.setEnabled(false);

					//---- jCB_MU_21 ----
					this.jCB_MU_21.setText("21"); //$NON-NLS-1$
					this.jCB_MU_21.setEnabled(false);

					//---- jCB_MU_22 ----
					this.jCB_MU_22.setText("22"); //$NON-NLS-1$
					this.jCB_MU_22.setEnabled(false);

					//---- jCB_MU_23 ----
					this.jCB_MU_23.setText("23"); //$NON-NLS-1$
					this.jCB_MU_23.setEnabled(false);

					//---- jCB_MU_24 ----
					this.jCB_MU_24.setText("24"); //$NON-NLS-1$
					this.jCB_MU_24.setEnabled(false);

					//---- jCB_MU_25 ----
					this.jCB_MU_25.setText("25"); //$NON-NLS-1$
					this.jCB_MU_25.setEnabled(false);

					//---- jCB_MU_26 ----
					this.jCB_MU_26.setText("26"); //$NON-NLS-1$
					this.jCB_MU_26.setEnabled(false);

					//---- jCB_MU_27 ----
					this.jCB_MU_27.setText("27"); //$NON-NLS-1$
					this.jCB_MU_27.setEnabled(false);

					//---- jCB_MU_28 ----
					this.jCB_MU_28.setText("28"); //$NON-NLS-1$
					this.jCB_MU_28.setEnabled(false);

					//---- jCB_MU_29 ----
					this.jCB_MU_29.setText("29"); //$NON-NLS-1$
					this.jCB_MU_29.setEnabled(false);

					//---- jCB_MU_30 ----
					this.jCB_MU_30.setText("30"); //$NON-NLS-1$
					this.jCB_MU_30.setEnabled(false);

					//---- jCB_MU_31 ----
					this.jCB_MU_31.setText("31"); //$NON-NLS-1$
					this.jCB_MU_31.setEnabled(false);

					//---- jCB_MU_32 ----
					this.jCB_MU_32.setText("32"); //$NON-NLS-1$
					this.jCB_MU_32.setEnabled(false);

					//---- jCB_MU_33 ----
					this.jCB_MU_33.setText("33"); //$NON-NLS-1$
					this.jCB_MU_33.setEnabled(false);

					//---- jCB_MU_34 ----
					this.jCB_MU_34.setText("34"); //$NON-NLS-1$
					this.jCB_MU_34.setEnabled(false);

					//---- jCB_MU_35 ----
					this.jCB_MU_35.setText("35"); //$NON-NLS-1$
					this.jCB_MU_35.setEnabled(false);

					//---- jCB_MU_36 ----
					this.jCB_MU_36.setText("36"); //$NON-NLS-1$
					this.jCB_MU_36.setEnabled(false);

					//---- jCB_MU_37 ----
					this.jCB_MU_37.setText("37"); //$NON-NLS-1$
					this.jCB_MU_37.setEnabled(false);

					//---- jCB_MU_38 ----
					this.jCB_MU_38.setText("38"); //$NON-NLS-1$
					this.jCB_MU_38.setEnabled(false);

					//---- jCB_MU_39 ----
					this.jCB_MU_39.setText("39"); //$NON-NLS-1$
					this.jCB_MU_39.setEnabled(false);

					//---- jCB_MU_40 ----
					this.jCB_MU_40.setText("40"); //$NON-NLS-1$
					this.jCB_MU_40.setEnabled(false);

					//---- jCB_MU_41 ----
					this.jCB_MU_41.setText("41"); //$NON-NLS-1$
					this.jCB_MU_41.setEnabled(false);

					//---- jCB_MU_42 ----
					this.jCB_MU_42.setText("42"); //$NON-NLS-1$
					this.jCB_MU_42.setEnabled(false);

					//---- jCB_MU_43 ----
					this.jCB_MU_43.setText("43"); //$NON-NLS-1$
					this.jCB_MU_43.setEnabled(false);

					//---- jCB_MU_44 ----
					this.jCB_MU_44.setText("44"); //$NON-NLS-1$
					this.jCB_MU_44.setEnabled(false);

					//---- jCB_MU_45 ----
					this.jCB_MU_45.setText("45"); //$NON-NLS-1$
					this.jCB_MU_45.setEnabled(false);

					//---- jCB_MU_46 ----
					this.jCB_MU_46.setText("46"); //$NON-NLS-1$
					this.jCB_MU_46.setEnabled(false);

					//---- jCB_MU_47 ----
					this.jCB_MU_47.setText("47"); //$NON-NLS-1$
					this.jCB_MU_47.setEnabled(false);

					//---- jCB_MU_48 ----
					this.jCB_MU_48.setText("48"); //$NON-NLS-1$
					this.jCB_MU_48.setEnabled(false);

					//---- jCB_MU_49 ----
					this.jCB_MU_49.setText("49"); //$NON-NLS-1$
					this.jCB_MU_49.setEnabled(false);

					//---- jCB_MU_50 ----
					this.jCB_MU_50.setText("50"); //$NON-NLS-1$
					this.jCB_MU_50.setEnabled(false);

					//---- jCB_MU_51 ----
					this.jCB_MU_51.setText("51"); //$NON-NLS-1$
					this.jCB_MU_51.setEnabled(false);

					//---- jCB_MU_52 ----
					this.jCB_MU_52.setText("52"); //$NON-NLS-1$
					this.jCB_MU_52.setEnabled(false);

					//---- jCB_MU_53 ----
					this.jCB_MU_53.setText("53"); //$NON-NLS-1$
					this.jCB_MU_53.setEnabled(false);

					//---- jCB_MU_54 ----
					this.jCB_MU_54.setText("54"); //$NON-NLS-1$
					this.jCB_MU_54.setEnabled(false);

					//---- jCB_MU_55 ----
					this.jCB_MU_55.setText("55"); //$NON-NLS-1$
					this.jCB_MU_55.setEnabled(false);

					//---- jCB_MU_56 ----
					this.jCB_MU_56.setText("56"); //$NON-NLS-1$
					this.jCB_MU_56.setEnabled(false);

					//---- jCB_MU_57 ----
					this.jCB_MU_57.setText("57"); //$NON-NLS-1$
					this.jCB_MU_57.setEnabled(false);

					//---- jCB_MU_58 ----
					this.jCB_MU_58.setText("58"); //$NON-NLS-1$
					this.jCB_MU_58.setEnabled(false);

					//---- jCB_MU_59 ----
					this.jCB_MU_59.setText("59"); //$NON-NLS-1$
					this.jCB_MU_59.setEnabled(false);

					GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
					jPanel12.setLayout(jPanel12Layout);
					jPanel12Layout.setHorizontalGroup(
						jPanel12Layout.createParallelGroup()
							.addGroup(jPanel12Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel12Layout.createParallelGroup()
									.addGroup(jPanel12Layout.createSequentialGroup()
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_0)
											.addComponent(this.jCB_MU_15))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_16)
											.addComponent(this.jCB_MU_1))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_17)
											.addComponent(this.jCB_MU_2))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_18)
											.addComponent(this.jCB_MU_3))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_4)
											.addComponent(this.jCB_MU_19))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_20)
											.addComponent(this.jCB_MU_5))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_6)
											.addComponent(this.jCB_MU_21))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_22)
											.addComponent(this.jCB_MU_7))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_8)
											.addComponent(this.jCB_MU_23))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_24)
											.addComponent(this.jCB_MU_9))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_25)
											.addComponent(this.jCB_MU_10))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_26)
											.addComponent(this.jCB_MU_11))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addComponent(this.jCB_MU_27)
											.addComponent(this.jCB_MU_12))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel12Layout.createParallelGroup()
											.addGroup(jPanel12Layout.createSequentialGroup()
												.addComponent(this.jCB_MU_13)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_MU_14))
											.addGroup(jPanel12Layout.createSequentialGroup()
												.addComponent(this.jCB_MU_28)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_MU_29))))
									.addGroup(jPanel12Layout.createSequentialGroup()
										.addComponent(this.jCB_MU_45)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_46)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_47)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_48)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_49)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_50)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_51)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_52)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_53)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_54)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_55)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_56)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_57)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_58)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_59))
									.addGroup(jPanel12Layout.createSequentialGroup()
										.addComponent(this.jCB_MU_30)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_31)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_32)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_33)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_34)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_35)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_36)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_37)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_38)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_39)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_40)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_41)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_MU_42)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_43)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_MU_44)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					jPanel12Layout.setVerticalGroup(
						jPanel12Layout.createParallelGroup()
							.addGroup(jPanel12Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_MU_0)
									.addComponent(this.jCB_MU_1)
									.addComponent(this.jCB_MU_2)
									.addComponent(this.jCB_MU_3)
									.addComponent(this.jCB_MU_4)
									.addComponent(this.jCB_MU_5)
									.addComponent(this.jCB_MU_6)
									.addComponent(this.jCB_MU_7)
									.addComponent(this.jCB_MU_8)
									.addComponent(this.jCB_MU_9)
									.addComponent(this.jCB_MU_10)
									.addComponent(this.jCB_MU_11)
									.addComponent(this.jCB_MU_12)
									.addComponent(this.jCB_MU_13)
									.addComponent(this.jCB_MU_14))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_MU_15)
									.addComponent(this.jCB_MU_16)
									.addComponent(this.jCB_MU_17)
									.addComponent(this.jCB_MU_18)
									.addComponent(this.jCB_MU_19)
									.addComponent(this.jCB_MU_20)
									.addComponent(this.jCB_MU_21)
									.addComponent(this.jCB_MU_22)
									.addComponent(this.jCB_MU_23)
									.addComponent(this.jCB_MU_24)
									.addComponent(this.jCB_MU_25)
									.addComponent(this.jCB_MU_26)
									.addComponent(this.jCB_MU_27)
									.addComponent(this.jCB_MU_28)
									.addComponent(this.jCB_MU_29))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_MU_30)
									.addComponent(this.jCB_MU_31)
									.addComponent(this.jCB_MU_32)
									.addComponent(this.jCB_MU_33)
									.addComponent(this.jCB_MU_34)
									.addComponent(this.jCB_MU_35)
									.addComponent(this.jCB_MU_36)
									.addComponent(this.jCB_MU_37)
									.addComponent(this.jCB_MU_38)
									.addComponent(this.jCB_MU_39)
									.addComponent(this.jCB_MU_40)
									.addComponent(this.jCB_MU_41)
									.addComponent(this.jCB_MU_42)
									.addComponent(this.jCB_MU_43)
									.addComponent(this.jCB_MU_44))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_MU_45)
									.addComponent(this.jCB_MU_46)
									.addComponent(this.jCB_MU_47)
									.addComponent(this.jCB_MU_48)
									.addComponent(this.jCB_MU_49)
									.addComponent(this.jCB_MU_50)
									.addComponent(this.jCB_MU_51)
									.addComponent(this.jCB_MU_52)
									.addComponent(this.jCB_MU_53)
									.addComponent(this.jCB_MU_54)
									.addComponent(this.jCB_MU_55)
									.addComponent(this.jCB_MU_56)
									.addComponent(this.jCB_MU_57)
									.addComponent(this.jCB_MU_58)
									.addComponent(this.jCB_MU_59))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				//---- jRB_MU_Every ----
				this.jRB_MU_Every.setText("Per Minute"); //$NON-NLS-1$
				this.jRB_MU_Every.setSelected(true);

				GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
				jPanel4.setLayout(jPanel4Layout);
				jPanel4Layout.setHorizontalGroup(
					jPanel4Layout.createParallelGroup()
						.addGroup(jPanel4Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel4Layout.createParallelGroup()
								.addComponent(this.jPanel12, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel4Layout.createSequentialGroup()
									.addGroup(jPanel4Layout.createParallelGroup()
										.addComponent(this.jRB_MU_Every)
										.addGroup(jPanel4Layout.createSequentialGroup()
											.addComponent(this.jRB_MU_Loop)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jLabel9)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jSP_MU_From, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jLabel10)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addComponent(this.jSP_MU_Every, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(3, 3, 3)
											.addComponent(this.jLabel12))
										.addComponent(this.jRB_MU_Assign))
									.addGap(0, 0, Short.MAX_VALUE)))
							.addContainerGap())
				);
				jPanel4Layout.setVerticalGroup(
					jPanel4Layout.createParallelGroup()
						.addGroup(jPanel4Layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jRB_MU_Every)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
								.addComponent(this.jRB_MU_Loop)
								.addComponent(this.jLabel9)
								.addComponent(this.jSP_MU_From, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabel10)
								.addComponent(this.jSP_MU_Every, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(this.jLabel12))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jRB_MU_Assign)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(27, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Minute", this.jPanel4); //$NON-NLS-1$

			//======== jPanel_Hour ========
			{

				//---- jRB_HH_Every ----
				this.jRB_HH_Every.setSelected(true);
				this.jRB_HH_Every.setText("Per Hour"); //$NON-NLS-1$

				//---- jRB_HH_Assign ----
				this.jRB_HH_Assign.setText("Assign:"); //$NON-NLS-1$

				//======== jPanel9 ========
				{
					this.jPanel9.setBorder(new EtchedBorder());

					//---- jCB_HH_0 ----
					this.jCB_HH_0.setText("0  "); //$NON-NLS-1$
					this.jCB_HH_0.setEnabled(false);

					//---- jCB_HH_1 ----
					this.jCB_HH_1.setText("1  "); //$NON-NLS-1$
					this.jCB_HH_1.setEnabled(false);

					//---- jCB_HH_2 ----
					this.jCB_HH_2.setText("2  "); //$NON-NLS-1$
					this.jCB_HH_2.setEnabled(false);

					//---- jCB_HH_3 ----
					this.jCB_HH_3.setText("3  "); //$NON-NLS-1$
					this.jCB_HH_3.setEnabled(false);

					//---- jCB_HH_4 ----
					this.jCB_HH_4.setText("4  "); //$NON-NLS-1$
					this.jCB_HH_4.setEnabled(false);

					//---- jCB_HH_5 ----
					this.jCB_HH_5.setText("5  "); //$NON-NLS-1$
					this.jCB_HH_5.setEnabled(false);

					//---- jCB_HH_6 ----
					this.jCB_HH_6.setText("6  "); //$NON-NLS-1$
					this.jCB_HH_6.setEnabled(false);

					//---- jCB_HH_7 ----
					this.jCB_HH_7.setText("7  "); //$NON-NLS-1$
					this.jCB_HH_7.setEnabled(false);

					//---- jCB_HH_8 ----
					this.jCB_HH_8.setText("8  "); //$NON-NLS-1$
					this.jCB_HH_8.setEnabled(false);

					//---- jCB_HH_9 ----
					this.jCB_HH_9.setText("9  "); //$NON-NLS-1$
					this.jCB_HH_9.setEnabled(false);

					//---- jCB_HH_10 ----
					this.jCB_HH_10.setText("10  "); //$NON-NLS-1$
					this.jCB_HH_10.setEnabled(false);

					//---- jCB_HH_11 ----
					this.jCB_HH_11.setText("11  "); //$NON-NLS-1$
					this.jCB_HH_11.setEnabled(false);

					//---- jCB_HH_12 ----
					this.jCB_HH_12.setText("12  "); //$NON-NLS-1$
					this.jCB_HH_12.setEnabled(false);

					//---- jCB_HH_13 ----
					this.jCB_HH_13.setText("13  "); //$NON-NLS-1$
					this.jCB_HH_13.setEnabled(false);

					//---- jCB_HH_14 ----
					this.jCB_HH_14.setText("14  "); //$NON-NLS-1$
					this.jCB_HH_14.setEnabled(false);

					//---- jCB_HH_15 ----
					this.jCB_HH_15.setText("15  "); //$NON-NLS-1$
					this.jCB_HH_15.setEnabled(false);

					//---- jCB_HH_16 ----
					this.jCB_HH_16.setText("16  "); //$NON-NLS-1$
					this.jCB_HH_16.setEnabled(false);

					//---- jCB_HH_17 ----
					this.jCB_HH_17.setText("17  "); //$NON-NLS-1$
					this.jCB_HH_17.setEnabled(false);

					//---- jCB_HH_18 ----
					this.jCB_HH_18.setText("18  "); //$NON-NLS-1$
					this.jCB_HH_18.setEnabled(false);

					//---- jCB_HH_19 ----
					this.jCB_HH_19.setText("19  "); //$NON-NLS-1$
					this.jCB_HH_19.setEnabled(false);

					//---- jCB_HH_20 ----
					this.jCB_HH_20.setText("20  "); //$NON-NLS-1$
					this.jCB_HH_20.setEnabled(false);

					//---- jCB_HH_21 ----
					this.jCB_HH_21.setText("21  "); //$NON-NLS-1$
					this.jCB_HH_21.setEnabled(false);

					//---- jCB_HH_22 ----
					this.jCB_HH_22.setText("22  "); //$NON-NLS-1$
					this.jCB_HH_22.setEnabled(false);

					//---- jCB_HH_23 ----
					this.jCB_HH_23.setText("23  "); //$NON-NLS-1$
					this.jCB_HH_23.setEnabled(false);

					//---- jLabel16 ----
					this.jLabel16.setText("AM:"); //$NON-NLS-1$

					//---- jLabel17 ----
					this.jLabel17.setText("PM:"); //$NON-NLS-1$

					GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
					jPanel9.setLayout(jPanel9Layout);
					jPanel9Layout.setHorizontalGroup(
						jPanel9Layout.createParallelGroup()
							.addGroup(jPanel9Layout.createSequentialGroup()
								.addGap(2, 2, 2)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jLabel16)
									.addComponent(this.jLabel17))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_12)
									.addComponent(this.jCB_HH_0))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_1)
									.addComponent(this.jCB_HH_13))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addGroup(jPanel9Layout.createSequentialGroup()
										.addComponent(this.jCB_HH_14)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(this.jCB_HH_15))
									.addGroup(jPanel9Layout.createSequentialGroup()
										.addComponent(this.jCB_HH_2)
										.addGap(8, 8, 8)
										.addComponent(this.jCB_HH_3)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_4)
									.addComponent(this.jCB_HH_16))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_5)
									.addComponent(this.jCB_HH_17))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_6)
									.addComponent(this.jCB_HH_18))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_7)
									.addComponent(this.jCB_HH_19))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_8)
									.addComponent(this.jCB_HH_20))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_9)
									.addComponent(this.jCB_HH_21))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_10, GroupLayout.Alignment.TRAILING)
									.addComponent(this.jCB_HH_22))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup()
									.addComponent(this.jCB_HH_11)
									.addComponent(this.jCB_HH_23))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					jPanel9Layout.setVerticalGroup(
						jPanel9Layout.createParallelGroup()
							.addGroup(jPanel9Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(jPanel9Layout.createSequentialGroup()
										.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(this.jCB_HH_11)
											.addComponent(this.jCB_HH_10)
											.addComponent(this.jCB_HH_9))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(this.jCB_HH_21)
											.addComponent(this.jCB_HH_22)
											.addComponent(this.jCB_HH_23)))
									.addGroup(jPanel9Layout.createSequentialGroup()
										.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(this.jCB_HH_0)
											.addComponent(this.jCB_HH_8)
											.addComponent(this.jCB_HH_7)
											.addComponent(this.jCB_HH_6)
											.addComponent(this.jCB_HH_5)
											.addComponent(this.jCB_HH_4)
											.addComponent(this.jCB_HH_3)
											.addComponent(this.jCB_HH_2)
											.addComponent(this.jCB_HH_1)
											.addComponent(this.jLabel16))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(this.jCB_HH_12)
											.addComponent(this.jCB_HH_13)
											.addComponent(this.jCB_HH_14)
											.addComponent(this.jCB_HH_15)
											.addComponent(this.jCB_HH_16)
											.addComponent(this.jCB_HH_17)
											.addComponent(this.jCB_HH_18)
											.addComponent(this.jCB_HH_19)
											.addComponent(this.jCB_HH_20)
											.addComponent(this.jLabel17))))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				GroupLayout jPanel_HourLayout = new GroupLayout(this.jPanel_Hour);
				jPanel_Hour.setLayout(jPanel_HourLayout);
				jPanel_HourLayout.setHorizontalGroup(
					jPanel_HourLayout.createParallelGroup()
						.addGroup(jPanel_HourLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel_HourLayout.createParallelGroup()
								.addGroup(jPanel_HourLayout.createSequentialGroup()
									.addGap(21, 21, 21)
									.addComponent(this.jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(this.jRB_HH_Assign)
								.addComponent(this.jRB_HH_Every))
							.addContainerGap(43, Short.MAX_VALUE))
				);
				jPanel_HourLayout.setVerticalGroup(
					jPanel_HourLayout.createParallelGroup()
						.addGroup(jPanel_HourLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jRB_HH_Every)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(this.jRB_HH_Assign)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(105, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Hour", this.jPanel_Hour); //$NON-NLS-1$

			//======== jPanel_Day ========
			{

				//---- jRB_DD_Every ----
				this.jRB_DD_Every.setSelected(true);
				this.jRB_DD_Every.setText("Per Day"); //$NON-NLS-1$

				//---- jRB_DD_Assign ----
				this.jRB_DD_Assign.setText("Assign:"); //$NON-NLS-1$

				//======== jPanel10 ========
				{
					this.jPanel10.setBorder(new EtchedBorder());

					//---- jCB_DD_1 ----
					this.jCB_DD_1.setText("1"); //$NON-NLS-1$
					this.jCB_DD_1.setEnabled(false);

					//---- jCB_DD_2 ----
					this.jCB_DD_2.setText("2"); //$NON-NLS-1$
					this.jCB_DD_2.setEnabled(false);

					//---- jCB_DD_3 ----
					this.jCB_DD_3.setText("3"); //$NON-NLS-1$
					this.jCB_DD_3.setEnabled(false);

					//---- jCB_DD_4 ----
					this.jCB_DD_4.setText("4"); //$NON-NLS-1$
					this.jCB_DD_4.setEnabled(false);

					//---- jCB_DD_5 ----
					this.jCB_DD_5.setText("5"); //$NON-NLS-1$
					this.jCB_DD_5.setEnabled(false);

					//---- jCB_DD_6 ----
					this.jCB_DD_6.setText("6"); //$NON-NLS-1$
					this.jCB_DD_6.setEnabled(false);

					//---- jCB_DD_7 ----
					this.jCB_DD_7.setText("7"); //$NON-NLS-1$
					this.jCB_DD_7.setEnabled(false);

					//---- jCB_DD_8 ----
					this.jCB_DD_8.setText("8"); //$NON-NLS-1$
					this.jCB_DD_8.setEnabled(false);

					//---- jCB_DD_9 ----
					this.jCB_DD_9.setText("9"); //$NON-NLS-1$
					this.jCB_DD_9.setEnabled(false);

					//---- jCB_DD_10 ----
					this.jCB_DD_10.setText("10"); //$NON-NLS-1$
					this.jCB_DD_10.setEnabled(false);

					//---- jCB_DD_11 ----
					this.jCB_DD_11.setText("11"); //$NON-NLS-1$
					this.jCB_DD_11.setEnabled(false);

					//---- jCB_DD_12 ----
					this.jCB_DD_12.setText("12"); //$NON-NLS-1$
					this.jCB_DD_12.setEnabled(false);

					//---- jCB_DD_13 ----
					this.jCB_DD_13.setText("13"); //$NON-NLS-1$
					this.jCB_DD_13.setEnabled(false);

					//---- jCB_DD_14 ----
					this.jCB_DD_14.setText("14"); //$NON-NLS-1$
					this.jCB_DD_14.setEnabled(false);

					//---- jCB_DD_15 ----
					this.jCB_DD_15.setText("15"); //$NON-NLS-1$
					this.jCB_DD_15.setEnabled(false);

					//---- jCB_DD_16 ----
					this.jCB_DD_16.setText("16"); //$NON-NLS-1$
					this.jCB_DD_16.setEnabled(false);

					//---- jCB_DD_17 ----
					this.jCB_DD_17.setText("17"); //$NON-NLS-1$
					this.jCB_DD_17.setEnabled(false);

					//---- jCB_DD_18 ----
					this.jCB_DD_18.setText("18"); //$NON-NLS-1$
					this.jCB_DD_18.setEnabled(false);

					//---- jCB_DD_19 ----
					this.jCB_DD_19.setText("19"); //$NON-NLS-1$
					this.jCB_DD_19.setEnabled(false);

					//---- jCB_DD_20 ----
					this.jCB_DD_20.setText("20"); //$NON-NLS-1$
					this.jCB_DD_20.setEnabled(false);

					//---- jCB_DD_21 ----
					this.jCB_DD_21.setText("21"); //$NON-NLS-1$
					this.jCB_DD_21.setEnabled(false);

					//---- jCB_DD_22 ----
					this.jCB_DD_22.setText("22"); //$NON-NLS-1$
					this.jCB_DD_22.setEnabled(false);

					//---- jCB_DD_23 ----
					this.jCB_DD_23.setText("23"); //$NON-NLS-1$
					this.jCB_DD_23.setEnabled(false);

					//---- jCB_DD_24 ----
					this.jCB_DD_24.setText("24"); //$NON-NLS-1$
					this.jCB_DD_24.setEnabled(false);

					//---- jCB_DD_25 ----
					this.jCB_DD_25.setText("25"); //$NON-NLS-1$
					this.jCB_DD_25.setEnabled(false);

					//---- jCB_DD_26 ----
					this.jCB_DD_26.setText("26"); //$NON-NLS-1$
					this.jCB_DD_26.setEnabled(false);

					//---- jCB_DD_27 ----
					this.jCB_DD_27.setText("27"); //$NON-NLS-1$
					this.jCB_DD_27.setEnabled(false);

					//---- jCB_DD_28 ----
					this.jCB_DD_28.setText("28"); //$NON-NLS-1$
					this.jCB_DD_28.setEnabled(false);

					//---- jCB_DD_29 ----
					this.jCB_DD_29.setText("29"); //$NON-NLS-1$
					this.jCB_DD_29.setEnabled(false);

					//---- jCB_DD_30 ----
					this.jCB_DD_30.setText("30"); //$NON-NLS-1$
					this.jCB_DD_30.setEnabled(false);

					//---- jCB_DD_31 ----
					this.jCB_DD_31.setText("31"); //$NON-NLS-1$
					this.jCB_DD_31.setEnabled(false);

					GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
					jPanel10.setLayout(jPanel10Layout);
					jPanel10Layout.setHorizontalGroup(
						jPanel10Layout.createParallelGroup()
							.addGroup(jPanel10Layout.createSequentialGroup()
								.addGroup(jPanel10Layout.createParallelGroup()
									.addGroup(jPanel10Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(jPanel10Layout.createParallelGroup()
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_1)
												.addGap(7, 7, 7)
												.addComponent(this.jCB_DD_2))
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_16)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jCB_DD_17)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_3)
											.addComponent(this.jCB_DD_18))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_19)
											.addComponent(this.jCB_DD_4))
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_5)
												.addGap(7, 7, 7)
												.addComponent(this.jCB_DD_6)
												.addGap(7, 7, 7)
												.addComponent(this.jCB_DD_7))
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_20)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jCB_DD_21)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(this.jCB_DD_22)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_23)
											.addComponent(this.jCB_DD_8))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_9)
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_24)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_DD_25)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_26)
											.addComponent(this.jCB_DD_11))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_12)
											.addComponent(this.jCB_DD_27))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addComponent(this.jCB_DD_28)
											.addComponent(this.jCB_DD_13))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel10Layout.createParallelGroup()
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_14)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_DD_15))
											.addGroup(jPanel10Layout.createSequentialGroup()
												.addComponent(this.jCB_DD_29)
												.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(this.jCB_DD_30))))
									.addGroup(jPanel10Layout.createSequentialGroup()
										.addGap(367, 367, 367)
										.addComponent(this.jCB_DD_10))
									.addGroup(jPanel10Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(this.jCB_DD_31)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					jPanel10Layout.setVerticalGroup(
						jPanel10Layout.createParallelGroup()
							.addGroup(jPanel10Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel10Layout.createParallelGroup()
									.addComponent(this.jCB_DD_1)
									.addComponent(this.jCB_DD_2)
									.addComponent(this.jCB_DD_3)
									.addComponent(this.jCB_DD_4)
									.addComponent(this.jCB_DD_5)
									.addComponent(this.jCB_DD_6)
									.addComponent(this.jCB_DD_7)
									.addComponent(this.jCB_DD_8)
									.addComponent(this.jCB_DD_9)
									.addComponent(this.jCB_DD_10)
									.addComponent(this.jCB_DD_11)
									.addComponent(this.jCB_DD_12)
									.addComponent(this.jCB_DD_13)
									.addComponent(this.jCB_DD_14)
									.addComponent(this.jCB_DD_15))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addComponent(this.jCB_DD_20)
									.addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jCB_DD_16)
										.addComponent(this.jCB_DD_17)
										.addComponent(this.jCB_DD_18)
										.addComponent(this.jCB_DD_19))
									.addComponent(this.jCB_DD_30)
									.addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jCB_DD_21)
										.addComponent(this.jCB_DD_22)
										.addComponent(this.jCB_DD_23)
										.addComponent(this.jCB_DD_24)
										.addComponent(this.jCB_DD_25)
										.addComponent(this.jCB_DD_26)
										.addComponent(this.jCB_DD_27)
										.addComponent(this.jCB_DD_28)
										.addComponent(this.jCB_DD_29)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(this.jCB_DD_31)
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				GroupLayout jPanel_DayLayout = new GroupLayout(this.jPanel_Day);
				jPanel_Day.setLayout(jPanel_DayLayout);
				jPanel_DayLayout.setHorizontalGroup(
					jPanel_DayLayout.createParallelGroup()
						.addGroup(jPanel_DayLayout.createSequentialGroup()
							.addGroup(jPanel_DayLayout.createParallelGroup()
								.addGroup(jPanel_DayLayout.createSequentialGroup()
									.addContainerGap()
									.addGroup(jPanel_DayLayout.createParallelGroup()
										.addComponent(this.jRB_DD_Assign)
										.addComponent(this.jRB_DD_Every)))
								.addGroup(jPanel_DayLayout.createSequentialGroup()
									.addGap(29, 29, 29)
									.addComponent(this.jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				jPanel_DayLayout.setVerticalGroup(
					jPanel_DayLayout.createParallelGroup()
						.addGroup(jPanel_DayLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jRB_DD_Every)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(this.jRB_DD_Assign)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(75, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Day", this.jPanel_Day); //$NON-NLS-1$

			//======== jPanel_Month ========
			{

				//---- jRB_MM_Every ----
				this.jRB_MM_Every.setSelected(true);
				this.jRB_MM_Every.setText("Per Month"); //$NON-NLS-1$

				//---- jRB_MM_Assign ----
				this.jRB_MM_Assign.setText("Assign:"); //$NON-NLS-1$

				//======== jPanel11 ========
				{
					this.jPanel11.setBorder(new EtchedBorder());

					//---- jCB_MM_1 ----
					this.jCB_MM_1.setText("1  "); //$NON-NLS-1$
					this.jCB_MM_1.setEnabled(false);

					//---- jCB_MM_2 ----
					this.jCB_MM_2.setText("2  "); //$NON-NLS-1$
					this.jCB_MM_2.setEnabled(false);

					//---- jCB_MM_3 ----
					this.jCB_MM_3.setText("3  "); //$NON-NLS-1$
					this.jCB_MM_3.setEnabled(false);

					//---- jCB_MM_4 ----
					this.jCB_MM_4.setText("4  "); //$NON-NLS-1$
					this.jCB_MM_4.setEnabled(false);

					//---- jCB_MM_5 ----
					this.jCB_MM_5.setText("5  "); //$NON-NLS-1$
					this.jCB_MM_5.setEnabled(false);

					//---- jCB_MM_6 ----
					this.jCB_MM_6.setText("6  "); //$NON-NLS-1$
					this.jCB_MM_6.setEnabled(false);

					//---- jCB_MM_7 ----
					this.jCB_MM_7.setText("7  "); //$NON-NLS-1$
					this.jCB_MM_7.setEnabled(false);

					//---- jCB_MM_8 ----
					this.jCB_MM_8.setText("8  "); //$NON-NLS-1$
					this.jCB_MM_8.setEnabled(false);

					//---- jCB_MM_9 ----
					this.jCB_MM_9.setText("9  "); //$NON-NLS-1$
					this.jCB_MM_9.setEnabled(false);

					//---- jCB_MM_10 ----
					this.jCB_MM_10.setText("10  "); //$NON-NLS-1$
					this.jCB_MM_10.setEnabled(false);

					//---- jCB_MM_11 ----
					this.jCB_MM_11.setText("11  "); //$NON-NLS-1$
					this.jCB_MM_11.setEnabled(false);

					//---- jCB_MM_12 ----
					this.jCB_MM_12.setText("12  "); //$NON-NLS-1$
					this.jCB_MM_12.setEnabled(false);

					GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
					jPanel11.setLayout(jPanel11Layout);
					jPanel11Layout.setHorizontalGroup(
						jPanel11Layout.createParallelGroup()
							.addGroup(jPanel11Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel11Layout.createParallelGroup()
									.addGroup(jPanel11Layout.createSequentialGroup()
										.addComponent(this.jCB_MM_1)
										.addGap(7, 7, 7)
										.addComponent(this.jCB_MM_2))
									.addGroup(jPanel11Layout.createSequentialGroup()
										.addComponent(this.jCB_MM_7)
										.addGap(7, 7, 7)
										.addComponent(this.jCB_MM_8)))
								.addGap(11, 11, 11)
								.addGroup(jPanel11Layout.createParallelGroup()
									.addComponent(this.jCB_MM_3, GroupLayout.Alignment.TRAILING)
									.addComponent(this.jCB_MM_9, GroupLayout.Alignment.TRAILING))
								.addGroup(jPanel11Layout.createParallelGroup()
									.addGroup(jPanel11Layout.createSequentialGroup()
										.addGap(8, 8, 8)
										.addComponent(this.jCB_MM_4))
									.addGroup(jPanel11Layout.createSequentialGroup()
										.addGap(7, 7, 7)
										.addComponent(this.jCB_MM_10)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel11Layout.createParallelGroup()
									.addComponent(this.jCB_MM_5)
									.addComponent(this.jCB_MM_11))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel11Layout.createParallelGroup()
									.addComponent(this.jCB_MM_12)
									.addComponent(this.jCB_MM_6))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
					jPanel11Layout.setVerticalGroup(
						jPanel11Layout.createParallelGroup()
							.addGroup(jPanel11Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_MM_1)
									.addComponent(this.jCB_MM_6)
									.addComponent(this.jCB_MM_5)
									.addComponent(this.jCB_MM_4)
									.addComponent(this.jCB_MM_3)
									.addComponent(this.jCB_MM_2))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jCB_MM_12)
										.addComponent(this.jCB_MM_11)
										.addComponent(this.jCB_MM_10))
									.addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jCB_MM_8)
										.addComponent(this.jCB_MM_7)
										.addComponent(this.jCB_MM_9)))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				GroupLayout jPanel_MonthLayout = new GroupLayout(this.jPanel_Month);
				jPanel_Month.setLayout(jPanel_MonthLayout);
				jPanel_MonthLayout.setHorizontalGroup(
					jPanel_MonthLayout.createParallelGroup()
						.addGroup(jPanel_MonthLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel_MonthLayout.createParallelGroup()
								.addGroup(jPanel_MonthLayout.createSequentialGroup()
									.addGap(21, 21, 21)
									.addComponent(this.jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(this.jRB_MM_Assign)
								.addComponent(this.jRB_MM_Every))
							.addContainerGap(398, Short.MAX_VALUE))
				);
				jPanel_MonthLayout.setVerticalGroup(
					jPanel_MonthLayout.createParallelGroup()
						.addGroup(jPanel_MonthLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jRB_MM_Every)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(this.jRB_MM_Assign)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(111, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Month", this.jPanel_Month); //$NON-NLS-1$

			//======== jPanel_Week ========
			{

				//---- jCB_WK_Use ----
				this.jCB_WK_Use.setText("Use Week"); //$NON-NLS-1$

				//======== jPanel1_WK ========
				{
					this.jPanel1_WK.setBorder(new EtchedBorder());

					//---- jCB_WK_1 ----
					this.jCB_WK_1.setText("Sunday"); //$NON-NLS-1$
					this.jCB_WK_1.setEnabled(false);

					//---- jCB_WK_2 ----
					this.jCB_WK_2.setText("Monday"); //$NON-NLS-1$
					this.jCB_WK_2.setEnabled(false);

					//---- jCB_WK_3 ----
					this.jCB_WK_3.setText("Tuesday"); //$NON-NLS-1$
					this.jCB_WK_3.setEnabled(false);

					//---- jCB_WK_4 ----
					this.jCB_WK_4.setText("Wednesday"); //$NON-NLS-1$
					this.jCB_WK_4.setEnabled(false);

					//---- jCB_WK_5 ----
					this.jCB_WK_5.setText("Thursday"); //$NON-NLS-1$
					this.jCB_WK_5.setEnabled(false);

					//---- jCB_WK_6 ----
					this.jCB_WK_6.setText("Friday"); //$NON-NLS-1$
					this.jCB_WK_6.setEnabled(false);

					//---- jCB_WK_7 ----
					this.jCB_WK_7.setText("Saturday"); //$NON-NLS-1$
					this.jCB_WK_7.setEnabled(false);

					//---- jRB_WK_Every ----
					this.jRB_WK_Every.setSelected(true);
					this.jRB_WK_Every.setText("Per Week"); //$NON-NLS-1$
					this.jRB_WK_Every.setEnabled(false);

					//---- jRB_WK_Assign ----
					this.jRB_WK_Assign.setText("Assign:"); //$NON-NLS-1$
					this.jRB_WK_Assign.setEnabled(false);

					GroupLayout jPanel1_WKLayout = new GroupLayout(this.jPanel1_WK);
					jPanel1_WK.setLayout(jPanel1_WKLayout);
					jPanel1_WKLayout.setHorizontalGroup(
						jPanel1_WKLayout.createParallelGroup()
							.addGroup(jPanel1_WKLayout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel1_WKLayout.createParallelGroup()
									.addGroup(jPanel1_WKLayout.createSequentialGroup()
										.addGap(21, 21, 21)
										.addComponent(this.jCB_WK_1)
										.addGap(11, 11, 11)
										.addComponent(this.jCB_WK_2)
										.addGap(8, 8, 8)
										.addComponent(this.jCB_WK_3)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(this.jCB_WK_4)
										.addGap(7, 7, 7)
										.addComponent(this.jCB_WK_5)
										.addGap(7, 7, 7)
										.addComponent(this.jCB_WK_6)
										.addGap(7, 7, 7)
										.addComponent(this.jCB_WK_7))
									.addComponent(this.jRB_WK_Every)
									.addComponent(this.jRB_WK_Assign))
								.addContainerGap(35, Short.MAX_VALUE))
					);
					jPanel1_WKLayout.setVerticalGroup(
						jPanel1_WKLayout.createParallelGroup()
							.addGroup(jPanel1_WKLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.jRB_WK_Every)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(this.jRB_WK_Assign)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1_WKLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jCB_WK_7)
									.addComponent(this.jCB_WK_6)
									.addComponent(this.jCB_WK_5)
									.addComponent(this.jCB_WK_4)
									.addComponent(this.jCB_WK_3)
									.addComponent(this.jCB_WK_2)
									.addComponent(this.jCB_WK_1))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					);
				}

				GroupLayout jPanel_WeekLayout = new GroupLayout(this.jPanel_Week);
				jPanel_Week.setLayout(jPanel_WeekLayout);
				jPanel_WeekLayout.setHorizontalGroup(
					jPanel_WeekLayout.createParallelGroup()
						.addGroup(jPanel_WeekLayout.createParallelGroup()
							.addGroup(jPanel_WeekLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(this.jPanel1_WK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(101, Short.MAX_VALUE)))
						.addGroup(jPanel_WeekLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jCB_WK_Use)
							.addContainerGap(650, Short.MAX_VALUE))
				);
				jPanel_WeekLayout.setVerticalGroup(
					jPanel_WeekLayout.createParallelGroup()
						.addGroup(jPanel_WeekLayout.createParallelGroup()
							.addGroup(jPanel_WeekLayout.createSequentialGroup()
								.addGap(39, 39, 39)
								.addComponent(this.jPanel1_WK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(102, Short.MAX_VALUE)))
						.addGroup(jPanel_WeekLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(this.jCB_WK_Use)
							.addContainerGap(223, Short.MAX_VALUE))
				);
			}
			this.jTabbedPane1.addTab("Week", this.jPanel_Week); //$NON-NLS-1$
		}

		//======== jPanel2 ========
		{
			this.jPanel2.setBorder(new TitledBorder(new EtchedBorder(), "Expression")); //$NON-NLS-1$
			this.jPanel2.setPreferredSize(new Dimension(661, 100));

			//---- jLabel1 ----
			this.jLabel1.setText("Field:"); //$NON-NLS-1$

			//---- jLabel2 ----
			this.jLabel2.setText("Second"); //$NON-NLS-1$

			//---- jLabel3 ----
			this.jLabel3.setText("Minute"); //$NON-NLS-1$

			//---- jLabel4 ----
			this.jLabel4.setText("Hour"); //$NON-NLS-1$

			//---- jLabel5 ----
			this.jLabel5.setText("Day"); //$NON-NLS-1$

			//---- jLabel6 ----
			this.jLabel6.setText("Month"); //$NON-NLS-1$

			//---- jLabel7 ----
			this.jLabel7.setText("Week"); //$NON-NLS-1$

			//---- jLabel8 ----
			this.jLabel8.setText("Cron Expression:"); //$NON-NLS-1$

			//---- jTF_Cron_Second ----
			this.jTF_Cron_Second.setBackground(Color.orange);

			//---- jTF_Cron_Minute ----
			this.jTF_Cron_Minute.setBackground(Color.orange);

			//---- jTF_Cron_Hour ----
			this.jTF_Cron_Hour.setBackground(Color.orange);

			//---- jTF_Cron_Day ----
			this.jTF_Cron_Day.setBackground(Color.orange);

			//---- jTF_Cron_Month ----
			this.jTF_Cron_Month.setBackground(Color.orange);

			//---- jTF_Cron_Week ----
			this.jTF_Cron_Week.setBackground(Color.orange);

			//---- jButton_Parse ----
			this.jButton_Parse.setText("Resolve To UI"); //$NON-NLS-1$

			//======== jPanel13 ========
			{
				this.jPanel13.setBorder(new TitledBorder(new EtchedBorder(), "Plan Execute Time")); //$NON-NLS-1$

				//---- jLabel13 ----
				this.jLabel13.setText("Start time:"); //$NON-NLS-1$

				//---- jTF_Schedule_Start ----
				this.jTF_Schedule_Start.setEditable(false);

				//---- jLabel14 ----
				this.jLabel14.setText("Execute Time:"); //$NON-NLS-1$

				//======== jScrollPane1 ========
				{

					//---- jTA_Schedule_Next ----
					this.jTA_Schedule_Next.setBackground(UIManager.getColor("CheckBox.background")); //$NON-NLS-1$
					this.jTA_Schedule_Next.setColumns(20);
					this.jTA_Schedule_Next.setEditable(false);
					this.jTA_Schedule_Next.setRows(5);
					this.jScrollPane1.setViewportView(this.jTA_Schedule_Next);
				}

				GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
				jPanel13.setLayout(jPanel13Layout);
				jPanel13Layout.setHorizontalGroup(
					jPanel13Layout.createParallelGroup()
						.addGroup(jPanel13Layout.createSequentialGroup()
							.addContainerGap()
							.addGroup(jPanel13Layout.createParallelGroup()
								.addComponent(this.jLabel14)
								.addComponent(this.jLabel13))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(jPanel13Layout.createParallelGroup()
								.addComponent(this.jTF_Schedule_Start)
								.addComponent(this.jScrollPane1))
							.addContainerGap())
				);
				jPanel13Layout.setVerticalGroup(
					jPanel13Layout.createParallelGroup()
						.addGroup(jPanel13Layout.createSequentialGroup()
							.addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(this.jLabel13)
								.addComponent(this.jTF_Schedule_Start, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel13Layout.createParallelGroup()
								.addGroup(jPanel13Layout.createSequentialGroup()
									.addComponent(this.jLabel14)
									.addContainerGap())
								.addComponent(this.jScrollPane1, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
				);
			}

			GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
			jPanel2.setLayout(jPanel2Layout);
			jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup()
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup()
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup()
									.addComponent(this.jLabel8, GroupLayout.Alignment.TRAILING)
									.addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING))
								.addGap(18, 18, 18)
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jLabel2)
											.addComponent(this.jTF_Cron_Second, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jTF_Cron_Minute, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(this.jLabel3))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jTF_Cron_Hour, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(this.jLabel4))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jTF_Cron_Day, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(this.jLabel5))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jTF_Cron_Month, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addComponent(this.jLabel6)))
									.addComponent(this.jTF_Cron_Exp))
								.addGap(18, 18, 18)
								.addGroup(jPanel2Layout.createParallelGroup()
									.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup()
											.addComponent(this.jLabel7)
											.addComponent(this.jTF_Cron_Week, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE))
									.addComponent(this.jButton_Parse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addComponent(this.jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
			);
			jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup()
					.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(this.jLabel2)
							.addComponent(this.jLabel3)
							.addComponent(this.jLabel4)
							.addComponent(this.jLabel5)
							.addComponent(this.jLabel6)
							.addComponent(this.jLabel7))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(this.jTF_Cron_Second, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jTF_Cron_Minute, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jTF_Cron_Hour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jTF_Cron_Day, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jTF_Cron_Month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jTF_Cron_Week, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(this.jLabel1))
						.addGroup(jPanel2Layout.createParallelGroup()
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(21, 21, 21)
								.addComponent(this.jLabel8))
							.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(18, 18, 18)
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(this.jTF_Cron_Exp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(this.jButton_Parse))))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(this.jPanel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
		}

		//======== jPanel3 ========
		{
			this.jPanel3.setAlignmentX(0.0F);
			this.jPanel3.setAlignmentY(0.0F);

			//---- jButton_Copy ----
			this.jButton_Copy.setText("Copy Cron Expression"); //$NON-NLS-1$

			//---- jButton_Exit ----
			this.jButton_Exit.setText("Quit"); //$NON-NLS-1$

			GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
			jPanel3.setLayout(jPanel3Layout);
			jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup()
					.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(this.jButton_Copy)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
						.addComponent(this.jButton_Exit, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGap(248, 248, 248))
			);
			jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup()
					.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(this.jButton_Copy)
						.addComponent(this.jButton_Exit))
			);
		}

		//---- jButton_Make ----
		this.jButton_Make.setText("Generate Cron Expression"); //$NON-NLS-1$
		this.jButton_Make.setAlignmentY(0.0F);

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(this.jButton_Make)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(this.jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
							.addComponent(this.jPanel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
							.addComponent(this.jTabbedPane1, GroupLayout.Alignment.LEADING)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(this.jTabbedPane1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(this.jPanel2, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(this.jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(this.jButton_Make))
					.addContainerGap())
		);
		setSize(770, 765);
		setLocationRelativeTo(null);

		//---- buttonGroup0 ----
		this.buttonGroup0.add(this.jRB_SE_Loop);
		this.buttonGroup0.add(this.jRB_SE_Assign);
		this.buttonGroup0.add(this.jRB_SE_Every);

		//---- buttonGroup1 ----
		this.buttonGroup1.add(this.jRB_MU_Loop);
		this.buttonGroup1.add(this.jRB_MU_Assign);
		this.buttonGroup1.add(this.jRB_MU_Every);

		//---- buttonGroup2 ----
		this.buttonGroup2.add(this.jRB_HH_Every);
		this.buttonGroup2.add(this.jRB_HH_Assign);

		//---- buttonGroup3 ----
		this.buttonGroup3.add(this.jRB_DD_Every);
		this.buttonGroup3.add(this.jRB_DD_Assign);

		//---- buttonGroup4 ----
		this.buttonGroup4.add(this.jRB_MM_Every);
		this.buttonGroup4.add(this.jRB_MM_Assign);

		//---- buttonGroup5 ----
		this.buttonGroup5.add(this.jRB_WK_Every);
		this.buttonGroup5.add(this.jRB_WK_Assign);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	protected JTabbedPane jTabbedPane1;
	protected JPanel jPanel_Second;
	protected JLabel label;
	protected JSpinner jSP_SE_From;
	protected JLabel lblSecondStartevery;
	protected JSpinner jSP_SE_Every;
	protected JLabel lblSecondExecute;
	protected JRadioButton jRB_SE_Loop;
	protected JRadioButton jRB_SE_Assign;
	protected JPanel jPanel_BoxSecond;
	protected JCheckBox jCB_SE_0;
	protected JCheckBox jCB_SE_1;
	protected JCheckBox jCB_SE_2;
	protected JCheckBox jCB_SE_3;
	protected JCheckBox jCB_SE_4;
	protected JCheckBox jCB_SE_5;
	protected JCheckBox jCB_SE_6;
	protected JCheckBox jCB_SE_7;
	protected JCheckBox jCB_SE_8;
	protected JCheckBox jCB_SE_9;
	protected JCheckBox jCB_SE_10;
	protected JCheckBox jCB_SE_11;
	protected JCheckBox jCB_SE_12;
	protected JCheckBox jCB_SE_13;
	protected JCheckBox jCB_SE_14;
	protected JCheckBox jCB_SE_15;
	protected JCheckBox jCB_SE_16;
	protected JCheckBox jCB_SE_17;
	protected JCheckBox jCB_SE_18;
	protected JCheckBox jCB_SE_19;
	protected JCheckBox jCB_SE_20;
	protected JCheckBox jCB_SE_21;
	protected JCheckBox jCB_SE_22;
	protected JCheckBox jCB_SE_23;
	protected JCheckBox jCB_SE_24;
	protected JCheckBox jCB_SE_25;
	protected JCheckBox jCB_SE_26;
	protected JCheckBox jCB_SE_27;
	protected JCheckBox jCB_SE_28;
	protected JCheckBox jCB_SE_29;
	protected JCheckBox jCB_SE_30;
	protected JCheckBox jCB_SE_31;
	protected JCheckBox jCB_SE_32;
	protected JCheckBox jCB_SE_33;
	protected JCheckBox jCB_SE_34;
	protected JCheckBox jCB_SE_35;
	protected JCheckBox jCB_SE_36;
	protected JCheckBox jCB_SE_37;
	protected JCheckBox jCB_SE_38;
	protected JCheckBox jCB_SE_39;
	protected JCheckBox jCB_SE_40;
	protected JCheckBox jCB_SE_41;
	protected JCheckBox jCB_SE_42;
	protected JCheckBox jCB_SE_43;
	protected JCheckBox jCB_SE_44;
	protected JCheckBox jCB_SE_45;
	protected JCheckBox jCB_SE_46;
	protected JCheckBox jCB_SE_47;
	protected JCheckBox jCB_SE_48;
	protected JCheckBox jCB_SE_49;
	protected JCheckBox jCB_SE_50;
	protected JCheckBox jCB_SE_51;
	protected JCheckBox jCB_SE_52;
	protected JCheckBox jCB_SE_53;
	protected JCheckBox jCB_SE_54;
	protected JCheckBox jCB_SE_55;
	protected JCheckBox jCB_SE_56;
	protected JCheckBox jCB_SE_57;
	protected JCheckBox jCB_SE_58;
	protected JCheckBox jCB_SE_59;
	protected JRadioButton jRB_SE_Every;
	protected JPanel jPanel4;
	protected JLabel jLabel9;
	protected JSpinner jSP_MU_From;
	protected JLabel jLabel10;
	protected JSpinner jSP_MU_Every;
	protected JLabel jLabel12;
	protected JRadioButton jRB_MU_Loop;
	protected JRadioButton jRB_MU_Assign;
	protected JPanel jPanel12;
	protected JCheckBox jCB_MU_0;
	protected JCheckBox jCB_MU_1;
	protected JCheckBox jCB_MU_2;
	protected JCheckBox jCB_MU_3;
	protected JCheckBox jCB_MU_4;
	protected JCheckBox jCB_MU_5;
	protected JCheckBox jCB_MU_6;
	protected JCheckBox jCB_MU_7;
	protected JCheckBox jCB_MU_8;
	protected JCheckBox jCB_MU_9;
	protected JCheckBox jCB_MU_10;
	protected JCheckBox jCB_MU_11;
	protected JCheckBox jCB_MU_12;
	protected JCheckBox jCB_MU_13;
	protected JCheckBox jCB_MU_14;
	protected JCheckBox jCB_MU_15;
	protected JCheckBox jCB_MU_16;
	protected JCheckBox jCB_MU_17;
	protected JCheckBox jCB_MU_18;
	protected JCheckBox jCB_MU_19;
	protected JCheckBox jCB_MU_20;
	protected JCheckBox jCB_MU_21;
	protected JCheckBox jCB_MU_22;
	protected JCheckBox jCB_MU_23;
	protected JCheckBox jCB_MU_24;
	protected JCheckBox jCB_MU_25;
	protected JCheckBox jCB_MU_26;
	protected JCheckBox jCB_MU_27;
	protected JCheckBox jCB_MU_28;
	protected JCheckBox jCB_MU_29;
	protected JCheckBox jCB_MU_30;
	protected JCheckBox jCB_MU_31;
	protected JCheckBox jCB_MU_32;
	protected JCheckBox jCB_MU_33;
	protected JCheckBox jCB_MU_34;
	protected JCheckBox jCB_MU_35;
	protected JCheckBox jCB_MU_36;
	protected JCheckBox jCB_MU_37;
	protected JCheckBox jCB_MU_38;
	protected JCheckBox jCB_MU_39;
	protected JCheckBox jCB_MU_40;
	protected JCheckBox jCB_MU_41;
	protected JCheckBox jCB_MU_42;
	protected JCheckBox jCB_MU_43;
	protected JCheckBox jCB_MU_44;
	protected JCheckBox jCB_MU_45;
	protected JCheckBox jCB_MU_46;
	protected JCheckBox jCB_MU_47;
	protected JCheckBox jCB_MU_48;
	protected JCheckBox jCB_MU_49;
	protected JCheckBox jCB_MU_50;
	protected JCheckBox jCB_MU_51;
	protected JCheckBox jCB_MU_52;
	protected JCheckBox jCB_MU_53;
	protected JCheckBox jCB_MU_54;
	protected JCheckBox jCB_MU_55;
	protected JCheckBox jCB_MU_56;
	protected JCheckBox jCB_MU_57;
	protected JCheckBox jCB_MU_58;
	protected JCheckBox jCB_MU_59;
	protected JRadioButton jRB_MU_Every;
	protected JPanel jPanel_Hour;
	protected JRadioButton jRB_HH_Every;
	protected JRadioButton jRB_HH_Assign;
	protected JPanel jPanel9;
	protected JCheckBox jCB_HH_0;
	protected JCheckBox jCB_HH_1;
	protected JCheckBox jCB_HH_2;
	protected JCheckBox jCB_HH_3;
	protected JCheckBox jCB_HH_4;
	protected JCheckBox jCB_HH_5;
	protected JCheckBox jCB_HH_6;
	protected JCheckBox jCB_HH_7;
	protected JCheckBox jCB_HH_8;
	protected JCheckBox jCB_HH_9;
	protected JCheckBox jCB_HH_10;
	protected JCheckBox jCB_HH_11;
	protected JCheckBox jCB_HH_12;
	protected JCheckBox jCB_HH_13;
	protected JCheckBox jCB_HH_14;
	protected JCheckBox jCB_HH_15;
	protected JCheckBox jCB_HH_16;
	protected JCheckBox jCB_HH_17;
	protected JCheckBox jCB_HH_18;
	protected JCheckBox jCB_HH_19;
	protected JCheckBox jCB_HH_20;
	protected JCheckBox jCB_HH_21;
	protected JCheckBox jCB_HH_22;
	protected JCheckBox jCB_HH_23;
	protected JLabel jLabel16;
	protected JLabel jLabel17;
	protected JPanel jPanel_Day;
	protected JRadioButton jRB_DD_Every;
	protected JRadioButton jRB_DD_Assign;
	protected JPanel jPanel10;
	protected JCheckBox jCB_DD_1;
	protected JCheckBox jCB_DD_2;
	protected JCheckBox jCB_DD_3;
	protected JCheckBox jCB_DD_4;
	protected JCheckBox jCB_DD_5;
	protected JCheckBox jCB_DD_6;
	protected JCheckBox jCB_DD_7;
	protected JCheckBox jCB_DD_8;
	protected JCheckBox jCB_DD_9;
	protected JCheckBox jCB_DD_10;
	protected JCheckBox jCB_DD_11;
	protected JCheckBox jCB_DD_12;
	protected JCheckBox jCB_DD_13;
	protected JCheckBox jCB_DD_14;
	protected JCheckBox jCB_DD_15;
	protected JCheckBox jCB_DD_16;
	protected JCheckBox jCB_DD_17;
	protected JCheckBox jCB_DD_18;
	protected JCheckBox jCB_DD_19;
	protected JCheckBox jCB_DD_20;
	protected JCheckBox jCB_DD_21;
	protected JCheckBox jCB_DD_22;
	protected JCheckBox jCB_DD_23;
	protected JCheckBox jCB_DD_24;
	protected JCheckBox jCB_DD_25;
	protected JCheckBox jCB_DD_26;
	protected JCheckBox jCB_DD_27;
	protected JCheckBox jCB_DD_28;
	protected JCheckBox jCB_DD_29;
	protected JCheckBox jCB_DD_30;
	protected JCheckBox jCB_DD_31;
	protected JPanel jPanel_Month;
	protected JRadioButton jRB_MM_Every;
	protected JRadioButton jRB_MM_Assign;
	protected JPanel jPanel11;
	protected JCheckBox jCB_MM_1;
	protected JCheckBox jCB_MM_2;
	protected JCheckBox jCB_MM_3;
	protected JCheckBox jCB_MM_4;
	protected JCheckBox jCB_MM_5;
	protected JCheckBox jCB_MM_6;
	protected JCheckBox jCB_MM_7;
	protected JCheckBox jCB_MM_8;
	protected JCheckBox jCB_MM_9;
	protected JCheckBox jCB_MM_10;
	protected JCheckBox jCB_MM_11;
	protected JCheckBox jCB_MM_12;
	protected JPanel jPanel_Week;
	protected JCheckBox jCB_WK_Use;
	protected JPanel jPanel1_WK;
	protected JCheckBox jCB_WK_1;
	protected JCheckBox jCB_WK_2;
	protected JCheckBox jCB_WK_3;
	protected JCheckBox jCB_WK_4;
	protected JCheckBox jCB_WK_5;
	protected JCheckBox jCB_WK_6;
	protected JCheckBox jCB_WK_7;
	protected JRadioButton jRB_WK_Every;
	protected JRadioButton jRB_WK_Assign;
	protected JPanel jPanel2;
	protected JLabel jLabel1;
	protected JLabel jLabel2;
	protected JLabel jLabel3;
	protected JLabel jLabel4;
	protected JLabel jLabel5;
	protected JLabel jLabel6;
	protected JLabel jLabel7;
	protected JLabel jLabel8;
	protected JTextField jTF_Cron_Second;
	protected JTextField jTF_Cron_Minute;
	protected JTextField jTF_Cron_Hour;
	protected JTextField jTF_Cron_Day;
	protected JTextField jTF_Cron_Month;
	protected JTextField jTF_Cron_Week;
	protected JTextField jTF_Cron_Exp;
	protected JButton jButton_Parse;
	protected JPanel jPanel13;
	protected JLabel jLabel13;
	protected JTextField jTF_Schedule_Start;
	protected JLabel jLabel14;
	protected JScrollPane jScrollPane1;
	protected JTextArea jTA_Schedule_Next;
	protected JPanel jPanel3;
	protected JButton jButton_Copy;
	protected JButton jButton_Exit;
	protected JButton jButton_Make;
	protected ButtonGroup buttonGroup0;
	protected ButtonGroup buttonGroup1;
	protected ButtonGroup buttonGroup2;
	protected ButtonGroup buttonGroup3;
	protected ButtonGroup buttonGroup4;
	protected ButtonGroup buttonGroup5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
