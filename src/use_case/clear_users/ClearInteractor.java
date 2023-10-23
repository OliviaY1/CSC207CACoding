package use_case.clear_users;

import java.util.List;
// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{
    final ClearOutputBoundary clearPresenter;
    final ClearUserDataAccessInterface clearUserDAO;
    public ClearInteractor(ClearOutputBoundary clearPresenter,
                           ClearUserDataAccessInterface clearUserDataAccessInterface){
        this.clearPresenter = clearPresenter;
        this.clearUserDAO = clearUserDataAccessInterface;
    }
    public void execute(){
        clearUserDAO.delete();
        List<String> deletedUsers = clearUserDAO.getDeletedUsers();
        ClearOutputData clearOutputData = new ClearOutputData(deletedUsers);
        clearPresenter.prepareSuccessView(clearOutputData);

        // if csvFile empty: call Presenter.prepare
        // else call DAO.deleteALL()
        // and create output data, pass it to ClearPresenter.preparexxView(output)
        //todo: consider the case to use prepareFailView()
    }
}
