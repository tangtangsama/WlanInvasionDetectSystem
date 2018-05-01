package cn.nuaa.spicydick.server.handler.wifiDetection;

import cn.nuaa.spicydick.server.RequestHandler;
import cn.nuaa.spicydick.server.handler.wifiDetection.Info.OnlineWhiteListWifiInfo;
import cn.nuaa.spicydick.server.msg.Request;
import cn.nuaa.spicydick.server.msg.ErrorCode;
import cn.nuaa.spicydick.server.msg.ResponseFactory;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.RoutingContext;
import org.apache.log4j.Logger;


public class GetOnlineWhiteListWifiList extends RequestHandler {
    public static Logger logger = Logger.getLogger((Class) cn.nuaa.spicydick.server.handler.wifiDetection.GetStatisticsInfo.class);

    @Override
    public void handle(RoutingContext routingContext, final Request request) {
        routingContext.response().putHeader("content-type", "application/json");

        //int page = request.getParams().getValue("page") != null ?
                //StringToInt(request.getParams().getValue("page").toString()) : 1;

    }
}