<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>main page</title>
    <script type="text/javascript" src="/js/home.js?2"></script>
</head>
<body style="margin: 5% 10%; ">
<div class="top_header">
    <div class="logo" style="text-align:center;">
        <img src="https://static.wixstatic.com/media/063edf_adf20f1003cd4f72a38722b26ac0848b~mv2.jpg/v1/fill/w_500,h_324,al_c,q_80,usm_0.66_1.00_0.01,enc_auto/%EC%BA%A1%EC%B2%98_JPG.jpg"
             alt="캡처.JPG" style="width:250px;height:162px;object-fit:cover;object-position:50% 50%">
    </div>
    <div class="mymenu" style="display: flex; justify-content: flex-end; margin: 3% 5%;">
        <button type="button">마이페이지</button>
        <button type="button">로그인</button>
    </div>
    <div class="search" style="text-align:center; margin: 3% 5%">
        <input type="text" placeholder="Search...">
        <button type="button">검색</button>
    </div>
</div>
<!--카테고리별 식당 조회할 수 있는 버튼 4개-->
<div class="content1" style="margin: 5%;">
    <div class="title1" style="text-align:center; font-size: 40px">
        CATEGORY
    </div>
    <div class="parent" style=" margin:3%; overflow: hidden; margin-left: auto; margin-right: auto; "
         onmouseover="" style="cursor: pointer;">
        <div class="category1"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; "
             onclick="location.href='/category/비건'">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>비건</p>
                </div>
            </div>
        </div>
        <div class="category2"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; "
             onclick="location.href='/category/유아동반'">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>유아 동반</p>
                </div>
            </div>
        </div>
        <div class="category3"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; "
             onclick="location.href='/category/독립공간'">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>독립공간</p>
                </div>
            </div>
        </div>
        <div class="category4"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; "
             onclick="location.href='/category/반려동물동반'">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>반려동물 동반</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!--리뷰 많은 순 top 4개의 식당 보여주기-->
<div class="content2" style="margin: 5%;">
    <div class="title1" style="text-align:center; font-size: 40px">
        리뷰 많은 순 top 4
    </div>
    <div class="parent" style=" margin:3%; overflow: hidden; margin-left: auto; margin-right: auto; ">
        <div class="review_top1"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; ">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>식당 1</p>
                </div>
            </div>
        </div>
        <div class="review_top2"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; ">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>식당 2</p>
                </div>
            </div>
        </div>
        <div class="review_top3"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; ">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>식당 3</p>
                </div>
            </div>
        </div>
        <div class="review_top4"
             style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; ">
            <div class="category_box">
                <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                <div class="category_name" style="text-align: center;">
                    <p>식당 4</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!--리뷰 많은 순 top 4개의 식당 보여주기-->
<div class="content3" style="margin: 5%;">
    <div class="title1" style="text-align:center; font-size: 40px">
        평점 높은 순 top 4
    </div>
    <div class="parent" style=" margin:3%; overflow: hidden; margin-left: auto; margin-right: auto; ">
        <c:forEach var="restaurant" items="${restaurants}">
            <div class="star_top1"
                 style="float:left; margin-left: 10px; margin-right: 10px; width: 200px; height: 370px; border: 1px solid darkgrey; position:relative; ">
                <div class="category_box">
                    <img src="https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style="max-width: 100%;">
                    <div class="category_name" style="text-align: center;">
                        <p>${restaurant.name}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>


</body>
</html>