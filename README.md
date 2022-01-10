# sort-o_ChrysanthemumTea
##### An implementation of elementary sorting algorithms to determine which sort(s) are the most efficient, if any.
~ Ryan Lau ~ \
~ Melody Lew ~ \
~ Anthony Sun ~

**Song of the Week**: Alcohol-Free by Twice

We chose to use the number of swaps to determine the best and worst cases for each sort. The case with the least amount of swaps is the best case whereas the case with the most amount of swaps is the worst case. This is because we found that the number of passes is the same for every sort and the number of comparisons in bubble sort will always be the same given that the length of the ArrayList is the same. So the number of swaps should be the deciding factor.

## Bubble Sort
- Best case: O(n)
  - The data is already sorted (in ascending order) or all the elements are the same. When Bubble Sort is performed on a list that is already sorted, it doesn't need to make any swaps.
  - Example:
    - [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    - [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
- Worst case: O(n<sup>2</sup>)
  - The data is in descending order, as this requires Bubble Sort to perform the maximum number of swaps possible to move the smallest/largest value to the leftmost/rightmost position, respectively.
  - Example:
    - [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

## Selection Sort
 - In our testing, we found that for any arrangement of elements in a n-sized array, the number of swaps, comparisons, and passes were the same which means that there is no "best" or "worst" case for selection sort since the only factor that had an impact on our results was the size of the array. Therefore, the Big-O time complexity for this algorithm is always O(n<sup>2</sup>).
 - For example, these two arrays have the same number of swaps:
    - [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    - [289, 399, 200, 324, 680, 820, 914, 966, 662, 650]
 - But an array of a different size would have a different number of swaps.

## Insertion Sort
- Best case: O(n)
  - The data is already sorted (in ascending order) or all the elements are the same. When Insertion Sort is performed on a list that is already sorted, it doesn't need to make any swaps.
  - Example:
    - [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    - [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
- Worst case: O(n<sup>2</sup>)
  - The data is in descending order, as this requires Insertion Sort to make the maximum number of swaps with its left neighbor to move to its sorted position in the list.
  - Example:
    - [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
