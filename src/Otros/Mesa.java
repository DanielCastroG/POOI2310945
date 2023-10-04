
package Otros;


public class Mesa {
    private float ancho;
    private float altura;
    private String color;
    private String material;
    private String forma;

    public Mesa(float ancho, float altura, String color, String material, String forma) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        this.material = material;
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public String getForma() {
        return forma;
    }
}