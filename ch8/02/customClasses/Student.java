package customClasses;

public class Student {

    private String studentNumber;
    private String studentName;
    // initial values like in the chapter examples in the book
    private int markForMaths = -999;
    private int markForEnglish = -999;
    private int markForScience = -999;
    private static double fee = 3000;

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
	int sum = (markForMaths + markForEnglish + markForScience);
	double average = sum / 3.0;
	return average;
    }

    public static double getFee() {
	return fee;
    }

    public static void setFee(double feeIn) {
	fee = feeIn;
    }
}
