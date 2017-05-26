package com.dmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dmall.beans.Product;

public interface ProductDao {
	
	// 获取商品总数
	int getCount();
	
	// 通过offset和limit查询商品
	List<Product> selectProduct(@Param("offset") int offset, @Param("limit") int limit);
	
	// 通过商品id查询商品
	Product selectProductById(Integer productId);
	
	// 通过搜索框输入模糊查询商品
	List<Product> selectProductByName(String productName);
}
