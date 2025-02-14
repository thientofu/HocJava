package baitap.HasRelationships;

public class Horse extends Animal {
    private Halter myHalter = new Halter();
    public void tie(LeadRope rope) {
        myHalter.tie(rope); // Delegate tie behavior to the
        // Halter object
    }
}