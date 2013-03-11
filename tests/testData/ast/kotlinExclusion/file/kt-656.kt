package demo
open class Test() : MutableIterable<String?> {
public override fun iterator() : MutableIterator<String?>? {
return null
}
public open fun push(i : MutableIterator<String?>?) : MutableIterator<String?>? {
var j : MutableIterator<String?>? = i
return j
}
}
open class FullTest() : MutableIterable<String?> {
public override fun iterator() : MutableIterator<String?>? {
return null
}
public open fun push(i : MutableIterator<String?>?) : MutableIterator<String?>? {
var j : MutableIterator<String?>? = i
return j
}
}