<%--
  Created by IntelliJ IDEA.
  User: yulong.liu
  Date: 2016/12/1
  Time: 下午3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<cmtitle>success</cmtitle>
<cmhead>

</cmhead>
<cmbody>
    <div ng-app="manager" ng-controller="myCtrl">
        这是success页面;
        {{age}}
        {{name}}
    </div>

</cmbody>
<cmfooter>

    <script type="text/javascript">
        var mainApp = angular.module('manager',['app.base']);
        mainApp.controller("myCtrl",function($scope ,$http){
            $scope.age = 19;
            $http.get("/login/getTestData").success(function(response){
                $scope.name = response.data;
            }).error(function(response){
                console.log(response);
                $scope.name= response;
            });
        });

    </script>
</cmfooter>
