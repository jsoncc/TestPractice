package com.demo;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class is a simple JFrame implementation to explain how to
 * display time dynamically on the JSwing-based interface.
 */
public class TimeFrame extends JFrame {
    /*
     * Variables
     */
    private JPanel timePanel;
    private JLabel timeLabel;

    private JLabel displayArea;
    private String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    private String time;
    private JLabel timeLabel2;
    private int ONE_SECOND = 1000;

    public TimeFrame() {
        timePanel = new JPanel();
        timeLabel = new JLabel("CurrentTime: ");
        displayArea = new JLabel();


        configTimeArea();
        timeLabel2 = new JLabel("距离下班剩余：");

        timePanel.add(timeLabel);

        timePanel.add(displayArea);
        this.add(timePanel);
        timePanel.add(timeLabel2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(200, 70));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method creates a timer task to update the time per second
     */
    private void configTimeArea() {
        Timer tmr = new Timer();
        tmr.scheduleAtFixedRate(new JLabelTimerTask(), new Date(), ONE_SECOND);
    }

    /**
     * Timer task to update the time display area
     */
    protected class JLabelTimerTask extends TimerTask {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_TIME_FORMAT);

        @Override
        public void run() {
            time = dateFormatter.format(Calendar.getInstance().getTime());
            displayArea.setText(time);
        }
    }

    public static void main(String arg[]) {
        TimeFrame timeFrame = new TimeFrame();
        timeFrame.setVisible(true);
    }
}/* 何问起 hovertree.com */
