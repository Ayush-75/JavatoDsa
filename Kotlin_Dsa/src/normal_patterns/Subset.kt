package normal_patterns

fun main(args: Array<String>) {

    val s = "abc"
    printAllSubsets(s,0,"")

    println(findSubString(s))
}

fun printAllSubsets(s: String,i: Int,cur: String){
    if (i == s.length){
        println(cur)
        return
    }
    printAllSubsets(s,i+1,cur+s[i])
    printAllSubsets(s,i+1,cur)
}

// return subset list in sorted and avoid empty ""

fun findSubString(str: String): List<String>{
    val subString = mutableListOf<String>()
    generateSubString(str,0, StringBuilder(),subString)
    subString.sort()
    return subString
}

fun generateSubString(str: String,index:Int,current: StringBuilder,subString: MutableList<String>){
    if (index == str.length){
        if (current.isNotEmpty()){
            subString.add(current.toString())
        }
        return
    }

    generateSubString(str, index + 1, current.append(str[index]), subString)

    current.deleteCharAt(current.length-1)
    generateSubString(str,index+1,current,subString)
}