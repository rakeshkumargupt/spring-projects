/**
 * 
 */
package com.rakeshgupta.spring.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Rakesh_Gupta
 *
 */

@EnableJpaRepositories(basePackages = "com.rakeshgupta.spring.cache.repository")
@EnableCaching
@Configuration
public class EhCacheConfig {

	@Bean
	public CacheManager cacheManager() {
		return new EhCacheCacheManager(cacheManagerFactory().getObject());
	}

	@Bean
	 EhCacheManagerFactoryBean cacheManagerFactory() {
		EhCacheManagerFactoryBean eBean = new EhCacheManagerFactoryBean();
		eBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
		eBean.setShared(true);
		return eBean;
	}
}
