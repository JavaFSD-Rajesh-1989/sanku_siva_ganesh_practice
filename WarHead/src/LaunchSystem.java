import java.util.ArrayList;
import java.util.List;

class LaunchSystem {
    private AuthenticationMechanism authMechanism;
    private List<Warhead> warheads = new ArrayList<>();

    public LaunchSystem(AuthenticationMechanism authMechanism) {
        this.authMechanism = authMechanism;
    }

    public boolean authorize(String credentials) throws Exception {
        if (!authMechanism.validateCredentials(credentials)) {
            throw new Exception("Unauthorized Access!");
        }
        return true; 
    }

    public void addWarhead(Warhead warhead) {
        warheads.add(warhead);
    }

    public void initiateLaunch() {
        for (Warhead warhead : warheads) {
            warhead.launch();
        }
    }
}
