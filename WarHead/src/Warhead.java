abstract class Warhead {
    private String targetCoordinates;
    private int payload;

    public Warhead(String targetCoordinates, int payload) {
        this.targetCoordinates = targetCoordinates;
        this.payload = payload;
    }

    public String getTargetCoordinates() { return targetCoordinates; }
    public int getPayload() { return payload; }

    public abstract void launch();
}