package streamApi;

public enum Position {
    DEVELOPER(true), TECH_LEAD(true), RECRUITER(false), CEO(false);

    private boolean isIt;

    Position(boolean isIt) {
        this.isIt = isIt;
    }

    public boolean isIt() {
        return isIt;
    }
}
