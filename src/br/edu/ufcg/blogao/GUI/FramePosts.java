package br.edu.ufcg.blogao.GUI;

import java.util.ArrayList;
import java.util.List;

import com.trolltech.qt.gui.QFont;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QScrollArea;
import com.trolltech.qt.gui.QTextEdit;
import com.trolltech.qt.gui.QWidget;

public class FramePosts extends QWidget {
	
	private FrameContainer container = FrameContainer.getInstance();
	
	private List<QTextEdit> posts;
	

	public FramePosts() {
		resize(1200, 700);

		initObjects();
		resizeObjects();
		positionsObjects();
		
	}

	


	private void initObjects() {
		
		posts = new ArrayList<QTextEdit>();
		
		
		
		getUserData();
	}

	private void positionsObjects() {
		int w = 100;
		int h = 100;
		
	}

	private void resizeObjects() {
		
		for (int i = 0; i < posts.size(); i++) {
			posts.get(i).resize(200, 100);
		}
	}

	private void getUserData() {
		try {
			int numberOfPosts = container.getBlog().getNumberOfPosts(container.getCurrentBlogId());
			for (int i = 0; i < numberOfPosts; i++) {
				String postId = container.getBlog().getPost(container.getCurrentBlogId(), i).toString();
				String postContent = container.getBlog().getPostInformation(postId, container.TEXT);
				QTextEdit post = new QTextEdit(this);
				post.setText(postContent);
				posts.add(post);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void displayMessageErro(String title, String message) {
		QMessageBox.critical(this, title, message);
	}

	private void displayMessageInformation(String title, String message) {
		QMessageBox.information(this, title, message);
	}
}