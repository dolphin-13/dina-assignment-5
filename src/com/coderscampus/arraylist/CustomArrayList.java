package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		// According to methods add(E e) and add(E e, Object[] elementData, int s) from
		// ArrayList class
		if (size == items.length)
			items = growBackingObjectArray();
		items[size] = item;
		size += 1;

		return true;
	}

	// According to method public int size() from ArrayList class
	@Override
	public int getSize() {
		return size;
	}

	// According to method elementData(int index) from ArrayList class
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];

	}

	// According to method private Object[] grow(int minCapacity) from ArrayList
	// class
	public Object[] growBackingObjectArray() {
		Object[] newItems = Arrays.copyOf(items, size * 2);
		items = newItems;
		return newItems;
	}

}
