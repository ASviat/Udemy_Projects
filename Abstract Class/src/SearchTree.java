public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public void getRoot() {
//            -  getRoot(), getter for root.

    }

    @Override
    public void addItem() {
//        -  addItem(), similar to MyLinkedList. See second TIP below.

    }

    @Override
    public void removeItem() {
//            -  removeItem(), same as MyLinkedList.

    }

    private void performRemoval(){
//            -  performRemoval(), takes two ListItems, the item to be removed and its parent.
//    It doesn't return anything and is declared as private. Call this method from removeItem() when the item is found.

    }

    @Override
    public void traverse() {
//            -  traverse(), takes the root as an argument and does not return anything.
//    It uses recursion to visit all the branches in the tree (Inorder). Print each value on a seperate line.

    }


}
