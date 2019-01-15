package inner_as_subclass;

public class Basketball {
	Ball b = new Ball() {
		public void kick() {
			System.out.println("anonymous ball kicked");
		}
	};

	public static void main(String[] args) {
		Basketball ball = new Basketball();
		ball.b.kick();
	}
}
