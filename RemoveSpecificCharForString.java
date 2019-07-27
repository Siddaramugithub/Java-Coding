package corejava;

public class RemoveCharFormWord {
	public static void main(String[] args) {
		removeCharFromWord("Kolle");
	}

	private static void removeCharFromWord(String str) {
		StringBuffer buffer = new StringBuffer();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 'o') {
				buffer.append(ch[i]);
			}
		}
		System.out.println(buffer.toString());
	}
}
