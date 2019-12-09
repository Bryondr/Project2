public class Bag<AnyType>
{
    private Node<AnyType> first;

    public Bag()
    {
        first = null;
    }

     public Bag(Bag bag)
    {
        for (AnyType obj: bag)
        {
            Node<AnyType> type = new Node<>(obj);
            this.add(obj);
        }
    }

    public void add(AnyType data)
    {
        if (first == null)
        {
            Node<AnyType> newNode = new Node<>(data);
            newNode.setNext(first);
            first = newNode;
        }
        else
        {
            Node<AnyType> newNode = new Node<>(data);
            newNode.setNext(first);
            first = newNode;
        }
    }

    public void clear()
    {
        first=null;
    }

    public boolean contains(AnyType a)
    {

        return false;
    }

    public int distinctSize()
    {
        return 0;
    }

    @Override
    public boolean equals(Object obj)
    {
        if ()

        return false;
    }

    public int elementSize(AnyType a)
    {
        return 0;
    }

    public boolean isEmpty()
    {
        if (first==null)
            return false;
        else
            return true;
    }

    public void remove(AnyType a)
    {

    }

    public int size()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "";
    }

    public boolean compareTo(Bag bag) { return bag.size() < this.size(); }z""
}
