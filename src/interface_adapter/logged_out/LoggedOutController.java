package interface_adapter.logged_out;

import use_case.logged_out.LoggedOutInputBoundary;

public class LoggedOutController {
    private final LoggedOutInputBoundary loggedOutInputBoundary;
    public LoggedOutController(LoggedOutInputBoundary loggedOutInputBoundary){
        this.loggedOutInputBoundary=loggedOutInputBoundary;
    }
    public void execute() {
        this.loggedOutInputBoundary.execute();
    }
}
