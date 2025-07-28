package Cool.Operations.Switchstatements.Javainstanceoperator;

class Tree {
    void grow() {
        System.out.println("The tree is growing...");
    }
    public static void main(String[] args) {
        Tree myTree = null;
        if (myTree instanceof Tree) {
            System.out.println("myTree gives natural air");
        } else {
            System.out.println("myTree not gives natural air");
        }
    }
}

    

