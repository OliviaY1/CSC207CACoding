package interface_adapter.logged_out;

import interface_adapter.ViewManagerModel;
import interface_adapter.login.LoginViewModel;
import use_case.logged_out.LoggedOutOutputBoundary;

public class LoggedOutPresenter implements LoggedOutOutputBoundary {
    private final ViewManagerModel viewManagerModel;
    private final LoginViewModel loginViewModel;
    public LoggedOutPresenter(ViewManagerModel viewManagerModel, LoginViewModel loginViewModel){
        this.loginViewModel = loginViewModel;
        this.viewManagerModel = viewManagerModel;
    }
    @Override
    public void prepareSuccessView() {
        this.viewManagerModel.setActiveView(this.loginViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }
}
