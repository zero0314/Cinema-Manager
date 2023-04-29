package com.entity.view;

import com.entity.YingyuanchangciEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 影院场次
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-10 18:07:15
 */
@TableName("yingyuanchangci")
public class YingyuanchangciView  extends YingyuanchangciEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyuanchangciView(){
	}
 
 	public YingyuanchangciView(YingyuanchangciEntity yingyuanchangciEntity){
 	try {
			BeanUtils.copyProperties(this, yingyuanchangciEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
