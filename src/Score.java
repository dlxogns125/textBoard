public class Score {

    private int korean;
    private int math;
    private int english;
    private int social;
    private int science;

    public int getKorean() {
        return korean;
    }

    public Score(int korean, int math, int english, int social, int science){
        this.korean = korean;
        this.math = math;
        this.english = english;
        this.social = social;
        this.science = science;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public int getSocial() {
        return social;
    }

    public int getScience() {
        return science;
    }

    public int sum(){
        return this.korean + this.math + this.english + this. social + this.science;
    }
    public int avg(){
        return sum() / 5;
    }

    @Override
    public String toString() {
        return "Score{" +
                "korean=" + korean +
                ", math=" + math +
                ", english=" + english +
                ", social=" + social +
                ", science=" + science +
                '}';
    }
}
