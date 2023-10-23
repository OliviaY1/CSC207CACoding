package interface_adapter.clear_users;
import use_case.clear_users.ClearInputBoundary;
// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearInteractor;
    public ClearController(ClearInputBoundary clearInteractor){  // no void in front of constructor
        this.clearInteractor = clearInteractor;
    }
    public void execute(){  // No Input Data used
        // fixme: this.clearInteractor ^ clearInteractor makes difference?
        clearInteractor.execute();
    }
}
