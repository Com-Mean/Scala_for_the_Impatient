import scala.io.Source
import java.io.PrintWriter
class FlineReverser(){
    def reverse_flines(srcfile: String, targetfile: String) = {
        val lines = Source.fromFile(srcfile).getLines.toArray
        val out = new PrintWriter(targetfile)
        for (i <- (lines.length-1) to 0 by -1) out.println(lines(i))
        out.close()
    }
}

object Hello{
    def main(args: Array[String])
    {
        val fileReverser = new FlineReverser()
        fileReverser.reverse_flines("1.txt", "1_resed.txt")
        println("exit......")
    }
}
