public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    void next() {
//            -  next(), takes no parameters and returns the ListItem to its right.

    }

    @Override
    void setNext() {
//            -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.

    }

    @Override
    void previous() {

//            -  previous(), takes no parameters and returns the ListItem to its left.
    }

    @Override
    void setPrevious() {

//            -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
    }

    @Override
    void compareTo() {
//            -  compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from
//    ListItem for comparison. If this value is greater than the value that was passed in, then it should return a number greater than zero.
//    If vice versa, then it should return a number less than zero, and zero if equal.

    }


}
