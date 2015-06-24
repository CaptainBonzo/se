package withstrategy;

import withoutstrategy.UserInterface;

public class ContentProvider {
	private AuthenticationStrategy loginStrategy;
    private UserInterface ui;

	public void setLoginStrategy(AuthenticationStrategy loginStrategy) {
		this.loginStrategy = loginStrategy;
	}

	public void enter() {
		loginStrategy.login();
	}

	public void show() {
		if (loginStrategy.isValidUser()) {
			ui.showContent();
		}
	}

	public void exit() {
		loginStrategy.logout();
	}
}
