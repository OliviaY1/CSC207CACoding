package interface_adapter.login_cancel;
import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.login_cancel.CancelOutputBoundary;

import javax.swing.text.View;

public class CancelPresenter implements CancelOutputBoundary{
    private final ViewManagerModel viewManagerModel;
    private final SignupViewModel signupViewModel;
    public CancelPresenter(ViewManagerModel viewManagerModel,
                           SignupViewModel signupViewModel){
        this.viewManagerModel = viewManagerModel;
        this.signupViewModel = signupViewModel;
    }
    public void prepareSuccessView(){
        SignupState signupState = signupViewModel.getState();
        signupState.reset();
        this.signupViewModel.setState(signupState);
        this.signupViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(signupViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }
}
