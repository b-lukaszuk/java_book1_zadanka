package customClasses;

public class Student {

    private String studentNumber;
    private String studentName;
    private int markForMaths;
    private int markForEnglish;
    private int markForScience;
    private double fee;

    public Student(String studentNumberIn, String studentNameIn) {
	studentNumber = studentNumberIn;
	studentName = studentNameIn;
    }

    public String getNumber() {
	return studentNumber;
     }

    public String getName() {
	return studentName;
     }

    public void enterMarks(int markForMathsIn, int markForEnglishIn,
		      int markForScienceIn) {
	markForMaths = markForMathsIn;
	markForEnglish = markForEnglishIn;
	markForScience = markForScienceIn;
     }

    public int getMathsMark() {
	return markForMaths;
     }

    public int getEnglishMark() {
	return markForEnglish;
     }

    public int getScienceMark() {
	return markForScience;
     }

    public double calculateAverageMark() {
	double sum = (double) (markForMaths + markForEnglish + markForScience);
	return sum / 3;
     }

    public double getFee() {
	return fee;
     }

    public void setFee(double feeIn) {
	fee = feeIn;
     }
}
