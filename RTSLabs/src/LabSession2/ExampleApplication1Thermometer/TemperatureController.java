package LabSession2.ExampleApplication1Thermometer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class TemperatureController {
    Thermometer t;
    TemperatureTextView tview;
    public TemperatureController(Thermometer t, TemperatureTextView tview, TemperatureCanvasView tcanvasView){
        t.addObserver(tview);
        t.addObserver(tcanvasView);
        this.tview = tview;
        tview.addEnableDisableListener(new EnableDisableListener());
    }
    class EnableDisableListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            t.setPause(t.isPaused());
        }
    }
}
