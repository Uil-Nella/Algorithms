package org.bugkillers.algorithm.sort.bit;

public class Bit {
	private int[] mBits;// 用int类型来操作位。
	private int mSize; // 指定有多少位。

	/**
	 * 初始化，在构造函数中指定构造多大的位。
	 * 
	 * @param size
	 *            初始化的bit数目
	 */
	public Bit(int size) {
		mSize = size;
		initBits();
	}

	/**
	 * 初始化整型数组
	 */
	private void initBits() {
		// Java中整型为32位，所以数组长度为位长度/32。
		int count = (int) Math.ceil(mSize / 32f);// Math.ceil(double
													// a),返回大于或等于a的最小的整数值。此处的32f就等于32.0
		mBits = new int[count];
		clear();
	}

	/**
	 * 清空，全部置零
	 */
	private void clear() {
		int len = mBits.length;
		for (int index = 0; index < len; index++) {
			mBits[index] = 0;
		}
	}

	/**
	 * 将指定的位，置为1
	 * 
	 * @param pos
	 */
	public void set1(int pos) {
		// 得到此pos在数组中的索引
		int index = (int) Math.floor(pos / 32f);// Math.floor(double
												// a)，返回小于或等于a的最大的整数值。

		// System.out.println(index);
		// 把当前整数的第n位设置为1
		mBits[index] = mBits[index] | (1 << (31 - pos % 32));// 与移位后的1进行或运算，将指定的位，置为1，注意这里的定位。
	}

	/**
	 * 将指定的位，置为1
	 * 
	 * @param pos
	 */
	public void set0(int pos) {
		int index = (int) Math.floor(pos / 32f);
		// 把当前整数的第n位设置为0
		mBits[index] = mBits[index] & ~(1 << (31 - pos % 32));// 1移位到指定的位置后，取反，就是将0移动到指定的位置，
		// 然后和原数进行与运算，就将指定的位置为0了，因为0和任何数相与，都变位0
	}

	/**
	 * 获取指定位是否存在 ，若返回true，则指定的位为1，若返回false，则指定的位为0
	 * 
	 * @param pos
	 * @return
	 */
	public boolean get(int pos) {
		int index = (int) Math.floor(pos / 32f);
		return mBits[index] == (mBits[index] | 1 << (31 - pos % 32));// 将1移动到指定的位置，和当前的数进行或运算，
		// 若指定的位置是1，则进行或运算后不变，若指定的位置是0，则或运算后值会改变。
		// 因为任何数和1相或，都变为1.
	}

	public int getSize() {
		return this.mSize;
	}
}