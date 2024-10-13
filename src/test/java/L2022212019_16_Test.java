import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L2022212019_16_Test {

    @Test
    public void testLargestNumber_AllZeros() {
        // 测试目的：验证当所有元素为零时，返回 "0"
        // 测试用例：[0, 0, 0]
        int[] nums = {0, 0, 0};
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    @Test
    public void testLargestNumber_SingleElementPositive() {
        // 测试目的：验证当只有一个正数时，返回该数的字符串表示
        // 测试用例：[5]
        int[] nums = {5};
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(nums);
        assertEquals("5", result);
    }

    @Test
    public void testLargestNumber_SingleElementZero() {
        // 测试目的：验证当只有一个零时，返回 "0"
        // 测试用例：[0]
        int[] nums = {0};
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(nums);
        assertEquals("0", result);
    }

    @Test
    public void testLargestNumber_MixedElements() {
        // 测试目的：验证当包含正数和零时，返回按字典序最大的组合
        // 测试用例：[3, 30, 34, 5, 9]
        int[] nums = {3, 30, 34, 5, 9};
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(nums);
        assertEquals("9534330", result);
    }

    @Test
    public void testLargestNumber_AllSameElements() {
        // 测试目的：验证当所有元素相同时，返回该数的字符串表示
        // 测试用例：[1, 1, 1, 1]
        int[] nums = {1, 1, 1, 1};
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(nums);
        assertEquals("1111", result);
    }

}
