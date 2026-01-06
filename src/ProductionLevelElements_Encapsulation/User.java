package ProductionLevelElements_Encapsulation;

public class User {
	
	private String name;
	private String email;
	private String password;
	private int failedAttempts;
	private boolean accountLocked;

	private static final int MAX_ATTEMPTS = 3;

	public User(String name, String email, String password) {
		setName(name);
		setEmail(email);
		setPassword(password);
		this.failedAttempts=0;
		this.accountLocked=false;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Name should not be null");
		}
		if (name.length() < 2) {
			throw new IllegalArgumentException("Invalid name");

		}
		this.name = name;
	}

	public void setEmail(String email) {
		if (email == null) {
			throw new IllegalArgumentException("Email cannot be null");
		}

		email = email.toLowerCase().trim();
		if (email.length() < 5 || email.length() > 254) {
			throw new IllegalArgumentException("Invalid email length");
		}

		if (!email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		this.email = email;
	}

	public void setPassword(String password) {
		if (password == null) {
			throw new IllegalArgumentException("Password cannot be null");
		}

		if (password.length() < 8) {
			throw new IllegalArgumentException("Password is too weak");

		}
		this.password = password;
	}
}
