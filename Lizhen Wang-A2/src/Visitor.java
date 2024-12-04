public class Visitor extends Person {
    private int visitorId;
    private boolean isVIP;

    public Visitor() { super(); }

    public Visitor(String name, int age, String gender, int visitorId, boolean isVIP) {
        super(name, age, gender);
        this.visitorId = visitorId;
        this.isVIP = isVIP;
    }

    public int getVisitorId() { return visitorId; }
    public void setVisitorId(int visitorId) { this.visitorId = visitorId; }

    public boolean isVIP() { return isVIP; }
    public void setVIP(boolean isVIP) { this.isVIP = isVIP; }
}