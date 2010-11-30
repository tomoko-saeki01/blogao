package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.core.QDate;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QCalendarWidget;
import com.trolltech.qt.gui.QGridLayout;
import com.trolltech.qt.gui.QGroupBox;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLayout;
import com.trolltech.qt.gui.QWidget;

public class CalendarFrame extends QWidget {
	private QGroupBox previewGroupBox;
	private QGridLayout previewLayout;
	private QCalendarWidget calendar;

	public CalendarFrame() {		
		createPreviewGroupBox();
		init();
		show();
	}
	
	public QDate getSelectedDate() {	
		return calendar.selectedDate();
	}
	
	private void init() {
		QGridLayout layout = new QGridLayout();
		layout.addWidget(previewGroupBox, 0, 0);
		layout.setSizeConstraint(QLayout.SizeConstraint.SetFixedSize);
		setLayout(layout);

		previewLayout.setRowMinimumHeight(0, calendar.sizeHint().height());
		previewLayout.setColumnMinimumWidth(0, calendar.sizeHint().width());

		setWindowTitle("Calendário");
		setWindowIcon(new QIcon("pictures/calendar.png"));
	}
			
	private void createPreviewGroupBox() {
		previewGroupBox = new QGroupBox(("Calendário"));
		
		calendar = new QCalendarWidget();
		calendar.setMinimumDate(new QDate(1900, 1, 1));
		calendar.setMaximumDate(new QDate(3000, 1, 1));
		
		calendar.setGridVisible(true);

		previewLayout = new QGridLayout();
		previewLayout.addWidget(calendar, 0, 0, Qt.AlignmentFlag.AlignCenter);
		previewGroupBox.setLayout(previewLayout);
	}
}