package Lab3_bai2;

public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject;
    private float everageMark;
    public StudentMarkTotal(int totalExamSubject, float everageMark) {
        super();
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }
    public StudentMarkTotal() {
        super();
    }
    public int getTotalExamSubject() {
        return totalExamSubject;
    }
    public int getTotalExamSubject(StudentMarkTotal[] arr) {
        return arr.length;
    }
    public void calculateEverageMark(StudentMarkTotal[] arr) {
        for (int i = 0; i < arr.length; i++) {
            everageMark+=arr[i].getMark();
        }
    }

    private float getMark() {
        return 0;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }
    public float getEverageMark() {
        return everageMark;
    }
    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
}
