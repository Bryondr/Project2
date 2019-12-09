public class Bag<AnyType extends Comparable<AnyType>>
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
        Node newNode = new Node(null,data,null);

        if(isEmpty())
            first = newNode;
        else
        {
            Node tempNode = first;

            while(true)
            {
                if(data.compareTo(tempNode.getData())<0)
                {
                    if(tempNode.getLeft() == null)
                    {
                        tempNode.setLeft(newNode);
                        break;
                    }
                    else
                        tempNode = tempNode.getLeft();
                }
                else
                {
                    if(tempNode.getRight() == null)
                    {
                        tempNode.setRight(newNode);
                        break;
                    }
                    else
                        tempNode = tempNode.getRight();
                }
            }
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
        return (first == null);
    }

    public void remove(AnyType a)
    {

    }

    public int size()
    {
        return 0;
    }

    //Override for turning
    @Override
    public String toString()
    {
        return "";
    }


    //Compare two bags with their sizes
    public int compareTo(Bag bag)
    {
        if(bag.size() < this.size())
            return 2;
        else if (bag.size() == this.size())
            return 0;
        else
            return -2;
    }

    public int compareTo(AnyType o) {
        return 0;
    }
}
