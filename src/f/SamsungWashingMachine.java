package f;

public class SamsungWashingMachine implements WashingMachine, DryMachine{

    public int washingSpeed = 0;

    @Override
    public void dry() {
        System.out.println("빨래 건조를 시작합니다ㅑ.");
    }


        @Override
        public void startButton() {
            if (washingSpeed == 0) {
                System.out.println("스피드를 설정해주세요");
            } else {
                System.out.println("세탁을 일시정지합니다. ");
            }
        }

        @Override
        public void pauseButton () {
            if (washingSpeed == 0) {
                System.out.println("스피드를 설정해주세요");
            } else {
                System.out.println("세탁을 일시정지합니다. ");
            }
        }

        @Override
        public void stopButton () {
            if (washingSpeed == 0) {
                System.out.println("스피드를 설정해주세요");
            } else {
                System.out.println("세탁을 일시정지합니다. ");
            }
        }

        @Override
        public int setSpeed (int spped){
            switch (spped) {
                case 1:
                    washingSpeed = 20;
                    System.out.println("세탁시간이 20분 소요됩니다.");
                    break;
                case 2:
                    washingSpeed = 50;
                    System.out.println("세탁시간이 50분 소요됩니다.");
                    break;
                case 3:
                    washingSpeed = 100;
                    System.out.println("세탁시간이 100분 소요됩니다.");
                    break;
            }
            return washingSpeed;
        }
        public void checkSpped () {
            if (washingSpeed == 0) {
                System.out.println("스피드를 설정해주세요");
            } else {
                System.out.println("설정된 세탁 시간은 " +washingSpeed +"분입니다.");
            }
        }
    }