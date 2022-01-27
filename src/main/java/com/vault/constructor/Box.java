package com.vault.constructor;

class Box {

double wight;
double height;
double depth;

  // empty constructor
  Box(){

  }

  Box(double wight, double height, double depth) {
    this.wight = wight;
    this.height = height;
    this.depth = depth;
  }

  Box(double len){
    wight = height = depth = len;
  }

  double volume() {
    return wight*height*depth;
  }
}
