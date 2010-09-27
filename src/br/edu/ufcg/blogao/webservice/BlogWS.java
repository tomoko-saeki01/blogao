package br.edu.ufcg.blogao.webservice;

/**
 * Web Service interface for Blogao application.
 * 
 * @author <a href="mailto:caiocmpaes@gmail.com">Caio Paes</a><br>
 * @author <a href="mailto:carlos.artur.n@gmail.com">Carlos Artur</a><br>
 * @author <a href="mailto:catharinequintans@gmail.com">Catharine Quintans</a><br>
 * @author <a href="mailto:demontiejunior@gmail.com">Demontie Junior</a><br>
 * @author <a href="mailto:teu.araujo@gmail.com">Matheus Araujo</a><br>
 * @version 0.1
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;

public interface BlogWS {
	
	/**
	 * Add a comment to a determined post of the blog.
	 * @param sessionId The session's ID.
	 * @param postId The ID of the post where the comment will be added.
	 * @param texto The comment's text.
	 * @return The comment's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String addComment(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "postId")
	String postId, @WebParam(name = "texto")
	String texto) throws Exception;
	
	/**
	 * Add a announcement to the blog.
	 * @param sessionId The session's 
	 * @param blogId The blog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void addPostAnnouncements(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Add a subComment to a determined comment.
	 * @param sessionId The session's ID.
	 * @param commentId The commnet's ID.
	 * @param texto The subComment's text.
	 * @return The subComment's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String addSubComment(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "commentId")
	String commentId, @WebParam(name = "texto")
	String texto) throws Exception;
	
	/**
	 * Attach a movie to the blog's post.
	 * @param sessionId The session's ID.
	 * @param postId The ID of the post where the movie will be attached.
	 * @param descricao The description of the movie.
	 * @param dado The movie.
	 * @return Return the movie's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String attachMovie(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "postId")
	String postId, @WebParam(name = "descricao")
	String descricao, @WebParam(name = "dado")
	String dado) throws Exception;
	
	/**
	 * Attach a picture to the blog's post.
	 * @param sessionId The session's ID.
	 * @param postId The ID of the post where the picture will be attached.
	 * @param descricao The description of the picture.
	 * @param dado The picture.
	 * @return The picture's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String attachPicture(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "postId")
	String postId, @WebParam(name = "descricao")
	String descricao, @WebParam(name = "dado")
	String dado) throws Exception;
	
	/**
	 * Attach a sound to the blog's post.
	 * @param sessionId The session's ID.
	 * @param postId The ID of the post where the sound will be attached.
	 * @param descricao The description of the sound.
	 * @param dado The sound.
	 * @return The sound's ID.
	 * @throws Exception
	 */
	
	@WebMethod
	public String attachSound(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "postId")
	String postId, @WebParam(name = "descricao")
	String descricao, @WebParam(name = "dado")
	String dado) throws Exception;

	

	/**
	 * Create a profile to the "Blogao" user.
	 * @param login The login of the profile.
	 * @param senha The password of the profile.
	 * @param nome_exibicao The name of exhibition.
	 * @param email The user's e-mail.
	 * @param sexo The user's sex.
	 * @param dataNasc The user's date of birthday.
	 * @param endereco The user's address.
	 * @param interesses The user's interests.
	 * @param quem_sou_eu The user's description.
	 * @param filmes The user's favorites movies.
	 * @param musicas The user's favorites songs.
	 * @param livros The user's favorites books. 
	 * @throws Exception
	 */
	@WebMethod
	public void createProfile(@WebParam(name = "login")
	String login, @WebParam(name = "senha")
	String senha, @WebParam(name = "nome_exibicao")
	String nome_exibicao, @WebParam(name = "email")
	String email, @WebParam(name = "sexo")
	String sexo, @WebParam(name = "dataNasc")
	String dataNasc, @WebParam(name = "endereco")
	String endereco, @WebParam(name = "interesses")
	String interesses, @WebParam(name = "quem_sou_eu")
	String quem_sou_eu, @WebParam(name = "filmes")
	String filmes, @WebParam(name = "musicas")
	String musicas, @WebParam(name = "livros")
	String livros) throws Exception;

	/**
	 * Change the information of the blog.
	 * @param sessionId The session's ID.
	 * @param BlogId The blog's ID.
	 * @param atributo The attribute that will change.
	 * @param valor The value.
	 * @throws Exception
	 */
	@WebMethod
	public void changeBlogInformation(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "BlogId")
	String BlogId, @WebParam(name = "atributo")
	String atributo, @WebParam(name = "valor")
	String valor) throws Exception;
	
	/**
	 * Change the post information.
	 * @param sessionId The session's ID.
	 * @param postId The post's ID.
	 * @param atributo The attribute that will change.
	 * @param valor The value.
	 * @throws Exception
	 */
	@WebMethod
	public void changePostInformation(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "postId")
	String postId, @WebParam(name = "atributo")
	String atributo, @WebParam(name = "valor")
	String valor) throws Exception;
	
	/**
	 * Change the post information.
	 * @param sessionId The session's ID.
	 * @param atributo The attribute that will change.
	 * @param valor The value.
	 * @throws Exception
	 */
	@WebMethod
	public void changeProfileInformation(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "atributo")
	String atributo, @WebParam(name = "valor")
	String valor) throws Exception;
	
	/**
	 * Create a new blog.
	 * @param sessionId The session's ID.
	 * @param titulo The blog's tittle.
	 * @param descricao The blog's description.
	 * @return The blog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String createBlog(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "titulo")
	String titulo, @WebParam(name = "descricao")
	String descricao) throws Exception;
	
	/**
	 * Create a new post to the blog.
	 * @param sessionId The session's ID.
	 * @param blogId The ID of the blog where the post will be created.
	 * @param titulo The post's title.
	 * @param texto The post's text.
	 * @return The post's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String createPost(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "blogId")
	String blogId, @WebParam(name = "titulo")
	String titulo, @WebParam(name = "texto")
	String texto) throws Exception;
	
	/**
	 * Create a new sub blog.
	 * @param sessionId The session's ID.
	 * @param blogId The blog's ID.
	 * @param titulo The subBlog's title.
	 * @param descricao The subBlog's description.
	 * @return The subBlog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String createSubBlog(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "blogId")
	String blogId, @WebParam(name = "titulo")
	String titulo, @WebParam(name = "descricao")
	String descricao) throws Exception;
	
	/**
	 * Delete a announcement.
	 * @param sessionId The session's ID.
	 * @param announcementId The announcement's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deleteAnnouncement(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "announcementId")
	String announcementId) throws Exception;
		
	/**
	 * Delete a blog.	
	 * @param sessionId The session's ID.
	 * @param blogId  The blog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deleteBlog(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Delete a movie.
	 * @param sessionId The session's ID.
	 * @param videoId The movie's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deleteMovie(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "videoId")
	String videoId) throws Exception;

	/**
	 * Delete a picture.
	 * @param sessionId The session's ID.
	 * @param pictureId The pictures's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deletePicture(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "pictureId")
	String pictureId) throws Exception;
	
	/**
	 * Delete a post.
	 * @param sessionId The session's ID.
	 * @param postId The post's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deletePost(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "postId")
	String postId) throws Exception;
	
	/**
	 * Delete a profile.
	 * @param sessionId The session's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deleteProfile(@WebParam(name = "sessiondId")
	String sessionId) throws Exception;
	
	/**
	 * Delete a sound.
	 * @param sessionId The session's ID.
	 * @param soundId The sound's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void deleteSound(@WebParam(name = "sessiondId")
	String sessionId, @WebParam(name = "soundId")
	String soundId) throws Exception;
	
	/**
	 * Find a blog by name.
	 * @param match The name.
	 * @return Blogs with the specific name.
	 */
	@WebMethod
	public String findBlogByName(@WebParam(name = "match")
	String match);	

	/**
	 * Find a profile by name.
	 * @param match The name.
	 * @return All profiles with the name.
	 */
	@WebMethod
	public String findProfileByName(@WebParam(name = "match")
	String match);

	/**
	 * Find a profile by gender.
	 * @param match The gender.
	 * @return All profile with the specific gender.
	 */
	@WebMethod
	public String findProfileByGender(@WebParam(name = "match")
	String match);
	
	/**
	 * Find a profile by interests.
	 * @param match The interests.
	 * @return All profile with the same interests.
	 */ 
	@WebMethod
	public String findProfileByInterests(@WebParam(name = "match")
	String match);
	
	/**
	 * Return the announcement.
	 * @param sessionId The session's ID.
	 * @param index The index of the announcement.
	 * @return The announcement.
	 * @throws Exception
	 */
	@WebMethod
	public String getAnnouncement(@WebParam(name = "sessionId")
	String sessionId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return the blog's ID by login.
	 * @param login The login.
	 * @param index The index of blog.
	 * @return The blog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getBlogByLogin(@WebParam(name = "login")
	String login, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return the ID of the blog by session.
	 * @param sessiongId The session's ID.
	 * @param index The index of the blog.
	 * @return The blog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getBlogBySessionId(@WebParam(name = "sessionId")
	String sessiongId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return blog's information.
	 * @param BlogId The blog's ID.
	 * @param atributo The atribute.
	 * @return The information.
	 * @throws Exception
	 */
	@WebMethod
	public String getBlogInformation(@WebParam(name = "BlogId")
	String BlogId, @WebParam(name = "atributo")
	String atributo) throws Exception;
	
	/**
	 * Return a comment's ID on a specific post.
	 * @param postId The post's ID.
	 * @param index The index of the comment.
	 * @return The comment's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String getComment(@WebParam(name = "postId")
	String postId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return the comment's author.
	 * @param commentId The comment's ID.
	 * @return The comment1s author.
	 * @throws Exception
	 */
	@WebMethod
	public String getCommentAuthor(@WebParam(name = "commentId")
	String commentId) throws Exception;	

	/**
	 * Return the comment's text.
	 * @param commentId The comment's ID.
	 * @return The comment's text.
	 * @throws Exception
	 */
	@WebMethod
	public String getCommentText(@WebParam(name = "commentId")
	String commentId) throws Exception;
	
	/**
	 * Return a movie's ID in a specific post.
	 * @param postId The post's ID.
	 * @param index The index of the movie.
	 * @return The movie's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String getMovie(@WebParam(name = "postId")
	String postId, @WebParam(name = "index")
	Integer index) throws Exception;

	/**
	 * Return a movie data.
	 * @param soundId The movie's ID.
	 * @return The movie data.
	 * @throws Exception
	 */
	@WebMethod
	public String getMovieData(@WebParam(name = "dataId")
	String soundId) throws Exception;
	
	/**
	 * Return movie's description.
	 * @param soundId The movie's ID.
	 * @return The movie's description.
	 * @throws Exception
	 */
	@WebMethod
	public String getMovieDescription(@WebParam(name = "movieId")
	String soundId) throws Exception;
	
	/**
	 * Return the number of all posts on a specific blog.
	 * @param blogId The blog's ID.
	 * @return The number of all posts.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfAllPosts(@WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Return the number of all subBlogs on a specific comment.
	 * @param blogId The blog's ID.
	 * @return The number of all subBlogs.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfAllSubBlogs(@WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Return the number of all subComments on a specific comment.
	 * @param commentId The commment's ID.
	 * @return The number of all subComments.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfAllSubComments(@WebParam(name = "commentId")
	String commentId) throws Exception;
	
	/**
	 * Return the number of announcements.
	 * @param sessionId The session's ID.
	 * @return The number of announcements.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfAnnouncements(@WebParam(name = "sessionId")
	String sessionId) throws Exception;
	
	/**
	 * Return the number of blogs by login.
	 * @param login The login.
	 * @return The number of blogs.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfBlogsByLogin(@WebParam(name = "login")
	String login) throws Exception;
	
	/**
	 * Return the number of blogs by session's ID.
	 * @param sessiongId The session's ID.
	 * @return The number of blogs.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfBlogsBySessionId(@WebParam(name = "sessionId")
	String sessiongId) throws Exception;
	
	/**
	 * This signature was accept in our Google groups discussion. Provided by William.
	 * This method decides what implementation should be called.
	 */
	@WebMethod
	public Integer getNumberOfComments(@WebParam(name = "parametros")
	String... parametros) throws Exception;
	
//	@WebMethod
//	public Integer getNumberOfComments(@WebParam(name = "postId")
//	String postId) throws Exception;
	
	
//	@WebMethod
//	public Integer getNumberOfComments(@WebParam(name = "login")
//	String login, @WebParam(name = "blogId")
//	String blogId) throws Exception;
	
	/**
	 * Return the number of movies on a specific post.
	 * @param postId The post's ID.
	 * @return The number of movies.
	 */
	@WebMethod
	public Integer getNumberOfMovies(@WebParam(name = "postId")
	String postId);
	
	/**
	 * Return the number of pictures on a specific post.
	 * @param postId The post's ID.
	 * @return The number of pictures.
	 */
	@WebMethod
	public Integer getNumberOfPictures(@WebParam(name = "postId")
	String postId);
	
	/**
	 * Return the number of posts on a blog.
	 * @param blogId The blog's ID.
	 * @return The number of posts on a blog.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfPosts(@WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Return the number of sounds on a specific post.
	 * @param postId The post's ID.
	 * @return The number of sounds.
	 */
	@WebMethod
	public Integer getNumberOfSounds(@WebParam(name = "postId")
	String postId);
	
	/**
	 * Return the number of subBlogs in first level from a specific blog.
	 * @param blogId The blog's ID.
	 * @return The number of subBlogs.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfSubBlogs(@WebParam(name = "blogId")
	String blogId) throws Exception;
	
	/**
	 * Return the number of subComments in first level from a specific comment.
	 * @param commentId The comment's ID.
	 * @return The number of all subComments.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getNumberOfSubComments(@WebParam(name = "commentId")
	String commentId) throws Exception;
	
	/**
	 * Return a picture's ID on a specific post.
	 * @param postId The post's ID.
	 * @param index The index of the picture.
	 * @return The picture's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String getPicture(@WebParam(name = "postId")
	String postId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return picture data.
	 * @param soundId The picture's ID.
	 * @return The picture data.
	 * @throws Exception
	 */
	@WebMethod
	public String getPictureData(@WebParam(name = "pictureId")
	String soundId) throws Exception;
	
	/**
	 * Return the sound's description.
	 * @param soundId The sound's ID. 
	 * @return The sound's description.
	 * @throws Exception
	 */
	@WebMethod
	public String getPictureDescription(@WebParam(name = "pictureId")
	String soundId) throws Exception;
	
	/**
	 * Return the post's ID on a specific blog.
	 * @param blogId The blog's ID.
	 * @param index The index of the post.
	 * @return The post's ID.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getPost(@WebParam(name = "blogId")
	String blogId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return post's information.
	 * @param postId The post's ID.
	 * @param atributo The attribute.
	 * @return The information.
	 * @throws Exception
	 */
	@WebMethod
	public String getPostInformation(@WebParam(name = "postId")
	String postId, @WebParam(name = "atributo")
	String atributo) throws Exception;
	
	/**
	 * Return post just created.
	 * @param announcementId The announcement's ID.
	 * @return The ID of the post just created.
	 * @throws Exception
	 */
	@WebMethod
	public String getPostJustCreated(@WebParam(name = "announcementId")
	String announcementId) throws Exception;
	
	/**
	 * Return a profile's information.
	 * @param login The profile's login.
	 * @param atributo The attribute.
	 * @return The information.
	 * @throws Exception
	 */
	@WebMethod
	public String getProfileInformation(@WebParam(name = "login")
	String login, @WebParam(name = "atributo")
	String atributo) throws Exception;

	/**
	 * Return profile's information by session's ID.
	 * @param sessionId The session's ID.
	 * @param atributo The attribute.
	 * @return The information.
	 * @throws Exception
	 */
	@WebMethod
	public String getProfileInformationBySessionId(
			@WebParam(name = "sessionId")
			String sessionId, @WebParam(name = "atributo")
			String atributo) throws Exception;
	
	/**
	 * Return the sound's ID on a specific post.
	 * @param postId The post's ID.
	 * @param index The index of the sound.
	 * @return The sound's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String getSound(@WebParam(name = "postId")
	String postId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return the sound data.
	 * @param soundId The sound's ID.
	 * @return The sound data.
	 * @throws Exception
	 */
	@WebMethod
	public String getSoundData(@WebParam(name = "soundId")
	String soundId) throws Exception;
	
	/**
	 * Return the sound's description.
	 * @param soundId The sound's ID.
	 * @return The sound's description.
	 * @throws Exception
	 */
	@WebMethod
	public String getSoundDescription(@WebParam(name = "soundId")
	String soundId) throws Exception;
	
	/**
	 * Return the subComment's ID on a specific comment.
	 * @param commentId The comment's ID.
	 * @param index The index of the subComment.
	 * @return The subComment's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String getSubComment(@WebParam(name = "commentId")
	String commentId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Return the subBlog's ID on a specific blog.
	 * @param blogId The blog's ID.
	 * @param index The index of the subBlog.
	 * @return The subBlog's ID.
	 * @throws Exception
	 */
	@WebMethod
	public Integer getSubBlog(@WebParam(name = "blogId")
	String blogId, @WebParam(name = "index")
	Integer index) throws Exception;
	
	/**
	 * Verify if a user is logged on "Blogao".
	 * @param login The user's login.
	 * @return True if the user is logged, or False otherwise.
	 * @throws Exception
	 */
	@WebMethod
	public Boolean isUserLogged(@WebParam(name = "login")
	String login) throws Exception;
	
	/**
	 * Logoff the session.
	 * @param sessionId The session's ID.
	 * @throws Exception
	 */
	@WebMethod
	public void logoff(@WebParam(name = "sessionId")
			String sessionId) throws Exception;
	
	/**
	 * Logon a user.
	 * @param login The user's login.
	 * @param senha The user's password.
	 * @return The session's ID.
	 * @throws Exception
	 */
	@WebMethod
	public String logon(@WebParam(name = "login")
	String login, @WebParam(name = "senha")
	String senha) throws Exception;
}