public class LoginController {

    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void login(String username, String password) {

        if (username.isEmpty() || password.isEmpty()) {
            view.showMessage("Enter username and password.");
            return;
        }

        view.showMessage("Authentication pending.");
    }
}

