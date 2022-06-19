<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project</title>
    <script type="text/javascript" src="/js/category.js"></script>
    <script type="text/javascript" src="/js/lib/ajax.js"></script>
    <link rel="stylesheet" href="/css/category_detail.css">
    <link rel="stylesheet" href="/css/category_ContentBox.css">
</head>

<body>
<div class='cut' style="align: center">
    <header>
        <div class="bar">
            <h1><a href="/home">레스토랑 나랑</a></h1>
            <nav class="menu">
                <ul>
                    <li><a href="/category/비건">비건</a></li>
                    <li><a href="/category/유아동반">유아동반</a></li>
                    <li><a href="/category/반려동물동반">반려동물동반</a></li>
                    <li><a href="/category/독립공간">독립룸</a></li>
                </ul>
            </nav>
        </div>
    </header>

    ```
    <div class="projects">
        <nav class="contentBox">
            <c:forEach var="categoryReview" items="${categoryReviews}">
                <div class="contentBox_wide">
                    <div class="contentBox_left">
                        <div class="contentBox_left_img">
                            <img src="/image/logo.png">
                            <!--여기에 프로젝트 사진 넣어주세요.-->
                        </div>
                    </div>
                    <div class="contentBox_right">
                        <h2 class="contentBox_title">${categoryReview.restaurant.name}</h2>
                        <div class="contentBox_smallTitle">${categoryReview.restaurant.address}</div>
                        <div class="contentBox_smallTitle">${categoryReview.restaurant.number}</div>
                        <div class="contentBox_smallTitle">${categoryReview.txt}</div>
                        <div class="contentBox_info">
                            <div class="info_text_more"> <!--텍스트 더보기-->
                                <details id="${categoryReview.restaurant.id}">
                                    <summary onclick="$category.getReview(${categoryReview.restaurant.id})">
                                        리뷰 더보기
                                    </summary>
                                </details>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </nav>
    </div>

    ```

</div>
</body>
</html>