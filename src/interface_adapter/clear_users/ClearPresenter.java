package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputData;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary{
    private final ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel){
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }
    public void prepareSuccessView(ClearOutputData users){
        ClearState clearState = clearViewModel.getState();
        clearState.setUserNames(users);
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
        //todo: add this to view Manager?
        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();

    }
    public void prepareFailView(String error){}
}
