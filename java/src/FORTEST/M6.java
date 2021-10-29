package FORTEST;

class One {
    private int secret = 1;
    int roommate = 2;
    protected int child = 3;
    public int anybody = 4;

    public void show() {

    }
}

class Three {
    void print() {
        One o = new One();
        System.out.println(o.roommate);
    }
}
