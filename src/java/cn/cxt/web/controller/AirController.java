package cn.cxt.web.controller;

import cn.cxt.entity.Air;
import cn.cxt.entity.District;
import cn.cxt.service.AirService;
import cn.cxt.service.DistrictService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/air")
public class AirController {
    @Autowired
    @Qualifier("airService")
    private AirService airService;
    @Autowired
    @Qualifier("districtService")
    private DistrictService districtService;

    @RequestMapping("/list.action")
    public String list(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "3") int pageSize, Model model, Air air) {
        PageHelper.startPage(pageNo, pageSize);
        List<Air> airList = airService.getAirList(air);
        List<District> districtList = districtService.getAll();
        PageInfo<Air> pageInfo = new PageInfo<Air>(airList);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("districtList", districtList);
        model.addAttribute("air", air);
        System.out.println("1");
        return "index";
    }
}
