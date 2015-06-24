package withstrategy;

public class DatabaseAuthentication implements AuthenticationStrategy{
	private Database db;
	@Override
	public void login() {
		db.logIn();		
	}

	@Override
	public void logout() {
		db.logOut();
	}

	@Override
	public boolean isValidUser() {
		return db.isLoginSuccess();
	}

}
