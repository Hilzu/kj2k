import java.util.*
public open class NewIterables() {
public open fun test() : Unit {
var xs : MutableList<Any?>? = ArrayList<Any?>()
var ys : Deque<Any?>? = LinkedList<Any?>()
var zs : ArrayList<Int?>? = ArrayList<Int?>()
var `is` : MutableIterable<Any?>? = Vector<Any?>()
var js : MutableCollection<Any?>? = TreeSet<Any?>()
var ks : MutableSet<Any?>? = HashSet<Any?>()
var ws : SortedSet<Any?>? = TreeSet<Any?>()
var `as` : MutableMap<Any?, Any?>? = HashMap<Any?, Any?>()
var bs : SortedMap<Any?, Any?>? = TreeMap<Any?, Any?>()
xs?.add(null)
zs?.add(3)
zs?.add(4)
ys?.add(null)
js?.add("null")
ks?.add(null)
ws?.add("null")
`as`?.put(null, null)
bs?.put("null", null)
}
}