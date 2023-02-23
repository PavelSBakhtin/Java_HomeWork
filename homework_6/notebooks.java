package homework_6;

class Notebooks {

    Integer ram;
    Integer hdd;
    String os;
    String colour;
    String product;
    Integer price;

    public Notebooks(String noteProd, String noteCol, String noteOS, Integer noteRam,
                    Integer noteHdd, Integer notePrice) {
        this.product = noteProd;
        this.colour = noteCol;
        this.os = noteOS;
        this.ram = noteRam;
        this.hdd = noteHdd;
        this.price = notePrice;

    }

    public String getProduct() {
        return this.product;
    }

    public String getColour() {
        return this.colour;
    }

    public String getOS() {
        return this.os;
    }

    public Integer getRam() {
        return this.ram;
    }

    public Integer getHdd() {
        return this.hdd;
    }

    public Integer getPrice() {
        return this.price;
    }

}
