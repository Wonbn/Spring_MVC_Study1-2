package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); -> 롬복 어노테이션 @Slf4j 으로 대체

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // 로그레벨 : trace -> debug -> info -> warn -> error
        // resource/application.properties 에서 변경가능
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
