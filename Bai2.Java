package session01;

import java.util.Scanner;

public class Execise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnStudent = 0;
        int totalScores = 0;
        float maxScore = Float.MAX_VALUE; // lấy kiểu dữ liệu lớn nhất
        float minScore = Float.MAX_VALUE; // lấy kiu dữ liệu nhỏ nhất
        do {
            System.out.println("***** MENU NHẬP ĐIỂM *****");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
//                    Khai báo biển đếm sinh viên
                    do {

                        System.out.println("Nhập điểm: ");
                        float score = Float.parseFloat(scanner.nextLine());
                        if (score == -1){
                            break;
                        } else if (score < 0 || score >10) {
                            System.err.println("Điểm không hợp lệ, vui lòng nhập lại");
                        }else {
//                            Học lực
                            cnStudent++;
                            totalScores += score;
                            if (score > maxScore){
                                maxScore = score;
                            }
                            if (score < minScore){
                                minScore = score;
                            }
                            if (score<5){
                                System.out.println("Học lực: Yếu");
                            } else if (score<7) {
                                System.out.println("Học lực: Trung Bình");
                            } else if (score <8) {
                                System.out.println("Học lực: Khá");
                            }else if (score < 9){
                                System.out.println("Học lực: Giỏi");
                            }else {
                                System.out.println("Học lực xuất sắc");
                            }
                        }
                    }while (true);
                    break;
                case 2:
                    if (cnStudent == 0){
                        System.out.println("Chua co du lieu");
                    }else {
                        System.out.println("Số học viên đã nhập: " + cnStudent);
                        System.out.println("Điểm trung bình: " + totalScores);
                        System.out.println("Điểm cao nhất: " +maxScore);
                        System.out.println("Điểm thấp nhất: " + minScore);
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập vào 1-3");
            }
        }while (true);
    }
}
