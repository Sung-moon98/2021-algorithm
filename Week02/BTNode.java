package Algo21_2;

public class BTNode {
	String data;
    BTNode Lchild;
    BTNode Rchild;

    public BTNode() {
    	data = null;
        Lchild = null;
        Rchild = null;
    }

    public BTNode(String dt) {
        data = dt;
        Lchild = null;
        Rchild = null;
    }

    public BTNode(BTNode lc, String dt, BTNode rc) {
        data = dt;
        Lchild = lc;
        Rchild = rc;
    }
}
