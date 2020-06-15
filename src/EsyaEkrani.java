
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EsyaEkrani extends javax.swing.JDialog {
DefaultTableModel model;
EsyaIslemleri islemler = new EsyaIslemleri();



    /**
     * Creates new form CalisanEkrani
     */
    public EsyaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) esya_tablosu.getModel();
        esyaGoruntule();
        
        getContentPane().setBackground(Color.pink);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        esya_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        fiyat_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adet_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        calisanEkle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(255, 204, 204));

        esya_tablosu.setForeground(new java.awt.Color(102, 0, 102));
        esya_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "fiyat", "adet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(esya_tablosu);
        if (esya_tablosu.getColumnModel().getColumnCount() > 0) {
            esya_tablosu.getColumnModel().getColumn(0).setResizable(false);
            esya_tablosu.getColumnModel().getColumn(1).setResizable(false);
            esya_tablosu.getColumnModel().getColumn(2).setResizable(false);
            esya_tablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Ad :");

        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Fiyat :");

        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Adet :");

        adet_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adet_alaniActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(153, 153, 255));

        calisanEkle.setForeground(new java.awt.Color(204, 0, 204));
        calisanEkle.setText("Satmak istediğin ürünü ekle");
        calisanEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanEkleActionPerformed(evt);
            }
        });

        sil.setForeground(new java.awt.Color(204, 0, 204));
        sil.setText("Ürün sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arama_cubugu, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(adet_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calisanEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fiyat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calisanEkle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(sil)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adet_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(mesaj_yazisi)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikAra(String ara) {
   
        
      TableRowSorter<DefaultTableModel> tr = new  TableRowSorter<DefaultTableModel>(model);
      
     esya_tablosu.setRowSorter(tr);
     
     tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void calisanEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanEkleActionPerformed
       mesaj_yazisi.setText("");
     String ad = ad_alani.getText();
    String fiyat = fiyat_alani.getText();
      String adet = adet_alani.getText();
      
      islemler.calisanEkle(ad, fiyat, adet);
      
      esyaGoruntule();
      
      mesaj_yazisi.setText("Yeni ürün başarıyla eklendi.");
      
      
       
    }//GEN-LAST:event_calisanEkleActionPerformed

    private void adet_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adet_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adet_alaniActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
      
        mesaj_yazisi.setText("");
        
        int selectedrow = esya_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Eşya tablosu şu anda boş.");
                
            }
            else {
                mesaj_yazisi.setText("Lütfen silinecek bir eşya seçiniz.");
            
        }
        }
        
        else {
            int id = (int) model.getValueAt(selectedrow,0);
            
            islemler.esyaSil(id);
            
            esyaGoruntule();
            
            mesaj_yazisi.setText("Seçilen ürün başarıyla silindi.");
        }
        
    }//GEN-LAST:event_silActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void esyaGoruntule() {
        
        model.setRowCount(0);
        
        ArrayList<Esya> esyalar = new ArrayList<Esya>();
        
       esyalar = islemler.esyalariGetir();
        
        if( esyalar != null) {
            
            for(Esya esya :esyalar) {
                Object[] eklenecek = {esya.getId(), esya.getAd(), esya.getFiyat(), esya.getAdet()};
                
                model.addRow(eklenecek);
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(esyaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(esyaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(esyaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(esyaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EsyaEkrani dialog = new EsyaEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField adet_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calisanEkle;
    private javax.swing.JTable esya_tablosu;
    private javax.swing.JTextField fiyat_alani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton sil;
    // End of variables declaration//GEN-END:variables

    private static class esyaEkrani {

        public esyaEkrani() {
        }
    }
}