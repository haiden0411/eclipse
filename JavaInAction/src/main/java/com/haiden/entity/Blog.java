package com.haiden.entity;

import com.jfinal.plugin.activerecord.Model;

public class Blog extends Model<Blog>
{
	public static final Blog dao = new Blog().dao();
}
