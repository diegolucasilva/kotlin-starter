package type_aliases.learnprogramming.iokotlin

import java.io.File


fun main(args: Array<String>) {
    File("testfile.txt").reader().forEachLine { println(it) }

    //new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8")
}