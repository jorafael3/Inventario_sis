/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author G1-GAMING
 */
public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form Productos
     */
    clases.Productos pr = new clases.Productos();
    DefaultTableModel modeloTablaProductos;

    public Productos() {
        initComponents();
        setLocationRelativeTo(null);
        String[] cabeceraUsuarios = {"ID", "CODIGO", "NOMBRE", "PRECIO", "PRECIO DE VENTA"};
        String datos[][] = {};
        modeloTablaProductos = new DefaultTableModel(datos, cabeceraUsuarios) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Tabla_Productos.setModel(modeloTablaProductos);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PROD_TXT_COD = new javax.swing.JTextField();
        PROD_TXT_STOCK = new javax.swing.JTextField();
        PROD_TXT_NOMBRE = new javax.swing.JTextField();
        PROD_TXT_COSTO = new javax.swing.JTextField();
        PROD_TXT_PRECIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PROD_TXT_DESC = new javax.swing.JTextArea();
        PROD_CHECK_ESTADO = new javax.swing.JCheckBox();
        PROD_TXT_ID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Btn_Guardar_Producto = new javax.swing.JButton();
        Btn_Actualizar_p = new javax.swing.JButton();
        PROD_Btn_Nuevo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Productos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        PRO_TXT_BUSCAR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fichero de Productos");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        PROD_TXT_STOCK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PROD_TXT_STOCKKeyTyped(evt);
            }
        });

        PROD_TXT_COSTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PROD_TXT_COSTOKeyTyped(evt);
            }
        });

        PROD_TXT_PRECIO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PROD_TXT_PRECIOKeyTyped(evt);
            }
        });

        PROD_TXT_DESC.setColumns(20);
        PROD_TXT_DESC.setRows(5);
        jScrollPane1.setViewportView(PROD_TXT_DESC);

        PROD_CHECK_ESTADO.setSelected(true);
        PROD_CHECK_ESTADO.setText("Activo");

        PROD_TXT_ID.setEditable(false);
        PROD_TXT_ID.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PROD_TXT_STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(PROD_TXT_NOMBRE)
                    .addComponent(PROD_TXT_COD)
                    .addComponent(PROD_TXT_COSTO)
                    .addComponent(PROD_TXT_PRECIO)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PROD_CHECK_ESTADO)
                    .addComponent(PROD_TXT_ID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(PROD_TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(PROD_TXT_COD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROD_TXT_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROD_TXT_COSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROD_TXT_PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROD_TXT_STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PROD_CHECK_ESTADO)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Costo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Precio de Venta");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Stock Inicial");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(87, 87, 87)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Btn_Guardar_Producto.setBackground(new java.awt.Color(82, 190, 128));
        Btn_Guardar_Producto.setText("Guardar");
        Btn_Guardar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar_ProductoActionPerformed(evt);
            }
        });

        Btn_Actualizar_p.setBackground(new java.awt.Color(245, 176, 65));
        Btn_Actualizar_p.setText("Actualizar");
        Btn_Actualizar_p.setEnabled(false);
        Btn_Actualizar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Actualizar_pActionPerformed(evt);
            }
        });

        PROD_Btn_Nuevo.setBackground(new java.awt.Color(127, 179, 213));
        PROD_Btn_Nuevo.setText("Nuevo");
        PROD_Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROD_Btn_NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Guardar_Producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Actualizar_p)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PROD_Btn_Nuevo)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Guardar_Producto)
                    .addComponent(Btn_Actualizar_p)
                    .addComponent(PROD_Btn_Nuevo))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Precio Venta"
            }
        ));
        Tabla_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_Productos);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Codigo / Nombre del producto");

        PRO_TXT_BUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PRO_TXT_BUSCARKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PRO_TXT_BUSCAR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PRO_TXT_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Guardar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar_ProductoActionPerformed

        String codigo = PROD_TXT_COD.getText();
        String nombre = PROD_TXT_NOMBRE.getText();
        String desc = PROD_TXT_DESC.getText();
        String costo = PROD_TXT_COSTO.getText();
        String precio = PROD_TXT_PRECIO.getText();
        String stock = PROD_TXT_STOCK.getText();
        Boolean estado = PROD_CHECK_ESTADO.isSelected();
        String es = "0";
        if (estado == true) {
            es = "1";
        }

        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar codigo del producto");
        } else if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre del producto");

        } else if (desc.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar descripcion del producto");

        } else if (costo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar costo del producto");

        } else if (precio.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar precio del producto");

        } else if (stock.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar stock del producto");

        } else {

            if (isNumeric(costo) == false) {
                PROD_TXT_COSTO.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Costo tiene un formato no valido, si es decimales utilizar punto(.)");
            } else if (isNumeric(precio) == false) {
                PROD_TXT_PRECIO.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Precio tiene un formato no valido, si es decimales utilizar punto(.)");

            } else if (isStringInt(stock) == false) {
                PROD_TXT_STOCK.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Stock tiene un formato no valido, Solo numero enteros");

            } else {
                String[] param = {
                    codigo, nombre, desc, costo, precio, stock, es
                };

                pr.Nuevo_Producto(param);
                pr.Cargar_Productos_Tabla(modeloTablaProductos, Tabla_Productos);
                PROD_Btn_Nuevo.doClick();
            }
        }


    }//GEN-LAST:event_Btn_Guardar_ProductoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pr.Cargar_Productos_Tabla(modeloTablaProductos, Tabla_Productos);
    }//GEN-LAST:event_formWindowOpened

    private void Tabla_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProductosMouseClicked

        int index = Tabla_Productos.getSelectedRow();
        TableModel model = Tabla_Productos.getModel();
        String ID = model.getValueAt(index, 0).toString();
        String[] param = {
            ID
        };
        PROD_TXT_ID.setText(ID);
        Btn_Guardar_Producto.setEnabled(false);
        Btn_Actualizar_p.setEnabled(true);
        Object[] a = pr.Cargar_Productos(param);
        System.out.println(a[1]);
        PROD_TXT_COD.setText(a[1].toString());
        PROD_TXT_NOMBRE.setText(a[2].toString());
        PROD_TXT_DESC.setText(a[3].toString());
        PROD_TXT_COSTO.setText(a[4].toString());
        PROD_TXT_PRECIO.setText(a[5].toString());
        PROD_TXT_STOCK.setText(a[6].toString());
        PROD_CHECK_ESTADO.setSelected((Boolean) a[7]);

    }//GEN-LAST:event_Tabla_ProductosMouseClicked

    private void Btn_Actualizar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Actualizar_pActionPerformed
        String ID = PROD_TXT_ID.getText();
        String codigo = PROD_TXT_COD.getText();
        String nombre = PROD_TXT_NOMBRE.getText();
        String desc = PROD_TXT_DESC.getText();
        String costo = PROD_TXT_COSTO.getText();
        String precio = PROD_TXT_PRECIO.getText();
        String stock = PROD_TXT_STOCK.getText();
        Boolean estado = PROD_CHECK_ESTADO.isSelected();
        String es = "0";
        if (estado == true) {
            es = "1";
        }

        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar codigo del producto");
        } else if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre del producto");

        } else if (desc.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar descripcion del producto");

        } else if (costo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar costo del producto");

        } else if (precio.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar precio del producto");

        } else if (stock.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar stock del producto");

        } else {

            if (isNumeric(costo) == false) {
                PROD_TXT_COSTO.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Costo tiene un formato no valido, si es decimales utilizar punto(.)");
            } else if (isNumeric(precio) == false) {
                PROD_TXT_PRECIO.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Precio tiene un formato no valido, si es decimales utilizar punto(.)");

            } else if (isStringInt(stock) == false) {
                PROD_TXT_STOCK.requestFocus();
                JOptionPane.showMessageDialog(null, "El campo Stock tiene un formato no valido, Solo numero enteros");

            } else {
                String[] param = {
                    codigo, nombre, desc, costo, precio, stock, es, ID
                };
                pr.Actualizar_Producto(param);
                pr.Cargar_Productos_Tabla(modeloTablaProductos, Tabla_Productos);
            }
        }
    }//GEN-LAST:event_Btn_Actualizar_pActionPerformed

    private void PRO_TXT_BUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PRO_TXT_BUSCARKeyTyped
        // TODO add your handling code here:
        String codigo = PRO_TXT_BUSCAR.getText();

        String[] param = {
            codigo
        };
        pr.Buscar_Producto(modeloTablaProductos, Tabla_Productos, param);
    }//GEN-LAST:event_PRO_TXT_BUSCARKeyTyped

    private void PROD_Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROD_Btn_NuevoActionPerformed
        PROD_TXT_ID.setText("");
        PROD_TXT_COD.setText("");
        PROD_TXT_NOMBRE.setText("");
        PROD_TXT_DESC.setText("");
        PROD_TXT_COSTO.setText("");
        PROD_TXT_PRECIO.setText("");
        PROD_TXT_STOCK.setText("");
        PROD_CHECK_ESTADO.setSelected(true);
        Btn_Actualizar_p.setEnabled(false);
        Btn_Guardar_Producto.setEnabled(true);

    }//GEN-LAST:event_PROD_Btn_NuevoActionPerformed

    private void PROD_TXT_STOCKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PROD_TXT_STOCKKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            PROD_TXT_STOCK.setText("");
            JOptionPane.showMessageDialog(rootPane, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_PROD_TXT_STOCKKeyTyped

    private void PROD_TXT_PRECIOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PROD_TXT_PRECIOKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            PROD_TXT_PRECIO.setText("");
            JOptionPane.showMessageDialog(rootPane, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_PROD_TXT_PRECIOKeyTyped

    private void PROD_TXT_COSTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PROD_TXT_COSTOKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            PROD_TXT_COSTO.setText("");
            JOptionPane.showMessageDialog(rootPane, "SOLO SE PUEDEN INGRESAR NUMEROS");
        }
    }//GEN-LAST:event_PROD_TXT_COSTOKeyTyped

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);

            }
        });
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public boolean isStringInt(String s) {
        try {
            double d = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Actualizar_p;
    private javax.swing.JButton Btn_Guardar_Producto;
    private javax.swing.JButton PROD_Btn_Nuevo;
    private javax.swing.JCheckBox PROD_CHECK_ESTADO;
    private javax.swing.JTextField PROD_TXT_COD;
    private javax.swing.JTextField PROD_TXT_COSTO;
    private javax.swing.JTextArea PROD_TXT_DESC;
    private javax.swing.JTextField PROD_TXT_ID;
    private javax.swing.JTextField PROD_TXT_NOMBRE;
    private javax.swing.JTextField PROD_TXT_PRECIO;
    private javax.swing.JTextField PROD_TXT_STOCK;
    private javax.swing.JTextField PRO_TXT_BUSCAR;
    private javax.swing.JTable Tabla_Productos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
