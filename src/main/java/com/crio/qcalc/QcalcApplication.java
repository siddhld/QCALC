package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");

      
	StandardCalculator calc = new StandardCalculator();
	calc.add(Double.MAX_VALUE, 1.0);
	calc.divide(10, 0);
	calc.printResult();

	ScientificCalculator scalc = new ScientificCalculator();
	scalc.square(5.0);
	scalc.printResult();


	}

}
