package com.zubayer.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zubayer Ahamed
 * @since Feb 21, 2024
 */
@java.lang.annotation.Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
public @interface RestApiController {
	
}
