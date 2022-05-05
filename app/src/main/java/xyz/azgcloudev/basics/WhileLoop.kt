package xyz.azgcloudev.basics

fun main() {

    var x = 100

    // loop that prints from 100 to 0 in jumps of 2
    while(x >= 0) {
        if (x == 0) {
            print(x)
        } else {
            print("$x,")
        }
        x -= 2
    }
    print("\n")

    // do wwhile loop [first do will be run even if the condition is not met, then it is stop if while is not true
    var y: Int = 1
    do {
        print(y)
        y++
    }while (y <= 9)

}