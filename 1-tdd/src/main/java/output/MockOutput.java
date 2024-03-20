package output;

public class MockOutput implements Output {

    private boolean invoked = false;
    @Override
    public void print(String toPrint) {
        invoked = true;
        if (!toPrint.equals("1,2,Fizz,4,Buzz")) {
            throw new Error("Invalid mock call");
        }
    }

    public boolean isInvoked() {
        return invoked;
    }
}
