package JavaProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * use the 'new' keyword when using a constructor tree
		 * the 'new tree' will then create a new tree from our tree class.
		 * create a variable myFavoriteOakTree and store the new tree.
		 */
		
		// Color myTrunkColor = Tree.TRUNK_COLOR;
		// Color defaultWhite = Color.WHITE;
		// Color defaultBlue = Color.BLUE;
		// Color brighterBlue = defaultBlue.brighter();
		
		Tree myFavoriteOakTree = new Tree(100, 5, TreeType.OAK);
		Tree myFavoriteMapleTree = new Tree(25, 5, TreeType.MAPLE);
		Tree myFavoritePineTree = new Tree(105, 20, TreeType.PINE);
		
		// use the class grow function in Tree class.
		myFavoriteOakTree.grow();
		myFavoriteOakTree.treeSize();
		myFavoriteMapleTree.treeSize();
		myFavoritePineTree.treeSize();
		System.out.println(Tree.TRUNK_COLOR);
		Tree.announceTree();

	}

}
