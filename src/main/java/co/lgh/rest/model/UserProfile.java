package co.lgh.rest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfile {

	private String id;
	private String name;
	private String phone;
	private String addr;

	public UserProfile(String id, String name, String phone, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

}
