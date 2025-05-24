package session01;

import java.util.Scanner;

public class Execise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên khách hàng: ");
        String customerName = scanner.nextLine();
        System.out.println("Nhập vào tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm: ");
//        float price = scanner.nextFloat();
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào số lượng mua: ");
//        float quantity = scanner.nextFloat();
        float quantity = Float.parseFloat(scanner.nextLine());
        System.out.println("Bạn có phải là thành viên không? ");
//        boolean isMember = scanner.nextBoolean();
        boolean isMember = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ nhận hàng: ");
        String address = scanner.nextLine();

//        B2: Tính toán thành tiền, giảm giá., VAT, tổng thanh toán
        float amout = price * quantity;
//        0.1: double --> 0.1F
        float discount = isMember ? 0.1F * amout : 0;
        float vat = amout * 0.08F;
        float totalAmout = amout - discount + vat;

//        B3: In thông tin theo yêu cầu
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Thành tiền: %,10.0f VND\n", totalAmout);
        System.out.printf("Giảm giá thành viên (10%%): %10.0f VND\n", discount);
        System.out.printf("Tiền VAT (8%%): %,10.0f VND\n", totalAmout);
        System.out.printf("Tổng thanh toán: %,10.2f VND\n",totalAmout);
    }
}
