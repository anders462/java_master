package com.andben;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparision = currentItem.compareTo(item);
            if (comparision < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }

            } else if (comparision > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;

                }
                return true;
            } else {
                System.out.println(item.getValue() + " already exists in list");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("");
        }
            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    if (currentItem == this.root) {
                        System.out.println(" 1 " + currentItem.next().getValue());

                        this.root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    System.out.println("\nDeleted item " + item.getValue() + "\n");
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    System.out.println(item.getValue() + " not found in list");
                    return false;
                }
            }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}


