$category = {
    getReview: function (restaurantId) {
        console.log(restaurantId);
        if (document.getElementById(restaurantId).childElementCount == 1) {
            console.log("restaurantId : " + restaurantId);
            var url = "/api/reviews?restaurantId=" + restaurantId;
            var param = {}
            $ajax.get(url, param, $category.callbackFunc, $category.errCallbackFund);
        }
    },


    callbackFunc: function (response) {
        console.log(response);
        var json = JSON.parse(response);
        console.log(json);
        if (json.rtnCd != 0) {
            if (json.rtnMsg != '') {
                alert(json.rtnMsg);
                return;
            } else {
                alert('정보를 가져오는 도중 오류가 발생했습니다.');
                return;
            }
        }

        var rtnObj = json.rtnObj;
        if (rtnObj.length == 0) {
            return;
        }
        var id = rtnObj[0].restaurant.id;
        var html = document.getElementById(id).innerHTML;
        rtnObj.forEach(element =>
            html += '<p>' + element.content + '</p>\n'
        )
        document.getElementById(id).innerHTML = html;
    },


    errCallbackFund: function (response) {
        alert('정보를 가져오는 도중 오류가 발생했습니다.');
    }

}