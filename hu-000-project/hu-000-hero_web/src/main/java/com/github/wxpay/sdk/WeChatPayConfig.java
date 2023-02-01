package com.github.wxpay.sdk;

import com.github.wxpay.sdk.IWXPayDomain;
import com.github.wxpay.sdk.WXPayConfig;
import java.io.InputStream;

public class WeChatPayConfig extends WXPayConfig {
    public String getAppID() {
        return "wx8397f8696b538317";
    }

    public String getMchID() {
        return "1473426802";
    }

    public String getKey() {
        return "T6m9iK73b0kn9g5v426MKfHQH7X8rKwb";
    }

    public InputStream getCertStream() {
        return null;
    }

    public IWXPayDomain getWXPayDomain() {
        return new IWXPayDomain() {
            public void report(String domain, long elapsedTimeMillis, Exception ex) {
            }

            public IWXPayDomain.DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo("api.mch.weixin.qq.com", true);
            }
        };
    }
}
