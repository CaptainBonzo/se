package withoutstrategy;

public class ContentProvider {
	   private Database db;
	   private UserInterface ui;
	   private LoginType loginType;
	   
	   public void enter (){ 
	      if(loginType == LoginType.DB_LOGIN){
	         db.logIn();
	      }
	      else if (loginType == LoginType.FACEBOOK){
	         Facebook.LoginUser();
	      }
	   }
	   
	   public void show(){
	      boolean isValidUser = false;
	      if(loginType == LoginType.DB_LOGIN){
	         isValidUser = db.isLoginSuccess();
	      }
	      else if (loginType == LoginType.FACEBOOK){
	         isValidUser = Facebook.ValidUser();
	      }
	      else if (loginType == LoginType.GUEST){
	         isValidUser = true;
	      }     

	      if (isValidUser == true){
	         ui.showContent();
	      }
	   }
	   
	   public void exit() {
	      if(loginType == LoginType.DB_LOGIN){
	         db.logOut();
	      }
	      else if (loginType == LoginType.FACEBOOK){
	         Facebook.LogoffUser();
	      }
	   }
	}    

