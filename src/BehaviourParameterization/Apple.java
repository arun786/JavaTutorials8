package BehaviourParameterization;

public class Apple {

    private String color;
    private Integer weigh;
    private String origin;

    public Apple(String color, Integer weigh, String origin) {
        this.color = color;
        this.weigh = weigh;
        this.origin = origin;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeigh() {
        return weigh;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weigh='" + weigh + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
