fun main(args: Array<String>) {
    var name="Lavakumar";
    for(i in 0..name.length-1) {
        var character = name.get(i)
        var ascii = character.toInt()
        println(ascii)
    }
}