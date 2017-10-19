<%--
  Created by IntelliJ IDEA.
  User: yulong.liu
  Date: 2016/12/27
  Time: 下午2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><sitemesh:write property='cmtitle'/></title>
    <sitemesh:write property='cmheader'/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="/app/angular/angular.min.js"></script>
    <script src="/app/angular/angular-resource.min.js"></script>
    <link type="text/css" rel="stylesheet" href="<c:url value="/app/css/style.css"/>"/>
    <link rel="stylesheet" type="text/css" href="../../app/css/head.css"/>
</head>
<body>

<div>
    <div class="header">
        <sitemesh:write property="headview"/>
    </div>
    <div class="app">
        <sitemesh:write property="cmbody"/>
    </div>
    <div class="footer">

    </div>
</div>
<div>
    <sitemesh:write property="cmfooter"/>
</div>
<script>
    angular.module('app.base', [])
            .config(['$provide', function ($provide) {
                $provide.decorator('$rootScope', ['$delegate', function ($delegate) {
                    Object.defineProperty($delegate.constructor.prototype, '$onRootScope', {
                        value: function (name, listener) {
                            var unsubscribe = $delegate.$on(name, listener);
                            this.$on('$destroy', unsubscribe);
                            return unsubscribe;
                        },
                        enumerable: false
                    });
                    return $delegate;
                }]);
            }]);


</script>
</body>
</html>
