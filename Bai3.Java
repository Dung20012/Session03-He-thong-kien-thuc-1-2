import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> luongNhanVien = new ArrayList<>();

        int choice;
        do {
            // Hiển thị menu
            System.out.println("\n***************MENU NHẬP LƯƠNG***************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Nhập lương
                    while (true) {
                        System.out.print("Nhập lương nhân viên (-1 để kết thúc): ");
                        double luong = scanner.nextDouble();

                        if (luong == -1) break;

                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Lương không hợp lệ. Nhập từ 0 đến 500 triệu.");
                            continue;
                        }

                        // Phân loại
                        if (luong < 5_000_000)
                            System.out.println("→ Thu nhập thấp");
                        else if (luong <= 15_000_000)
                            System.out.println("→ Thu nhập trung bình");
                        else if (luong <= 50_000_000)
                            System.out.println("→ Thu nhập khá");
                        else
                            System.out.println("→ Thu nhập cao");

                        // Thêm vào danh sách
                        luongNhanVien.add(luong);
                    }
                    break;

                case 2:
                    // Thống kê
                    if (luongNhanVien.isEmpty()) {
                        System.out.println("Chưa có dữ liệu.");
                    } else {
                        double tongLuong = 0;
                        double max = Double.MIN_VALUE;
                        double min = Double.MAX_VALUE;

                        for (double luong : luongNhanVien) {
                            tongLuong += luong;
                            if (luong > max) max = luong;
                            if (luong < min) min = luong;
                        }

                        double trungBinh = tongLuong / luongNhanVien.size();

                        System.out.println("Số nhân viên: " + luongNhanVien.size());
                        System.out.println("Lương trung bình: " + trungBinh);
                        System.out.println("Lương cao nhất: " + max);
                        System.out.println("Lương thấp nhất: " + min);
                        System.out.println("Tổng tiền lương: " + tongLuong);
                    }
                    break;

                case 3:
                    // Tính thưởng
                    if (luongNhanVien.isEmpty()) {
                        System.out.println("⚠ Chưa có dữ liệu.");
                    } else {
                        double tongThuong = 0;

                        for (double luong : luongNhanVien) {
                            double thuong = 0;
                            if (luong <= 5_000_000)
                                thuong = luong * 0.05;
                            else if (luong <= 15_000_000)
                                thuong = luong * 0.10;
                            else if (luong <= 50_000_000)
                                thuong = luong * 0.15;
                            else if (luong <= 100_000_000)
                                thuong = luong * 0.20;
                            else
                                thuong = luong * 0.25;

                            tongThuong += thuong;
                        }

                        System.out.println("Tổng tiền thưởng: " + tongThuong);
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (true);
    }
}
