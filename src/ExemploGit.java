
public class ExemploGit {
	public static void sayHellowManyTimes(int times) {
		for (int i = 0; i < times; i++) {
			sayHellow();
		}
	}
	public static void sayHellow() {
		System.out.println("Olá Mundo!");
	}
	
	public static void main(String[] args) {
		sayHellowManyTimes(5);
	}
}
