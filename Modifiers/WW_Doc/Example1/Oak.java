package Modifiers.WW_Doc.Example1;

import Modifiers.WW_Doc.Example.Plant;

public class Oak extends Plant {

    public Oak() {
 // cannot be accesses because is private
 //   type = "tree";
  // this work --- size is protected and Oak is a subclass of Plant even different package
      this.size = "large";
        }
   }