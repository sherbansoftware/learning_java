package miscellaneous.package_game;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
