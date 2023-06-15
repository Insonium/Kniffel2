package org.kniffel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextFieldA extends Main {

    static JTextField aa = new JFormattedTextField("");
    static JTextField ab = new JFormattedTextField("");
    static JTextField ac = new JFormattedTextField("");
    static JTextField ad = new JFormattedTextField("");
    static JTextField ae = new JFormattedTextField("");
    static JTextField af = new JFormattedTextField("");
    static JTextField ag = new JFormattedTextField("");
    static JTextField ah = new JFormattedTextField("");
    static JTextField ai = new JFormattedTextField("");
    static JTextField aj = new JFormattedTextField("");
    static JTextField ak = new JFormattedTextField("");
    static JTextField al = new JFormattedTextField("");
    static JTextField am = new JFormattedTextField("");
    static JTextField an = new JFormattedTextField("");
    static JTextField ao = new JFormattedTextField("");
    static JTextField ap = new JFormattedTextField("");
    static JTextField aq = new JFormattedTextField("");
    static JTextField ar = new JFormattedTextField("");
    static JTextField as = new JFormattedTextField("");

    static boolean isAddedaa = false;
    static boolean isAddedab = false;
    static boolean isAddedac = false;
    static boolean isAddedad = false;
    static boolean isAddedae = false;
    static boolean isAddedaf = false;


    public TextFieldA(JFrame frame) {
        //aa.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        aa.setBounds(935, 118, 80, 35);
        aa.setForeground(new Color(255, 255, 255));
        aa.setBackground(new Color(32, 32, 32));
        aa.setCaretColor(Color.WHITE);
        aa.setBorder(new RoundedBorder(10));
        frame.add(aa);


        //aa.setComponentZOrder(aa, 1);
     /*   aa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleTextChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //handleTextChanged();
            }

            private void handleTextChanged() {
                String eingabe = "10";


                if (aa.getText() != null){
                    eingabe = aa.getText();
                }
                if( Integer.parseInt(eingabe) == 0||Integer.parseInt(eingabe) == 1||Integer.parseInt(eingabe) == 2 || Integer.parseInt(eingabe) == 3 || Integer.parseInt(eingabe) == 4 || Integer.parseInt(eingabe) == 5 ){


                }else {
                    aa.setText("0");
                }

            }
        }); */


        ab.setBounds(935, 165, 80, 35);
        ab.setForeground(new Color(255, 255, 255));
        ab.setBackground(new Color(32, 32, 32));
        ab.setCaretColor(Color.WHITE);
        ab.setBorder(new RoundedBorder(10));
        frame.add(ab);
        //aa.setComponentZOrder(aa, 1);
        //aa.setComponentZOrder(aa, 1);
        ab.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                handleTextChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //handleTextChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                handleTextChanged();
            }

            private void handleTextChanged() {
                String eingabe = "10";

                if (ab.getText() != null) {
                    eingabe = ab.getText();
                }
                if (Integer.parseInt(eingabe) == 0 || Integer.parseInt(eingabe) == 2 || Integer.parseInt(eingabe) == 4 || Integer.parseInt(eingabe) == 6 || Integer.parseInt(eingabe) == 8 || Integer.parseInt(eingabe) == 10) {

                }

            }
        });


        ac.setBounds(935, 207, 80, 35);
        ac.setForeground(new Color(255, 255, 255));
        ac.setBackground(new Color(32, 32, 32));
        ac.setCaretColor(Color.WHITE);
        ac.setBorder(new RoundedBorder(10));
        frame.add(ac);
        //aa.setComponentZOrder(aa, 1);
        Action actionac = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ac.addActionListener(actionac);


        ad.setBounds(935, 250, 80, 35);
        ad.setForeground(new Color(255, 255, 255));
        ad.setBackground(new Color(32, 32, 32));
        ad.setCaretColor(Color.WHITE);
        ad.setBorder(new RoundedBorder(10));
        frame.add(ad);
        //aa.setComponentZOrder(aa, 1);
        Action actionad = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ad.addActionListener(actionad);


        ae.setBounds(935, 294, 80, 35);
        ae.setForeground(new Color(255, 255, 255));
        ae.setBackground(new Color(32, 32, 32));
        ae.setCaretColor(Color.WHITE);
        ae.setBorder(new RoundedBorder(10));
        frame.add(ae);
        //aa.setComponentZOrder(aa, 1);
        Action actionae = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ae.addActionListener(actionae);


        af.setBounds(935, 337, 80, 35);
        af.setForeground(new Color(255, 255, 255));
        af.setBackground(new Color(32, 32, 32));
        af.setCaretColor(Color.WHITE);
        af.setBorder(new RoundedBorder(10));
        frame.add(af);
        //aa.setComponentZOrder(aa, 1);
        Action actionaf = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        af.addActionListener(actionaf);


        ag.setBounds(935, 382, 80, 35);
        ag.setForeground(new Color(255, 255, 255));
        ag.setBackground(new Color(32, 32, 32));
        ag.setCaretColor(Color.WHITE);
        ag.setBorder(new RoundedBorder(10));
        frame.add(ag);
        //aa.setComponentZOrder(aa, 1);
        Action actionag = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ag.addActionListener(actionag);


        ah.setBounds(935, 427, 80, 35);
        ah.setForeground(new Color(255, 255, 255));
        ah.setBackground(new Color(32, 32, 32));
        ah.setCaretColor(Color.WHITE);
        ah.setBorder(new RoundedBorder(10));
        frame.add(ah);
        //aa.setComponentZOrder(aa, 1);
        Action actionah = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ah.addActionListener(actionah);


        ai.setBounds(935, 470, 80, 35);
        ai.setForeground(new Color(255, 255, 255));
        ai.setBackground(new Color(32, 32, 32));
        ai.setCaretColor(Color.WHITE);
        ai.setBorder(new RoundedBorder(10));
        frame.add(ai);
        //aa.setComponentZOrder(aa, 1);
        Action actionai = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ai.addActionListener(actionai);


        aj.setBounds(935, 525, 80, 35);
        aj.setForeground(new Color(255, 255, 255));
        aj.setBackground(new Color(32, 32, 32));
        aj.setCaretColor(Color.WHITE);
        aj.setBorder(new RoundedBorder(10));
        frame.add(aj);
        //aa.setComponentZOrder(aa, 1);
        Action actionaj = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        aj.addActionListener(actionaj);


        ak.setBounds(935, 566, 80, 35);
        ak.setForeground(new Color(255, 255, 255));
        ak.setBackground(new Color(32, 32, 32));
        ak.setCaretColor(Color.WHITE);
        ak.setBorder(new RoundedBorder(10));
        frame.add(ak);
        //aa.setComponentZOrder(aa, 1);
        Action actionak = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ak.addActionListener(actionak);


        al.setBounds(935, 610, 80, 35);
        al.setForeground(new Color(255, 255, 255));
        al.setBackground(new Color(32, 32, 32));
        al.setCaretColor(Color.WHITE);
        al.setBorder(new RoundedBorder(10));
        frame.add(al);
        //aa.setComponentZOrder(aa, 1);
        Action actional = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        al.addActionListener(actional);


        am.setBounds(935, 655, 80, 35);
        am.setForeground(new Color(255, 255, 255));
        am.setBackground(new Color(32, 32, 32));
        am.setCaretColor(Color.WHITE);
        am.setBorder(new RoundedBorder(10));
        frame.add(am);
        //aa.setComponentZOrder(aa, 1);
        Action actionam = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        am.addActionListener(actionam);


        an.setBounds(935, 698, 80, 35);
        an.setForeground(new Color(255, 255, 255));
        an.setBackground(new Color(32, 32, 32));
        an.setCaretColor(Color.WHITE);
        an.setBorder(new RoundedBorder(10));
        frame.add(an);
        //aa.setComponentZOrder(aa, 1);
        Action actionan = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        an.addActionListener(actionan);


        ao.setBounds(935, 742, 80, 35);
        ao.setForeground(new Color(255, 255, 255));
        ao.setBackground(new Color(32, 32, 32));
        ao.setCaretColor(Color.WHITE);
        ao.setBorder(new RoundedBorder(10));
        frame.add(ao);
        //aa.setComponentZOrder(aa, 1);
        Action actionao = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ao.addActionListener(actionao);


        ap.setBounds(935, 786, 80, 35);
        ap.setForeground(new Color(255, 255, 255));
        ap.setBackground(new Color(32, 32, 32));
        ap.setCaretColor(Color.WHITE);
        ap.setBorder(new RoundedBorder(10));
        frame.add(ap);
        //aa.setComponentZOrder(aa, 1);
        Action actionap = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ap.addActionListener(actionap);


        aq.setBounds(935, 829, 80, 35);
        aq.setForeground(new Color(255, 255, 255));
        aq.setBackground(new Color(32, 32, 32));
        aq.setCaretColor(Color.WHITE);
        aq.setBorder(new RoundedBorder(10));
        frame.add(aq);
        //aa.setComponentZOrder(aa, 1);
        Action actionaq = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        aq.addActionListener(actionaq);


        ar.setBounds(935, 872, 80, 35);
        ar.setForeground(new Color(255, 255, 255));
        ar.setBackground(new Color(32, 32, 32));
        ar.setCaretColor(Color.WHITE);
        ar.setBorder(new RoundedBorder(10));
        frame.add(ar);
        //aa.setComponentZOrder(aa, 1);
        Action actionar = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        ar.addActionListener(actionar);


        as.setBounds(935, 918, 80, 35);
        as.setForeground(new Color(255, 255, 255));
        as.setBackground(new Color(32, 32, 32));
        as.setCaretColor(Color.WHITE);
        as.setBorder(new RoundedBorder(10));
        frame.add(as);
        //aa.setComponentZOrder(aa, 1);
        Action actionas = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        as.addActionListener(actionas);


        new Thread(() -> {

            while (true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                String eingabeaa = aa.getText();
                String eingabeab = ab.getText();
                String eingabeac = ac.getText();
                String eingabead = ad.getText();
                String eingabeae = ae.getText();
                String eingabeaf = af.getText();
                String eingabeag = ag.getText();
                String eingabeah = ah.getText();
                String eingabeai = ai.getText();
                String eingabeaj = aj.getText();
                String eingabeak = ak.getText();
                String eingabeal = al.getText();
                String eingabeam = am.getText();
                String eingabean = an.getText();
                String eingabeao = ao.getText();
                String eingabeap = ap.getText();
                String eingabeaq = aq.getText();
                String eingabear = ar.getText();
                String eingabeas = as.getText();
                if (eingabeaa.equals("") ||eingabeaa.matches("[1-5]")) {
                    aa.setText(eingabeaa);

                } else {
                    aa.setText("");
                }
                if (eingabeab.equals("") ||eingabeab.equals("2") || eingabeab.equals("4") || eingabeab.equals("6") || eingabeab.equals("8") || eingabeab.equals("10")) {
                    ab.setText(eingabeab);

                } else {
                    ab.setText("");
                }
                if (eingabeac.equals("") ||eingabeac.equals("3") || eingabeac.equals("6") || eingabeac.equals("9") || eingabeac.equals("12") || eingabeac.equals("15")) {
                    ac.setText(eingabeac);

                } else {
                    ac.setText("");
                }
                if (eingabead.equals("") ||eingabead.equals("4") || eingabead.equals("8") || eingabead.equals("12") || eingabead.equals("16") || eingabead.equals("20")) {
                    ad.setText(eingabead);

                } else {
                    ad.setText("");
                }
                if (eingabeae.equals("") ||eingabeae.equals("5") || eingabeae.equals("10") || eingabeae.equals("15") || eingabeae.equals("20") || eingabeae.equals("25")) {
                    ae.setText(eingabeae);

                } else {
                    ae.setText("");
                }
                if (eingabeaf.equals("") ||eingabeaf.equals("6") || eingabeaf.equals("12") || eingabeaf.equals("18") || eingabeaf.equals("24") || eingabeaf.equals("30")) {
                    af.setText(eingabeaf);

                } else {
                    af.setText("");
                }
                try {
                    int zahl = Integer.parseInt(eingabeaj);


                        if (eingabeaj.equals("")){
                            aj.setText("");
                        }
                         else if (zahl >= 5 && zahl <= 30) {
                            aj.setText(eingabeaj);

                        }else aj.setText("");

                } catch (NumberFormatException e) {

                }
                try {
                    int zahl = Integer.parseInt(eingabeak);

                    if (eingabeak.equals("")){
                        ak.setText("");
                    }
                    else if (zahl >= 5 && zahl <= 30) {
                        ak.setText(eingabeak);

                    }else ak.setText("");

                } catch (NumberFormatException e) {

                }
                if (eingabeal.equals("") ||eingabeal.equals("25")) {
                    al.setText(eingabeal);

                } else {
                    al.setText("0");
                }
                if (eingabeam.equals("") ||eingabeam.equals("30")) {
                    am.setText(eingabeam);

                } else {
                    am.setText("0");
                }
                if (eingabean.equals("") ||eingabean.equals("40")) {
                    an.setText(eingabean);

                } else {
                    an.setText("0");
                }
                if (eingabeao.equals("") ||eingabeao.equals("50")) {
                    ao.setText(eingabeao);

                } else {
                    ao.setText("0");
                }

                    try {
                        int zahl = Integer.parseInt(eingabeap);

                        if (zahl >= 0 && zahl <= 30 ||eingabeap.equals("") ||eingabeap.equals("0")) {
                            if(eingabeap.equals("") ||eingabeap.equals("0")) {
                                ap.setText("");
                            }else if(zahl >= 0 && zahl <= 30){
                                ap.setText(eingabeap);

                            }

                        } else {

                            ap.setText("");
                        }
                    } catch (NumberFormatException e) {

                        ap.setText("");
                    }


                int summe = 0;

                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int aa = Integer.parseInt(eingabeaa);
                    summe += aa;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }

                try {
                    // eingabeab zu int konvertieren und zur Summe hinzufügen
                    int ab = Integer.parseInt(eingabeab);
                    summe += ab;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                }
                try {
                    // eingabeab zu int konvertieren und zur Summe hinzufügen
                    int ac = Integer.parseInt(eingabeac);
                    summe += ac;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                }
                try {
                    // eingabeab zu int konvertieren und zur Summe hinzufügen
                    int ad = Integer.parseInt(eingabead);
                    summe += ad;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                }
                try {
                    // eingabeab zu int konvertieren und zur Summe hinzufügen
                    int ae = Integer.parseInt(eingabeae);
                    summe += ae;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                }
                try {
                    // eingabeab zu int konvertieren und zur Summe hinzufügen
                    int af = Integer.parseInt(eingabeaf);
                    summe += af;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                }


                String test = Integer.toString(summe);
                ag.setText(test);


                    if (summe >= 63) {

                        int zusatz = 35;
                        int summe1 = zusatz + summe;
                        String test1 = Integer.toString(summe1);
                        ai.setText(test1);
                        ah.setText("✔️");
                        try {
                            if(eingabeai.equals(""))
                            // eingabeab zu int konvertieren und zur Summe hinzufügen
                            ar.setText("");
                        } catch (NumberFormatException e) {
                            // Fehlgeschlagene Konvertierung, wenn eingabeab kein gültiger Integer ist
                        }

                    } else {

                        String test2 = Integer.toString(summe);
                        ai.setText(test2);
                        ah.setText("");//"0"
                        ar.setText(test2);
                    }




                int summe2 = 0;

                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int aj = Integer.parseInt(eingabeaj);
                    summe2 += aj;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }

                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int ak = Integer.parseInt(eingabeak);
                    summe2 += ak;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int al = Integer.parseInt(eingabeal);
                    summe2 += al;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int am = Integer.parseInt(eingabeam);
                    summe2 += am;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int an = Integer.parseInt(eingabean);
                    summe2 += an;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int ao = Integer.parseInt(eingabeao);
                    summe2 += ao;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                try {
                    // eingabeaa zu int konvertieren und zur Summe hinzufügen
                    int ap = Integer.parseInt(eingabeap);
                    summe2 += ap;
                } catch (NumberFormatException e) {
                    // Fehlgeschlagene Konvertierung, wenn eingabeaa kein gültiger Integer ist
                }
                String test4 = Integer.toString(summe2);
                aq.setText(test4);

                if (summe >= 63) {

                    int zusatz1 = 35;
                    int summe3 = zusatz1 + summe + summe2;
                    String test5 = Integer.toString(summe3);
                    as.setText(test5);
                }else {
                    int summe3 = summe + summe2;
                    String test6 = Integer.toString(summe3);
                    as.setText(test6);

                }







            }
        }).start();





    }



    public static void resetValues() {
        aa.setText("");
        ab.setText("");
        ac.setText("");
        ad.setText("");
        ae.setText("");
        af.setText("");
        ag.setText("");//
        ah.setText("");
        ai.setText("");//
        aj.setText("");
        ak.setText("");
        al.setText("");
        am.setText("");
        an.setText("");
        ao.setText("");
        ap.setText("");
        aq.setText("");//
        ar.setText("");//
        as.setText("");//

    }


}

