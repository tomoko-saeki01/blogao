package br.edu.ufcg.blogao.GUI;

import java.util.HashMap;

import com.trolltech.qt.gui.QLabel;
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
}