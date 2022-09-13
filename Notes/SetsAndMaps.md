#Sets and Maps

1.Sets - множества
* HashSet - Does not guarantee the constant order of elements over time
Не подрежда елементите в реда, в който са добавени
* TreeSet - Елементите са подредени в нарастващ ред. The elements are ordered incrementally
* LinkedHashSet - The order of appearance is preserved. Подрежда елементите в реда, в който са добавени

> A set keeps unique elements.
> Provides methods for adding, removing and searching elements
> 
> Why we use Set? ->> it's so fast; Offers very fast performance
> 
> 
##2. Hashset vs. Treeset vs. Linkedhashset
- Hashset is implemented using a hash table. Elements are not ordered. 
Тhe add, remove, and contains methods has constant time complexity o(1)(constant).
- Treeset is implemented using a tree structure(red-black tree in algorithm book).
The elements in a set are sorted, but the add, remove, and contains methods has
time complexity of o(log (n)). it offers several methods to deal with the ordered set like first(),
last(), headset(), tailset(), etc.
- Linkedhashset is between hashset and treeset. it is implemented as a hash table with a linked 
list running through it, so it provides the order of insertion. the time complexity of basic methods is o(1).
- conclusion - HashSet and LinkedHashSet are faster than TreeSet, but elements in TreeSet are ordered incrementally.

// HashSet отдолу е имплементирам, използвайки HashMap,
това е и причината Set да съдържа само уникални елемененти. Защото в Map не можем да има два едни и същи ключа

#Associative Arrays - Maps
* They are array indexes by keys
* Hold  a key of pairs <Key,Value>
* .put() -- add an element

LinkedHashMap - ключовете минават през hash function и застават на определен индекс,
но тук имаме не само key and value, a всеки елемент има и previous and next property , 
и така след като всеки елемент знае кой е предишния и следващия елемент, имаме подреден списък

TreeMap - имаме дърво,което се разделя на леви и десни разклонение 
и по този начин елементите се подреждам по големина. 
Като търсим един елемент веднага елиминиараме половината дърво