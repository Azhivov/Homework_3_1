public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        // ������ 1
        public static void task1() {
        int clientOS = 0;
        if (clientOS == '1') {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }
    }
    //������ 2
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2012;
        if (clientOS == '1') {
            if (clientDeviceYear < 2015) {
                System.out.println("���������� ���������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            }
        }else {
            if (clientDeviceYear < 2015) {
                System.out.println("���������� ���������� ������ ���������� ��� IOS �� ������");
            } else {
                System.out.println("���������� ������ ���������� ��� IOS �� ������");
            }
        }   }
    //������ 3
    public static void task3(){
        int year = 2020;
        if (((year % 4 == 0) && (year % 100 != 0 )) || (year % 400 == 0)) {
            System.out.println(" ���� ��� �������� �����������");
        } else {
            System.out.println(" ���� ��� �� �������� �����������");
        }
    }
    //������4
    public static void task4(){
        int deliveryDistance = 101;
        int deliveryTime = 1+((20 + deliveryDistance) / 40);
            System.out.println("�������� � ������� " + deliveryTime + " �����");

    }
    //������4
    public static void task5(){
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
        }

    }


}