package com.demo2;

public class EnumMain {
	//enum Colors {
			//RED(6), WHITE(7), BLACK(9), BLUE(8);

			// constructor for enum

		//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final String Course = "BTECH"; //decaring constant
		// System.out.println(Course);

				// Course = "MCA";

		 enum Colors {
			 RED, WHITE, BLACK, BLUE
			 }

			// array of constant
			// values :array contaning all enums
			for (Colors c : Colors.values()) {
				System.out.println(c);
			}
	}

}
