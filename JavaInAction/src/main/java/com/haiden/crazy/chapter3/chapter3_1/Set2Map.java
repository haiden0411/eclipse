package com.haiden.crazy.chapter3.chapter3_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2010, YeKu.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author YeKu.H.Lee kongyeKu@163.com
 * @version 1.0
 */
class SimpleEntry<K, V> implements Map.Entry<K, V>, java.io.Serializable
{
	private final K key;
	private V value;

	// ������������������
	public SimpleEntry(K key, V value)
	{
		this.key = key;
		this.value = value;
	}

	public SimpleEntry(Map.Entry<? extends K, ? extends V> entry)
	{
		this.key = entry.getKey();
		this.value = entry.getValue();
	}

	// ��ȡkey
	public K getKey()
	{
		return key;
	}

	// ��ȡvalue
	public V getValue()
	{
		return value;
	}

	// �ı��key-value�Ե�valueֵ
	public V setValue(V value)
	{
		V oldValue = this.value;
		this.value = value;
		return oldValue;
	}

	// ����key�Ƚ�����SimpleEntry�Ƿ���ȡ�
	public boolean equals(Object o)
	{
		if (o == this)
		{
			return true;
		}
		if (o.getClass() == SimpleEntry.class)
		{
			SimpleEntry se = (SimpleEntry) o;
			return se.getKey().equals(getKey());
		}
		return false;
	}

	// ����key����hashCode
	public int hashCode()
	{
		return key == null ? 0 : key.hashCode();
	}

	public String toString()
	{
		return key + "=" + value;
	}
}

// �̳�HashSetʵ��һ��Map
public class Set2Map<K, V> extends HashSet<SimpleEntry<K, V>>
{
	// ʵ���������key-value�Եķ���
	public void clear()
	{
		super.clear();
	}

	// �ж��Ƿ����ĳ��key
	public boolean containsKey(K key)
	{
		return super.contains(new SimpleEntry<K, V>(key, null));
	}

	// �ж��Ƿ����ĳ��value
	boolean containsValue(Object value)
	{
		for (SimpleEntry<K, V> se : this)
		{
			if (se.getValue().equals(value))
			{
				return true;
			}
		}
		return false;
	}

	// ����ָ��keyȡ����Ӧ��value
	public V get(Object key)
	{
		for (SimpleEntry<K, V> se : this)
		{
			if (se.getKey().equals(key))
			{
				return se.getValue();
			}
		}
		return null;
	}

	// ��ָ��key-value�Է��뼯����
	public V put(K key, V value)
	{
		add(new SimpleEntry<K, V>(key, value));
		return value;
	}

	// ����һ��Map��key-value�Է����Map��
	public void putAll(Map<? extends K, ? extends V> m)
	{
		for (K key : m.keySet())
		{
			add(new SimpleEntry<K, V>(key, m.get(key)));
		}
	}

	// ����ָ��keyɾ��ָ��key-value��
	public V removeEntry(Object key)
	{
		for (Iterator<SimpleEntry<K, V>> it = this.iterator(); it.hasNext();)
		{
			SimpleEntry<K, V> en = (SimpleEntry<K, V>) it.next();
			if (en.getKey().equals(key))
			{
				V v = en.getValue();
				it.remove();
				return v;
			}
		}
		return null;
	}

	// ��ȡ��Map�а������ٸ�key-value��
	public int size()
	{
		return super.size();
	}
}
