package com.keymaoshop.cart.service;

import com.keymao.common.utils.E3Result;
import com.keymao.pojo.TbItem;

import java.util.List;



public interface CartService {

	E3Result addCart(long userId, long itemId, int num);
	E3Result mergeCart(long userId, List<TbItem> itemList);
	List<TbItem> getCartList(long userId);
	E3Result updateCartNum(long userId, long itemId, int num);
	E3Result deleteCartItem(long userId, long itemId);
}
