/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.toolkit;

import java.util.List;

import com.baomidou.mybatisplus.annotations.IdType;

/**
 * <p>
 * 数据库表反射信息
 * </p>
 * 
 * @author hubin
 * @Date 2016-01-23
 */
public class TableInfo {

	/**
	 * 表主键ID 类型
	 */
	private IdType idType;

	/**
	 * 表名称
	 */
	private String tableName;

	/**
	 * <p>
	 * 主键是否有存在字段名与属性名关联
	 * </p>
	 * true , false
	 */
	private boolean keyRelated = false;

	/**
	 * 表主键ID 属性名
	 */
	private String keyProperty;

	/**
	 * 表主键ID 字段名
	 */
	private String keyColumn;

	/**
	 * 表字段信息列表
	 */
	private List<TableFieldInfo> fieldList;


	public IdType getIdType() {
		return idType;
	}


	public void setIdType( IdType idType ) {
		this.idType = idType;
	}


	public String getTableName() {
		return tableName;
	}


	public void setTableName( String tableName ) {
		this.tableName = tableName;
	}


	public boolean isKeyRelated() {
		return keyRelated;
	}


	public void setKeyRelated( boolean keyRelated ) {
		this.keyRelated = keyRelated;
	}


	public String getKeyProperty() {
		return keyProperty;
	}


	public void setKeyProperty( String keyProperty ) {
		this.keyProperty = keyProperty;
	}


	public String getKeyColumn() {
		return keyColumn;
	}


	public void setKeyColumn( String keyColumn ) {
		this.keyColumn = keyColumn;
	}


	public List<TableFieldInfo> getFieldList() {
		return fieldList;
	}


	public void setFieldList( List<TableFieldInfo> fieldList ) {
		this.fieldList = fieldList;
	}

}
