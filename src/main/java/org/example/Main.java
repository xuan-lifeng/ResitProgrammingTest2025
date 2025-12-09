package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        MedicalNotification notification = new MedicalNotification("None","Dialysis machine, ECG recorder, Ultrasound scanner, Masseur");
        HospitalInformation info = new HospitalInformation();

        ArrayList<Bay> list = new ArrayList<>();
        list.add(new Dix("Dix Bay", info, notification));
        list.add(new Barton("Barton Bay", info, notification));
        list.add(new Nightingale("Nightingale Bay", info, notification));
        list.add(new Seacole("Seacole Bay", info, notification));
        list.add(new Henderson("Henderson Bay", info, notification));
        list.add(new Sanger("Sanger Bay", info, notification));
        list.add(new Cavell("Cavell Bay", info, notification));
        list.add(new Breckinridge("Breckinridge Bay", info, notification));



        JFrame frame = new JFrame("Bay Service Dashboard");
        frame.setSize(900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(list.size(), 1));
        frame.add(panel);

        ArrayList<JPanel> panels = new ArrayList<>();
        ArrayList<JLabel> labels = new ArrayList<>();

        for (Bay bays : list) {
            JPanel p = new JPanel();
            JLabel l = new JLabel("Loading...");
            p.add(l);
            p.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            panels.add(p);
            labels.add(l);
            panel.add(p);
        }

        frame.setVisible(true);

        final int[] counter = {0};

        Timer timer = new Timer(1000, e -> {

            for (int i = 0; i < list.size(); i++) {
                Bay bays = list.get(i);
                bays.update();
                labels.get(i).setText(bays.getDisplayText());

            }

            counter[0]++;
            if (counter[0] == 20) {
                counter[0] = 0;
                System.out.println("===== SERVICES LOG =====");
                for (Bay bays : list) {
                    System.out.println(
                            bays.getDisplayText()
                                    .replace("<html>", "")
                                    .replace("</html>", "")
                                    .replace("<br>", " | ")
                    );
                }
                System.out.println("=====================");
            }
        });

        timer.start();
    }
}
