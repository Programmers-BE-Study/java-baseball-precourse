package Application.baseball_ver3;

import java.util.ArrayList;
import java.util.List;

public class Save {
    Save saveInstance = new Save();
    private List<String> gameLogs = new ArrayList<String>();

    public Save getInstance(){return saveInstance;}
    private Save(){}


}
