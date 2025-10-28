package com.ssg.springwebmvc.mapper;

import com.ssg.springwebmvc.member.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations =
        {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TimeMapperTests {

    @Autowired(required = false)
    private TimeMapper2 timeMapper1;

    @Autowired(required = false)
    private TimeMapper timeMapper2;


    @Test
    public void testTimeMapper1() {
        log.info(timeMapper1.getNow());
    }

    @Test
    public void testTimeMapper2() {
        log.info(timeMapper2.getTimeNow());
    }
}
