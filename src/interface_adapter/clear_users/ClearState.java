package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;
import java.util.List;

// TODO Complete me

public class ClearState {
    private List<String> userNames = new ArrayList<String>();
    public ClearState(){}//todo:
    public List<String> getUserNames(){return this.userNames;}
    public void setUserNames(ClearOutputData clearOutputData){
        this.userNames = clearOutputData.getDeletedUsers();
    }
    public String formatNames(){
        String res = "";
        String newLine = System.getProperty("line.separator");
        for (String each: this.getUserNames()){
            res += (newLine + each);
        }
        return res;
    }
}
