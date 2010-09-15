/**
 * 
 */
package br.edu.ufcg.blogao.webservice;

import br.edu.ufcg.blogao.blog.WebElementManager;
import br.edu.ufcg.blogao.session.SessionManager;
import br.edu.ufcg.blogao.user.UsersHandler;

/**
 * @author ivocalado
 *
 */
public class BlogWSImpl implements BlogWS {
	
	private UsersHandler usersHandler = UsersHandler.getInstance();
	private SessionManager sessionManager = SessionManager.getInstance();
	private WebElementManager webElementManager = WebElementManager.getInstance();

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#addComment(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String addComment(String sessionId, String postId, String texto)
			throws Exception {
//		return Finder.findSession(sessionId).getPost(postId).addComment(texto);
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#addPostAnnouncements(java.lang.String, java.lang.String)
	 */
	@Override
	public void addPostAnnouncements(String sessionId, String blogId)
			throws Exception {
		// TODO Auto-generated method stub		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#addSubComment(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String addSubComment(String sessionId, String commentId, String texto)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#attachMovie(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String attachMovie(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#attachPicture(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String attachPicture(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#attachSound(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String attachSound(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#changeBlogInformation(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void changeBlogInformation(String sessionId, String BlogId,
			String atributo, String valor) throws Exception {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#changePostInformation(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void changePostInformation(String sessionId, String postId, String atributo, String valor) throws Exception {
		// TODO Auto-generated method stub		
	}

	@Override
	public void changeProfileInformation(String sessionId, String atributo, String valor)
			throws Exception {
		final String LOGIN_USERID_ATTRIBUTE = "login";
		String userId = sessionManager.getLoggedUserId(sessionId);
		usersHandler.changeUserInformation(userId, atributo, valor);
		if (atributo.equals(LOGIN_USERID_ATTRIBUTE)) {
			sessionManager.updateLoggedUserId(userId, valor);
		}
	}

	@Override
	public String createBlog(String sessionId, String titulo, String descricao)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		String blogId = webElementManager.createBlog(userId, titulo, descricao);
		usersHandler.addBlogToUser(blogId, userId);
		return blogId;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#createPost(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String createPost(String sessionId, String blogId, String titulo,
			String texto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProfile(String login, String senha, String nome_exibicao,
			String email, String sexo, String dataNasc, String endereco,
			String interesses, String quem_sou_eu, String filmes,
			String musicas, String livros) throws Exception {
		
		usersHandler.createUser(login, senha, nome_exibicao, email, sexo, dataNasc, endereco, interesses, quem_sou_eu, filmes, musicas, livros);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#createSubBlog(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String createSubBlog(String sessionId, String blogId, String titulo,
			String descricao) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deleteAnnouncement(java.lang.String, java.lang.String)
	 */
	@Override
	public String deleteAnnouncement(String sessionId, String announcementId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deleteBlog(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteBlog(String sessionId, String blogId) throws Exception {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deleteMovie(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteMovie(String sessionId, String videoId) throws Exception {
//		Finder.findSession(sessionId).deleteMovie(videoId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deletePicture(java.lang.String, java.lang.String)
	 */
	@Override
	public void deletePicture(String sessionId, String pictureId) throws Exception {
//		Finder.findSession(sessionId).deletePicture(pictureId);		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deletePost(java.lang.String, java.lang.String)
	 */
	@Override
	public void deletePost(String sessionId, String postId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deleteProfile(java.lang.String)
	 */
	@Override
	public void deleteProfile(String sessionId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#deleteSound(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteSound(String sessionId, String soundId) throws Exception {
//		Finder.findSession(sessionId).deleteSound(soundId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#findBlogByName(java.lang.String)
	 */
	@Override
	public void findBlogByName(String match) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#findProfileByGender(java.lang.String)
	 */
	@Override
	public void findProfileByGender(String match) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#findProfileByInterests(java.lang.String)
	 */
	@Override
	public void findProfileByInterests(String match) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#findProfileByName(java.lang.String)
	 */
	@Override
	public void findProfileByName(String match) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getAnnouncement(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getAnnouncement(String sessionId, Integer index)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getBlogByLogin(java.lang.String, java.lang.Integer)
	 */
	@Override
	public Integer getBlogByLogin(String login, Integer index) throws Exception {
		//TODO esse metodo ta estranho. REVER! (catha)
//		return Finder.findUser(login).getBlog(index);
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getBlogBySessionId(java.lang.String, java.lang.Integer)
	 */
	@Override
	public Integer getBlogBySessionId(String sessiongId, Integer index) throws Exception {
		//TODO esse metodo ta estranho. REVER! (catha)
//		return Finder.findSession(sessiongId).getBlog(index);
		return null;
	}

	@Override
	public String getBlogInformation(String blogId, String atributo)
			throws Exception {
		return webElementManager.getBlogInformation(blogId, atributo);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getComment(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getComment(String postId, Integer index) throws Exception {
//		return Finder.findPost(postId).getComment(index);
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getCommentAuthor(java.lang.String)
	 */
	@Override
	public String getCommentAuthor(String commentId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getCommentText(java.lang.String)
	 */
	@Override
	public String getCommentText(String commentId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getMovie(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getMovie(String postId, Integer index) throws Exception {
		 
//		return Finder.findPost(postId).getMovie(index).getData();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getMovieData(java.lang.String)
	 */
	@Override
	public String getMovieData(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getData();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getMovieDescription(java.lang.String)
	 */
	@Override
	public String getMovieDescription(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getDescription();
		return null;

	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfAllSubComments(java.lang.String)
	 */
	@Override
	public Integer getNumberOfAllSubComments(String commentId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfAnnouncements(java.lang.String)
	 */
	@Override
	public Integer getNumberOfAnnouncements(String sessionId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfBlogsByLogin(java.lang.String)
	 */
	@Override
	public Integer getNumberOfBlogsByLogin(String login) throws Exception {
//		return Finder.findUser(login).getNumberOfBlogs();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfBlogsBySessionId(java.lang.String)
	 */
	@Override
	public Integer getNumberOfBlogsBySessionId(String sessiongId)
			throws Exception {
//		return Finder.findSession(sessiongId).getNumberOfBlogs();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfComments(java.lang.String)
	 */
	@Override
	public Integer getNumberOfComments(String postId) throws Exception {
		// TODO Auto-generated method stub
//		return Finder.findPost(postId).getNumberOfComments();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfMovies(java.lang.String)
	 */
	@Override
	public Integer getNumberOfMovies(String postId) {
		
//		return Finder.findPost(postId).getNumberOfMovies();
		return null;

	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfPictures(java.lang.String)
	 */
	@Override
	public Integer getNumberOfPictures(String postId) {
		
//		return Finder.findPost(postId).getNumberOfPictures();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfPosts(java.lang.String)
	 */
	@Override
	public Integer getNumberOfPosts(String blogId) throws Exception {
		// TODO Auto-generated method stub
//		return Finder.fingBlog(blogId).getNumberOfPost();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfSounds(java.lang.String)
	 */
	@Override
	public Integer getNumberOfSounds(String postId) {
		
//		return Finder.findPost(postId).getNumberOfSounds();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfSubAllBlogs(java.lang.String)
	 */
	@Override
	public Integer getNumberOfSubAllBlogs(String blogId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfSubBlogs(java.lang.String)
	 */
	@Override
	public Integer getNumberOfSubBlogs(String blogId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getNumberOfSubComments(java.lang.String)
	 */
	@Override
	public Integer getNumberOfSubComments(String commentId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPicture(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getPicture(String postId, Integer index) throws Exception {
		
//		return Finder.findPost(postId).getPicture(index).getData();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPictureData(java.lang.String)
	 */
	@Override
	public String getPictureData(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getData();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPictureDescription(java.lang.String)
	 */
	@Override
	public String getPictureDescription(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getDescription();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPost(java.lang.String, java.lang.Integer)
	 */
	@Override
	public Integer getPost(String blogId, Integer index) throws Exception {
		// TODO Ajeitar!! (catha)
//		return Finder.fingBlog(blogId).getPost(index);
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPostInformation(java.lang.String, java.lang.String)
	 */
	@Override
	public String getPostInformation(String postId, String atributo)
			throws Exception {
		
		return Finder.findPostInfo(postId, atributo);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getPostJustCreated(java.lang.String)
	 */
	@Override
	public String getPostJustCreated(String announcementId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProfileInformation(String login, String atributo)
			throws Exception {
		return usersHandler.getUserInformation(login, atributo);
	}

	@Override
	public String getProfileInformationBySessionId(String sessionId,
			String atributo) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return usersHandler.getUserInformation(userId, atributo);
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getSound(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getSound(String postId, Integer index) throws Exception {
		
//		return Finder.findPost(postId).getSound(index).getData();
		return null;

	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getSoundData(java.lang.String)
	 */
	@Override
	public String getSoundData(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getData();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getSoundDescription(java.lang.String)
	 */
	@Override
	public String getSoundDescription(String soundId) throws Exception {
		
//		return Finder.findContent(soundId).getDescription();
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getSubBlog(java.lang.String, java.lang.Integer)
	 */
	@Override
	public Integer getSubBlog(String blogId, Integer index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see br.edu.ufcg.dsc.si.blog.webservice.BlogWS#getSubComment(java.lang.String, java.lang.Integer)
	 */
	@Override
	public String getSubComment(String commentId, Integer index)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isUserLogged(String login) throws Exception {
		return sessionManager.isUserLogged(login);
	}

	
	public void cleanPersistence() {
		// TODO Auto-generated method stub
		
	}

	public void loadData() {
		// TODO Auto-generated method stub
		
	}

	public void saveData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logoff(String sessionId) throws Exception {
		sessionManager.logoff(sessionId);
	}

	@Override
	public String logon(String login, String senha) throws Exception {
		return sessionManager.logon(login, senha);
	}
}