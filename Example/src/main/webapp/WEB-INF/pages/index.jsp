<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<cmtitle>网站建设中</cmtitle>
<cmhead>
</cmhead>
<headview>

</headview>
<cmbody>
    <div ng-app="manager" ng-controller="mainCtrl">
        <div>
            <h1 style="text-align: center;color:#ffffff;height: 73%">
                当前网站正在建设中~~~
            </h1>
            <h4> 敬请期待...</h4>
        </div>

        <div>
            <div ng-repeat="item in data">
                <span ng-bind="item.name"></span>
                <span ng-bind="item.age" style="margin-left: 5px;"></span>
                <span ng-bind="item.addr" style="margin-left: 5px;"></span>
                <span ng-bind="item.num" style="margin-left: 5px;"></span>

                <button ng-click="del(item.id)" style="margin-left: 20rem">删除</button>
                <button ng-click="showDetail(item)" style="margin-left: 5px;">更新</button>
            </div>
            <hr>
        </div>
        <div hidden="true">
            <div>
                <form role="form" id="myForm">
                    <div>请输入名字:<input type="text" ng-model="owner.name" required/></div>
                    <div>请输入年龄:<input type="number" ng-model="owner.age" min="1" max="120" value="12"/></div>
                    <div>请输入地址:<input type="text" ng-model="owner.addr" required/></div>
                    <div>请输入数量:<input type="number" ng-model="owner.num" min="1"></div>
                    <button type="button" ng-click="insert()">新增</button>
                    <button type="button" ng-click="update()">更新</button>
                </form>
            </div>
        </div>

    </div>
</cmbody>
<cmfooter>
    <script>
        var mainApp = angular.module('manager', ['app.base']);
        mainApp.controller('mainCtrl', function ($scope, $http) {
            var isShowDataOnDesktop = true;
            if (isShowDataOnDesktop) {
                initList();
            }
            $scope.owner = {
                id: 0,
                name: "",
                age: 9,
                addr: "",
                num: 1
            };
            $scope.showDetail = function (item) {
                $scope.owner.id = item.id;
                $scope.owner.name = item.name;
                $scope.owner.age = item.age;
                $scope.owner.addr = item.addr;
                $scope.owner.num = item.num;
            };

            $scope.insert = function () {
                var parmas = {
                    method: "POST",
                    url: "/insert",
                    data: $scope.owner
                }
                $http(parmas).success(function (response) {
                    console.log(response.data);
                    var isSuccess = response.data;
                    if (isSuccess) {
                        if (isShowDataOnDesktop) {
                            initList();
                        }
                    }
                }).error(function (response) {
                    console.log(response.data);
                });
            };
            $scope.del = function (id) {
                $http.get("/del?id=" + id).success(function (response) {
                    var isSuccess = response.data;
                    if (isSuccess) {
                        if (isShowDataOnDesktop) {
                            initList();
                        }
                    }
                }).error(function (response) {
                    console.log(response);
                });
            };
            $scope.update = function () {
                var parmas = {
                    method: "POST",
                    url: "/update",
                    data: $scope.owner
                }
                $http(parmas).success(function (response) {
                    console.log(response.data);
                    var isSuccess = response.data;
                    if (isSuccess) {
                        if (isShowDataOnDesktop) {
                            initList();
                        }
                    }
                }).error(function (response) {
                    console.log(response.data);
                });
            };
            function initList() {
                $http.get("/getList").success(function (response) {
                    $scope.data = response.data;
                }).error(function (response) {
                    console.log(response);
                });
            }
        });

    </script>

</cmfooter>