package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameCommentCreation  extends QWidget {
	private QLabel commentLabel;
	private QTextEdit commentField;
	private QPushButton okButton, cancelButton;
	private FrameContainer container = FrameContainer.getInstance();
	
	public FrameCommentCreation() {
		resize(maximumSize());
		init();
		resizes();
		positions();
		actionsObjects();
	}

	private void actionsObjects() {
		cancelButton.clicked.connect(this, "closeFrame()");
		okButton.clicked.connect(this, "createComment()");
	}

	private void closeFrame() {
		close();
		container.getLayout().removeWidget(container.getActualCreationCommentFrame());
		//TODO fix
		//container.getLayout().addWidget(container.getActualPost());
	}
	
	@SuppressWarnings("unused")
	private void createComment() {
		String c = commentField.toPlainText();
		
		try {
			container.getBlog().addComment(container.getActualSession(), container.getActualPostId(), c);
			closeFrame();
			displayMessageInformation("Informação", "Comentário realizado com sucesso.");
		} catch (Exception e) {
			displayMessageErro("Erro", "O comentário não pôde ser realizado. Tente novamente.");
		}
	}
	
	private void init() {
		commentLabel = new QLabel("Comentário", this);
		commentLabel.setFont(new QFont("Tempus Sans ITC", 11));
		
		commentField = new QTextEdit(this);
		
		okButton = new QPushButton("Concluir", this);
		okButton.setIcon(new QIcon("pictures/right.png"));
		
		cancelButton = new QPushButton ("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}
	
	private void positions() {
		int w = 100;
		int h = 100;
		commentLabel.move(w, h);

		commentField.move(w + 65, h);
		
		okButton.move(w + 70, h + 200);
		cancelButton.move(w  + 150, h + 200);
	}

	private void resizes() {
		commentField.resize(300, 100);
		okButton.maximumSize();
		cancelButton.maximumSize();
	}
	
	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}