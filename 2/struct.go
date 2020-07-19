package main

import "fmt"

func main() {
	fmt.Println("vim-go")
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	header := ListNode{}
	pointer := &header
	carrier := 0
	for l1 != nil || l2 != nil || carrier > 0 {
		tmpNode := ListNode{}
		if l1 != nil {
			carrier += l1.Val
			l1 = l1.Next
		}
		if l2 != nil {
			carrier += l2.Val
			l2 = l2.Next
		}
		tmpNode.Val = carrier % 10
		carrier = carrier / 10
		pointer.Next = &tmpNode
		pointer = pointer.Next
	}
	return
}
