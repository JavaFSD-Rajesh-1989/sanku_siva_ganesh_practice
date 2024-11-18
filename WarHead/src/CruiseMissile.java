class CruiseMissile extends Warhead {
    public CruiseMissile(String targetCoordinates, int payload) {
        super(targetCoordinates, payload);
    }

    @Override
    public void launch() {
        System.out.println("Launching Cruise Missile at " + getTargetCoordinates() + " with payload " + getPayload());
    }
}