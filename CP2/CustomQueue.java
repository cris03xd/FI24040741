package CP2;

public class CustomQueue {

    private QueueNode _head;

    public CustomQueue() {
        _head = null;
    }

    public void enqueue(int index) {
         // Basado en la definición de cola por lista enlazada simple:
    // https://en.wikipedia.org/wiki/Queue_(abstract_data_type)
    
        var node = new QueueNode(index);

        // Actualizar
        if (_head == null) {
            _head = node;
        } else {
            QueueNode curr = _head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);
        }
    }

    public int dequeue() {
        // Concepto estándar de cola FIFO:
    // https://en.wikipedia.org/wiki/FIFO_(computing_and_electronics)
    
        var index = -1;

        // Actualizar
        if (_head != null) {
            index = _head.getIndex();
            _head = _head.getNext();
        }

        return index;
    }

    public int getSize() {
         // Conteo iterativo en lista enlazada:
    // https://en.wikipedia.org/wiki/Linked_list
    
        var size = 0;

        // Actualizar
        QueueNode curr = _head;
        while (curr != null) {
            size++;
            curr = curr.getNext();
        }

        return size;
    }

    public String getIndexes() {
        var builder = new StringBuilder();
        for (var index = dequeue(); index > -1; index = dequeue()) {
            builder.append(" " + index);
        }
        return builder.toString();
    }
}
