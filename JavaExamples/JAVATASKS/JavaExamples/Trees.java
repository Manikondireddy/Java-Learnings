package JavaExamples;
import java.util.ArrayList;
import java.util.List;

class Branch {
    private List<Integer> fruits;

    public Branch() {
        fruits = new ArrayList<>();
    }

    public void addFruit(int fruit) {
        if (fruits.size() < 6) {
            fruits.add(fruit);
        } else {
            System.out.println("This branch already has 6 fruits.");
        }
    }

    public List<Integer> getFruits() {
        return fruits;
    }
}

class Tree {
    private List<Branch> branches;

    public Tree() {
        branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void showTree() {
        int branchNum = 1;
        for (Branch branch : branches) {
            System.out.println("Branch " + branchNum + ": " + branch.getFruits());
            branchNum++;
        }
    }
}

public class Trees {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Branch branch1 = new Branch();
        for (int i = 0; i < 6; i++) {
            branch1.addFruit(11); 
        }

        tree.addBranch(branch1);
        tree.showTree();
    }
}
    

