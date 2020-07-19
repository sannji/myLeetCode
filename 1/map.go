package main

import "fmt"

func main() {
	fmt.Println("vim-go")
	nums := []int{1, 2, 4, 8, 12}
	fmt.Println(twoSum(nums, 6))
}

func twoSum(nums []int, target int) []int {
	hMap := make(map[int]int, len(nums))
	for i, num := range nums {
		hMap[num] = i
	}

	for i, num := range nums {
		remain := target - num
		if j, ok := hMap[remain]; ok {
			if j != i {
				return []int{i, j}
			}
		}
	}

	return []int{}
}
