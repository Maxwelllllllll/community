package xiaohu.community.community.cache;

import org.apache.commons.lang3.StringUtils;
import xiaohu.community.community.dto.TagDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        //开发语言
        TagDTO program = new TagDTO();
        program.setTags(Arrays.asList("java", "js", "php", "c++", "html", "css", "python", "node", "c", "golang"));
        program.setCategoryName("开发语言");
        tagDTOS.add(program);
        //开发框架
        TagDTO framework = new TagDTO();
        framework.setTags(Arrays.asList("spring", "express", "flask", "struts", "koa", "tornado", "laravel"));
        framework.setCategoryName("开发框架");
        tagDTOS.add(framework);
        //服务器
        TagDTO server = new TagDTO();
        server.setTags(Arrays.asList("linux", "nginx", "docker", "tomcat", "缓存", "负载均衡", "centos"));
        server.setCategoryName("服务器");
        tagDTOS.add(server);
        //数据库
        TagDTO db = new TagDTO();
        db.setTags(Arrays.asList("mysql", "redis", "h2", "mongodb", "sql", "oracle"));
        db.setCategoryName("数据库");
        tagDTOS.add(db);
        //其他
        TagDTO others = new TagDTO();
        others.setTags(Arrays.asList("力扣", "面经", "生活", "其他"));
        others.setCategoryName("其他");
        tagDTOS.add(others);
        return tagDTOS;
    }
    public static String filterInvalid(String tags){
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();
        //二维数组两层的内容循环出来
        List<String> taglist = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !taglist.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}
