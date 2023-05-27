
public class NoteBook {
    private Integer RAM;
    private Integer HDD;
    private String OS;
    private String color;
    private String brand;
    private final String model;

    public NoteBook(String model, String color, String brand) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        System.out.println("Ноутбук марки " + "'" + this.brand + "'" + " Модель " + this.model + " цвет" + this.color);
    }

    public Integer getRAM() {
        return this.RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHDD() {
        return this.HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return this.OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        String sb;
        sb = "Ноутбук " + this.color + "  " + this.brand + "  " + this.model + "  " + this.OS + "  " + this.HDD + " HDD  " + this.RAM + " RAM  ";
        return (sb);
    }
}
