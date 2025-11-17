import java.util.Arrays;
import java.util.Stack;

public class BinTreeIntArray {

    private Integer[] _tree;

    public BinTreeIntArray(int size) {
        _tree = new Integer[size];
    }

    public Integer[] getTree() {
        return _tree;
    }

    public void insert(int value) {
        int index = 0;
        while (index < _tree.length) {
            if (_tree[index] == null) {
                _tree[index] = value;
                break;
            }
            if (value < _tree[index]) {
                index = 2 * index + 1;
            } else {
                index = 2 * index + 2;
            }
        }
        System.out.println(" ↳ insert: " + value + " → " + Arrays.toString(_tree));
    }

    public void inOrderTraversal() {
        System.out.print(" ↳ inOrderTraversal → ");
        var stack = new Stack<Integer>();
        var index = 0;
        while (!stack.isEmpty() || (index < _tree.length && _tree[index] != null)) {
            while (index < _tree.length && _tree[index] != null) {
                stack.push(index);
                index = 2 * index + 1;
            }
            index = stack.pop();
            System.out.print(_tree[index] + " ");
            index = 2 * index + 2;
        }
        System.out.println();
    }

    public void preOrderTraversal() {
        System.out.print(" ↳ preOrderTraversal → ");
        var stack = new Stack<Integer>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int index = stack.pop();
            if (index >= _tree.length || _tree[index] == null) continue;
            System.out.print(_tree[index] + " ");
            stack.push(2 * index + 2);
            stack.push(2 * index + 1);
        }
        System.out.println();
    }

    public void postOrderTraversal() {
        System.out.print(" ↳ postOrderTraversal → ");
        var s1 = new Stack<Integer>();
        var s2 = new Stack<Integer>();
        s1.push(0);
        while (!s1.isEmpty()) {
            int index = s1.pop();
            if (index >= _tree.length || _tree[index] == null) continue;
            s2.push(index);
            s1.push(2 * index + 1);
            s1.push(2 * index + 2);
        }
        while (!s2.isEmpty()) {
            System.out.print(_tree[s2.pop()] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var tree = new BinTreeIntArray(7);
        System.out.println("Empty array → " + Arrays.toString(tree.getTree()));
        tree.insert(4);
        tree.insert(6);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        System.out.println("\nFull array → " + Arrays.toString(tree.getTree()));
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
    }
}
