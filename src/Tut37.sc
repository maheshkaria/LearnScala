// functions - HOF - higher order function - map, filter, span, partition and more are example of HOF
// HOF are functions which takes another function

val nums = (1 to 10).toList

// map function applies lambda to every element and returns a sequence
print(nums.map(x=> x*x))

// filter removes elements which are not matching conditions and returns remaining elements of sequence
print(nums.filter(x => x % 2 == 0))

// span function returns 2 List .. left list contains all the elements up to first matching condition (but not the element which is matching conditions) and right list contains all the elements first matching condition element till last
print(nums.span(x => x % 5 != 0))

// divides given sequence into two parts left list contains matching condition elements and right contains list of non-matching elements
print(nums.partition(x => x % 2 == 0))

// sliding function returns window of given size from given sequence
// nums.sliding(3) foreach println

// how to create HOF ?
//

val xs = (1 to 10).toList
def compareNeighbors(xs: List[Int], compare: (Int, Int) => Int): List[Int] = {
  for (pair <- xs.sliding(2)) yield {
    compare(pair(0), pair(1))
  }
}.toList


print(compareNeighbors(xs, (a, b) => a + b))

print(compareNeighbors(xs, (a, b) => (a - b).abs))

