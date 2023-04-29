package com.entity.view;

import com.entity.LingshifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 零食分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 18:07:15
 */
@TableName("lingshifenlei")
public class LingshifenleiView  extends LingshifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingshifenleiView(){
	}
 
 	public LingshifenleiView(LingshifenleiEntity lingshifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, lingshifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
