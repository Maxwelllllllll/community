package xiaohu.community.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001,"你的问题找不到了，要不换个试试看？"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复！"),
    NO_LOGIN(2003,"请先登录！"),
    SYSTEM_ERROR(2004,"服务出错啦，要不稍后再试试~~~"),
    TYPE_PARAM_WRONG(2006,"回复错误！"),
    COMMENT_NOT_FOUND(2007,"回复的评论已不存在！"),
    COMMENT_IS_EMPTY(2008,"输入内容不能为空！"),
    FILE_UPLOAD_FAIL(2009,"图片上传失败！");
    @Override
    public  String getMessage(){
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private String message;
    private  Integer code;

    CustomizeErrorCode(Integer code, String message){
        this.message = message;
        this.code = code;
    }
}
