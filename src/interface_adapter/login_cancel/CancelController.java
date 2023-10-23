package interface_adapter.login_cancel;

import use_case.login_cancel.CancelInputBoundary;

public class CancelController {
    private final CancelInputBoundary cancelInputBoundary;
    public CancelController(CancelInputBoundary cancelInputBoundary){
        this.cancelInputBoundary = cancelInputBoundary;
    }
    public void execute(){
        cancelInputBoundary.execute();
    }
}
