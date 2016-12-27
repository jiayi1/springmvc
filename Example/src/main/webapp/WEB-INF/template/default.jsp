<%--
  Created by IntelliJ IDEA.
  User: yulong.liu
  Date: 2016/12/27
  Time: 下午2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><sitemesh:write property='cmtitle'/></title>
    <sitemesh:write property='cmhead'/>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="/app/angular/angular.min.js"></script>
    <script src="/app/angular/angular-resource.min.js"></script>
</head>
<body>

<div style="min-height:840px;">
    <sitemesh:write property="cmbody"  />
</div>
<div>
    <sitemesh:write property="cmfooter"/>
</div>
<script>
    angular.module('app.base', [])
            .config(['$provide', function($provide){
                $provide.decorator('$rootScope', ['$delegate', function($delegate){
                    Object.defineProperty($delegate.constructor.prototype, '$onRootScope', {
                        value: function(name, listener){
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
