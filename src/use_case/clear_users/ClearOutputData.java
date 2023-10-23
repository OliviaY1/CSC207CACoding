package use_case.clear_users;

// TODO Complete me
import java.util.List;

public class ClearOutputData {
    private final List<String> deletedUsers;
    ClearOutputData(List<String> deletedUsers){
        this.deletedUsers = deletedUsers;
    }
    public List<String> getDeletedUsers(){return this.deletedUsers;}
}
