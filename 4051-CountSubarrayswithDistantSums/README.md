You are given an integer array nums and two integers goal and k.

A subarray nums[i..j] is considered distant if the absolute difference between its sum and goal is at least k.

Return the number of distant subarrays.

 
Example 1:


Input: nums = [1,2,1], goal = 4, k = 1

Output: 5

Explanation:

The distant subarrays for k = 1 are:

ijnums[i..j]Sumabs(sum - goal)00[1]1311[2]2222[1]1301[1, 2]3112[2, 1]31

Thus, the answer is 5.


Example 2:


Input: nums = [2,-1,3], goal = 2, k = 2

Output: 2

Explanation:

The distant subarrays for k = 2 are:

ijnums[i..j]Sumabs(sum - goal)11[-1]-1302[2, -1, 3]42

Thus, the answer is 2.


Example 3:


Input: nums = [-3,1,2], goal = 0, k = 3

Output: 2

Explanation:

The distant subarrays for k = 3 are:

ijnums[i..j]Sumabs(sum - goal)00[-3]-3312[1, 2]33

Thus, the answer is 2.


 
Constraints:


	1 <= nums.length <= 105
	-109 <= nums[i] <= 109
	-109 <= goal <= 109
	0 <= k <= 109

