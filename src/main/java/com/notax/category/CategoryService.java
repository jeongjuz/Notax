package com.notax.category;


import com.notax.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.LinkedList;

@Service
public class CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    public LinkedList<ProductCategoryVO> selectProductByMain(int main_no, int value) {
        return categoryDAO.selectProductByMain(main_no, value);
    }

    public LinkedList<ProductCategoryVO> searchProductByMain(int main_no, String text, int value) {
        return categoryDAO.searchProductByMain(main_no, text, value);
    }

    public String mainname(int main_no) {
        return categoryDAO.mainname(main_no);
    }

    public String mid_name(int main_no, int mid_cate_no) {
        return categoryDAO.mid_name(main_no, mid_cate_no);
    }

    public String sub_name(int main_no, int mid_cate_no, int sub_no) {
        return categoryDAO.sub_name(main_no, mid_cate_no, sub_no);
    }

    public ArrayList<ProductCategoryVO> selectDuty() {
        return categoryDAO.selectDuty();
    }

    public ArrayList<ProductCategoryVO> selectMiddle(int main_no) {
        return categoryDAO.selectMiddle(main_no);
    }

    public ArrayList<ProductCategoryVO> selectBrand(int main_no) {
        return categoryDAO.selectBrand(main_no);
    }

    public ArrayList<ProductCategoryVO> selectMain() {
        return categoryDAO.selectMain();
    }

    public ArrayList<ProductCategoryVO> selectProductByMiddle(int main_no, int mid_cate_no, int value) {
        return categoryDAO.selectProductByMiddle(main_no, mid_cate_no, value);
    }
    public ArrayList<ProductCategoryVO> searchProductByMiddle(int main_no, int mid_cate_no, String text, int value) {
        return categoryDAO.searchProductByMiddle(main_no, mid_cate_no, text, value);
    }
    public ArrayList<ProductCategoryVO> selectSub(int main_no, int mid_cate_no) {
        return categoryDAO.selectSub(main_no, mid_cate_no);
    }

    public ArrayList<ProductCategoryVO> selectProductBySub(int main_no, int mid_cate_no, int sub_no, int value) {
        return categoryDAO.selectProductBySub(main_no, mid_cate_no, sub_no, value);
    }
    public ArrayList<ProductCategoryVO> searchProductBySub(int main_no, int mid_cate_no, int sub_no, String text, int value) {
        return categoryDAO.searchProductBySub(main_no, mid_cate_no, sub_no,text, value);
    }

}
