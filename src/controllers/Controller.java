
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model;
import views.View;
import extras.DataValidation;
/**
 *
 * @author HP
 */
public class Controller implements ActionListener{
    private Model model;
    private View view;
    DataValidation dataValidation = new DataValidation();
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        
        this.view.jb_restar.addActionListener(this);
        
        this.view.jbtn_suma.addActionListener(this);
        
        this.view.jb_multiplicacion.addActionListener(this);
        
        
        this.view.jb_division.addActionListener(this);
    }
    public void init_view(){
        this.view.setTitle("Operaciones");
        this.view.setLocationRelativeTo(null);
        this.view.jtf_numero1.setText( String.valueOf(model.getnumero1()) );
        this.view.jtf_numero2.setText( String.valueOf(model.getnumero2()) );
       this.view.jtf_resultado.setText( String.valueOf(model.get_total()) );
        
        
        
        this.view.setVisible(true);
    }
   public void sumar(){
           this.view.jbtn_suma.setText(""+this.model.sumar());
           }
    public void restar(){
           this.view.jb_restar.setText(""+this.model.resta());
           } 
    public void dividir(){
           this.view.jb_division.setText(""+this.model.division());
           } 
    public void multiplicar(){
           this.view.jb_multiplicacion.setText(""+this.model.multiplicacion());
           } 
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
      model.setnumero1( dataValidation.string2Int(view.jtf_numero1.getText() ) );
        model.setnumero2( Integer.valueOf( view.jtf_numero2.getText() ) );
         if(e.getSource()== this.view.jbtn_suma){
         model.sumar();
         } 
         else if(e.getSource()== this.view.jb_restar){
             model.resta();
         }
         else if(e.getSource()== this.view.jb_division){
         model.division();
         } 
         else if(e.getSource()== this.view.jb_multiplicacion){
             model.multiplicacion();
         }
        
      view.jtf_resultado.setText( String.valueOf(model.get_total()) );
        }
      }

