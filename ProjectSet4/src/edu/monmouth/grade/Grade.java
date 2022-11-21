package edu.monmouth.grade;


public class Grade {
	//“A”,“A-“, “B”, “B+”, “B-“, “C”, “C+” and “INC”
	private final String UNKNOWN = "UNKNOWN";
	private String gradeLetter;
	private int score;
	final static int UPPER_SCORE_A=100;
	final static int LOWER_SCORE_A=94;
	final static int UPPER_SCORE_AMINUS=93;
	final static int LOWER_SCORE_AMINUS=90;
	final static int UPPER_SCORE_BPLUS=89;
	final static int LOWER_SCORE_BPLUS=87;
	final static int UPPER_SCORE_B=86;
	final static int LOWER_SCORE_B=84;
	final static int UPPER_SCORE_BMINUS=83;
	final static int LOWER_SCORE_BMINUS=80;
	final static int UPPER_SCORE_CPLUS=79;
	final static int LOWER_SCORE_CPLUS=77;
	final static int UPPER_SCORE_C=76;
	final static int LOWER_SCORE_C=74;

	
	public Grade() {
		setGradeLetter(UNKNOWN);
		setScore(0);
	}
	
	
	public Grade(char gradeLetter) {
		setGradeLetter(Character.toString(gradeLetter));
		
	}
	public Grade(String gradeLetter) {
		setGradeLetter(gradeLetter);
	}
	
	public Grade(int score) {
		setScore(score);
		
	}
	
	public String getGradeLetter() {
		return gradeLetter;
	}
	
	public void setGradeLetter(String gradeLetter) {
	
		if (gradeLetter.equals("A")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_A);
		}
		else if (gradeLetter.equals("A-")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_AMINUS);
		}
		else if (gradeLetter.equals("B+")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_BPLUS);
		}
		else if (gradeLetter.equals("B")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_B);
		}
		else if (gradeLetter.equals("B-")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_BMINUS);
		}
		else if (gradeLetter.equals("C+")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_CPLUS);
		}
		else if (gradeLetter.equals("C")){
			this.gradeLetter = gradeLetter;
			setScore(UPPER_SCORE_C);
		}
		else if (gradeLetter.equals("INC")) {	
			this.gradeLetter = gradeLetter;
			setScore(0);
		}
		else {
			this.gradeLetter = UNKNOWN;
			setScore(0);
		}
		
	}


	public double getGradeValue() {
		if(this.gradeLetter.equals("A")) {
			return 4;
		}
		
		if(this.gradeLetter.equals("-A")) {
			return 3.75;
		}
		
		if(this.gradeLetter.equals("B+")) {
			return 3.5;
		}
		
		if(this.gradeLetter.equals("B")) {
			return 3;
		}
		
		if(this.gradeLetter.equals("B-")) {
			return 2.75;
		}
		if(this.gradeLetter.equals("C+")) {
			return 2.5;
		}
		
		if(this.gradeLetter.equals("C")) {
			return 2;
		}
		
		if(this.gradeLetter.equals("INC")) {
			return 0;
		}
		
		if(this.gradeLetter.equals("UNKNOWN")) {
			return 0;
		}
		return 0;
	}
	
	public void setScore(int score) {
		
		if(score <= UPPER_SCORE_A && score >= LOWER_SCORE_A) {
			this.score = score;
			this.gradeLetter = "A";
		}else if(score <= UPPER_SCORE_AMINUS && score >= LOWER_SCORE_AMINUS) {
			this.score = score;
			this.gradeLetter = "A-";
		}else if(score <= UPPER_SCORE_BPLUS && score >= LOWER_SCORE_BPLUS) {
			this.score = score;
			this.gradeLetter = "B+";
		}else if(score <= UPPER_SCORE_B && score >= LOWER_SCORE_B) {
			this.score = score;
			this.gradeLetter = "B";
		}else if(score <= UPPER_SCORE_BMINUS && score >= LOWER_SCORE_BMINUS) {
			this.score = score;
			this.gradeLetter = "B-";
		}else if(score <= UPPER_SCORE_CPLUS && score >= LOWER_SCORE_CPLUS) {
			this.score = score;
			this.gradeLetter = "C+";
		}else if(score <= UPPER_SCORE_C && score >= LOWER_SCORE_C) {
			this.score = score;
			this.gradeLetter = "C";
		}else {
			this.score = 0;
			this.gradeLetter = UNKNOWN;
		}
		
	}
	
	public int getScore() {
		return this.score;
		
	}


}
