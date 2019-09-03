package cn.wk.adminlte.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : wksky
 * @date : 2019-09-03 15:30
 */
@Controller
public class PageController {
    /**
     * 匹配一级页面
     *
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }

    /**
     * 匹配二级页面
     *
     * @param pre
     * @param page
     * @return
     */
    @RequestMapping("{pre}/{page}")
    public String multilevelPage(@PathVariable String pre, @PathVariable String page) {
        return pre + "/" + page;
    }
}
