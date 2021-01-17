package type_aliases.learnprogramming.iokotlin

import java.io.FileInputStream
import java.io.DataInputStream
import java.io.EOFException


fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    }
    catch (e: EOFException) {}
}