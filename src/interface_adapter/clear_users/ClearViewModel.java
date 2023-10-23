package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import interface_adapter.signup.SignupState;

/* I decide to let SignUpView have multiple View Model
 */
public class ClearViewModel extends ViewModel{
    public static final String CLEAR_BUTTON_LABEL = "Clear";
    private ClearState state = new ClearState();
    public ClearViewModel(){super("clear");}

    public void setState(ClearState state){this.state = state;}

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void firePropertyChanged(){support.firePropertyChange("state", null, this.state);}
    public void addPropertyChangeListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
    public ClearState getState(){return state;}

}
