package xiaohu.community.community.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import xiaohu.community.community.model.Comment;
import xiaohu.community.community.model.CommentExample;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int insert(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int insertSelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    Comment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int updateByExampleSelective(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int updateByExample(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int updateByPrimaryKeySelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMMENT
     *
     * @mbg.generated Mon Apr 11 15:01:36 GMT+08:00 2022
     */
    int updateByPrimaryKey(Comment row);
}