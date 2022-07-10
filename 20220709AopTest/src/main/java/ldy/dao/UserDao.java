package ldy.dao;


import ldy.lei.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : ldy
 * @version : 1.0
 */
@Repository
public interface UserDao {
  @Insert("insert into users(username,birthday,sex,address)\n" +
          "        value (#{username},#{birthday},#{sex},#{address})")
  int insert(User user);

  @Delete("delete from  users where id = #{id}")
  int delete(int id);

  @Update("update users set username = #{username}, birthday = #{birthday},\n" +
          "        sex = #{sex},address=#{address} where id = #{id}")
  int update(User user);

  @Select("select * from users")//查询全部
  List<User> getAll();

  @Select("select * from users where username like concat('%',#{usename},'%')")
  List<User> getByName(String username);

}
/*
<update id="update" >
        update users set username = #{username}, birthday = #{birthday},
        sex = #{sex},address=#{address} where id = #{id}
</update>
<insert id="insert">
        insert into users(username,birthday,sex,address)
        value (#{username},#{birthday},#{sex},#{address})
</insert>
<!--resultType是返回值类型 keyProperty是指使用user类中的那个属性接受
        order="AFTER"是指在insert的语句执行完毕之后执行  但是这个在代码里目前好像没啥用 -->
<insert id="returnIdInsert">
<selectKey resultType="int" keyProperty="id" order="AFTER">
        select last_insert_id();
</selectKey>
        insert into users(username,birthday,sex,address)
        value (#{username},#{birthday},#{sex},#{address})
</insert>

<select id="getAll" resultType="user">
        select * from users
</select>

<!--
        虽然配置了批量改名，但是使用不使用别名都无所谓   本方法使用的是${}
        使用的是拼接  不可以防止sql注入
        -->
<select id="getByName" resultType="com.ldy.pojo.User">
        select * from users where username like '%${王}%'
</select>
<!--以下为更好的模糊查询方式-->
<select id="goodGetByName" resultType="com.ldy.pojo.User">
        select * from  users where username like concat('%',#{usename},'%')
</select>
<!--灵活模糊查询-->
<select id="nimbleGetByName" resultType="com.ldy.pojo.User">
        select * from users
        where ${columnName} like concat('%',#{columnNameValue},'%')
</select>
*/
