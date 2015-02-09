package org.bugkillers.algorithm.sort.bit;

public class Bit {
	private int[] mBits;// ��int����������λ��
	private int mSize; // ָ���ж���λ��

	/**
	 * ��ʼ�����ڹ��캯����ָ���������λ��
	 * 
	 * @param size
	 *            ��ʼ����bit��Ŀ
	 */
	public Bit(int size) {
		mSize = size;
		initBits();
	}

	/**
	 * ��ʼ����������
	 */
	private void initBits() {
		// Java������Ϊ32λ���������鳤��Ϊλ����/32��
		int count = (int) Math.ceil(mSize / 32f);// Math.ceil(double
													// a),���ش��ڻ����a����С������ֵ���˴���32f�͵���32.0
		mBits = new int[count];
		clear();
	}

	/**
	 * ��գ�ȫ������
	 */
	private void clear() {
		int len = mBits.length;
		for (int index = 0; index < len; index++) {
			mBits[index] = 0;
		}
	}

	/**
	 * ��ָ����λ����Ϊ1
	 * 
	 * @param pos
	 */
	public void set1(int pos) {
		// �õ���pos�������е�����
		int index = (int) Math.floor(pos / 32f);// Math.floor(double
												// a)������С�ڻ����a����������ֵ��

		// System.out.println(index);
		// �ѵ�ǰ�����ĵ�nλ����Ϊ1
		mBits[index] = mBits[index] | (1 << (31 - pos % 32));// ����λ���1���л����㣬��ָ����λ����Ϊ1��ע������Ķ�λ��
	}

	/**
	 * ��ָ����λ����Ϊ1
	 * 
	 * @param pos
	 */
	public void set0(int pos) {
		int index = (int) Math.floor(pos / 32f);
		// �ѵ�ǰ�����ĵ�nλ����Ϊ0
		mBits[index] = mBits[index] & ~(1 << (31 - pos % 32));// 1��λ��ָ����λ�ú�ȡ�������ǽ�0�ƶ���ָ����λ�ã�
		// Ȼ���ԭ�����������㣬�ͽ�ָ����λ��Ϊ0�ˣ���Ϊ0���κ������룬����λ0
	}

	/**
	 * ��ȡָ��λ�Ƿ���� ��������true����ָ����λΪ1��������false����ָ����λΪ0
	 * 
	 * @param pos
	 * @return
	 */
	public boolean get(int pos) {
		int index = (int) Math.floor(pos / 32f);
		return mBits[index] == (mBits[index] | 1 << (31 - pos % 32));// ��1�ƶ���ָ����λ�ã��͵�ǰ�������л����㣬
		// ��ָ����λ����1������л�����󲻱䣬��ָ����λ����0����������ֵ��ı䡣
		// ��Ϊ�κ�����1��򣬶���Ϊ1.
	}

	public int getSize() {
		return this.mSize;
	}
}