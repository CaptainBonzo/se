package withstrategy;

public interface AuthenticationStrategy {
	public void login();
	public void logout();
	public boolean isValidUser();
}
