package br.edu.ufcg.blogao.webservice;

/**
 * Web Service facade for Blogao application.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import java.util.Calendar;

import br.edu.ufcg.blogao.Finder;
import br.edu.ufcg.blogao.blog.WebElementManager;
import br.edu.ufcg.blogao.persistence.DatabaseFacade;
import br.edu.ufcg.blogao.session.SessionManager;
import br.edu.ufcg.blogao.user.UsersHandler;

public class BlogWSImpl implements BlogWS {

	private final String INVALID_SESSION_MESSAGE = "Sessão inválida";

	private UsersHandler usersHandler = UsersHandler.getInstance();
	private SessionManager sessionManager = SessionManager.getInstance();
	private WebElementManager webElementManager = WebElementManager
			.getInstance();
	private Finder finder = new Finder();

	@Override
	public String addComment(String sessionId, String postId, String texto)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return webElementManager.addComment(postId, userId, texto);
	}

	@Override
	public void addPostAnnouncements(String sessionId, String blogId)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (sessionManager.isUserLogged(userId)) {
			webElementManager.addPostAnnouncement(blogId, userId);
		}
	}

	@Override
	public String addSubComment(String sessionId, String commentId, String texto)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return webElementManager.addSubComment(commentId, userId, texto);
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
	public void changePostInformation(String sessionId, String postId,
			String atributo, String valor) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager.getPostAuthor(postId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.changePostInformation(postId, atributo, valor);
	}

	@Override
	public void changeProfileInformation(String sessionId, String atributo,
			String valor) throws Exception {
		final String LOGIN_USERID_ATTRIBUTE = "login";
		String userId = sessionManager.getLoggedUserId(sessionId);
		usersHandler.changeUserInformation(userId, atributo, valor);
		if (atributo.equals(LOGIN_USERID_ATTRIBUTE)) {
			sessionManager.updateLoggedUserId(userId, valor);
		}
	}

	/**
	 * Clean the persistence.
	 */
	public void cleanPersistence() {
		DatabaseFacade.getInstance().cleanPersistence();
		sessionManager.logoffAllSessions();
	}

	@Override
	public String createBlog(String sessionId, String titulo, String descricao)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		String blogId = webElementManager.createBlog(userId, titulo, descricao);
		usersHandler.addBlogToUser(blogId, userId);
		return blogId;
	}

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

		usersHandler.createUser(login, senha, nome_exibicao, email, sexo,
				dataNasc, endereco, interesses, quem_sou_eu, filmes, musicas,
				livros);
	}

	@Override
	public String createSubBlog(String sessionId, String blogId, String titulo,
			String descricao) throws Exception {
		sessionManager.getLoggedUserId(sessionId);
		String subBlogId = webElementManager.createSubBlog(blogId, titulo,
				descricao);
		return subBlogId;
	}

	@Override
	public void deleteAnnouncement(String sessionId, String announcementId)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		webElementManager.deleteAnnouncement(userId, announcementId.toString());
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
		if (!userId.equals(webElementManager
				.getInteractiveContentAuthor(videoId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteInteractiveContent(videoId);
	}

	@Override
	public void deletePicture(String sessionId, String pictureId)
			throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		if (!userId.equals(webElementManager
				.getInteractiveContentAuthor(pictureId))) {
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
		if (!userId.equals(webElementManager
				.getInteractiveContentAuthor(soundId))) {
			throw new IllegalArgumentException(INVALID_SESSION_MESSAGE);
		}
		webElementManager.deleteInteractiveContent(soundId);
	}

	@Override
	public String findBlogByName(String match) {
		return finder.findBlogsWithName(match);
	}

	@Override
	public String findProfileByGender(String match) {
		return finder.findUsersWithGender(match);
	}

	@Override
	public String findProfileByInterests(String match) {
		return finder.findUsersWithInterests(match);
	}

	@Override
	public String findProfileByName(String match) {
		return finder.findUsersWithName(match);

	}

	@Override
	public String getAnnouncement(String sessionId, Integer index)
			throws Exception {
		String usrId = sessionManager.getLoggedUserId(sessionId);
		return usersHandler.getAnnouncement(usrId, index);
	}

	@Override
	public Integer getBlogByLogin(String login, Integer index) throws Exception {
		return Integer.parseInt(usersHandler.getBlogFromUser(login, index));
	}

	@Override
	public Integer getBlogBySessionId(String sessionId, Integer index)
			throws Exception {
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
		return webElementManager.getCommentInformation(commentId,
				WebElementManager.COMMENT_AUTHOR);
	}

	@Override
	public String getCommentText(String commentId) throws Exception {
		return webElementManager.getCommentInformation(commentId,
				WebElementManager.COMMENT_TEXT);
	}

	@Override
	public String getMovie(String postId, Integer index) throws Exception {
		return webElementManager.getPostAttachmentsInformation(postId,
				WebElementManager.MOVIE, index);
	}

	@Override
	public String getMovieData(String movieId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(movieId,
				WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getMovieDescription(String movieId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(movieId,
				WebElementManager.CONTENT_DESCRIPTION);
	}

	@Override
	public Integer getNumberOfAllSubComments(String commentId) throws Exception {
		return webElementManager.getNumberOfAllSubComments(commentId);
	}

	@Override
	public Integer getNumberOfAnnouncements(String sessionId) throws Exception {
		String userId = sessionManager.getLoggedUserId(sessionId);
		return usersHandler.getNumberOfAnnouncements(userId);
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
	public Integer getNumberOfComments(String... parametros) throws Exception {
		if (parametros.length == 1) {
			return this.getNumberOfComments(parametros[0]);
		} else if (parametros.length == 2) {
			return this.getNumberOfComments(parametros[0], parametros[1]);
		}
		return -1;
	}

	/**
	 * Return the number of comments on a specific post.
	 * 
	 * @param postId
	 *            The post's ID.
	 * @return The number of comments.
	 * @throws Exception
	 */
	public Integer getNumberOfComments(String postId) throws Exception {
		return webElementManager.getNumberOfCommentsFromPost(postId);
	}

	/**
	 * Return the number of comments from an user on a specific blog.
	 * 
	 * @param login
	 *            The login.
	 * @param blogId
	 *            The blog's ID.
	 * @return The number of comments.
	 * @throws Exception
	 */
	public Integer getNumberOfComments(String login, String blogId)
			throws Exception {
		return webElementManager.getNumberOfCommentsFromAuthorOnBlog(login,
				blogId);
	}

	@Override
	public Integer getNumberOfMovies(String postId) {
		try {
			return webElementManager.getPostAttachmentsNumericInformation(
					postId, WebElementManager.NUMBER_OF_MOVIES);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Integer getNumberOfPictures(String postId) {
		try {
			return webElementManager.getPostAttachmentsNumericInformation(
					postId, WebElementManager.NUMBER_OF_PICTURES);
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
			return webElementManager.getPostAttachmentsNumericInformation(
					postId, WebElementManager.NUMBER_OF_SOUNDS);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Integer getNumberOfAllSubBlogs(String blogId) throws Exception {
		return webElementManager.getNumberOfAllSubBlogs(blogId);
	}

	@Override
	public Integer getNumberOfAllPosts(String blogId) throws Exception {
		return webElementManager.getNumberOfAllPostsFromBlog(blogId);
	}

	@Override
	public Integer getNumberOfSubBlogs(String blogId) throws Exception {
		return webElementManager.getNumberOfSubBlogs(blogId);
	}

	@Override
	public Integer getNumberOfSubComments(String commentId) throws Exception {
		return webElementManager.getNumberOfSubComments(commentId);
	}

	@Override
	public String getPicture(String postId, Integer index) throws Exception {
		return webElementManager.getPostAttachmentsInformation(postId,
				WebElementManager.PICTURE, index);
	}

	@Override
	public String getPictureData(String pictureId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(pictureId,
				WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getPictureDescription(String pictureId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(pictureId,
				WebElementManager.CONTENT_DESCRIPTION);
	}

	@Override
	public Integer getPost(String blogId, Integer index) throws Exception {
		return Integer.parseInt(webElementManager
				.getPostFromBlog(blogId, index));
	}

	@Override
	public String getPostInformation(String postId, String atributo)
			throws Exception {
		return webElementManager.getPostInformation(postId, atributo);
	}

	@Override
	public String getPostJustCreated(String announcementId) throws Exception {
		return webElementManager.getAnnouncementTarget(announcementId);
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
		return webElementManager.getPostAttachmentsInformation(postId,
				WebElementManager.SOUND, index);
	}

	@Override
	public String getSoundData(String soundId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(soundId,
				WebElementManager.CONTENT_DATA);
	}

	@Override
	public String getSoundDescription(String soundId) throws Exception {
		return webElementManager.getInteractiveContentsInformation(soundId,
				WebElementManager.CONTENT_DESCRIPTION);
	}

	@Override
	public Integer getSubBlog(String blogId, Integer index) throws Exception {
		return Integer.parseInt(webElementManager.getSubBlog(blogId, index));
	}

	@Override
	public String getSubComment(String commentId, Integer index)
			throws Exception {
		return webElementManager.getSubComment(commentId, index);
	}

	@Override
	public Boolean isUserLogged(String login) throws Exception {
		return sessionManager.isUserLogged(login);
	}

	public void loadData() {
		/*
		 * It's not necessary open the datas to validate the tests. The
		 * informations are loaded as necessary.
		 */
	}

	@Override
	public void logoff(String sessionId) throws Exception {
		sessionManager.logoff(sessionId);
	}

	@Override
	public String logon(String login, String senha) throws Exception {
		return sessionManager.logon(login, senha);
	}

	public void saveData() {
		/*
		 * It's not necessary save the datas in a specific moment. The dates are
		 * inserted and changed when the webMethods are executed.
		 */
	}

	/**
	 * Return the date of the day.
	 * 
	 * @return The date of the day.
	 */
	public String todaysDate() {
		return usersHandler.convertCalendarToStringDate(Calendar.getInstance());
	}
}