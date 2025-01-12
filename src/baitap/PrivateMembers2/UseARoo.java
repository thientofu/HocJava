package baitap.PrivateMembers2;


import baitap.PrivateMembers.Roo;

private class UseARoo {
    public void testIt() {
        Roo r = new Roo(); //So far so good; class Roo is public
        System.out.println(r.doRooThings()); //Compiler error!
    }
}