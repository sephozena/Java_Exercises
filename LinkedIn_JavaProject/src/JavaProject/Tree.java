package JavaProject;

import java.awt.Color;

public class Tree {

	double heightFT;
	double trunkDiameterInches;
	TreeType treeType;
	static Color TRUNK_COLOR = new Color(102, 51, 0);

	/*
	 * the constructor Tree is used to create a custom tree.
	 * when the Tree constructor is used, it will create a tree based on the input
	 * values or parameters.
	 */
	Tree(double heightFT, double trunkDiameterInches, TreeType treeType) {
		this.heightFT = heightFT;
		this.trunkDiameterInches = trunkDiameterInches;
		this.treeType = treeType;
	}

	public void grow() {
		this.heightFT = this.heightFT + 10;
		this.trunkDiameterInches = this.trunkDiameterInches + 1;
	}

	static void announceTree() {
		System.out.println("Look out for that tree!" + TRUNK_COLOR);
	}

	public void treeSize() {
		if (this.heightFT > 100) {
			System.out.println("That's a tall " + this.treeType + " Tree!");
		} else {
			System.out.println("That's a small " + this.treeType + " Tree!");
		}
	}

}
