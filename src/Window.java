public class Window {
    private int widthCm;
    private int heightCm;
    private int areal;

 public Window (int widthCm, int heightCm){
    this.areal = widthCm * heightCm;
}

    public int getArealCm2() {
        return areal;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void add(Window window) {
        window.add(window);
    }


}
