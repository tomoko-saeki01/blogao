package br.edu.ufcg.blogao.GUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.xml.xsom.impl.scd.Iterators.Map;
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
	
	private HashMap<QTextEdit, QLabel> posts;
	
	

	public FramePosts() {
		resize(600, 1200);

		initObjects();
		resizeObjects();
		positionsObjects();
		
	}

	


	private void initObjects() {
		
		posts = new HashMap<QTextEdit,QLabel>();
		
		
		
		getUserData();
	}

	private void positionsObjects() {
		int i = 0;
		for (QTextEdit post : posts.keySet()) {
			post.move(120, 50 + i* 140);
			posts.get(post).move(120, 30 + i*140);
			i++;
			
		}
	}

	private void resizeObjects() {
		
		for (QTextEdit post : posts.keySet()) {
			post.resize(400, 100);
		}
	}

	private void getUserData() {
		try {
			int numberOfPosts = container.getBlog().getNumberOfPosts(container.getCurrentBlogId());
			for (int i = 0; i < numberOfPosts; i++) {
				String postId = container.getBlog().getPost(container.getCurrentBlogId(), i).toString();
				
				String postContent = container.getBlog().getPostInformation(postId, container.TEXT);
				String postTitle = container.getBlog().getPostInformation(postId, container.TITLE);
				QTextEdit post = new QTextEdit(this);
				QLabel title = new QLabel(postTitle, this);
				post.setText(postContent);
				post.setEnabled(false);
				posts.put(post, title);
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