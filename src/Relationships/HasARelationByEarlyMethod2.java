package Relationships;

public class HasARelationByEarlyMethod2 {
	
	static class Sim {
		private int Enumber;

		public int getEnumber() {
			return Enumber;
		}

		public Sim(int enumber) {
			this.Enumber = enumber;

		}

	}

	static class Phone {
		private String modelName;

		public String getModelName() {
			return modelName;
		}

		public Phone(String modelName) {
			this.modelName = modelName;
		}

		private Sim s = new Sim(12345);

		public Sim getSim() {
			return s;
		}

	}

	public static void main(String[] args) {

		Phone p = new Phone("Motorola");
		System.out.println(p.getModelName());
		System.out.println(p.getSim().getEnumber());

	}
	
}
