package drive;
public class OpStack extends Stack {
    private String Ops = "+-*/";
    private char leftParenthesis = '(';
    private char rightParenthesis = ')';

    @Override
    public void push(String data) {
        this.prepend(data);
    }

    @Override
    public Node pop() {
        Node result = this.Head;
        this.removeHead();
        return result;
    }

    @Override
    public Node peek() {
        return this.Head;
    }
    
    @Override
    public abstract boolean isEmpty()
    {
    	if(this.Head == null)
    	{
    		return true;
    	}
    }
    
    @Override
    public static int GetLength()
    {
    	
    }
    
}
