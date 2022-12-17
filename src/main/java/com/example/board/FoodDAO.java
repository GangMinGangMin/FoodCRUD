package com.example.board;

import com.example.board.FoodVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class FoodDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertFood(FoodVO vo) {
        int result = sqlSession.insert("FoodCRUD.insertFood", vo);
        return result;
    }

    public int deleteFood(int seq) {
        int result = sqlSession.delete("FoodCRUD.deleteFood", seq);
        return result;
    }

    public int updateFood(FoodVO vo) {
        int result = sqlSession.update("FoodCRUD.updateFood", vo);
        return result;
    }

    public FoodVO getFood(int seq) {
        FoodVO one = sqlSession.selectOne("FoodCRUD.getFood", seq);
        return one;
    }

    public List<FoodVO> getFoodList() {
        List<FoodVO> list = sqlSession.selectList("FoodCRUD.getFoodList");
        return list;
    }
}