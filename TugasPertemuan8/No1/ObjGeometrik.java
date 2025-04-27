package TugasPertemuan8.No1;

public class ObjGeometrik {
    private String color = "white";
    private boolean filled;

    public ObjGeometrik() {
    }

    public ObjGeometrik(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Warna: " + color + " Terisi: " + filled;
    }
}

