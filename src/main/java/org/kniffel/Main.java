package org.kniffel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {

    static List<JLabel> würfelListe = new ArrayList<>();
    static List<Integer> zahlenWerte = new ArrayList<>();
    static boolean isClicked0 = false;
    static boolean isClicked1 = false;
    static boolean isClicked2 = false;
    static boolean isClicked3 = false;
    static boolean isClicked4 = false;




    static JLabel Block = new JLabel(new ImageIcon (Objects.requireNonNull(Main.class.getClassLoader().getResource("Kniffel-Block.png"))));

    public static void main(String[] args) {
        JLabel würfel1 = new JLabel(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel-fragezeichen.png"))));

        JLabel würfel2 = new JLabel(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel-fragezeichen.png"))));

        JLabel würfel3 = new JLabel(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel-fragezeichen.png"))));

        JLabel würfel4 = new JLabel(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel-fragezeichen.png"))));

        JLabel würfel5 = new JLabel(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel-fragezeichen.png"))));

        // JLabel Block = new JLabel(new ImageIcon (Objects.requireNonNull(Main.class.getClassLoader().getResource("Kniffel-Block.png"))));

        würfelListe.add(würfel1);
        würfelListe.add(würfel2);
        würfelListe.add(würfel3);
        würfelListe.add(würfel4);
        würfelListe.add(würfel5);
        createFrame();
    }

    public static void createFrame(){
        JFrame frame = new JFrame("Kniffel");
        frame.getContentPane().setBackground(new Color(35,35,35));


        ImageIcon linie_horizontal = new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("linie_horizontal.png")));
        JLabel label_linie_horizontal = new JLabel(linie_horizontal);
        label_linie_horizontal.setBounds(700, 0, 5, 1024);
        frame.add(label_linie_horizontal);

        würfelListe.get(0).setBounds(100, 110, 100, 100);
        //würfelListe.get(0).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        //würfelListe.get(0).setBorder(null);
        frame.add(würfelListe.get(0));
        würfelListe.get(0).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (!isClicked0){
                    isClicked0 = true;
                }else {
                    isClicked0 = false;
                }
                if(würfelListe.get(0).getBorder() == null){
                    würfelListe.get(0).setBorder(null);
                }else würfelListe.get(0).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                würfelListe.get(0).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isClicked0){
                    würfelListe.get(0).setBorder(null);
                }else {

                }
            }
        });
        würfelListe.get(1).setBounds(210, 110, 100, 100);
        //würfelListe.get(1).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        frame.add(würfelListe.get(1));
        würfelListe.get(1).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (!isClicked1){
                    isClicked1 = true;
                }else {
                    isClicked1= false;
                }
                if(würfelListe.get(1).getBorder() == null){
                    würfelListe.get(1).setBorder(null);
                }else würfelListe.get(1).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                würfelListe.get(1).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isClicked1){
                    würfelListe.get(1).setBorder(null);
                }else {

                }
            }
        });

        würfelListe.get(2).setBounds(320, 110, 100, 100);
        //würfelListe.get(2).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        frame.add(würfelListe.get(2));
        würfelListe.get(2).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (!isClicked2){
                    isClicked2 = true;
                }else {
                    isClicked2 = false;
                }
                if(würfelListe.get(2).getBorder() == null){
                    würfelListe.get(2).setBorder(null);
                }else würfelListe.get(2).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                würfelListe.get(2).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isClicked2){
                    würfelListe.get(2).setBorder(null);
                }else {

                }
            }
        });

        würfelListe.get(3).setBounds(430, 110, 100, 100);
        //würfelListe.get(3).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        frame.add(würfelListe.get(3));
        würfelListe.get(3).addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (!isClicked3){
                    isClicked3 = true;
                }else {
                    isClicked3 = false;
                }
                if(würfelListe.get(3).getBorder() == null){
                    würfelListe.get(3).setBorder(null);
                }else würfelListe.get(3).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                würfelListe.get(3).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isClicked3){
                    würfelListe.get(3).setBorder(null);
                }else {

                }
            }
        });

        würfelListe.get(4).setBounds(540, 110, 100, 100);
        //würfelListe.get(4).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
        frame.add(würfelListe.get(4));
        würfelListe.get(4).addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (!isClicked4){
                    isClicked4 = true;
                }else {
                    isClicked4 = false;
                }
                if(würfelListe.get(4).getBorder() == null){
                    würfelListe.get(4).setBorder(null);
                }else würfelListe.get(4).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mousePressed(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                //nicht benötigt
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                würfelListe.get(4).setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if(!isClicked4){
                    würfelListe.get(4).setBorder(null);
                }else {

                }
            }
        });

        Block.setBounds(500,5,636,998);
        frame.add(Block);

        JButton roleDice = new JButton("Würfeln");
        roleDice.setBounds(100, 250, 540, 100);
        roleDice.setFocusable(false);
        roleDice.setForeground(new Color(255, 255, 255));
        roleDice.setBackground(new Color(32,32,32));
        roleDice.setFont(new Font(null, Font.PLAIN, 50));
        roleDice.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        roleDice.setBorder((Border) new RoundedBorder(10));
        frame.add(roleDice);
        roleDice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                returnDice(isClicked0, isClicked1, isClicked2, isClicked3, isClicked4, frame);
            }
        });


        JButton nPlayer = new JButton("nächster Spieler");
        nPlayer.setBounds(100, 380, 250, 60);
        nPlayer.setFocusable(false);
        nPlayer.setForeground(new Color(255, 255, 255));
        nPlayer.setBackground(new Color(32, 32, 32));
        nPlayer.setFont(new Font(null, Font.PLAIN, 30));
        nPlayer.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        nPlayer.setBorder((Border) new RoundedBorder(10));
        frame.add(nPlayer);
        nPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nPlayer(isClicked0, isClicked1, isClicked2, isClicked3, isClicked4);
                isClicked0 = false; isClicked1 = false; isClicked2= false; isClicked3=false; isClicked4 = false;
            }
        });

        JButton newGame = new JButton("neues Spiel");
        newGame.setBounds(1650, 930, 250, 60);
        newGame.setFocusable(false);
        newGame.setForeground(new Color(255, 255, 255));
        newGame.setBackground(new Color(32, 32, 32));
        newGame.setFont(new Font(null, Font.PLAIN, 30));
        newGame.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        newGame.setBorder((Border) new RoundedBorder(10));
        frame.add(newGame);
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newGame(isClicked0, isClicked1, isClicked2, isClicked3, isClicked4);
                isClicked0 = false; isClicked1 = false; isClicked2= false; isClicked3=false; isClicked4 = false;

                TextFieldA.resetValues();
                TextFieldB.resetValues();
                TextFieldC.resetValues();
            }
        });

        JButton newPlayer = new JButton("Player +");
        newPlayer.setBounds(1835, 20, 80, 60);
        newPlayer.setFocusable(false);
        newPlayer.setForeground(new Color(255, 255, 255));
        newPlayer.setBackground(new Color(32,32,32));
        newPlayer.setFont(new Font(null, Font.PLAIN, 15));
        newPlayer.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        newPlayer.setBorder((Border) new RoundedBorder(10));
        frame.add(newPlayer);
        newPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });

        JButton delPlayer = new JButton("Player -");
        delPlayer.setBounds(1750, 20, 80, 60);
        delPlayer.setFocusable(false);
        delPlayer.setForeground(new Color(255, 255, 255));
        delPlayer.setBackground(new Color(32,32,32));
        delPlayer.setFont(new Font(null, Font.PLAIN, 15));
        delPlayer.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        delPlayer.setBorder((Border) new RoundedBorder(10));
        frame.add(delPlayer);
        delPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });

        TextFieldA textFieldA = new TextFieldA(frame);
        TextFieldB textFieldB = new TextFieldB(frame);
        TextFieldC textfieldC = new TextFieldC(frame);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0, 0, 1920, 1040);
        ImageIcon logo = new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("Kniffel_Logo.png")));
        frame.setIconImage(logo.getImage());
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }


    public static void returnDice(boolean isClicked0, boolean isClicked1, boolean isClicked2, boolean isClicked3, boolean isClicked4, JFrame frame){
        Random random = new Random();
        if (isClicked0 && isClicked1 && isClicked2 && isClicked3 && isClicked4){
            JDialog errorDialog = new JDialog(frame, "Fehler");
            JLabel errorText = new JLabel("<html><body>Fehler:<br>Du benötigst mindestens 1 freigeschalteten Würfel!</body></html>");
            //errorText.setText("Fehler: Du benötigst zum Würfeln mindestens \n" + "1 freigeschalteten Würfel!");
            errorText.setBounds(20, 10, 400, 75);
            errorText.setFont(new Font(null, Font.PLAIN, 15));
            errorText.setForeground(Color.white);
            errorDialog.add(errorText);

            JButton close = new JButton("close");
            close.setFocusable(false);
            close.setBounds(270, 120, 100, 30);
            close.setBorder(new RoundedBorder(10));
            close.setBackground(new Color(35,35,35));
            close.setForeground(new Color(255,255,255));
            close.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    errorDialog.dispose();
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            });
            errorDialog.getRootPane().setDefaultButton(close);
            errorDialog.add(close);


            ImageIcon logo = new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("fehler.png")));
            errorDialog.setIconImage(logo.getImage());
            errorDialog.setLayout(null);
            errorDialog.setVisible(true);
            errorDialog.setBounds(frame.getWidth()/2-200, frame.getHeight()/2-100, 400, 200);
            errorDialog.getContentPane().setBackground(new Color(35,35,35));
            frame.setLocationRelativeTo(null);
        }
        if (!isClicked0){
            int randomNumber = random.nextInt(6)+1;
            if (randomNumber == 1) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel1-100px.png"))));
            if (randomNumber == 2) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel2-100px.png"))));
            if (randomNumber == 3) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel3-100px.png"))));
            if (randomNumber == 4) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel4-100px.png"))));
            if (randomNumber == 5) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel5-100px.png"))));
            if (randomNumber == 6) würfelListe.get(0).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel6-100px.png"))));
        }
        if (!isClicked1){
            int randomNumber = random.nextInt(6)+1;
            if (randomNumber == 1) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel1-100px.png"))));
            if (randomNumber == 2) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel2-100px.png"))));
            if (randomNumber == 3) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel3-100px.png"))));
            if (randomNumber == 4) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel4-100px.png"))));
            if (randomNumber == 5) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel5-100px.png"))));
            if (randomNumber == 6) würfelListe.get(1).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel6-100px.png"))));
        }
        if (!isClicked2){
            int randomNumber = random.nextInt(6)+1;
            if (randomNumber == 1) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel1-100px.png"))));
            if (randomNumber == 2) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel2-100px.png"))));
            if (randomNumber == 3) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel3-100px.png"))));
            if (randomNumber == 4) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel4-100px.png"))));
            if (randomNumber == 5) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel5-100px.png"))));
            if (randomNumber == 6) würfelListe.get(2).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel6-100px.png"))));
        }
        if (!isClicked3){
            int randomNumber = random.nextInt(6)+1;
            if (randomNumber == 1) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel1-100px.png"))));
            if (randomNumber == 2) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel2-100px.png"))));
            if (randomNumber == 3) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel3-100px.png"))));
            if (randomNumber == 4) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel4-100px.png"))));
            if (randomNumber == 5) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel5-100px.png"))));
            if (randomNumber == 6) würfelListe.get(3).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel6-100px.png"))));
        }
        if (!isClicked4){
            int randomNumber = random.nextInt(6)+1;
            if (randomNumber == 1) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel1-100px.png"))));
            if (randomNumber == 2) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel2-100px.png"))));
            if (randomNumber == 3) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel3-100px.png"))));
            if (randomNumber == 4) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel4-100px.png"))));
            if (randomNumber == 5) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel5-100px.png"))));
            if (randomNumber == 6) würfelListe.get(4).setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getClassLoader().getResource("wurfel6-100px.png"))));
        }
    }
    public static int nPlayer(boolean isClicked0, boolean isClicked1, boolean isClicked2, boolean isClicked3, boolean isClicked4) {
        if (isClicked0 = true) {
            würfelListe.get(0).setBorder(null);
        }
        if (isClicked1 = true) {
            würfelListe.get(1).setBorder(null);
        }
        if (isClicked2 = true) {
            würfelListe.get(2).setBorder(null);

        }
        if (isClicked3 = true) {
            würfelListe.get(3).setBorder(null);

        }
        if (isClicked4 = true) {
            würfelListe.get(4).setBorder(null);

        }

        System.out.println("Test gelungen");

        return 0;
    }
    public static int newGame(boolean isClicked0, boolean isClicked1, boolean isClicked2, boolean isClicked3, boolean isClicked4) {
        if (isClicked0 = true) {
            würfelListe.get(0).setBorder(null);
        }
        if (isClicked1 = true) {
            würfelListe.get(1).setBorder(null);
        }
        if (isClicked2 = true) {
            würfelListe.get(2).setBorder(null);
        }
        if (isClicked3 = true) {
            würfelListe.get(3).setBorder(null);

        }
        if (isClicked4 = true) {
            würfelListe.get(4).setBorder(null);

        }



        return 0;
    }






    static class RoundedBorder implements Border {

        private final int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}