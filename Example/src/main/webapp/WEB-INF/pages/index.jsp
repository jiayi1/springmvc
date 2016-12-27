<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<cmtitle>你好啊</cmtitle>
<cmhead>
</cmhead>
<cmbody>
    <div ng-app="manager" ng-controller="mainCtrl">
        <h1>这里是SpringMVC Demo首页</h1>
        <h3>恭喜你,配置成功。</h3>
        <h4>{{name}}</h4>
        <div ng-repeat="item in data">
            <span ng-bind="item.name"></span>
        </div>

        <div>
            <form method="post" id="form">
                <div>请输入名字:<input type="text" name="name" id="name_text"/></div>
                <div>请输入年龄:<input type="number" name="age" min="1" max="120" value="12"/></div>
                <div>请输入地址:<input type="text" name="addr"/></div>
                <div>请输入数量:<input type="number" name="num"></div>
                <div><input type="submit" name="submit" value="增加" id="check"></div>
            </form>
        </div>
    </div>
</cmbody>
<cmfooter>
    <script>
        var mainApp = angular.module('manager', ['app.base']);
        mainApp.controller('mainCtrl', function ($scope,$http) {
            $http.get("/getList").success(function(response){
                $scope.data = response;
            }).error(function(response){
                console.log(response);
                $scope.name= response;
            });

        });

    </script>

</cmfooter>