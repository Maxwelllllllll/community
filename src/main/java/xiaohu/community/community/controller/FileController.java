package xiaohu.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import xiaohu.community.community.dto.FileDTO;
import xiaohu.community.community.provider.UCloudProvider;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class FileController {
    @Autowired
    private UCloudProvider uCloudProvider;

    @ResponseBody
    @RequestMapping("/file/upload")
    public FileDTO upload(HttpServletRequest request) throws IOException {
        //把request转换成multipartRequest
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //通过前端id拿到multipartFile的文件
        MultipartFile file = multipartRequest.getFile("editormd-image-file");

        int length = file.getInputStream().read();
        //拿到multipartFile的类型，文件名，输入流
        try {
            String fileName = uCloudProvider.upload(file.getInputStream(), file.getContentType(), file.getOriginalFilename());
            FileDTO fileDTO = new FileDTO();
            fileDTO.setSuccess(1);
            fileDTO.setUrl(fileName);
            return fileDTO;
        } catch (IOException e){
            e.printStackTrace();
        }
/*          log.error("upload error", e);*/
            FileDTO fileDTO = new FileDTO();
            fileDTO.setSuccess(1);
            fileDTO.setMessage("/images/wechat.jpg");
            return fileDTO;
    }
}