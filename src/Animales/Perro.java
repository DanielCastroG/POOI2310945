
package animales;


public class Perro {

    private String name;
    private String raza;
    private String color;
    private int edad;
    

    public Perro(String name, String raza, String color, int edad) {
        this.name = name;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
