package CP2;

public class CustomStack {

    private StackNode _head;

    public CustomStack() {
        _head = null;
    }

    public void push(String word) {
         // Basado en la definición de pila LIFO:
    // https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
    
        var node = new StackNode(word);

        // Actualizar
        node.setNext(_head);

        _head = node;
    }

    public String pop() {
        String word = null;

        // Actualizar
        if (_head != null) {
            word = _head.getWord();
            _head = _head.getNext();
        }

        return word;
    }

    public int size() {
        // Conteo de nodos en lista enlazada (no recursivo):
    // https://en.wikipedia.org/wiki/Linked_list
    
        var length = 0;

        StackNode curr = _head;
        while (curr != null) {
            length++;
            curr = curr.getNext();
        }

        return length;
    }

    public String getWords() {
        var builder = new StringBuilder("(" + size() + ") [");
        for (var word = pop(); word != null; word = pop()) {
            builder.append(" " + word);
        }
        builder.append(" ]");
        return builder.toString();
    }
}

