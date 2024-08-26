/*
 * @ (#) Rectangle.java      1.0     8/26/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.fe;

/*
 * @description:
 * @author: Quan Nguyen
 * @date:   8/26/2024
 * @version:   1.0
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than or equal to 0");
        else {
            this.length = length;
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newVal) {
        if (newVal < 0)
            throw new IllegalArgumentException("Length must be greater than or equal to 0");
        else {
            this.length = newVal;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newVal) {
        if (newVal < 0)
            throw new IllegalArgumentException("Width must be greater than or equal to 0");
        else {
            this.width = newVal;
        }
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
