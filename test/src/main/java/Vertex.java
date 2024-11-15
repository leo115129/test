/**
 * Vertex类表示二维空间中的一个点。
 * 它包含x和y坐标，以及一个计算两个顶点之间距离的方法。
 *
 */
public class Vertex {
    float x;
    float y;

    /**
     * 计算此顶点与另一个顶点之间的距离。
     *
     * @param other 要计算距离的另一个顶点。
     * @return 两个顶点之间的距离。
     */
    float calcDistance(Vertex other) {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
