/**
 * 
 */
package br.edu.ufcg.blogao.webservice;

import java.util.Calendar;

import br.edu.ufcg.blogao.blog.WebElementManager;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.session.SessionManager;
import br.edu.ufcg.blogao.user.UsersHandler;

/**
 * @author ivocalado
 *
 */
public class BlogWSImpl implements BlogWS {
	
	private final String INVALID_SESSION_MESSAGE = "Sess‹o inv‡lida";
	
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

	@Override
	public String attachMovie(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		return webElementManager.attachMovieOnPost(postId, descricao, dado);
	}

	@Override
	public String attachPicture(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		return webElementManager.attachPictureOnPost(postId, descricao, dado);
	}

	@Override
	public String attachSound(String sessionId, String postId,
			String descricao, String dado) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		return webElementManager.attachSoundOnPost(postId, descricao, dado);
	}

	@Override
	public void changeBlogInformation(String sessionId, String blogId,
			String atributo, String valor) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getBlogAuthor(blogId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.changeBlogInformation(blogId, atributo, valor);
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
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getBlogAuthor(blogId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		return webElementManager.createPost(blogId, titulo, texto);
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
		return webElementManager.getPostAttachmentsInformation(postId, WebElementManager.MOVIE, index);
	}

	@Override
	public String getMovieData(String movieId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(movieId, WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getMovieDescription(String movieId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(movieId, WebElementManager.CONTENT_DESCRIPTION);
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
	
	@Override
	public Integer getNumberOfMovies(String postId) {
		try {
			return webElementManager.getPostAttachmentsNumericInformation(postId, WebElementManager.NUMBER_OF_MOVIES);
		} catch (Exception e) {
			return null;
		}
	}
	
	@Override
	public Integer getNumberOfPictures(String postId) {
		try {
			return webElementManager.getPostAttachmentsNumericInformation(postId, WebElementManager.NUMBER_OF_PICTURES);
		} catch (Exception e) {
			return null;
		}
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

	@Override
	public Integer getNumberOfSounds(String postId) {
		try {
			return webElementManager.getPostAttachmentsNumericInformation(postId, WebElementManager.NUMBER_OF_SOUNDS);
		} catch (Exception e) {
			return null;
		}
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

	@Override
	public String getPicture(String postId, Integer index) throws Exception {
		return webElementManager.getPostAttachmentsInformation(postId, WebElementManager.PICTURE, index);
	}

	@Override
	public String getPictureData(String pictureId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(pictureId, WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getPictureDescription(String pictureId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(pictureId, WebElementManager.CONTENT_DESCRIPTION);
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

	@Override
	public String getPostInformation(String postId, String atributo)
			throws Exception {
		return webElementManager.getPostInformation(postId, atributo);
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

	@Override
	public String getSound(String postId, Integer index) throws Exception {
		return webElementManager.getPostAttachmentsInformation(postId, WebElementManager.SOUND, index);
	}

	@Override
	public String getSoundData(String soundId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(soundId, WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getSoundDescription(String soundId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(soundId, WebElementManager.CONTENT_DESCRIPTION);
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
		DatabaseFacade.getInstance().cleanPersistence();
		sessionManager.logoffAllSessions();
	}

	public void loadData() {
		// Nao ha necessidade de abrir os dados para que os testes passem. As informacoes sao carregadas assim que necessarias.
	}

	public void saveData() {
		// Nao ha necessidade de salvar os dados em um momento especifico. Os dados inseridos e modificados sao salvos assim que os webMethods sao executados.
	}
	

	@Override
	public void logoff(String sessionId) throws Exception {
		sessionManager.logoff(sessionId);
	}

	@Override
	public String logon(String login, String senha) throws Exception {
		return sessionManager.logon(login, senha);
	}
	
	public String todaysDate() {
		return usersHandler.convertCalendarToStringDate(Calendar.getInstance());
	}
}