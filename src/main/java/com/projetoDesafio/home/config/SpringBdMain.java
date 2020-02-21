//package com.projetoDesafio.home.config;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.projetoDesafio.home.repositorio.ApartamentoRepositorio;
//
//public class SpringBdMain {
//	
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
//			SpringBdMain.class.getPackage().getName());
//			
//		ApartamentoRepositorio repo = applicationContext.getBean(ApartamentoRepositorio.class);
//			
//		repo.listar().forEach(u -> System.out.println("Método listar(): " + u));
//		
//		applicationContext.close();
//		
//		System.out.println("Fim!");
//			
//		}
//	}
