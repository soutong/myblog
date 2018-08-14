package com.sxt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxt.model.Article;
import com.sxt.model.ArticleType;
import com.sxt.model.UserInfo;
import com.sxt.service.ArticleService;
import com.sxt.service.ArticleTypeService;
import com.sxt.service.UserInfoService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserInfoService bean = ac.getBean("userInfoService",UserInfoService.class);
//		
//		UserInfo userInfo = new UserInfo();
//		userInfo.setUserName("zhangsan");
//		userInfo.setUserPass("123");
//		bean.register(userInfo);
		
//		ArticleTypeService bean = ac.getBean("articleTypeService",ArticleTypeService.class);
//		ArticleType articleType = new ArticleType();
//		articleType.setTypeName("���");
//		bean.add(articleType);
//		bean.delete(1);
		ArticleService articleService = ac.getBean("articleService",ArticleService.class);
		Article article2 = new Article();
		article2.setArticleContent("����һ��С�������첻�£��ز���");
		article2.setArticleDesc("xiaogouzi");
		article2.setArticleFrom("ԭ��");
		article2.setArticleTitle("С��");
		article2.setTypeId(4);
		//articleService.add(article2);
		List<Article> findByType = articleService.findByType(4);
		for(Article article:findByType){
			System.out.println(article);
		}
		
	}
}
