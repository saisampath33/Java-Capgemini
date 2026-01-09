package Encapsulation;

public class EncapsulationStudentResult {

	static class Result {
		private String result;

		public void calculateResult(int marks) {
			if (marks < 40) {
				result = "Fail";

			} else if (marks >= 40 && marks <= 80) {
				result = "Good";
			} else {
				result = "Excellect";
			}
		}

		public String getResult() {
			return result;
		}

	}

	public static void main(String[] args) {
		Result result = new Result();
		result.calculateResult(99);
		System.out.println(result.getResult());
	}

}
