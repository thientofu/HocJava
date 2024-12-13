package baitap.SCJP;

public class Listeners {
    private List<ActionListener> actionListeners = new ArrayList<>();

    // Method to add an ActionListener
    public void addActionListener(ActionListener listener) {
        actionListeners.add(listener);
    }

    // Method to remove an ActionListener
    public void removeActionListener(ActionListener listener) {
        actionListeners.remove(listener);
    }
}
