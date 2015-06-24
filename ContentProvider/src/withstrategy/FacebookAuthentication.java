package withstrategy;

public class FacebookAuthentication implements AuthenticationStrategy {

	@Override
	public void login() {
		Facebook.LoginUser();
	}

	@Override
	public void logout() {
		Facebook.LogoffUser();
	}

	@Override
	public boolean isValidUser() {
		return Facebook.ValidUser();
	}

}
