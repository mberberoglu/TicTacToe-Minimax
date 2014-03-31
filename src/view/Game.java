/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import main.nemesis.GameClass;

/**
 *
 * @author mustafa
 */
public class Game extends javax.swing.JFrame {

    private static boolean startPlayer = true;
    private static char optionPlayer = 'X'; 
    private static char optionCpu = 'O'; 
    private static String playerName = "Player";
    private static boolean playerTurn = true;
    private static final int playerScore = 0;
    private static final int cpuScore = 0;
    private static int lastWinner = 0;
    private final GameClass game = new GameClass();;
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        optionUserBtn = new javax.swing.JToggleButton();
        scorePlayer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        optionCPUBtn = new javax.swing.JToggleButton();
        scoreCPU = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 476, 340));
        setMinimumSize(new java.awt.Dimension(476, 340));
        setResizable(false);
        getContentPane().setLayout(null);

        username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        username.setText("Player 1");
        getContentPane().add(username);
        username.setBounds(300, 10, 90, 30);

        optionUserBtn.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        optionUserBtn.setSelected(true);
        optionUserBtn.setText("X");
        optionUserBtn.setEnabled(false);
        optionUserBtn.setMaximumSize(new java.awt.Dimension(75, 75));
        optionUserBtn.setMinimumSize(new java.awt.Dimension(75, 75));
        optionUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(optionUserBtn);
        optionUserBtn.setBounds(290, 50, 50, 50);

        scorePlayer.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        scorePlayer.setText("0");
        scorePlayer.setToolTipText("");
        getContentPane().add(scorePlayer);
        scorePlayer.setBounds(350, 50, 60, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CPU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 110, 100, 30);

        optionCPUBtn.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        optionCPUBtn.setSelected(true);
        optionCPUBtn.setText("X");
        optionCPUBtn.setEnabled(false);
        optionCPUBtn.setMaximumSize(new java.awt.Dimension(75, 75));
        optionCPUBtn.setMinimumSize(new java.awt.Dimension(75, 75));
        optionCPUBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCPUBtnActionPerformed(evt);
            }
        });
        getContentPane().add(optionCPUBtn);
        optionCPUBtn.setBounds(290, 140, 50, 50);

        scoreCPU.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        scoreCPU.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scoreCPU.setText("0");
        scoreCPU.setToolTipText("");
        scoreCPU.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(scoreCPU);
        scoreCPU.setBounds(350, 140, 60, 50);

        btnReset.setText("Reset Game");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(290, 190, 120, 29);

        btnNext.setText("Next Game");
        btnNext.setEnabled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext);
        btnNext.setBounds(290, 220, 120, 29);

        btn0.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(20, 10, 80, 70);

        btn1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(110, 10, 80, 70);

        btn2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(200, 10, 80, 70);

        btn3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(20, 90, 80, 70);

        btn4.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(110, 90, 80, 70);

        btn5.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(200, 90, 80, 70);

        btn6.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(20, 170, 80, 70);

        btn7.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(110, 170, 80, 70);

        btn8.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(200, 170, 80, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionUserBtnActionPerformed
       
    }//GEN-LAST:event_optionUserBtnActionPerformed

    private void optionCPUBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCPUBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionCPUBtnActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.btnReset.setEnabled(false);
        this.resetGame();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (Game.lastWinner == -1) {
            int counter = Integer.parseInt(this.scorePlayer.getText());
            counter++;
            this.scorePlayer.setText(counter+"");
        } else {
            int counter = Integer.parseInt(this.scoreCPU.getText());
            counter++;
            this.scoreCPU.setText(counter+"");
        }
        this.btnNext.setEnabled(false);
        this.resetGame();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         this.play(1, 1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         this.play(0, 1);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         this.play(2, 1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         this.play(3, 1);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         this.play(4, 1);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         this.play(5, 1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         this.play(6, 1);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         this.play(7, 1);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         this.play(8, 1);
    }//GEN-LAST:event_btn8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    public static boolean isStartPlayer() {
        return startPlayer;
    }

    public static void setStartPlayer(boolean startPlayer) {
        Game.startPlayer = startPlayer;
    }

    public static char getOptionPlayer() {
        return optionPlayer;
    }

    public static void setOptionPlayer(char optionPlayer) {
        Game.optionPlayer = optionPlayer;
    }

    public static char getOptionCpu() {
        return optionCpu;
    }

    public static void setOptionCpu(char optionCpu) {
        Game.optionCpu = optionCpu;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String playerName) {
        Game.playerName = playerName;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton optionCPUBtn;
    private javax.swing.JToggleButton optionUserBtn;
    private javax.swing.JLabel scoreCPU;
    private javax.swing.JLabel scorePlayer;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    public void start() {
        this.username.setText(playerName);
        if (!Game.startPlayer) {
            Game.playerTurn = false;
        }
        this.optionUserBtn.setText(Game.optionPlayer+"");
        this.optionCPUBtn.setText(Game.optionCpu+"");
        if (!startPlayer) {
            this.play(0, -1);
        }
    }
    
    private void play(int position, int type) {
        if (type == 1) {
            Game.playerTurn = false;
            this.game.playPlayer(position);
            this.mark(position, Game.optionPlayer + "");
            this.play(0, -1);
        } else {
            Game.playerTurn = true;
            int playComputer = this.game.playComputer();
            this.mark(playComputer, Game.optionCpu + "");
        }
        int winner = this.game.winner();
        if (winner != 0) {
            this.gameIsOver(winner);
        } else if (this.game.isFinished()) {
            this.gameIsOver(0);
        }
    } 
    private void mark(int position, String character) {
        switch(position) {
                case 0:
                    this.btn0.setText(character);
                    this.btn0.setEnabled(false);
                    break;
                case 1:
                    this.btn1.setText(character);
                    this.btn1.setEnabled(false);
                    break;
                case 2:
                    this.btn2.setText(character);
                    this.btn2.setEnabled(false);
                    break;
                case 3:
                    this.btn3.setText(character);
                    this.btn3.setEnabled(false);
                    break;
                case 4:
                    this.btn4.setText(character);
                    this.btn4.setEnabled(false);
                    break;
                case 5:
                    this.btn5.setText(character);
                    this.btn5.setEnabled(false);
                    break;
                case 6:
                    this.btn6.setText(character);
                    this.btn6.setEnabled(false);
                    break;
                case 7:
                    this.btn7.setText(character);
                    this.btn7.setEnabled(false);
                    break;
                case 8:
                    this.btn8.setText(character);
                    this.btn8.setEnabled(false);
                    break;
            }
    }

    private void gameIsOver(int winner) {
        if (winner == 0) {
            this.btnReset.setEnabled(true);
        } else {
            Game.lastWinner = winner;
            this.btnNext.setEnabled(true);
        }
    }
    
    private void resetGame() {
        this.game.reset();
        this.btn0.setText("");
        this.btn1.setText("");
        this.btn2.setText("");
        this.btn3.setText("");
        this.btn4.setText("");
        this.btn5.setText("");
        this.btn6.setText("");
        this.btn7.setText("");
        this.btn8.setText("");
        
        this.btn0.setEnabled(true);
        this.btn1.setEnabled(true);
        this.btn2.setEnabled(true);
        this.btn3.setEnabled(true);
        this.btn4.setEnabled(true);
        this.btn5.setEnabled(true);
        this.btn6.setEnabled(true);
        this.btn7.setEnabled(true);
        this.btn8.setEnabled(true);
    }
}