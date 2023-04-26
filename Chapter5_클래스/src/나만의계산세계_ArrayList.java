import java.util.ArrayList;
import java.util.Arrays;

public class 나만의계산세계_ArrayList {
	public static void main(String[] args) {
		
		
		ArrayList<String>colors = new ArrayList<>(Arrays.asList("Black","White","blue","pink","yeelow"));
		String remobedColor = colors.remove(0);
		System.out.println("Removed color is "+remobedColor);
		
		colors.remove("White");
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
		
		
	}
}
