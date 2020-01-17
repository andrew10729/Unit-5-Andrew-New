public class Die implements Lockable {
    private boolean isLocked;
    private int face;

    public Die() {


    }

    public void setLockable(boolean status) {
        this.isLocked = status;

    }
    public boolean getLockable(){
        return isLocked;
    }




    public int getFace() {
        return face;
    }

    public void roll(){
        face = (int) (Math.random() * 6 + 1);
    }

    public String toString(){
        String result = "Face value = " + face;
        return result;
    }
}
