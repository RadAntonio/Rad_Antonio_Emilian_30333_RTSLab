package LabSession2.Application2;

public class StartClas {
    private Fir fir;
    private static Window win = new Window(Main.noOfThreads);

    public void startProgram() {
        for (int i = 0; i < Main.noOfThreads; i++) {
            this.fir = new Fir(i, Main.processorLoad);
            this.fir.addObserver(win);
            this.fir.startThread();
        }
    }
}
