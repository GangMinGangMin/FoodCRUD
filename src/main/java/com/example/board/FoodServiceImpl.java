package com.example.board;

import com.example.board.FoodDAO;
import com.example.board.FoodService;
import com.example.board.FoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodDAO foodDAO;

    @Override
    public int insertFood(FoodVO vo){
        return foodDAO.insertFood(vo);
    }
    @Override
    public int deleteFood(int seq){
        return foodDAO.deleteFood(seq);
    }
    @Override
    public int updateFood(FoodVO vo){
        return foodDAO.updateFood(vo);
    }
    @Override
    public FoodVO getFood(int seq){
        return foodDAO.getFood(seq);
    }
    @Override
    public List<FoodVO> getFoodList(){
        return foodDAO.getFoodList();
    }
}
