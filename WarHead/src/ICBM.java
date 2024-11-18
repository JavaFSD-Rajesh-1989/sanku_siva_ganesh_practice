class ICBM extends Warhead {
    public ICBM(String targetCoordinates, int payload) {
        super(targetCoordinates, payload);
    }

    @Override
    public void launch() {
        System.out.println("Launching ICBM at " + getTargetCoordinates() + " with payload " + getPayload());
    }
}