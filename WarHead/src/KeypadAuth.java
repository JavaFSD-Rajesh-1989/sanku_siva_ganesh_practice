class KeypadAuth implements AuthenticationMechanism {
    private String password;

    public KeypadAuth(String password) {
        this.password = password;
    }

    @Override
    public boolean validateCredentials(String credentials) {
        return this.password.equals(credentials);
    }
}