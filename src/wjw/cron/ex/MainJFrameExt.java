/*
 * MainJFrame.java
 *
 * Created on Oct 31, 2010, 7:11:40 PM
 */
package wjw.cron.ex;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 * 
 * @author Administrator
 */
public class MainJFrameExt extends MainJFrameUi {
  final static Font fontPLAIN = new Font("Dialog", Font.PLAIN, 12);
  final static Font fontBOLD = new Font("Dialog", Font.BOLD | Font.ITALIC, 12);
  
  CheckBoxItemListener _checkBoxItemListener = new CheckBoxItemListener();
  SEItemListener _SEItemListener = new SEItemListener();
  MUItemListener _MUItemListener = new MUItemListener();
  HHItemListener _HHItemListener = new HHItemListener();
  DDItemListener _DDItemListener = new DDItemListener();
  MMItemListener _MMItemListener = new MMItemListener();
  WKItemListener _WKItemListener = new WKItemListener();
  SpinnerNumberModel _sp_SE_From_Model = new SpinnerNumberModel(0, 0, 59, 1);
  SpinnerNumberModel _sp_SE_Every_Model = new SpinnerNumberModel(5, 1, 50, 1);
  SpinnerNumberModel _sp_MU_From_Model = new SpinnerNumberModel(0, 0, 59, 1);
  SpinnerNumberModel _sp_MU_Every_Model = new SpinnerNumberModel(5, 1, 50, 1);
  java.util.Map<Integer, JCheckBox> _jCB_SE_Map = new java.util.TreeMap<Integer, JCheckBox>();
  java.util.Map<Integer, JCheckBox> _jCB_MU_Map = new java.util.TreeMap<Integer, JCheckBox>();
  java.util.Map<Integer, JCheckBox> _jCB_HH_Map = new java.util.TreeMap<Integer, JCheckBox>();
  java.util.Map<Integer, JCheckBox> _jCB_DD_Map = new java.util.TreeMap<Integer, JCheckBox>();
  java.util.Map<Integer, JCheckBox> _jCB_MM_Map = new java.util.TreeMap<Integer, JCheckBox>();
  java.util.Map<Integer, JCheckBox> _jCB_WK_Map = new java.util.TreeMap<Integer, JCheckBox>();

  /** Creates new form MainJFrame */
  public MainJFrameExt() {
    super();
    postInitUI();
  }

