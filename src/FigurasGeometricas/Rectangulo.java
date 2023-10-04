
package figurasgeometricas;


public class Rectangulo {
    private float largo = 1.0f;
    private float ancho = 1.0f;
    
    public Rectangulo(){
        largo = 1.0f;
        ancho = 1.0f;
    }
    
    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public float getArea(){
        return largo * ancho;
    }
}