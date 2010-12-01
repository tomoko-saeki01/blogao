package br.edu.ufcg.blogao.GUI;

import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FrameCommentCreation  extends QWidget {
	private QTextEdit comment;
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

	@SuppressWarnings("unused")
	private void closeFrame() {
		close();
		container.getLayout().removeWidget(container.getActualCreationCommentFrame());
		//TODO fix
		//container.getLayout().addWidget(container.getActualPost...());
	}
	
	@SuppressWarnings("unused")
	private void createComment() {
		
	}
	
	private void init() {
		comment = new QTextEdit(this);
		
		okButton = new QPushButton("Concluir", this);
		okButton.setIcon(new QIcon("pictures/right.png"));
		
		cancelButton = new QPushButton ("Cancelar", this);
		cancelButton.setIcon(new QIcon("pictures/wrong.png"));
	}
	
	private void positions() {
		// TODO Auto-generated method stub
		
	}

	private void resizes() {
		comment.resize(300, 100);
		okButton.maximumSize();
		cancelButton.maximumSize();
	}
}