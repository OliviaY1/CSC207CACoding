package use_case.logged_out;

public class LoggedOutInteractor implements LoggedOutInputBoundary{
    private final LoggedOutOutputBoundary loggedOutPresenter;
    public LoggedOutInteractor(LoggedOutOutputBoundary loggedOutPresenter){
        this.loggedOutPresenter = loggedOutPresenter;
    }
    public void execute(){
        this.loggedOutPresenter.prepareSuccessView();
    }
}
