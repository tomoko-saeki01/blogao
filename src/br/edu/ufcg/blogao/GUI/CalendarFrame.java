package br.edu.ufcg.blogao.GUI;
import com.trolltech.examples.QtJambiExample;
import com.trolltech.qt.gui.*;
import com.trolltech.qt.core.*;

@QtJambiExample(name = "Calendar Widget")
public class CalendarFrame extends QWidget {
	private QGroupBox previewGroupBox;
	private QGridLayout previewLayout;
	private QCalendarWidget calendar;

	private QDateEdit currentDateEdit;

	public CalendarFrame() {
		createPreviewGroupBox();
		createDatesGroupBox();

		QGridLayout layout = new QGridLayout();
		layout.addWidget(previewGroupBox, 0, 0);
		layout.setSizeConstraint(QLayout.SizeConstraint.SetFixedSize);
		setLayout(layout);

		setWindowTitle("Calendário");
		show();
	}

	public QDateEdit getSelectedDate() {
		return currentDateEdit;
	}
	
	private void createPreviewGroupBox() {
		previewGroupBox = new QGroupBox("Calendário");

		calendar = new QCalendarWidget();
		calendar.setGridVisible(true);

		previewLayout = new QGridLayout();
		previewLayout.addWidget(calendar, 0, 0, Qt.AlignmentFlag.AlignCenter);
		previewGroupBox.setLayout(previewLayout);
	}

	private void createDatesGroupBox() {
		currentDateEdit = new QDateEdit();
		currentDateEdit.setDisplayFormat("dd MMM, yyyy");
		currentDateEdit.setDate(calendar.selectedDate());
	}

	public static void main(String args[]) {
		QApplication.initialize(args);
		new CalendarFrame();
		QApplication.exec();
	}
}