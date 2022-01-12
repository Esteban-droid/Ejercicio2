package ListAssigment;

public class SinglyLinkedList {

    public Node head=null;

    public SinglyLinkedList() {

        // su codigo aqui

    }

    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.

    public void add(int value) {

        Node newNode = new Node(value);

        if(head == null) {

            head = newNode;

        } else {

            Node runner = head;

            while(runner.next != null) {

                runner = runner.next;

            }

            runner.next = newNode;

        }

    }

	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public void printValues() {
		// TODO Auto-generated method stub
		
	}    

}
