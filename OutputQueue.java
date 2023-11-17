package drive;
public class OutputQueue extends Queue{

    // adds item to end of queue
    @Override
    public void enqueue(String data) {
       this.append(data);
    }

    // retunrs and removes head node
    @Override
    public Node dequeue() {
        Node qNode = this.Head;
        this.removeHead();
        return qNode;
    }

    // returns but does not remove head node
    @Override
    public Node peek() {
       return this.Head;
    }

    // checks if head is empty or not
    @Override
    public boolean isEmpty(){
        if(this.Head == null)
    	{
    		return true;
    	}
        else
        {
            return false;
        ]
    }

        // reutns size
    @Override
    public int getLength(){
        return this.Size;
    }
    
}
