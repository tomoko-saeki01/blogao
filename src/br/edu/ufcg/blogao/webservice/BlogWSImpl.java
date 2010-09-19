/**
 * 
 */
package br.edu.ufcg.blogao.webservice;

import java.util.Calendar;
import java.util.List;

import br.edu.ufcg.blogao.Finder;
import br.edu.ufcg.blogao.blog.WebElementManager;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.session.SessionManager;
import br.edu.ufcg.blogao.user.UsersHandler;

/**
 * @author ivocalado
 *
 */
public class BlogWSImpl implements BlogWS {
	
	private final String INVALID_SESSION_MESSAGE = "Sess�o inv�lida";
	
	private UsersHandler usersHandler = UsersHandler.getInstance();
	private SessionManager sessionManager = SessionManager.getInstance();
	private WebElementManager webElementManager = WebElementManager.getInstance();
	private Finder finder = new Finder();

	@Override
	public String addComment(String sessionId, String postId, String texto)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return webElementManager.addComment(postId, userId, texto);
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
	
	@Override
	public void changePostInformation(String sessionId, String postId, String atributo, String valor) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.changePostInformation(postId, atributo, valor);
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
	
	@Override
	public void deleteBlog(String sessionId, String blogId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getBlogAuthor(blogId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteBlog(blogId);
		usersHandler.removeBlogFromUser(blogId, userId);
	}

	@Override
	public void deleteMovie(String sessionId, String videoId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getInteractiveContentAuthor(videoId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteInteractiveContent(videoId);
	}
	
	@Override
	public void deletePicture(String sessionId, String pictureId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getInteractiveContentAuthor(pictureId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteInteractiveContent(pictureId);
	}
	
	@Override
	public void deletePost(String sessionId, String postId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deletePost(postId);
	}
	
	@Override
	public void deleteProfile(String sessionId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		usersHandler.deleteUser(userId);
	}
	
	@Override
	public void deleteSound(String sessionId, String soundId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getInteractiveContentAuthor(soundId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteInteractiveContent(soundId);
	}

	@Override
	public List<String> findBlogByName(String match) {
		return finder.findBlogsWithName(match);
	}
	
	@Override
	public List<String> findProfileByGender(String match) {
		return finder.findUsersWithGender(match);
	}
	
	@Override
	public List<String> findProfileByInterests(String match) {
		return finder.findUsersWithInterests(match);
	}

	@Override
	public List<String> findProfileByName(String match) {
		return finder.findUsersWithName(match);
		
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

	@Override
	public Integer getBlogByLogin(String login, Integer index) throws Exception {
		return Integer.parseInt(usersHandler.getBlogFromUser(login, index));
	}

	@Override
	public Integer getBlogBySessionId(String sessionId, Integer index) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return Integer.parseInt((usersHandler.getBlogFromUser(userId, index)));
	}

	@Override
	public String getBlogInformation(String blogId, String atributo)
			throws Exception {
		return webElementManager.getBlogInformation(blogId, atributo);
	}
	
	@Override
	public String getComment(String postId, Integer index) throws Exception {
		return webElementManager.getCommentFromPost(postId, index);
	}

	@Override
	public String getCommentAuthor(String commentId) throws Exception {
		return webElementManager.getCommentInformation(commentId, WebElementManager.COMMENT_AUTHOR);
	}
	
	@Override
	public String getCommentText(String commentId) throws Exception {
		return webElementManager.getCommentInformation(commentId, WebElementManager.COMMENT_TEXT);
	}

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

	@Override
	public Integer getNumberOfBlogsByLogin(String login) throws Exception {
		return usersHandler.getNumberOfBlogsFromUser(login);
	}

	@Override
	public Integer getNumberOfBlogsBySessionId(String sessionId)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return usersHandler.getNumberOfBlogsFromUser(userId);
	}
	
	@Override
	public Integer getNumberOfComments(String postId) throws Exception {
		return webElementManager.getNumberOfCommentsFromPost(postId);
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

	@Override
	public Integer getNumberOfPosts(String blogId) throws Exception {
		return webElementManager.getNumberOfPostsFromBlog(blogId);
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
	
	@Override
	public Integer getPost(String blogId, Integer index) throws Exception {
		return Integer.parseInt(webElementManager.getPostFromBlog(blogId, index));
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