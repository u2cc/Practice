import java.math.BigDecimal;

public class BigDecimalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal unscaled = new BigDecimal("5.273");
		BigDecimal scaled = unscaled.setScale(5);
		System.out.printf("Scaled value is %2$-6s. %n",scaled,"hello");
		BigDecimal rescaled = scaled.setScale(3);
		System.out.printf("Rescaled value is %s", rescaled);
	}

}
