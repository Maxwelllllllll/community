package xiaohu.community.community.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xiaohu.community.community.model.Comment;
import xiaohu.community.community.model.CommentExample;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}