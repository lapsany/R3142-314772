import java.util.Objects;

public class Size {
    private int width;
    private int height;
    private int length;

    public Size (int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        if (width > 0) {
            System.out.print("Ширина = " + width + " футов, ");
        }
        if (height > 0) {
            System.out.print("высота = " + height + " футов, ");
        }
        if (length > 0) {
            System.out.print("длина = " + length + " футов.");
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(width, height, length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Size)) return false;
        Size size = (Size) obj;
        return Objects.equals(width, length);
    }

    public enum Measure {
        FOOT("футов"),
        METER("метров"),
        MILE("миль");

        private String mer;
        Measure(String mer) {this.mer = mer;}
        public String getMer() {return mer;}
    }
}
