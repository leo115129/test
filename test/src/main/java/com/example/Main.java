package com.example;

/**
 * Main类包含用于测试这些类功能的main方法。
 *
 */
public class Main {
    /**
     * 用于测试这些类功能的main方法。
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 测试Vertex
        Vertex v1 = new Vertex();
        Vertex v2 = new Vertex();
        v1.x = 0;
        v1.y = 0;
        v2.x = 3;
        v2.y = 4;
        System.out.println("顶点之间的距离: " + v1.calcDistance(v2));

        // 测试Circle
        Circle circle = new Circle();
        circle.center = v1;
        circle.radius = 5;
        circle.drawCircle();
        System.out.println("圆的面积: " + circle.calcAreaCircle());

        // 测试Triangle
        Triangle triangle = new Triangle();
        triangle.vertices[0] = v1;
        triangle.vertices[1] = v2;
        // 设置第三个顶点
        Vertex v3 = new Vertex();
        v3.x = 3;
        v3.y = 0;
        triangle.vertices[2] = v3;
        triangle.draw();
        System.out.println("三角形的面积: " + triangle.calcArea());

        // 测试Rectangle
        Rectangle rectangle = new Rectangle();
        // 设置矩形的四个顶点
        rectangle.vertices[0] = v1;
        Vertex v4 = new Vertex();
        v4.x = 0;
        v4.y = 4;
        rectangle.vertices[1] = v4;
        rectangle.vertices[2] = v2;
        Vertex v5 = new Vertex();
        v5.x = 3;
        v5.y = 0;
        rectangle.vertices[3] = v5;
        rectangle.draw();
        System.out.println("矩形的面积: " + rectangle.calcArea());

        // 测试AdapterCircle
        AdapterCircle adapterCircle = new AdapterCircle(circle);
        adapterCircle.draw();
        System.out.println("适配圆的面积: " + adapterCircle.calcArea());
    }
}
