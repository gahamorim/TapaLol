/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapalol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Gabriel Amorim
 * @author Felipe Toshio
 */

public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    
    public TelaJogo() { 
        getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
        
        JPanel c1 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/AhriSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        };       
        c1.setPreferredSize(new Dimension(80,80));
        
        JPanel c2 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/AkaliSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        };    
        
        JPanel c3 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon iconeC1 = new ImageIcon("src/tapalol/icones/Aurelion_SolSquare.png");
            Image ci1 = iconeC1.getImage();
            g.drawImage(ci1, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        };    
        
        JPanel c4 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/BlitzcrankSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c5 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/CaitlynSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c6 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/CorkiSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c7 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/DianaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c8 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/DravenSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c9 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/EkkoSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
          
        JPanel c10 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/EliseSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c11 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/EzrealSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c12 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/FioraSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c13 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/GangplankSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c14 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/GragasSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c15 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/GravesSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c16 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/HecarimSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c17 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/IvernSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c18 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/JannaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c19 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/Jarvan_IVSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
          
        JPanel c20 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/JhinSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c21 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/JinxSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c22 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/Kai'SaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c23 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/KarthusSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c24 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/KatarinaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c25 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/KayleSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c26 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/KaynSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c27 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/KledSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c28 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/LeBlancSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c29 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/Lee_sinSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
          
        JPanel c30 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/LissandraSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c31 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/LuluSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c32 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/LuxSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c33 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/MalphiteSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c34 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/MaokaiSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c35 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/Miss_FortuneSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c36 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/MordekaiserSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c37 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/MorganaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c38 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/NamiSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c39 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/NasusSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
          
        JPanel c40 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/NeekoSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c41 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/NidaleeSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c42 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/NunuSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c43 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/OriannaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c44 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/PantheonSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c45 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/PykeSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; ;
        
        JPanel c46 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/RenektonSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c47 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/RengarSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        JPanel c48 = new JPanel(){
            public void paintComponent(Graphics g){
            ImageIcon icone = new ImageIcon("src/tapalol/icones/SonaSquare.png");
            Image ci = icone.getImage();
            g.drawImage(ci, 0, 0, this.getSize().width, this.getSize().height, this);
            }                
        }; 
        
        GridLayout gridChampions = new GridLayout(6,8,3,3);
        jPanelCampeoesContent.setLayout(gridChampions);
        jPanelCampeoesContent.add(c1);
        jPanelCampeoesContent.add(c2);
        jPanelCampeoesContent.add(c3);
        jPanelCampeoesContent.add(c4);
        jPanelCampeoesContent.add(c5);
        jPanelCampeoesContent.add(c6);
        jPanelCampeoesContent.add(c7);
        jPanelCampeoesContent.add(c8);
        jPanelCampeoesContent.add(c9);
        jPanelCampeoesContent.add(c10);
        jPanelCampeoesContent.add(c11);
        jPanelCampeoesContent.add(c12);
        jPanelCampeoesContent.add(c13);
        jPanelCampeoesContent.add(c14);
        jPanelCampeoesContent.add(c15);
        jPanelCampeoesContent.add(c16);
        jPanelCampeoesContent.add(c17);
        jPanelCampeoesContent.add(c18);
        jPanelCampeoesContent.add(c19);
        jPanelCampeoesContent.add(c20);
        jPanelCampeoesContent.add(c21);
        jPanelCampeoesContent.add(c22);
        jPanelCampeoesContent.add(c23);
        jPanelCampeoesContent.add(c24);
        jPanelCampeoesContent.add(c25);
        jPanelCampeoesContent.add(c26);
        jPanelCampeoesContent.add(c27);
        jPanelCampeoesContent.add(c28);
        jPanelCampeoesContent.add(c29);
        jPanelCampeoesContent.add(c30);
        jPanelCampeoesContent.add(c31);
        jPanelCampeoesContent.add(c32);
        jPanelCampeoesContent.add(c33);
        jPanelCampeoesContent.add(c34);
        jPanelCampeoesContent.add(c35);
        jPanelCampeoesContent.add(c36);
        jPanelCampeoesContent.add(c37);
        jPanelCampeoesContent.add(c38);
        jPanelCampeoesContent.add(c39);
        jPanelCampeoesContent.add(c40);
        jPanelCampeoesContent.add(c41);
        jPanelCampeoesContent.add(c42);
        jPanelCampeoesContent.add(c43);
        jPanelCampeoesContent.add(c44);
        jPanelCampeoesContent.add(c45);
        jPanelCampeoesContent.add(c46);
        jPanelCampeoesContent.add(c47);
        jPanelCampeoesContent.add(c48);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCampeoes = new javax.swing.JPanel();
        jPanelCampeoesContent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSaguao = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelSaguaoContent = new javax.swing.JPanel();
        jPanelTempo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelPontuacaoSolo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelJogadores = new javax.swing.JPanel();
        jPanelJogador1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanelIcone1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon icone1 = new ImageIcon("src/tapalol/icones/iconejogador/Jogador1.png");
                Image i1 = icone1.getImage();

                g.drawImage(i1, 0, 0, this.getSize().width, this.getSize().height, this);
            }

        };
        jPanelJogador2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelIcone2 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon icone1 = new ImageIcon("src/tapalol/icones/iconejogador/Jogador2.png");
                Image i1 = icone1.getImage();

                g.drawImage(i1, 0, 0, this.getSize().width, this.getSize().height, this);

            }

        };
        jPanelJogador3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanelIcone3 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon icone1 = new ImageIcon("src/tapalol/icones/iconejogador/Jogador3.png");
                Image i1 = icone1.getImage();

                g.drawImage(i1, 0, 0, this.getSize().width, this.getSize().height, this);

            }

        };
        jPanelJogador4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanelIcone4 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                ImageIcon icone1 = new ImageIcon("src/tapalol/icones/iconejogador/Jogador4.png");
                Image i1 = icone1.getImage();

                g.drawImage(i1, 0, 0, this.getSize().width, this.getSize().height, this);

            }

        };
        jPanelEscolhido = new javax.swing.JPanel();
        jPanelCampeaoEscolhido = new javax.swing.JPanel();
        jPanelPontuacao = new javax.swing.JPanel();
        jPanelPontuacaoContent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tapa LOL");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelCampeoes.setBackground(new java.awt.Color(1, 42, 168));
        jPanelCampeoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelCampeoesContent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelCampeoesContentLayout = new javax.swing.GroupLayout(jPanelCampeoesContent);
        jPanelCampeoesContent.setLayout(jPanelCampeoesContentLayout);
        jPanelCampeoesContentLayout.setHorizontalGroup(
            jPanelCampeoesContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanelCampeoesContentLayout.setVerticalGroup(
            jPanelCampeoesContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Campeões");

        javax.swing.GroupLayout jPanelCampeoesLayout = new javax.swing.GroupLayout(jPanelCampeoes);
        jPanelCampeoes.setLayout(jPanelCampeoesLayout);
        jPanelCampeoesLayout.setHorizontalGroup(
            jPanelCampeoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampeoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCampeoesContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCampeoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCampeoesLayout.setVerticalGroup(
            jPanelCampeoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampeoesLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCampeoesContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSaguao.setBackground(new java.awt.Color(1, 42, 168));
        jPanelSaguao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saguão");

        jPanelSaguaoContent.setBackground(new java.awt.Color(149, 164, 209));
        jPanelSaguaoContent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelSaguaoContentLayout = new javax.swing.GroupLayout(jPanelSaguaoContent);
        jPanelSaguaoContent.setLayout(jPanelSaguaoContentLayout);
        jPanelSaguaoContentLayout.setHorizontalGroup(
            jPanelSaguaoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSaguaoContentLayout.setVerticalGroup(
            jPanelSaguaoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelSaguaoLayout = new javax.swing.GroupLayout(jPanelSaguao);
        jPanelSaguao.setLayout(jPanelSaguaoLayout);
        jPanelSaguaoLayout.setHorizontalGroup(
            jPanelSaguaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaguaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(235, Short.MAX_VALUE))
            .addComponent(jPanelSaguaoContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSaguaoLayout.setVerticalGroup(
            jPanelSaguaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaguaoLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSaguaoContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTempo.setBackground(new java.awt.Color(149, 164, 209));
        jPanelTempo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Timer");

        javax.swing.GroupLayout jPanelTempoLayout = new javax.swing.GroupLayout(jPanelTempo);
        jPanelTempo.setLayout(jPanelTempoLayout);
        jPanelTempoLayout.setHorizontalGroup(
            jPanelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTempoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelTempoLayout.setVerticalGroup(
            jPanelTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTempoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanelPontuacaoSolo.setBackground(new java.awt.Color(149, 164, 209));
        jPanelPontuacaoSolo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Score");

        javax.swing.GroupLayout jPanelPontuacaoSoloLayout = new javax.swing.GroupLayout(jPanelPontuacaoSolo);
        jPanelPontuacaoSolo.setLayout(jPanelPontuacaoSoloLayout);
        jPanelPontuacaoSoloLayout.setHorizontalGroup(
            jPanelPontuacaoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontuacaoSoloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanelPontuacaoSoloLayout.setVerticalGroup(
            jPanelPontuacaoSoloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPontuacaoSoloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanelJogadores.setBackground(new java.awt.Color(1, 42, 168));

        jPanelJogador1.setBackground(new java.awt.Color(149, 164, 209));
        jPanelJogador1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelJogador1.setPreferredSize(new java.awt.Dimension(203, 123));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("Jogador 1");

        jPanelIcone1.setPreferredSize(new java.awt.Dimension(65, 52));

        javax.swing.GroupLayout jPanelIcone1Layout = new javax.swing.GroupLayout(jPanelIcone1);
        jPanelIcone1.setLayout(jPanelIcone1Layout);
        jPanelIcone1Layout.setHorizontalGroup(
            jPanelIcone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelIcone1Layout.setVerticalGroup(
            jPanelIcone1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelJogador1Layout = new javax.swing.GroupLayout(jPanelJogador1);
        jPanelJogador1.setLayout(jPanelJogador1Layout);
        jPanelJogador1Layout.setHorizontalGroup(
            jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelJogador1Layout.setVerticalGroup(
            jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelJogador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelJogador2.setBackground(new java.awt.Color(149, 164, 209));
        jPanelJogador2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelJogador2.setPreferredSize(new java.awt.Dimension(203, 123));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("Jogador 2");

        jPanelIcone2.setPreferredSize(new java.awt.Dimension(65, 52));

        javax.swing.GroupLayout jPanelIcone2Layout = new javax.swing.GroupLayout(jPanelIcone2);
        jPanelIcone2.setLayout(jPanelIcone2Layout);
        jPanelIcone2Layout.setHorizontalGroup(
            jPanelIcone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelIcone2Layout.setVerticalGroup(
            jPanelIcone2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelJogador2Layout = new javax.swing.GroupLayout(jPanelJogador2);
        jPanelJogador2.setLayout(jPanelJogador2Layout);
        jPanelJogador2Layout.setHorizontalGroup(
            jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJogador2Layout.setVerticalGroup(
            jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanelJogador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(27, 27, 27))
        );

        jPanelJogador3.setBackground(new java.awt.Color(149, 164, 209));
        jPanelJogador3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel15.setText("Jogador 3");

        jPanelIcone3.setPreferredSize(new java.awt.Dimension(65, 52));

        javax.swing.GroupLayout jPanelIcone3Layout = new javax.swing.GroupLayout(jPanelIcone3);
        jPanelIcone3.setLayout(jPanelIcone3Layout);
        jPanelIcone3Layout.setHorizontalGroup(
            jPanelIcone3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelIcone3Layout.setVerticalGroup(
            jPanelIcone3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelJogador3Layout = new javax.swing.GroupLayout(jPanelJogador3);
        jPanelJogador3.setLayout(jPanelJogador3Layout);
        jPanelJogador3Layout.setHorizontalGroup(
            jPanelJogador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJogador3Layout.setVerticalGroup(
            jPanelJogador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogador3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelJogador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelJogador4.setBackground(new java.awt.Color(149, 164, 209));
        jPanelJogador4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("Jogador 4");

        jPanelIcone4.setPreferredSize(new java.awt.Dimension(65, 52));

        javax.swing.GroupLayout jPanelIcone4Layout = new javax.swing.GroupLayout(jPanelIcone4);
        jPanelIcone4.setLayout(jPanelIcone4Layout);
        jPanelIcone4Layout.setHorizontalGroup(
            jPanelIcone4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelIcone4Layout.setVerticalGroup(
            jPanelIcone4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelJogador4Layout = new javax.swing.GroupLayout(jPanelJogador4);
        jPanelJogador4.setLayout(jPanelJogador4Layout);
        jPanelJogador4Layout.setHorizontalGroup(
            jPanelJogador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelIcone4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJogador4Layout.setVerticalGroup(
            jPanelJogador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanelJogador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIcone4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogador4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanelJogadoresLayout = new javax.swing.GroupLayout(jPanelJogadores);
        jPanelJogadores.setLayout(jPanelJogadoresLayout);
        jPanelJogadoresLayout.setHorizontalGroup(
            jPanelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jPanelJogador2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jPanelJogador3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelJogador4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelJogadoresLayout.setVerticalGroup(
            jPanelJogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogadoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanelEscolhido.setBackground(new java.awt.Color(149, 164, 209));
        jPanelEscolhido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelCampeaoEscolhido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCampeaoEscolhido.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout jPanelCampeaoEscolhidoLayout = new javax.swing.GroupLayout(jPanelCampeaoEscolhido);
        jPanelCampeaoEscolhido.setLayout(jPanelCampeaoEscolhidoLayout);
        jPanelCampeaoEscolhidoLayout.setHorizontalGroup(
            jPanelCampeaoEscolhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanelCampeaoEscolhidoLayout.setVerticalGroup(
            jPanelCampeaoEscolhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEscolhidoLayout = new javax.swing.GroupLayout(jPanelEscolhido);
        jPanelEscolhido.setLayout(jPanelEscolhidoLayout);
        jPanelEscolhidoLayout.setHorizontalGroup(
            jPanelEscolhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEscolhidoLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jPanelCampeaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        jPanelEscolhidoLayout.setVerticalGroup(
            jPanelEscolhidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEscolhidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCampeaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelPontuacao.setBackground(new java.awt.Color(1, 42, 168));
        jPanelPontuacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelPontuacaoContent.setBackground(new java.awt.Color(149, 164, 209));
        jPanelPontuacaoContent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelPontuacaoContentLayout = new javax.swing.GroupLayout(jPanelPontuacaoContent);
        jPanelPontuacaoContent.setLayout(jPanelPontuacaoContentLayout);
        jPanelPontuacaoContentLayout.setHorizontalGroup(
            jPanelPontuacaoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        jPanelPontuacaoContentLayout.setVerticalGroup(
            jPanelPontuacaoContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pontuação");

        javax.swing.GroupLayout jPanelPontuacaoLayout = new javax.swing.GroupLayout(jPanelPontuacao);
        jPanelPontuacao.setLayout(jPanelPontuacaoLayout);
        jPanelPontuacaoLayout.setHorizontalGroup(
            jPanelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPontuacaoContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPontuacaoLayout.setVerticalGroup(
            jPanelPontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPontuacaoLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPontuacaoContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelSaguao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jPanelPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelPontuacaoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelCampeoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanelPontuacaoSolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanelTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanelCampeoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanelJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSaguao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCampeaoEscolhido;
    private javax.swing.JPanel jPanelCampeoes;
    private javax.swing.JPanel jPanelCampeoesContent;
    private javax.swing.JPanel jPanelEscolhido;
    private javax.swing.JPanel jPanelIcone1;
    private javax.swing.JPanel jPanelIcone2;
    private javax.swing.JPanel jPanelIcone3;
    private javax.swing.JPanel jPanelIcone4;
    private javax.swing.JPanel jPanelJogador1;
    private javax.swing.JPanel jPanelJogador2;
    private javax.swing.JPanel jPanelJogador3;
    private javax.swing.JPanel jPanelJogador4;
    private javax.swing.JPanel jPanelJogadores;
    private javax.swing.JPanel jPanelPontuacao;
    private javax.swing.JPanel jPanelPontuacaoContent;
    private javax.swing.JPanel jPanelPontuacaoSolo;
    private javax.swing.JPanel jPanelSaguao;
    private javax.swing.JPanel jPanelSaguaoContent;
    private javax.swing.JPanel jPanelTempo;
    // End of variables declaration//GEN-END:variables
}
