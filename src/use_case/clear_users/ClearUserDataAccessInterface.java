package use_case.clear_users;

import entity.User;
import java.util.List;

// TODO Complete me

public interface ClearUserDataAccessInterface {

    abstract void delete();
    abstract boolean isEmpty();
    abstract List<String> getDeletedUsers();
}
