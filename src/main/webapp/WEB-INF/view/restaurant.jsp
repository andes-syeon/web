<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="/js/restaurant.js"></script>
    <title>Project</title>
    <link rel="stylesheet" href="/css/restaurant_detail.css">
    <link rel="stylesheet" href="/css/restaurant_ContentBox.css">
</head>

<body>
<div class='cut' style="align=center;">
    <header>
        <div class="bar">
            <h1><a href="#">레스토랑 나랑</a></h1>
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

    <div class="title">
        <div class="tit_location" id="#top" align="center" style="margin-top: 150px; margin-bottom: 0px;"> ${restaurant.originalName}</div>
    </div>

    <table style="margin-top: -50px; width: 15%" align="center">
        <tr>
            <td style="width: 50%">
                <div style="float: left; margin-left: 15px; margin-right: 5px;">
                    <h4> 별점: </h4>
                </div>
                <div style="float: left; margin-right: 0px;">
                    <h4>${restaurant.star}</h4>
                </div>
            </td>
            <td style="width: 50%">
                <div style="float: left; margin-right: 5px; margin-left: 15px;">
                    <h4> 리뷰: </h4>
                </div>
                <div style="float: left; margin-right: 0px;">
                    <h4> ${fn:length(reviews)} </h4>
                </div>
            </td>
        </tr>
    </table>

    <hr style="border-bottom-width: 1px; margin-top: 3%; width: 65%"></hr>


    <section>
        <table style="margin-top: 50px; width: 65%" align="center">
            <tr style="margin-top: 30px; width: 100%">
                <td>
                    <div style="font-size: 30px; margin-bottom: 0%; float: left; margin-left: 5%"> 상세정보</div>
                </td>
                <td>
                    <div style="font-size: 11px; margin-bottom: 0; float: right; margin-right: 70px"> 업데이트:</div>
                    <div style="font-size: 11px; margin-bottom: 0%; float: right; margin-right: -110px"> ${restaurant.infoDttm}
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <img src="/image/address.png" alt="주소아이콘"
                         style="float: left; width: 20px; margin-left: 50px; margin-top: 30px;"/>
                    <div style="float: left; margin-left: 10px; margin-top: 32px;"> ${restaurant.address}</div>
                </td>
            </tr>
            <tr>
                <td>
                    <img src="/image/time.png" alt="시계아이콘"
                         style="float: left; width: 20px; margin-left: 50px; margin-top: 10px"/>
                    <div style="float: left; margin-left: 10px; margin-top: 10px;"> 영업시간</div>
                </td>
            </tr>
            <tr>
                <td>
                    <div style="float: left; margin-left: 80px; margin-top: 0px;"> ${restaurant.operation}</div>
                </td>
            </tr>
            <tr>
                <td>
                    <img src="/image/number.png" alt="번호아이콘"
                         style="float: left; width: 20px; margin-left: 50px; margin-top: 10px;"/>
                    <div style="float: left; margin-left: 10px; margin-top: 10px;"> ${restaurant.number}</div>
                </td>
            </tr>
        </table>
    </section>

    <hr style="border-bottom-width: 1px; margin-top: 55px; width: 65%;" align="center">

    <table style="margin-top: 40px; width: 65%" align="center">
        <tr style="width: 100%;">
            <td>
                <div style="float: left; font-size: 13px; margin-bottom: 0%; margin-left: 5%;"> 후기</div>
                <div style="float: left; font-size: 13px; margin-bottom: 0%; margin-left: 1%">${fn:length(reviews)}</div>
            </td>
        </tr>
        <tr>
            <td>
                <div style="float: left; font-size: 30px; margin-bottom: 0%; margin-left: 5%"> ${restaurant.star}</div>
                <div style="float: left; font-size: 30px; margin-bottom: 0%; margin-left: 1%"> 점</div>
            </td>
        </tr>
    </table>

    <c:forEach var="review" items="${reviews}">
    <table style="background-color: #F2F2F2; margin-top: 30px; width: 58%" align="center">
        <tr style="width: 100%;">
            <td style="width: 1%;">
                <img src="/image/account.png" alt="계정아이콘"
                     style="float: left; width: 40px; margin-left: 10px; margin-top: 10px"/>
            </td>
            <td style="width: 99%;">
                <div style="float: left; margin-left: 15px; margin-right: 15px; margin-top: 10px;">${review.content}
                </div>
            </td>
        </tr>
        <tr style="width: 100%;">
            <td colspan="2">
                <div style="font-size: 11px; float: left; margin-left: 68px; margin-top: 10px;">${review.writer}</div>
                <div style="font-size: 11px; float: left; margin-left: 15px; margin-top: 11px; margin-bottom: 10px;">
                        ${review.writedttm}
                </div>
            </td>
        </tr>
    </table>
    </c:forEach>
    <div style="position: fixed; bottom: 15%; right: 10%;">
        <a href="#top"><img src="/image/move_to_top(2).png" class="moveTopBtn" alt="위로가기아이콘"
                            style="position: absolute; align: center; width: 45px; margin-left: 95%; margin-top: 10px"/></a>
    </div>
    <hr style="border-bottom-width: 1px; margin-top: 55px; width: 65%;" align="center">

    <footer align="center" style="margin-top: 50px; margin-bottom: 50px;">
        <div class="footer" style="font-size: 16px; margin-bottom: 10px;"> 국민대학교 경영정보학부 2022-1 알파 프로젝트</div>
        <div class="footer" style="font-size: 16px;"> Kookmin University Management Information System 2022-1 Alpha
            project
        </div>
    </footer>

</body>
</html>
