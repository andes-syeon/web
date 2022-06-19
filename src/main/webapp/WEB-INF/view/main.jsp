<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>레스토랑나랑</title>
    <link rel="stylesheet" href="/css/main0605.css">
</head>

<body>
<div class='cut' style= "align : center">
    <!--
    <header>
        <div class="bar">
            <h1><a href="#">X-Ville</a></h1>
            <nav class="menu">
                <ul>
                    <li><a href="../introduce">소개</a></li>
                    <li><a href="#">멤버</a></li>
                    <li><a href="project_main.html">프로젝트</a></li>
                    <li><a href="#">갤러리</a></li>
                    <li><a href="#">트렌드</a></li>
                </ul>
            </nav>
            <nav class="spot">
                <ul>
                    <div class="sitemap">
                        <li><a href="#">sitemap</a></li>
                        <li><a href="#">contact us</a></li>
                    </div>
                </ul>
            </nav>
        </div>
    </header>

    <div class="navi">
        <ul>
            <li><a href="project_2015.html"> 2015</a></li>
            <li><a href="project_2016.html"> 2016</a></li>
            <li><a href="project_2017.html" class="now"> 2017</a></li>
            <li><a href="project_2018.html"> 2018</a></li>
            <li><a href="project_2019.html"> 2019</a></li>
            <li><a href="project_2020.html"> 2020</a></li>
        </ul>
    </div>
-->
    <div class="header">
        <div class="title">
            <img src="/image/logo.png"
                 alt="캡처.JPG" style="width: 300px; height: auto; <!--display: inline-block -->">
        </div>
    </div>
    <div class="projects">
        <div class="contentBox">
            <div class = "contentBox_wide"  >
                <div class = "contentBox_title" >
                    CATEGORY
                </div>
                <div class = "contentBox_parent">
                    <div class = "contentBox_category" onclick="location.href='/category/비건'">
                        <div class = "category_box">
                            <img src = "/image/vegan.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name" >
                                <p>비건</p>
                            </div>
                        </div>
                    </div>

                    <div class = "contentBox_category" onclick="location.href='/category/유아동반'">
                        <div class = "category_box">
                            <img src = "/image/baby.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name" >
                                <p>유아 동반</p>
                            </div>
                        </div>
                    </div>

                    <div class = "contentBox_category" onclick="location.href='/category/독립공간'">
                        <div class = "category_box">
                            <img src = "/image/dinner.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name">
                                <p>독립공간</p>
                            </div>
                        </div>
                    </div>
                    <div class = "contentBox_category" onclick="location.href='/category/반려동물동반'">
                        <div class = "category_box">
                            <img src = "/image/dog.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name">
                                <p>반려동물 동반</p>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class = "contentBox_wide"  >
                <div class = "contentBox_title" >
                    리뷰 Top 4
                </div>
                <div class = "contentBox_parent">
                    <div class = "contentBox_category">
                        <div class = "category_box">
                            <img src = "/image/vegan.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name" >
                                <p>비건</p>
                            </div>
                        </div>
                    </div>

                    <div class = "contentBox_category">
                        <div class = "category_box">
                            <img src = "/image/baby.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name" >
                                <p>유아 동반</p>
                            </div>
                        </div>
                    </div>

                    <div class = "contentBox_category">
                        <div class = "category_box">
                            <img src = "/image/dinner.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name">
                                <p>독립공간</p>
                            </div>
                        </div>
                    </div>
                    <div class = "contentBox_category">
                        <div class = "category_box">
                            <img src = "/image/dog.png" alt="" style = "max-width: 100%;">
                            <div class = "category_name">
                                <p>반려동물 동반</p>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class = "contentBox_wide"  >
                <div class = "contentBox_title" >
                    별점 Top 4
                </div>
                <div class = "contentBox_parent">
                    <c:forEach var="restaurant" items="${restaurants}">
                        <div class = "contentBox_category" onclick="location.href='/restaurant/${restaurant.id}'">
                            <div class = "category_box">
                                <img src = "https://cdn-icons-png.flaticon.com/512/4163/4163717.png" alt="" style = "max-width: 100%;">
                                <div class = "category_name" >
                                    <p>${restaurant.name}</p>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>
