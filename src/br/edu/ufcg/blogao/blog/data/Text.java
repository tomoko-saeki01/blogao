package br.edu.ufcg.blogao.blog.data;

public class Text implements StaticContent {
	
	private String text;
	
	public Text(String text) {
		this.setText(text);
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}

}
