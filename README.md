# Stack-Java

I found the smallest element in the stack with the findMin method. First, I used a loop to find the smallest of the elements in the newStack. I have stored the current minimum value in min variable.
During this process, I temporarily moved the elements in the newStack to the temp stack. Then I scanned the temp stack again and moved all but the smallest value back to the newStack stack.


I sorted the elements in the stack from smallest to largest with a method called sortStack. First, I got the elements from the stk stack and stored them in the tmp variable. I then moved the elements back to the stk stack as long as the temp stack was not empty and the top element of the temp stack was greater than tmp. I added the tmp value to the temp stack. This process will complete when the stk heap is empty and as a result the sorted elements will be found in the temp heap.

I merged two different stacks with the merge method. First, I added the elements from the s1 stack to the newStack and removed them from the s1 stack. Then I added the elements from the s2 stack to the newStack and removed them from the s2 stack. As a result of this operation, the combined elements will be found in the newStack stack and this stack will be returned.
