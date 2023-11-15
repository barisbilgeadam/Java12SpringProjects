EJB (Enterprise JavaBeans)  Java Bean
	//1. boş constructor
	//2. getter & setter
	//3. Serializable'dan implemente edilmesi gerekli.
POJO
	// Sadece field olması yeterli.
@Bean ile işaretlediklerinizin hepsi SpringBeandir.

Spring Bean: Spring tarafından yönetilen Java nesneleridir. @Bean ile işaretlenmelidir.

Java Bean: EJB özelliklerine sahip beanlerdir.

// Spring Framework tarafından yönetilen tüm beanleri göster:
System.out.println("--------------------------------");  
Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


