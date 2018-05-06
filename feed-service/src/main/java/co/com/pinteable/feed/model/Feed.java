package co.com.pinteable.feed.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * A hike.
 *
 * @author Gunnar Morling
 */
//@Entity
public class Feed {

//	@Id
//	@GeneratedValue(generator = "uuid")
//	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;


	private String userAvatarUrl;
	private String description;
	private String userName;
	private List<Image> images;

	// constructors, getters and setters...

	public Feed() {
	}


	public Feed(String id, String userAvatarUrl, String description, String userName, List<Image> images) {
		this.id = id;
		this.userAvatarUrl = userAvatarUrl;
		this.description = description;
		this.userName = userName;
		this.images = images;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserAvatarUrl() {
		return userAvatarUrl;
	}

	public void setUserAvatarUrl(String userAvatarUrl) {
		this.userAvatarUrl = userAvatarUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}


}