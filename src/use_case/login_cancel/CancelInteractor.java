package use_case.login_cancel;

import interface_adapter.login_cancel.CancelController;

public class CancelInteractor implements CancelInputBoundary{
    CancelOutputBoundary outputPresenter;
    public CancelInteractor(CancelOutputBoundary cancelOutputBoundary){
        this.outputPresenter = cancelOutputBoundary;
    }
    public void execute(){
        outputPresenter.prepareSuccessView();
    }
}
