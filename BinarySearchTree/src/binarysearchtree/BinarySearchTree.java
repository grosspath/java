/*
 * Copyright 2017 jerolg
 */

package binarysearchtree;

// @author jerolgraves
 
public class BinarySearchTree {

    // @param args the command line arguments

    public static void main(String[] args) throws Exception {
        // WRITE CODE HERE
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
    }

}
