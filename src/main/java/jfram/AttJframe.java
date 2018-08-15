/*
 * AttJframe.java
 *
 * Created on __DATE__, __TIME__
 */

package jfram;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

/**
 *
 * @author  __USER__
 */
public class AttJframe extends javax.swing.JFrame {


	private java.awt.TextField excelPath;
	private JButton excelpushButton;
	private javax.swing.JLabel jLabel1;
	private java.awt.Label label1;
	private java.awt.Label label2;
	private java.awt.Label label3;
	private java.awt.Label label4;
	private java.awt.Label label5;
	private java.awt.TextField mobileId;
	private java.awt.Button searchButton;
	private java.awt.TextArea showResult;
	private java.awt.TextField wangwangId;
	private java.awt.TextField weixinId;





	public AttJframe() {
		initComponents();
	}


	private void initComponents() {


		label1 = new java.awt.Label();
		wangwangId = new java.awt.TextField();
		label2 = new java.awt.Label();
		label3 = new java.awt.Label();
		label4 = new java.awt.Label();
		weixinId = new java.awt.TextField();
		mobileId = new java.awt.TextField();
		searchButton = new java.awt.Button();
		showResult = new java.awt.TextArea();
		label5 = new java.awt.Label();
		jLabel1 = new javax.swing.JLabel();
		excelPath = new java.awt.TextField();
		excelpushButton = new JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		label1.setFont(new java.awt.Font("Dialog", 1, 18));
		label1.setForeground(new java.awt.Color(102, 102, 0));
		label1.setText("\u6587\u672c\u67e5\u91cd");

		label2.setFont(new java.awt.Font("Dialog", 1, 14));
		label2.setText("\u65fa\u65fa\u53f7");

		label3.setFont(new java.awt.Font("Dialog", 1, 14));
		label3.setText("\u5fae\u4fe1\u53f7");

		label4.setFont(new java.awt.Font("Dialog", 1, 14));
		label4.setText("\u624b\u673a\u53f7");

		searchButton.setFont(new java.awt.Font("Dialog", 1, 14));
		searchButton.setForeground(new java.awt.Color(255, 153, 153));
		searchButton.setLabel("\u67e5\u8be2");

		label5.setText("\u67e5\u8be2\u7ed3\u679c");

		jLabel1.setText("\u9009\u62e9\u6587\u4ef6");

		excelPath.setText("\u9009\u62e9\u6587\u4ef6\u76ee\u6807excel");

		excelpushButton.setFont(new java.awt.Font("Dialog", 1, 14));
		excelpushButton.setLabel("\u9009\u62e9");

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout
						.createSequentialGroup()
						.add(79, 79, 79)
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.LEADING)
								.add(label5,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(label2,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(jLabel1))
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.LEADING)
								.add(layout
										.createSequentialGroup()
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(showResult,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												647, Short.MAX_VALUE))
								.add(layout
										.createSequentialGroup()
										.add(15, 15, 15)
										.add(layout
												.createParallelGroup(
														org.jdesktop.layout.GroupLayout.LEADING)
												.add(layout
														.createSequentialGroup()
														.add(excelPath,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																245,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(51, 51, 51)
														.add(excelpushButton,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																49,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
												.add(layout
														.createSequentialGroup()
														.add(wangwangId,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																138,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(13, 13, 13)
														.add(layout
																.createParallelGroup(
																		org.jdesktop.layout.GroupLayout.LEADING)
																.add(searchButton,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		230,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																.add(layout
																		.createSequentialGroup()
																		.add(label3,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(22,
																				22,
																				22)
																		.add(weixinId,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				133,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(51,
																				51,
																				51)
																		.add(label4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(26,
																				26,
																				26)
																		.add(mobileId,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				137,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))))
						.addContainerGap(100, Short.MAX_VALUE))
				.add(org.jdesktop.layout.GroupLayout.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(369, Short.MAX_VALUE)
								.add(label1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										187,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(332, 332, 332)));
		layout.setVerticalGroup(layout
				.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(layout
						.createSequentialGroup()
						.add(18, 18, 18)
						.add(label1,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.add(24, 24, 24)
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.LEADING,
										false)
								.add(layout
										.createSequentialGroup()
										.add(jLabel1)
										.add(34, 34, 34)
										.add(label2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(layout
										.createSequentialGroup()
										.add(layout
												.createParallelGroup(
														org.jdesktop.layout.GroupLayout.TRAILING)
												.add(excelPath,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.add(excelpushButton,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												29, Short.MAX_VALUE)
										.add(layout
												.createParallelGroup(
														org.jdesktop.layout.GroupLayout.LEADING)
												.add(org.jdesktop.layout.GroupLayout.TRAILING,
														wangwangId,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.add(org.jdesktop.layout.GroupLayout.TRAILING,
														label3,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.add(org.jdesktop.layout.GroupLayout.TRAILING,
														layout.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
																.add(weixinId,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																.add(layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.TRAILING)
																		.add(mobileId,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(label4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
						.addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED)
						.add(layout
								.createParallelGroup(
										org.jdesktop.layout.GroupLayout.TRAILING)
								.add(layout
										.createSequentialGroup()
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(label5,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(160, 160, 160))
								.add(org.jdesktop.layout.GroupLayout.LEADING,
										layout.createSequentialGroup()
												.add(24, 24, 24)
												.add(searchButton,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.add(49, 49, 49)
												.add(showResult,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														183,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED)))
						.addContainerGap(85, Short.MAX_VALUE)));

		pack();
		excelpushButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("上传！！！！！");
				int result = 0;
				File file = null;
				String path = null;
				JFileChooser fileChooser = new JFileChooser();
				FileSystemView fsv = FileSystemView.getFileSystemView();
				System.out.println(fsv.getHomeDirectory());                //得到桌面路径
				fileChooser.setCurrentDirectory(fsv.getHomeDirectory());
				fileChooser.setDialogTitle("请选择要上传的文件...");
				fileChooser.setApproveButtonText("确定");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("请上传Excel文件", "xls", "xlsx");
				fileChooser.setFileFilter(filter);
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				result = fileChooser.showOpenDialog(null);
				path=fileChooser.getSelectedFile().getPath();
			}
		});



		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String string=FileUtils.getConTextPath()+"/config.ini";
				String s=FileUtils.ReadFile(string);
				System.out.println(s);
				excelPath.setText(s);
				String result="";
				StringBuffer sb=new StringBuffer();
				String wexinIds=weixinId.getText();
				String wangwang=wangwangId.getText();
				String mobile=mobileId.getText();
				//1.wangwang  2.weixin  3.mobile
//				List<IDs> ids=ExcelReaderUtil.readExcel(s);
				ParseExcel pe=new ParseExcel(s);
					if(!wangwang.equals("")){
						result=pe.isMatchById(wangwang,1);
					}if(!wexinIds.equals("")){
						result=result+" \n"+"微信"+pe.isMatchById(wexinIds,2);
					}if(!mobile.equals("")){
						result=result+" \n"+"手机号"+pe.isMatchById(mobile,3);
					}

				System.out.println(result);
				showResult.setText(result);
			}
		});


	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AttJframe().setVisible(true);
			}
		});
	}


}