  public void postInitUI() {
    jSP_SE_From.setModel(_sp_SE_From_Model);
    jSP_MU_From.setModel(_sp_MU_From_Model);

    jSP_SE_Every.setModel(_sp_SE_Every_Model);
    jSP_MU_Every.setModel(_sp_MU_Every_Model);

    jCB_WK_Use.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jCB_WK_UseItemStateChanged(evt);
      }
    });
    
    jButton_Parse.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_ParseActionPerformed(evt);
      }
    });

    jButton_Copy.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_CopyActionPerformed(evt);
      }
    });

    jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_ExitActionPerformed(evt);
      }
    });

    jButton_Make.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_MakeActionPerformed(evt);
      }
    });
    
    jRB_SE_Every.addItemListener(_SEItemListener);
    jRB_SE_Loop.addItemListener(_SEItemListener);
    jRB_SE_Assign.addItemListener(_SEItemListener);

    jRB_MU_Every.addItemListener(_MUItemListener);
    jRB_MU_Loop.addItemListener(_MUItemListener);
    jRB_MU_Assign.addItemListener(_MUItemListener);

    jRB_HH_Every.addItemListener(_HHItemListener);
    jRB_HH_Assign.addItemListener(_HHItemListener);

    jRB_DD_Every.addItemListener(_DDItemListener);
    jRB_DD_Assign.addItemListener(_DDItemListener);

    jRB_MM_Every.addItemListener(_MMItemListener);
    jRB_MM_Assign.addItemListener(_MMItemListener);

    jRB_WK_Every.addItemListener(_WKItemListener);
    jRB_WK_Assign.addItemListener(_WKItemListener);

    //秒
    _jCB_SE_Map.put(0, jCB_SE_0);
    _jCB_SE_Map.put(1, jCB_SE_1);
    _jCB_SE_Map.put(2, jCB_SE_2);
    _jCB_SE_Map.put(3, jCB_SE_3);
    _jCB_SE_Map.put(4, jCB_SE_4);
    _jCB_SE_Map.put(5, jCB_SE_5);
    _jCB_SE_Map.put(6, jCB_SE_6);
    _jCB_SE_Map.put(7, jCB_SE_7);
    _jCB_SE_Map.put(8, jCB_SE_8);
    _jCB_SE_Map.put(9, jCB_SE_9);
    _jCB_SE_Map.put(10, jCB_SE_10);
    _jCB_SE_Map.put(11, jCB_SE_11);
    _jCB_SE_Map.put(12, jCB_SE_12);
    _jCB_SE_Map.put(13, jCB_SE_13);
    _jCB_SE_Map.put(14, jCB_SE_14);
    _jCB_SE_Map.put(15, jCB_SE_15);
    _jCB_SE_Map.put(16, jCB_SE_16);
    _jCB_SE_Map.put(17, jCB_SE_17);
    _jCB_SE_Map.put(18, jCB_SE_18);
    _jCB_SE_Map.put(19, jCB_SE_19);
    _jCB_SE_Map.put(20, jCB_SE_20);
    _jCB_SE_Map.put(21, jCB_SE_21);
    _jCB_SE_Map.put(22, jCB_SE_22);
    _jCB_SE_Map.put(23, jCB_SE_23);
    _jCB_SE_Map.put(24, jCB_SE_24);
    _jCB_SE_Map.put(25, jCB_SE_25);
    _jCB_SE_Map.put(26, jCB_SE_26);
    _jCB_SE_Map.put(27, jCB_SE_27);
    _jCB_SE_Map.put(28, jCB_SE_28);
    _jCB_SE_Map.put(29, jCB_SE_29);
    _jCB_SE_Map.put(30, jCB_SE_30);
    _jCB_SE_Map.put(31, jCB_SE_31);
    _jCB_SE_Map.put(32, jCB_SE_32);
    _jCB_SE_Map.put(33, jCB_SE_33);
    _jCB_SE_Map.put(34, jCB_SE_34);
    _jCB_SE_Map.put(35, jCB_SE_35);
    _jCB_SE_Map.put(36, jCB_SE_36);
    _jCB_SE_Map.put(37, jCB_SE_37);
    _jCB_SE_Map.put(38, jCB_SE_38);
    _jCB_SE_Map.put(39, jCB_SE_39);
    _jCB_SE_Map.put(40, jCB_SE_40);
    _jCB_SE_Map.put(41, jCB_SE_41);
    _jCB_SE_Map.put(42, jCB_SE_42);
    _jCB_SE_Map.put(43, jCB_SE_43);
    _jCB_SE_Map.put(44, jCB_SE_44);
    _jCB_SE_Map.put(45, jCB_SE_45);
    _jCB_SE_Map.put(46, jCB_SE_46);
    _jCB_SE_Map.put(47, jCB_SE_47);
    _jCB_SE_Map.put(48, jCB_SE_48);
    _jCB_SE_Map.put(49, jCB_SE_49);
    _jCB_SE_Map.put(50, jCB_SE_50);
    _jCB_SE_Map.put(51, jCB_SE_51);
    _jCB_SE_Map.put(52, jCB_SE_52);
    _jCB_SE_Map.put(53, jCB_SE_53);
    _jCB_SE_Map.put(54, jCB_SE_54);
    _jCB_SE_Map.put(55, jCB_SE_55);
    _jCB_SE_Map.put(56, jCB_SE_56);
    _jCB_SE_Map.put(57, jCB_SE_57);
    _jCB_SE_Map.put(58, jCB_SE_58);
    _jCB_SE_Map.put(59, jCB_SE_59);
    for (JCheckBox cb : _jCB_SE_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    //分钟
    _jCB_MU_Map.put(0, jCB_MU_0);
    _jCB_MU_Map.put(1, jCB_MU_1);
    _jCB_MU_Map.put(2, jCB_MU_2);
    _jCB_MU_Map.put(3, jCB_MU_3);
    _jCB_MU_Map.put(4, jCB_MU_4);
    _jCB_MU_Map.put(5, jCB_MU_5);
    _jCB_MU_Map.put(6, jCB_MU_6);
    _jCB_MU_Map.put(7, jCB_MU_7);
    _jCB_MU_Map.put(8, jCB_MU_8);
    _jCB_MU_Map.put(9, jCB_MU_9);
    _jCB_MU_Map.put(10, jCB_MU_10);
    _jCB_MU_Map.put(11, jCB_MU_11);
    _jCB_MU_Map.put(12, jCB_MU_12);
    _jCB_MU_Map.put(13, jCB_MU_13);
    _jCB_MU_Map.put(14, jCB_MU_14);
    _jCB_MU_Map.put(15, jCB_MU_15);
    _jCB_MU_Map.put(16, jCB_MU_16);
    _jCB_MU_Map.put(17, jCB_MU_17);
    _jCB_MU_Map.put(18, jCB_MU_18);
    _jCB_MU_Map.put(19, jCB_MU_19);
    _jCB_MU_Map.put(20, jCB_MU_20);
    _jCB_MU_Map.put(21, jCB_MU_21);
    _jCB_MU_Map.put(22, jCB_MU_22);
    _jCB_MU_Map.put(23, jCB_MU_23);
    _jCB_MU_Map.put(24, jCB_MU_24);
    _jCB_MU_Map.put(25, jCB_MU_25);
    _jCB_MU_Map.put(26, jCB_MU_26);
    _jCB_MU_Map.put(27, jCB_MU_27);
    _jCB_MU_Map.put(28, jCB_MU_28);
    _jCB_MU_Map.put(29, jCB_MU_29);
    _jCB_MU_Map.put(30, jCB_MU_30);
    _jCB_MU_Map.put(31, jCB_MU_31);
    _jCB_MU_Map.put(32, jCB_MU_32);
    _jCB_MU_Map.put(33, jCB_MU_33);
    _jCB_MU_Map.put(34, jCB_MU_34);
    _jCB_MU_Map.put(35, jCB_MU_35);
    _jCB_MU_Map.put(36, jCB_MU_36);
    _jCB_MU_Map.put(37, jCB_MU_37);
    _jCB_MU_Map.put(38, jCB_MU_38);
    _jCB_MU_Map.put(39, jCB_MU_39);
    _jCB_MU_Map.put(40, jCB_MU_40);
    _jCB_MU_Map.put(41, jCB_MU_41);
    _jCB_MU_Map.put(42, jCB_MU_42);
    _jCB_MU_Map.put(43, jCB_MU_43);
    _jCB_MU_Map.put(44, jCB_MU_44);
    _jCB_MU_Map.put(45, jCB_MU_45);
    _jCB_MU_Map.put(46, jCB_MU_46);
    _jCB_MU_Map.put(47, jCB_MU_47);
    _jCB_MU_Map.put(48, jCB_MU_48);
    _jCB_MU_Map.put(49, jCB_MU_49);
    _jCB_MU_Map.put(50, jCB_MU_50);
    _jCB_MU_Map.put(51, jCB_MU_51);
    _jCB_MU_Map.put(52, jCB_MU_52);
    _jCB_MU_Map.put(53, jCB_MU_53);
    _jCB_MU_Map.put(54, jCB_MU_54);
    _jCB_MU_Map.put(55, jCB_MU_55);
    _jCB_MU_Map.put(56, jCB_MU_56);
    _jCB_MU_Map.put(57, jCB_MU_57);
    _jCB_MU_Map.put(58, jCB_MU_58);
    _jCB_MU_Map.put(59, jCB_MU_59);
    for (JCheckBox cb : _jCB_MU_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    _jCB_HH_Map.put(0, jCB_HH_0);
    _jCB_HH_Map.put(1, jCB_HH_1);
    _jCB_HH_Map.put(2, jCB_HH_2);
    _jCB_HH_Map.put(3, jCB_HH_3);
    _jCB_HH_Map.put(4, jCB_HH_4);
    _jCB_HH_Map.put(5, jCB_HH_5);
    _jCB_HH_Map.put(6, jCB_HH_6);
    _jCB_HH_Map.put(7, jCB_HH_7);
    _jCB_HH_Map.put(8, jCB_HH_8);
    _jCB_HH_Map.put(9, jCB_HH_9);
    _jCB_HH_Map.put(10, jCB_HH_10);
    _jCB_HH_Map.put(11, jCB_HH_11);
    _jCB_HH_Map.put(12, jCB_HH_12);
    _jCB_HH_Map.put(13, jCB_HH_13);
    _jCB_HH_Map.put(14, jCB_HH_14);
    _jCB_HH_Map.put(15, jCB_HH_15);
    _jCB_HH_Map.put(16, jCB_HH_16);
    _jCB_HH_Map.put(17, jCB_HH_17);
    _jCB_HH_Map.put(18, jCB_HH_18);
    _jCB_HH_Map.put(19, jCB_HH_19);
    _jCB_HH_Map.put(20, jCB_HH_20);
    _jCB_HH_Map.put(21, jCB_HH_21);
    _jCB_HH_Map.put(22, jCB_HH_22);
    _jCB_HH_Map.put(23, jCB_HH_23);
    for (JCheckBox cb : _jCB_HH_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    _jCB_DD_Map.put(1, jCB_DD_1);
    _jCB_DD_Map.put(2, jCB_DD_2);
    _jCB_DD_Map.put(3, jCB_DD_3);
    _jCB_DD_Map.put(4, jCB_DD_4);
    _jCB_DD_Map.put(5, jCB_DD_5);
    _jCB_DD_Map.put(6, jCB_DD_6);
    _jCB_DD_Map.put(7, jCB_DD_7);
    _jCB_DD_Map.put(8, jCB_DD_8);
    _jCB_DD_Map.put(9, jCB_DD_9);
    _jCB_DD_Map.put(10, jCB_DD_10);
    _jCB_DD_Map.put(11, jCB_DD_11);
    _jCB_DD_Map.put(12, jCB_DD_12);
    _jCB_DD_Map.put(13, jCB_DD_13);
    _jCB_DD_Map.put(14, jCB_DD_14);
    _jCB_DD_Map.put(15, jCB_DD_15);
    _jCB_DD_Map.put(16, jCB_DD_16);
    _jCB_DD_Map.put(17, jCB_DD_17);
    _jCB_DD_Map.put(18, jCB_DD_18);
    _jCB_DD_Map.put(19, jCB_DD_19);
    _jCB_DD_Map.put(20, jCB_DD_20);
    _jCB_DD_Map.put(21, jCB_DD_21);
    _jCB_DD_Map.put(22, jCB_DD_22);
    _jCB_DD_Map.put(23, jCB_DD_23);
    _jCB_DD_Map.put(24, jCB_DD_24);
    _jCB_DD_Map.put(25, jCB_DD_25);
    _jCB_DD_Map.put(26, jCB_DD_26);
    _jCB_DD_Map.put(27, jCB_DD_27);
    _jCB_DD_Map.put(28, jCB_DD_28);
    _jCB_DD_Map.put(29, jCB_DD_29);
    _jCB_DD_Map.put(30, jCB_DD_30);
    _jCB_DD_Map.put(31, jCB_DD_31);
    for (JCheckBox cb : _jCB_DD_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    _jCB_MM_Map.put(1, jCB_MM_1);
    _jCB_MM_Map.put(2, jCB_MM_2);
    _jCB_MM_Map.put(3, jCB_MM_3);
    _jCB_MM_Map.put(4, jCB_MM_4);
    _jCB_MM_Map.put(5, jCB_MM_5);
    _jCB_MM_Map.put(6, jCB_MM_6);
    _jCB_MM_Map.put(7, jCB_MM_7);
    _jCB_MM_Map.put(8, jCB_MM_8);
    _jCB_MM_Map.put(9, jCB_MM_9);
    _jCB_MM_Map.put(10, jCB_MM_10);
    _jCB_MM_Map.put(11, jCB_MM_11);
    _jCB_MM_Map.put(12, jCB_MM_12);
    for (JCheckBox cb : _jCB_MM_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    _jCB_WK_Map.put(1, jCB_WK_1);
    _jCB_WK_Map.put(2, jCB_WK_2);
    _jCB_WK_Map.put(3, jCB_WK_3);
    _jCB_WK_Map.put(4, jCB_WK_4);
    _jCB_WK_Map.put(5, jCB_WK_5);
    _jCB_WK_Map.put(6, jCB_WK_6);
    _jCB_WK_Map.put(7, jCB_WK_7);
    for (JCheckBox cb : _jCB_WK_Map.values()) {
      cb.addItemListener(this._checkBoxItemListener);
    }

    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        okOrCancel();
      }
    });

    setSize(790, 765);
  }

  /**
   * 询问是否关闭程序
   * 
   * @return boolean
   */
  void okOrCancel() {
    int answer = JOptionPane.showConfirmDialog(this, "是否要退出?", this.getTitle(), JOptionPane.YES_NO_OPTION);
    if (answer == JOptionPane.YES_OPTION) {
      this.dispose();
      System.exit(0);
    }
  }
  
  private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {
    okOrCancel();
  }

  @SuppressWarnings("rawtypes")
  private void jButton_ParseActionPerformed(java.awt.event.ActionEvent evt) {
    try {
      if (jTF_Cron_Exp.getText().trim().length() == 0) {
        return;
      }

      jTA_Schedule_Next.setText("");
      CronExpressionEx exp = new CronExpressionEx(jTF_Cron_Exp.getText().trim());
      java.util.Date dd = new java.util.Date();
      jTF_Schedule_Start.setText(DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd));
      for (int i = 1; i <= 8; i++) {
        dd = exp.getNextValidTimeAfter(dd);
        jTA_Schedule_Next.append(i + ": " + DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd) + "\n");
        dd = new java.util.Date(dd.getTime() + 1000);
      }

      jTF_Cron_Second.setText(exp.getSecondsExp());
      jTF_Cron_Minute.setText(exp.getMinutesExp());
      jTF_Cron_Hour.setText(exp.getHoursExp());
      jTF_Cron_Day.setText(exp.getDaysOfMonthExp());
      jTF_Cron_Month.setText(exp.getMonthsExp());
      jTF_Cron_Week.setText(exp.getDaysOfWeekExp());

      //秒
      for (JCheckBox cb : _jCB_SE_Map.values()) {
        cb.setSelected(false);
      }
      Set set = exp.getSecondsSet();
      Iterator itr = set.iterator();
      if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jRB_SE_Every.setSelected(true);
      } else {
        if (jTF_Cron_Second.getText().contains("/")) {
          jRB_SE_Loop.setSelected(true);

          Integer iFrom = (Integer) itr.next();
          Integer iTo = (Integer) itr.next();
          int interval = iTo - iFrom;
          _sp_SE_From_Model.setValue(iFrom);
          _sp_SE_Every_Model.setValue(interval);
        } else {
          jRB_SE_Assign.setSelected(true);
          while (itr.hasNext()) {
            Integer iVal = (Integer) itr.next();
            _jCB_SE_Map.get(iVal).setSelected(true);
          }
        }
      }

      //分钟
      for (JCheckBox cb : _jCB_MU_Map.values()) {
        cb.setSelected(false);
      }
      set = exp.getMinutesSet();
      itr = set.iterator();
      if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jRB_MU_Every.setSelected(true);
      } else {
        if (jTF_Cron_Minute.getText().contains("/")) {
          jRB_MU_Loop.setSelected(true);

          Integer iFrom = (Integer) itr.next();
          Integer iTo = (Integer) itr.next();
          int interval = iTo - iFrom;
          _sp_MU_From_Model.setValue(iFrom);
          _sp_MU_Every_Model.setValue(interval);
        } else {
          jRB_MU_Assign.setSelected(true);
          while (itr.hasNext()) {
            Integer iVal = (Integer) itr.next();
            _jCB_MU_Map.get(iVal).setSelected(true);
          }
        }
      }

      //时间
      for (JCheckBox cb : _jCB_HH_Map.values()) {
        cb.setSelected(false);
      }
      set = exp.getHoursSet();
      itr = set.iterator();
      if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jRB_HH_Every.setSelected(true);
      } else {
        jRB_HH_Assign.setSelected(true);

        while (itr.hasNext()) {
          Integer iVal = (Integer) itr.next();
          _jCB_HH_Map.get(iVal).setSelected(true);
        }
      }

      //天
      for (JCheckBox cb : _jCB_DD_Map.values()) {
        cb.setSelected(false);
      }
      set = exp.getDaysOfMonthSet();
      itr = set.iterator();
      if (set.contains(CronExpressionEx.NO_SPEC_INT)) { //是'?'
        //
      } else if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jRB_DD_Every.setSelected(true);
      } else {
        jRB_DD_Assign.setSelected(true);

        while (itr.hasNext()) {
          Integer iVal = (Integer) itr.next();
          _jCB_DD_Map.get(iVal).setSelected(true);
        }
      }

      //月
      for (JCheckBox cb : _jCB_MM_Map.values()) {
        cb.setSelected(false);
      }
      set = exp.getMonthsSet();
      itr = set.iterator();
      if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jRB_MM_Every.setSelected(true);
      } else {
        jRB_MM_Assign.setSelected(true);

        while (itr.hasNext()) {
          Integer iVal = (Integer) itr.next();
          _jCB_MM_Map.get(iVal).setSelected(true);
        }
      }

      //礼拜
      for (JCheckBox cb : _jCB_WK_Map.values()) {
        cb.setSelected(false);
      }
      jCB_WK_Use.setSelected(true);
      set = exp.getDaysOfWeekSet();
      itr = set.iterator();
      if (set.contains(CronExpressionEx.NO_SPEC_INT)) { //是'?'
        jCB_WK_Use.setSelected(false);
      } else if (set.contains(CronExpressionEx.ALL_SPEC)) { //是'*'
        jCB_WK_Use.setSelected(true);
        jRB_WK_Every.setSelected(true);
      } else {
        jCB_WK_Use.setSelected(true);
        jRB_WK_Assign.setSelected(true);

        while (itr.hasNext()) {
          Integer iVal = (Integer) itr.next();
          _jCB_WK_Map.get(iVal).setSelected(true);
        }
      }

    } catch (Throwable ex) {
      //ex.printStackTrace();
      JOptionPane.showMessageDialog(this, "解析Cron表达式发生错误:" + ex);
    }
  }

  private void jButton_CopyActionPerformed(java.awt.event.ActionEvent evt) {
    //复制Cron表达式到剪切板
    jTF_Cron_Exp.selectAll();
    jTF_Cron_Exp.copy();
  }

  private void jCB_WK_UseItemStateChanged(java.awt.event.ItemEvent evt) {
    jRB_WK_Every.setEnabled(jCB_WK_Use.isSelected());
    jRB_WK_Assign.setEnabled(jCB_WK_Use.isSelected());

    for (JCheckBox cb : _jCB_WK_Map.values()) {
      cb.setEnabled(jCB_WK_Use.isSelected() && jRB_WK_Assign.isSelected());
    }
  }

  private void jButton_MakeActionPerformed(java.awt.event.ActionEvent evt) {
    //生成Cron表达式
    try {
      if (jRB_SE_Every.isSelected()) {
        jTF_Cron_Second.setText("*");
      } else {
        if (jRB_SE_Loop.isSelected()) {
          jTF_Cron_Second.setText(jSP_SE_From.getValue().toString() + "/" + jSP_SE_Every.getValue().toString());
        } else {
          StringBuilder buf = new StringBuilder();
          boolean first = true;
          for (int key : _jCB_SE_Map.keySet()) {
            JCheckBox cb = _jCB_SE_Map.get(key);
            if (cb.isSelected()) {
              if (!first) {
                buf.append(",");
              }
              buf.append(key);
              first = false;
            }
          }
          jTF_Cron_Second.setText(buf.toString());
          if (jTF_Cron_Second.getText().length() == 0) {
            throw new VerifyError("没有指定秒!");
          }
        }
      }

      if (jRB_MU_Every.isSelected()) {
        jTF_Cron_Minute.setText("*");
      } else {
        if (jRB_MU_Loop.isSelected()) {
          jTF_Cron_Minute.setText(jSP_MU_From.getValue().toString() + "/" + jSP_MU_Every.getValue().toString());
        } else {
          StringBuilder buf = new StringBuilder();
          boolean first = true;
          for (int key : _jCB_HH_Map.keySet()) {
            JCheckBox cb = _jCB_HH_Map.get(key);
            if (cb.isSelected()) {
              if (!first) {
                buf.append(",");
              }
              buf.append(key);
              first = false;
            }
          }
          jTF_Cron_Minute.setText(buf.toString());
          if (jTF_Cron_Minute.getText().length() == 0) {
            throw new VerifyError("没有指定分钟!");
          }
        }
      }

      if (jRB_HH_Every.isSelected()) {
        jTF_Cron_Hour.setText("*");
      } else {
        StringBuilder buf = new StringBuilder();
        boolean first = true;
        for (int key : _jCB_HH_Map.keySet()) {
          JCheckBox cb = _jCB_HH_Map.get(key);
          if (cb.isSelected()) {
            if (!first) {
              buf.append(",");
            }
            buf.append(key);
            first = false;
          }
        }
        jTF_Cron_Hour.setText(buf.toString());
        if (jTF_Cron_Hour.getText().length() == 0) {
          throw new VerifyError("没有指定小时!");
        }
      }

      if (jCB_WK_Use.isSelected()) {
        jTF_Cron_Day.setText("?");
        if (jRB_WK_Every.isSelected()) {
          jTF_Cron_Week.setText("*");
        } else {
          StringBuilder buf = new StringBuilder();
          boolean first = true;
          for (int key : _jCB_WK_Map.keySet()) {
            JCheckBox cb = _jCB_WK_Map.get(key);
            if (cb.isSelected()) {
              if (!first) {
                buf.append(",");
              }
              buf.append(key);
              first = false;
            }
          }
          jTF_Cron_Week.setText(buf.toString());
          if (jTF_Cron_Week.getText().length() == 0) {
            throw new VerifyError("没有指定礼拜!");
          }

        }
      } else {
        jTF_Cron_Week.setText("?");
        if (jRB_DD_Every.isSelected()) {
          jTF_Cron_Day.setText("*");
        } else {
          StringBuilder buf = new StringBuilder();
          boolean first = true;
          for (int key : _jCB_DD_Map.keySet()) {
            JCheckBox cb = _jCB_DD_Map.get(key);
            if (cb.isSelected()) {
              if (!first) {
                buf.append(",");
              }
              buf.append(key);
              first = false;
            }
          }
          jTF_Cron_Day.setText(buf.toString());
          if (jTF_Cron_Day.getText().length() == 0) {
            throw new VerifyError("没有指定天!");
          }
        }
      }

      if (jRB_MM_Every.isSelected()) {
        jTF_Cron_Month.setText("*");
      } else {
        StringBuilder buf = new StringBuilder();
        boolean first = true;
        for (int key : _jCB_MM_Map.keySet()) {
          JCheckBox cb = _jCB_MM_Map.get(key);
          if (cb.isSelected()) {
            if (!first) {
              buf.append(",");
            }
            buf.append(key);
            first = false;
          }
        }
        jTF_Cron_Month.setText(buf.toString());
        if (jTF_Cron_Month.getText().length() == 0) {
          throw new VerifyError("没有指定月份!");
        }
      }

      String cronStr = jTF_Cron_Second.getText() + " " + jTF_Cron_Minute.getText()
          + " " + jTF_Cron_Hour.getText() + " " + jTF_Cron_Day.getText()
          + " " + jTF_Cron_Month.getText() + " " + jTF_Cron_Week.getText();

      CronExpressionEx exp = new CronExpressionEx(cronStr);
      jTF_Cron_Exp.setText(exp.toString());

      jTA_Schedule_Next.setText("");
      java.util.Date dd = new java.util.Date();
      jTF_Schedule_Start.setText(DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd));
      for (int i = 1; i <= 8; i++) {
        dd = exp.getNextValidTimeAfter(dd);
        jTA_Schedule_Next.append(i + ": " + DateFormatUtil.format("yyyy-MM-dd HH:mm:ss", dd) + "\n");
        dd = new java.util.Date(dd.getTime() + 100);
      }
    } catch (Throwable ex) {
      JOptionPane.showMessageDialog(this, "生成Cron表达式发生错误:" + ex);
    }

  }

  class SEItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      if (jRB_SE_Every.isSelected()) {
        jSP_SE_From.setEnabled(false);
        jSP_SE_Every.setEnabled(false);
        for (JCheckBox cb : _jCB_SE_Map.values()) {
          cb.setEnabled(false);
        }
      } else {
        boolean selected = jRB_SE_Loop.isSelected();
        jSP_SE_From.setEnabled(selected);
        jSP_SE_Every.setEnabled(selected);
        for (JCheckBox cb : _jCB_SE_Map.values()) {
          cb.setEnabled(!selected);
        }
      }
    }
  }

  class MUItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      if (jRB_MU_Every.isSelected()) {
        jSP_MU_From.setEnabled(false);
        jSP_MU_Every.setEnabled(false);
        for (JCheckBox cb : _jCB_MU_Map.values()) {
          cb.setEnabled(false);
        }
      } else {
        boolean selected = jRB_MU_Loop.isSelected();
        jSP_MU_From.setEnabled(selected);
        jSP_MU_Every.setEnabled(selected);
        for (JCheckBox cb : _jCB_MU_Map.values()) {
          cb.setEnabled(!selected);
        }
      }
    }
  }

  class HHItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      for (JCheckBox cb : _jCB_HH_Map.values()) {
        cb.setEnabled(!jRB_HH_Every.isSelected());
      }
    }
  }

  class DDItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      for (JCheckBox cb : _jCB_DD_Map.values()) {
        cb.setEnabled(!jRB_DD_Every.isSelected());
      }
    }
  }

  class MMItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      for (JCheckBox cb : _jCB_MM_Map.values()) {
        cb.setEnabled(!jRB_MM_Every.isSelected());
      }
    }
  }

  class WKItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      for (JCheckBox cb : _jCB_WK_Map.values()) {
        cb.setEnabled(!jRB_WK_Every.isSelected());
      }
    }
  }

  class CheckBoxItemListener implements ItemListener {

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
      JCheckBox checkBox = (JCheckBox) evt.getSource();
      if (checkBox.isSelected()) {
        checkBox.setForeground(Color.blue);
        checkBox.setFont(fontBOLD);
      } else {
        checkBox.setForeground(Color.black);
        checkBox.setFont(fontPLAIN);
      }
    }
  }

}
