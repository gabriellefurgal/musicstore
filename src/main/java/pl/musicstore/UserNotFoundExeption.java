package pl.musicstore;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String userId) {
		super("could not find user with name '" + userId + "'.");
	}

	public UserNotFoundException(Long userId) {
		super("could not find user with id '" + userId + "'.");
	}

}