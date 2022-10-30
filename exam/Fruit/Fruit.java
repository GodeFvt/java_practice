public class Fruit {
    String name;
    double price;
    int quality;

    public Fruit(String name , double price , int quality){
        this.name = name ;
        this.price = price ;
        this.quality = quality;
    }
    //getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return  name +
                "(price:" + String.format("%.2f",price)  +
                ", quality:" + quality +
                ')';
    }

    public boolean equals(Fruit f){
        return this.quality == f.quality && this.name == f.name && this.price == f.price ;
    }

    public int compareTo(Fruit f){
        if (this.quality > f.quality || this.quality == 0)return 1;
        else if (this.quality < f.quality)return -1;
        else return 0;
    }



}
