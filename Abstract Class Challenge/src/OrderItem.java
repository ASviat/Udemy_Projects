record OrderItem (int quantity, ProductForSale selectedProduct) {
    public OrderItem(ProductForSale selectedProduct) {
        this(1, selectedProduct);
    }

    public void printOrder(){
        selectedProduct.printOrderedProduct(quantity);
    }
}

