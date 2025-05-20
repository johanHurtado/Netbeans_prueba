package edu.usta.formularios;


import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import edu.usta.clases.ListaDoble;
import edu.usta.clases.Nodo;
import edu.usta.utilidades.Aleatorio;
import edu.usta.utilidades.Utilidad;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
//import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.event.ListSelectionEvent;


public class FrmPrincipal extends javax.swing.JFrame {
     private ListaDoble miListaDoble;//null
    private DefaultListModel modeloLista = new DefaultListModel();

    

    public FrmPrincipal() {
        initComponents();
        
                addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                cerrarAplicacion();
            }
            
        });
        //Inicializacion de variables
        miListaDoble= new ListaDoble();
        listaSalida.setModel(modeloLista);

    }
    
private void cargarDatosNodo (Nodo nodoBuscar, int posicion){
        String nombreNodo = Utilidad.formatearTexto(nodoBuscar);
        String nombrePuntero = Utilidad.formatearTexto(nodoBuscar.getSiguiente());
        Nodo nodoAnterior = nodoBuscar.getAnterior();
        String nombreAnterior = Utilidad.formatearTexto(nodoAnterior);
        
        //estilos a la lista 
        listaSalida.setSelectedIndex(posicion);
        listaSalida.setBackground(Color.GREEN);
        listaSalida.setSelectionForeground(Color.YELLOW);
        //cargar datos
        cajaNodo.setText(nombreNodo);
        cajaSiguiente.setText(nombrePuntero);
         cajaAnterior.setText(nombreAnterior);
         cajaDato.setText(nodoBuscar.getDato().toString());

}

    private void cerrarAplicacion() {
        int opcion;
        String[] textoBotones = {"Aceptar", "Cancelar"};

        opcion = JOptionPane.showOptionDialog(this, "¿ Esta seguro de cerrar la aplicacion?", "Advertencia",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textoBotones, textoBotones[1]);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAleatorios = new javax.swing.JButton();
        btnBorrarUltimo = new javax.swing.JButton();
        btnAgregarPosicion = new javax.swing.JButton();
        btnBorrarPos = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnClaro = new javax.swing.JButton();
        btnOscuro = new javax.swing.JButton();
        btnImprimirInverso = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSalida = new javax.swing.JList<>();
        lblCajaNodo = new javax.swing.JLabel();
        lblCajaDato = new javax.swing.JLabel();
        lblSiguiente = new javax.swing.JLabel();
        cajaNodo = new javax.swing.JTextField();
        cajaDato = new javax.swing.JTextField();
        cajaSiguiente = new javax.swing.JTextField();
        lblAnterior = new javax.swing.JLabel();
        cajaAnterior = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(102, 102, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista Doble Enlazada");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotones.setBackground(new java.awt.Color(102, 102, 255));

        btnAgregar.setText("Agregar Nodo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir Lista");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnAleatorios.setText("Nodos Aleatorios");
        btnAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatoriosActionPerformed(evt);
            }
        });

        btnBorrarUltimo.setText("Borrar Nodo (Ultimo)");
        btnBorrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUltimoActionPerformed(evt);
            }
        });

        btnAgregarPosicion.setText("Agregar Nodo (Posicion)");
        btnAgregarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPosicionActionPerformed(evt);
            }
        });

        btnBorrarPos.setText("Borrar Nodo (Posicion)");
        btnBorrarPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPosActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Lista");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Nodo");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Actualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/usta/imagenes/iconoCerrar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnClaro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnClaro.setText("Claro");
        btnClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaroActionPerformed(evt);
            }
        });

        btnOscuro.setBackground(new java.awt.Color(0, 0, 0));
        btnOscuro.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnOscuro.setForeground(new java.awt.Color(255, 255, 255));
        btnOscuro.setText("Oscuro");
        btnOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOscuroActionPerformed(evt);
            }
        });

        btnImprimirInverso.setText("Imprimir inverso");
        btnImprimirInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirInversoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                        .addComponent(btnClaro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOscuro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImprimirInverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClaro)
                        .addComponent(btnOscuro)))
                .addGap(38, 38, 38)
                .addComponent(btnAleatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarPosicion)
                .addGap(12, 12, 12)
                .addComponent(btnBorrarUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarPos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirInverso)
                .addGap(18, 18, 18))
        );

        panelContenido.setBackground(new java.awt.Color(255, 204, 204));

        listaSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaSalida);

        lblCajaNodo.setText("Nodo");

        lblCajaDato.setText("Valor");

        lblSiguiente.setText("Siguiente");

        cajaNodo.setEnabled(false);

        cajaDato.setEnabled(false);

        cajaSiguiente.setEnabled(false);

        lblAnterior.setText("Anterior");

        cajaAnterior.setEnabled(false);

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(lblCajaDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaNodo)
                            .addGroup(panelContenidoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblCajaNodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addComponent(cajaDato))
                .addContainerGap())
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSiguiente)
                            .addComponent(lblCajaNodo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaNodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(lblAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCajaDato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOscuroActionPerformed
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btnOscuroActionPerformed

    private void btnClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaroActionPerformed
         try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(this);
            
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnClaroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatoriosActionPerformed
           int nuevoTamano, tipoDato;
        
        modeloLista.clear();
        miListaDoble.resetearLista();
        
        nuevoTamano = Aleatorio.numeroEntero(5, 10);
        
        for (int i = 0; i < nuevoTamano; i++) {
            tipoDato = Aleatorio.numeroEntero(1,4);
            switch (tipoDato) {
                case 1:
                    miListaDoble.agregar(Aleatorio.numeroEntero(500, 1000));
                    break;
                    
                case 2:
                    miListaDoble.agregar(Aleatorio.numeroDoble(10, 100));
                    break;
                
                case 3:
                    miListaDoble.agregar(Aleatorio.texto(7));
                    break;
                    
                case 4:
                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                {
                    try {
                        miListaDoble.agregar(Aleatorio.fecha(
                                formato.parse("01-05-2024"),
                                formato.parse("31-05-2025")));
                    } catch (ParseException ex) {
                        Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                default:
                    throw new AssertionError();
            }
            
        }
        modeloLista.addElement("Lista simple creada satisfactoriamente");
        modeloLista.addElement("Con "+nuevoTamano+ " Nodos");
    }//GEN-LAST:event_btnAleatoriosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
                modeloLista.clear();//Limpiar la lista
        
        int tamanoLista = miListaDoble.cantidadElementos();
        
        if (tamanoLista != 0) {
            miListaDoble.imprimir(modeloLista);
        } else {
            modeloLista.addElement("Lista Simple vacia !!");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
                modeloLista.clear();
        
        int tamano = miListaDoble.cantidadElementos();
        
        String datoAgregar = JOptionPane.showInputDialog(panelContenido,
                "Lista [" + tamano + "} = ");
        if (datoAgregar !=null) {
            miListaDoble.agregar(datoAgregar);
            modeloLista.addElement(datoAgregar + " agregado a la lista");
        } else {
            modeloLista.addElement("Operacion Cancelada");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPosicionActionPerformed
         modeloLista.clear();//Limpiar lista
        
        int tamano = miListaDoble.cantidadElementos();
        
        if (tamano == 0) {
            modeloLista.addElement("Lista sin elementos");
        } else {
            String posicion = JOptionPane.showInputDialog(panelContenido,"Entre [0," + tamano + "]", "Agregar Posicion",
                    JOptionPane.INFORMATION_MESSAGE);
            if (posicion != null) {
                try {
                    int posi = Integer.parseInt(posicion);
                    
                    if (posi >= 0 && posi <= tamano) {
                        String datoAgregar = JOptionPane.showInputDialog(panelContenido,
                                "Dato agregar");
                        if (datoAgregar != null) {
                            miListaDoble.agregar(posi, datoAgregar);
                            modeloLista.addElement("Elemento "+ datoAgregar + "en la posicion "+ posicion);
                        
                    } else {
                            modeloLista.addElement("Operacion Cancelada");
                        }
                    }else {
                        modeloLista.addElement("Posicion no valida para agregar ");
                    }
                    
                } catch (NumberFormatException e) {
                    modeloLista.addElement("El valor de posicion no es valido");
                }
            } else {
                modeloLista.addElement("Operacion cancelada...");
            }
        }
    }//GEN-LAST:event_btnAgregarPosicionActionPerformed

    private void btnBorrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUltimoActionPerformed
    modeloLista.clear();

    int tamano = miListaDoble.cantidadElementos();

    if (tamano != 0) {
        try {
            Nodo eliminado = miListaDoble.eliminar(tamano - 1);
            String nombre = Utilidad.formatearTexto(eliminado);

            miListaDoble.imprimir(modeloLista);
            modeloLista.addElement("Nodo " + nombre + " con dato " + eliminado.getDato() + " eliminado.");
        } catch (Exception e) {
            modeloLista.addElement("Error al eliminar el último nodo.");
        }
    } else {
        modeloLista.addElement("No se encontraron elementos");
    }
    }//GEN-LAST:event_btnBorrarUltimoActionPerformed

    private void btnBorrarPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPosActionPerformed
               modeloLista.clear();
        
        int tamano = miListaDoble.cantidadElementos();
        
        if(tamano != 0){
            String eliminarPos = JOptionPane.showInputDialog(panelContenido, "Ingrese la posicion a eliminar ente [0," + tamano + "] ");
            try {
                int pos = Integer.parseInt(eliminarPos);
                Nodo eliminado = miListaDoble.eliminar(pos);
                String nombre = Utilidad.formatearTexto(eliminado);
                
                miListaDoble.imprimir(modeloLista);
                modeloLista.addElement("Nodo " + nombre + " con dato " + eliminado.getDato() + " eliminado.");
            } catch (NumberFormatException e) {
                modeloLista.addElement("Agregue una posicion valida.");
            }
        } else {
            modeloLista.addElement("No se encontraron elementos");
        }
    }//GEN-LAST:event_btnBorrarPosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modeloLista.clear();
        
        int tamano = miListaDoble.cantidadElementos();
        if (tamano == 0) {
            modeloLista.addElement("Lista sin elementos");
            
        } else {
            String posi =JOptionPane.showInputDialog(panelContenido,
                    "ingrese la posicion [0,"+ (tamano -1) +"]",
                    "buscar elemento");
            if (posi != null) {
                try {
                    int posicion = Integer.parseInt(posi);
                    if (posicion>=0 && posicion <tamano){
                        Nodo nodoBuscar = miListaDoble.buscarNodo(posicion);
                        miListaDoble.imprimir(modeloLista);
                        this.cargarDatosNodo(nodoBuscar, posicion);
                    }
                            
                } catch (Exception e) {
                    modeloLista.addElement("la posicion debe ser numerica");
                }
            } else {
                modeloLista.addElement("operacion cancelada");
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 int filaSeleccionada = listaSalida.getSelectedIndex();
        int tamano = miListaDoble.cantidadElementos();
        String dato = JOptionPane.showInputDialog(panelContenido, "Ingrese el dato.");
        if (dato !=null) {
            if (filaSeleccionada >= 0 && filaSeleccionada <= tamano) {
                miListaDoble.actualizar(filaSeleccionada, dato);

            } else {
                 modeloLista.addElement("Ingrese una posicion valida.");

            }
        } else {
            modeloLista.addElement("Debe ingresar un dato valido.");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 modeloLista.clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void listaSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSalidaMouseClicked
       int filaSeleccionada= listaSalida.getSelectedIndex();
        if (filaSeleccionada >0) {
            Nodo nodoBuscar = miListaDoble.buscarNodo(filaSeleccionada);
            cargarDatosNodo(nodoBuscar, filaSeleccionada);
        } else {
        }
    }//GEN-LAST:event_listaSalidaMouseClicked

    private void btnImprimirInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirInversoActionPerformed
                 modeloLista.clear();//Limpiar la lista
        
        int tamanoLista = miListaDoble.cantidadElementos();
        
        if (tamanoLista != 0) {
            miListaDoble.imprimirInverso(modeloLista);
        } else {
            modeloLista.addElement("Lista Simple vacia !!");
        }
    }//GEN-LAST:event_btnImprimirInversoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarPosicion;
    private javax.swing.JButton btnAleatorios;
    private javax.swing.JButton btnBorrarPos;
    private javax.swing.JButton btnBorrarUltimo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClaro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirInverso;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOscuro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaAnterior;
    private javax.swing.JTextField cajaDato;
    private javax.swing.JTextField cajaNodo;
    private javax.swing.JTextField cajaSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblCajaDato;
    private javax.swing.JLabel lblCajaNodo;
    private javax.swing.JLabel lblSiguiente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listaSalida;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
