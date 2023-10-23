package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData users);

    void prepareFailView(String error);
}
