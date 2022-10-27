package tool.convertion;
public class Converter {
    private final double ratio;
    private final String name;
    //constructor
    public Converter(double ratio, String name) {
        this.ratio = ratio;
        this.name = name;
    }
    // getter
    public double getRatio() { return ratio; }
    public String getName() { return name; }
    // functions
    public double convert(double from) {
        return from * ratio;
    }
    public double invert(double from) {
        return from / ratio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convertor{");
        sb.append("ratio=").append(ratio);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
