package user_interface;

import java.util.LinkedHashMap;

public class TextMenu implements Menu {

    private final LinkedHashMap<String, Runnable> options;

    public TextMenu(LinkedHashMap<String, Runnable> options) {
        this.options = new LinkedHashMap<String, Runnable>(options);
    }

    @Override
    public void showOptions() {
        this.options.sequencedKeySet().forEach(System.out::println);
    }

    @Override
    public String readUserChoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readUserChoice'");
    }

    @Override
    public void runChoice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runChoice'");
    }

}
