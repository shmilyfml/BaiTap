/*
 * @ (#) TestRectangle.java      1.0     8/26/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.fe;

import java.util.Scanner;

/*
 * @description:
 * @author: Quan Nguyen
 * @date:   8/26/2024
 * @version:   1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = scanner.nextDouble();

        // Tạo một đối tượng Rectangle
        Rectangle myRectangle = new Rectangle(length, width);
        Rectangle myRectangle1 = new Rectangle(3, 4);

        // In ra thông tin hình chữ nhật
        System.out.println(myRectangle1);
        System.out.println("Chu vi: " + myRectangle1.getPerimeter());
        System.out.println("Diện tích: " + myRectangle1.getArea());
        System.out.println(myRectangle);
        System.out.println("Chu vi: " + myRectangle.getPerimeter());
        System.out.println("Diện tích: " + myRectangle.getArea());
    }
}
