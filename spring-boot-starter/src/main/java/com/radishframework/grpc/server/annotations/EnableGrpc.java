package com.radishframework.grpc.server.annotations;

import com.radishframework.grpc.server.springboot.RadishConfiguration;
import com.radishframework.grpc.server.springboot.SpringBootServerRunner;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({
        RadishConfiguration.class,
        SpringBootServerRunner.class,
})
public @interface EnableGrpc {

}
