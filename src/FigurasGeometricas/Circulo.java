
package figurasgeometricas;


public class Circulo {
    private double radio;  
    private String color;  
    
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
   
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        
        return Math.PI * Math.pow(radio, 2);
    }
  
    public String getColor() {
        return color;
    }
    
    public void setColor(String nuevoColor) {
        color = nuevoColor;
    }    
}
