package com.renxuan.aspectJ.demo2;

public class CustomerDaoImp implements CustomerDao{

	 public void save(){
	        System.out.println("保存商品...");
	    }

	    public void update(){
	        System.out.println("修改商品...");
	        
	    }

	    public void delete(){
	        System.out.println("删除商品...");
	        int i=1/0;
	    }

	    public String findOne(){
	        System.out.println("查询一个商品...");
//	        int i=1/0;
	        return "查询到商品A";
	    }

	    public String findAll(){
	        System.out.println("查询所有商品...");
	        return "查询到商品A、B、C";
	    }



}
